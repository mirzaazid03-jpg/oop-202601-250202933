# Catatan Minggu 07: (koleksi_penjadwalan peminjaman)

Salin berkas ini `catatan/minggu-NN.md` (NN dua digit, misalnya `minggu-07.md`).

## Yang saya kerjakan
mengimplementasikan empat metode pada class JadwalPeminjaman, yaitu bentrok(), semuaUrutMulai(), perAset(), dan hapus(). dan juga membuat pengujian sendiri pada BatasBentrokTest.java untuk menentukan perilaku jadwal ketika waktu selesai peminjaman sama dengan waktu mulai peminjaman berikutnya. 

## Keputusan desain
Menggunakan ArrayList sebagai struktur data utama untuk menyimpan daftar peminjaman karena dapat menampung banyak data dan memudahkan proses pengurutan.

Menggunakan TreeMap pada metode perAset() agar peminjaman dapat dikelompokkan berdasarkan kode aset dan kode aset tersusun secara berurutan.

Menggunakan Comparator.comparing(Peminjaman:getMulai) untuk mengurutkan jadwal berdasarkan waktu mulai secara menaik.

Pemeriksaan bentrok hanya dilakukan jika kode aset sama dan waktu peminjaman saling tumpang tindih.

Menggunakan interval setengah terbuka [mulai, selesai), sehingga jadwal yang selesai tepat ketika jadwal berikutnya dimulai tidak dianggap bentrok.

Menggunakan removeIf() untuk menghapus peminjaman berdasarkan ID dan mengembalikan nilai true jika data berhasil dihapus.

## Kendala
 menentukan aturan bentrok ketika waktu selesai suatu peminjaman sama dengan waktu mulai peminjaman berikutnya. 
 mengatasinya dengan menggunakan interval setengah terbuka [mulai, selesai) dan membuat pengujian sendiri untuk memastikan kedua jadwal tersebut tidak dianggap bentrok.


## Penggunaan AI
- Alat yang dipakai: GPT Ai
- Bagian yang dibantu AI: Class JadwalPeminjaman, khususnya metode bentrok(), semuaUrutMulai(), perAset(), dan hapus().
- Prompt utama:
Bagaimana cara mengimplementasikan fungsi bentrok pada jadwal peminjaman berdasarkan kode aset dan rentang waktu?
Bagaimana cara menggunakan Comparator untuk mengurutkan daftar peminjaman berdasarkan waktu mulai?
Bagaimana cara mengelompokkan peminjaman berdasarkan kode aset menggunakan Map dan menghapus data berdasarkan ID?
- Yang saya ubah atau tolak dari saran AI, dan alasannya:memilih menggunakan ArrayList sebagai penyimpanan utama dan TreeMap untuk pengelompokan berdasarkan kode aset.
dan juga memilih aturan interval setengah terbuka agar jadwal yang berurutan tidak dianggap bentrok.
- Satu hal yang saya pahami lebih baik sekarang:
