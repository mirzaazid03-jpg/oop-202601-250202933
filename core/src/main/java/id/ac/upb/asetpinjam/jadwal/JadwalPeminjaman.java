
package id.ac.upb.asetpinjam.jadwal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import id.ac.upb.asetpinjam.exception.KuotaHabisException;
import id.ac.upb.asetpinjam.exception.PeminjamanBentrokException;
import id.ac.upb.asetpinjam.model.Peminjaman;
import id.ac.upb.asetpinjam.model.Laptop;
import id.ac.upb.asetpinjam.model.StatusPeminjaman;

/**
 * Jadwal peminjaman di memori.
 *
 * Minggu 7: bentrok, semuaUrutMulai, perAset, hapus.
 * Minggu 9: ajukan (melempar exception).
 *
 * tambah() disediakan dan sengaja tidak memeriksa apa pun.
 */
public class JadwalPeminjaman {

    private final List<Peminjaman> daftar = new ArrayList<>();
    private final int kuotaLaptop;

    public JadwalPeminjaman(int kuotaLaptop) {
        this.kuotaLaptop = kuotaLaptop;
    }

    protected int kuotaLaptop() {
        return kuotaLaptop;
    }

    protected List<Peminjaman> daftarMutable() {
        return daftar;
    }

    /** Menambah apa adanya tanpa pemeriksaan. */
    public void tambah(Peminjaman p) {
        daftar.add(p);
    }

    /**
     * Memeriksa bentrok jadwal untuk aset yang sama.
     * Status ditolak, dibatalkan, dan dikembalikan
     * tidak lagi menggunakan jadwal.
     */
    public boolean bentrok(Peminjaman baru) {

        for (Peminjaman p : daftar) {

            // Aset berbeda tidak dianggap bentrok
            if (!p.getAset().getKode().equals(
                    baru.getAset().getKode())) {
                continue;
            }

            // Status yang tidak lagi menggunakan jadwal
            StatusPeminjaman status = p.getStatus();

            if (status == StatusPeminjaman.DITOLAK
                    || status == StatusPeminjaman.DIBATALKAN
                    || status == StatusPeminjaman.DIKEMBALIKAN) {
                continue;
            }

            // Interval [mulai, selesai)
            boolean tumpangTindih =
                    baru.getMulai().isBefore(p.getSelesai())
                    && p.getMulai().isBefore(baru.getSelesai());

            if (tumpangTindih) {
                return true;
            }
        }

        return false;
    }

    /** Mengurutkan semua peminjaman berdasarkan waktu mulai. */
    public List<Peminjaman> semuaUrutMulai() {

        List<Peminjaman> hasil = new ArrayList<>(daftar);

        hasil.sort(
                Comparator.comparing(Peminjaman::getMulai)
        );

        return hasil;
    }

    /** Mengelompokkan peminjaman berdasarkan kode aset. */
    public Map<String, List<Peminjaman>> perAset() {

        Map<String, List<Peminjaman>> hasil = new TreeMap<>();

        for (Peminjaman p : daftar) {

            String kode = p.getAset().getKode();

            hasil.computeIfAbsent(kode, k -> new ArrayList<>())
                    .add(p);
        }

        return hasil;
    }

    /** Menghapus peminjaman berdasarkan ID. */
    public boolean hapus(String id) {
        return daftar.removeIf(p -> p.getId().equals(id));
    }

    /**
     * Memeriksa bentrok dan kuota sebelum menambahkan peminjaman.
     */
    public void ajukan(Peminjaman baru) {

        // 1. Periksa bentrok jadwal
        if (bentrok(baru)) {
            throw new PeminjamanBentrokException(
                    baru.getAset().getKode()
            );
        }

        // 2. Periksa kuota jika aset berupa Laptop
        if (baru.getAset() instanceof Laptop) {

            String idPeminjam = baru.getPeminjam().id();
            int jumlahLaptopAktif = 0;

            // 3. Hitung laptop aktif milik peminjam yang sama
            for (Peminjaman p : daftar) {

                // Hanya menghitung aset Laptop
                if (!(p.getAset() instanceof Laptop)) {
                    continue;
                }

                // Hanya menghitung peminjam yang sama
                if (!p.getPeminjam().id().equals(idPeminjam)) {
                    continue;
                }

                StatusPeminjaman status = p.getStatus();

                // Hanya status DISETUJUI dan DIPINJAM yang dihitung
                if (status == StatusPeminjaman.DISETUJUI
                        || status == StatusPeminjaman.DIPINJAM) {
                    jumlahLaptopAktif++;
                }
            }

            // 4. Periksa apakah kuota sudah habis
            if (jumlahLaptopAktif >= kuotaLaptop) {
                throw new KuotaHabisException(
                        idPeminjam,
                        kuotaLaptop
                );
            }
        }

        // 5. Jika semua pemeriksaan lolos, tambahkan peminjaman
        daftar.add(baru);
    }
}
