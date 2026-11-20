package id.ac.upb.asetpinjam.mahasiswa;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import id.ac.upb.asetpinjam.TestSupport;
import static id.ac.upb.asetpinjam.TestSupport.pinjam;
import id.ac.upb.asetpinjam.config.Varian;
import id.ac.upb.asetpinjam.jadwal.JadwalPeminjaman;
import id.ac.upb.asetpinjam.model.Peminjaman;

class BatasBentrokTest {

    private JadwalPeminjaman jadwal;

    @BeforeEach
    void siapkan() {
        jadwal = new JadwalPeminjaman(Varian.aktif().kuotaLaptop);
    }

    @Test
    void selesaiSamaDenganMulaiTidakBentrok() {
        // Peminjaman pertama: jam 09.00 sampai 11.00
        jadwal.tambah(
            pinjam(
                "1",
                TestSupport.peminjam("P1"),
                TestSupport.ruang("R-1"),
                9,
                11
            )
        );

        // Peminjaman kedua: jam 11.00 sampai 13.00
        Peminjaman baru = pinjam(
            "2",
            TestSupport.peminjam("P2"),
            TestSupport.ruang("R-1"),
            11,
            13
        );

        // Keputusan: tidak bentrok karena peminjaman pertama
        // selesai tepat ketika peminjaman kedua dimulai.
        assertThat(jadwal.bentrok(baru)).isFalse();
    }
}