# Catatan Minggu 01: (topik)
`catatan/minggu-01.md` paradigma pemrograman

## Yang saya kerjakan
menyiapkan JDK 21, Maven, Git, dan struktur repositori proyek. selanjutnya saya mengimplementasikan program "Aset-Pinjam" dalam tiga gaya paradigma pemrograman yang berbeda—prosedural menggunakan fungsi statis, pemrograman berorientasi objek (OOP) dengan field private, serta gaya fungsional menggunakan ekspresi lambda.


## Keputusan desain
saya memutuskan untuk membuat format kalimat sapaan yang seragam di ketiga paradigma tersebut agar pengujian otomatis (Minggu01Test.java) dapat memvalidasi kata kunci "Aset-Pinjam", NIM, dan nama dengan konsisten. Untuk gaya fungsional, saya menggunakan interface fungsional seperti Supplier<String> agar fungsi dapat mengembalikan lambda dengan bersih tanpa efek samping.
## Kendala
Kendala awal yang saya hadapi adalah menyesuaikan struktur direktori Maven dengan penamaan package yang diharapkan oleh pengujian.
untuk mengatasinya saya memastikan struktur folder src/main/java/id/ac/upb/asetpinjam/minggu01/ dengan deklarasi package

## Penggunaan AI
- Alat yang dipakai: ("gmini")
- Bagian yang dibantu AI: (Implementasi kode dasar untuk ketiga gaya paradigma (HelloProsedural, HelloOOP, HelloFungsional) serta penyusunan catatan analisis kelebihan dan keterbatasan.)
- Prompt utama: (Berikan contoh implementasi program Java sederhana untuk gaya prosedural, OOP, dan fungsional yang menghasilkan teks sapaan memuat 'Aset-Pinjam'.")
- Yang saya ubah atau tolak dari saran AI, dan alasannya:
saya menyesuaikan isi nama dan NIM agar sesuai dengan file properti mahasiswa.properties di sistem lokal saya.
- Satu hal yang saya pahami lebih baik sekarang:perbedaan cara pandang antara fungsi statis prosedural, enkapsulasi data pada OOP
