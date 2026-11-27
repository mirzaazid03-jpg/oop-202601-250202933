# Catatan Minggu 09: (exception handlling)

Salin berkas ini `catatan/minggu-NN.md` (NN dua digit, misalnya `minggu-07.md`).

## Yang saya kerjakan
mengerjakan penerapan Exception Handling pada project Aset-Pinjam. Saya membuat dan memperbaiki exception khusus, yaitu PeminjamanBentrokException, KuotaHabisException, dan StatusTidakSahException.
 juga mengimplementasikan method ubahStatus() pada class Peminjaman dan method ajukan() pada class JadwalPeminjaman untuk memeriksa perpindahan status, bentrok jadwal, serta kuota laptop.

## Keputusan desain
- Menggunakan exception khusus agar setiap kesalahan memiliki pesan yang jelas dan mudah dipahami.
- status peminjaman hanya diperbolehkan sesuai aturan pada docs/aturan-bisnis.md.
- Bentrok jadwal hanya diperiksa pada aset dengan kode yang sama.
- 
## Kendala
- kesalahan pada constructor exception karena parameter yang dipanggil belum sesuai dengan constructor yang tersedia.
- itemukan dua kegagalan pada Week 5, yaitu perhitungan DendaFlat dan DendaProgresif.
- 

## Penggunaan AI
- Alat yang dipakai: chatGPT
- Bagian yang dibantu AI: Constructor pada PeminjamanBentrokException, KuotaHabisException, dan StatusTidakSahException; method ubahStatus() pada class Peminjaman; method ajukan() dan bentrok() pada class JadwalPeminjaman; serta analisis kesalahan pada DendaFlat dan DendaProgresif.
- Prompt utama: - implementasikan method ubahStatus() sesuai aturan perpindahan status 
                - implementasikan method ajukan() pada JadwalPeminjaman.java untuk memeriksa bentrok jadwal dan kuota laptop."
                - Analisis error hasil pengujian Maven dan bantu perbaiki kode yang menyebabkan pengujian gagal."
- Yang saya ubah atau tolak dari saran AI, dan alasannya:
enyesuaikan kode yang diberikan AI dengan struktur package, nama class, dan aturan bisnis pada project Aset-Pinjam. Saya juga memperbaiki kembali rumus denda Week 5 setelah pengujian menemukan hasil yang tidak sesuai.
- Satu hal yang saya pahami lebih baik sekarang:
