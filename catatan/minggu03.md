# Catatan Minggu 03: (INHERITACE)

## Yang saya kerjakan
Minggu ke03, saya mengaerjakan konsep inheritace dalam java pada projek aset-pinjam, saya melengkapi 3 class yaitu "alat-lab-java, laptop-java dan ruang,java"
saya menaambahkan atribut, kostructor,getter, validasi data serta melakukan override method getjenis, sesuai aset masing-masing.

## Keputusan desain
atribut yang dimiliki oleh semua jenis aset seperti kode, nama, status, dan kondisi tetep berada di clas induk aset. sementara itu, atribut yang dimiliki jenis aset tertentu diletakan pada clas turunanya
1. laptop; meemiliki spesifikasi daan nomor inventaris.
2. ruang' memiliki kapasitas
3. alat lab; memiliki nama dan tingkat  resiko.
saya menggunakan inharitance karna laptop, ruang dan alat lab, merupakan jenis dari aset, atribut dan perilaku umum dapat digunakan kembali tanpa ditulis ulang 
## Kendala
ketika menjalankan pengujian masih terdapat kode "unsuported" pada konstruktor ruang. akibatnya eberapa pengujain gagal, saya mengatasi kendala tersebut dengan melengkapi kostruktor, menambah validasi kapasitas agar lebih dari 0, serta menyimpan perubahan file sebelum menjalankan  pengujian kembali.
## Penggunaan AI
- Alat yang dipakai: (cahat gpt")
- Bagian yang dibantu AI: Implementasi class Laptop, Ruang, dan AlatLab, validasi constructor, getter, override method getJenis(), serta membantu menganalisis error saat pengujian.
- Prompt utama: (Bantu lengkapi file Laptop.java, Ruang.java, dan AlatLab.java 
eriksa apakah kode Java saya sudah sesuai dengan aturan inheritance dan validasi.")
- Yang saya ubah atau tolak dari saran AI, dan alasannya:
menyesuaikan implementasi kode dengan struktur project, nama enum, dan ketentuan yang sudah tersedia. selanjutnya memeriksa kembali hasil pengujian dan memperbaiki constructor Ruang ketika ditemukan error, bukan hanya mengandalkan saran AI
- Satu hal yang saya pahami lebih baik sekarang:
lebih memahami konsep inheritance dalam Java, yaitu class turunan dapat mewarisi atribut dan method dari class induk menggunakan extends
