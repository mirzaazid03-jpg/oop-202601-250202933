# Catatan Minggu 02: (Class, Object, Encapsulation)

Salin berkas ini `catatan/minggu-02.md` (NN dua digit, misalnya `minggu-02.md`).

## Yang saya kerjakan
mempelajari dan menerapkan konsep enkapsulasi pada pemrograman berorientasi objek (OOP) menggunakan bahasa Java. Saya mengerjakan class Aset.java dengan menambahkan atribut kode, nama, status, dan kondisi, serta mengatur akses atribut menggunakan modifier private. Saya juga membuat konstruktor, getter, setter, dan validasi agar data aset yang dimasukkan sesuai dengan ketentuan program.

## Keputusan desain
menggunakan modifier private pada atribut agar data di dalam class Aset tidak dapat diakses atau diubah secara langsung dari luar class. Untuk mengakses data, saya menggunakan method getter dan setter. Atribut status memiliki nilai awal TERSEDIA, sedangkan atribut kondisi memiliki nilai awal BAIK. Saya juga menambahkan validasi pada konstruktor dan setter agar kode dan nama tidak boleh bernilai null atau kosong, serta status dan kondisi tidak boleh bernilai null
## Kendala
memahami cara menerapkan enkapsulasi dan validasi data dengan benar
cara mengatasinya dengan memeriksa kembali kode pada Aset.java dan menjalankan pengujian

## Penggunaan AI
- Alat yang dipakai: (gpt)
- Bagian yang dibantu AI: Memahami konsep enkapsulasi, menyusun konstruktor, getter dan setter, serta menerapkan validasi data pada class Aset
- Prompt utama: Bantu saya memeriksa dan melengkapi class Aset.java
konstruktor, getter/setter, dan validasi data.
- Yang saya ubah atau tolak dari saran AI, dan alasannya:menyesuaikan kode dengan struktur package dan ketentuan proyek yang sudah tersedia.
mempertahankan bagian bisaDipinjam(), getJenis(), dan hitungDenda()
- Satu hal yang saya pahami lebih baik sekarang: memahami bahwa enkapsulasi digunakan untuk melindungi data di dalam class, sedangkan getter dan setter memberikan cara yang terkontrol untuk membaca atau mengubah data.
