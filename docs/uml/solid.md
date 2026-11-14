# Analisis Prinsip SOLID pada Proyek Aset-Pinjam

Dokumentasi ini mengacu pada source code Java yang tersedia pada proyek Aset-Pinjam.

## 1. Single Responsibility Principle (SRP)

Prinsip SRP menyatakan bahwa sebuah kelas sebaiknya memiliki satu tanggung jawab utama. Contohnya terlihat pada kelas `Koneksi` dan `JdbcAsetDAO`.

- `Koneksi` bertanggung jawab menyediakan koneksi database melalui method statis `baru()`.
- `JdbcAsetDAO` bertanggung jawab menjalankan operasi akses data aset, seperti `simpan`, `cariByKode`, `semua`, `perbarui`, dan `hapus`.

Pemisahan ini membuat perubahan pada cara membuka koneksi database tidak harus dicampur dengan perubahan aturan penyimpanan data aset. Begitu juga perubahan query aset dapat dilakukan pada DAO tanpa mengubah kelas `Koneksi`.

## 2. Dependency Inversion Principle (DIP)

Prinsip DIP menyatakan bahwa modul tingkat tinggi sebaiknya bergantung pada abstraksi, bukan langsung pada implementasi konkret.

Contohnya terlihat pada `JdbcPeminjamanDAO`. Kelas ini memiliki atribut `asetDao` bertipe interface `AsetDAO`, bukan bertipe `JdbcAsetDAO`. Konstruktor juga menerima `Supplier<Connection>` sebagai sumber koneksi, bukan membuat ketergantungan langsung pada satu cara pembuatan koneksi.

Dengan bergantung pada interface `AsetDAO`, implementasi akses data aset dapat diganti dengan implementasi lain tanpa mengubah deklarasi ketergantungan pada `JdbcPeminjamanDAO`. `Supplier<Connection>` juga memungkinkan sumber koneksi diganti, misalnya dengan koneksi uji saat pengujian. Hal ini membuat kode lebih fleksibel dan lebih mudah diuji.

## Catatan konsistensi

Kedua prinsip di atas dipilih karena struktur abstraksinya memang terlihat pada source code yang diperiksa. Beberapa kelas pada proyek masih memiliki method TODO dari minggu berikutnya, tetapi hal tersebut tidak mengubah contoh pemisahan tanggung jawab dan penggunaan abstraksi yang dijelaskan di atas.
