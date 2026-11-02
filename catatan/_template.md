# Catatan Minggu 04: (Override Method Hitung Denda)

Salin berkas ini `catatan/minggu-NN.md` (NN dua digit, misalnya `minggu-07.md`).

## Yang saya kerjakan
mengerjakan penerapan konsep "method overriding" pada projrct aset_pinjam.
Saya melengkapi method hitungDenda() pada setiap subclass aset, yaitu Laptop, Ruang, dan AlatLab. Setiap jenis aset memiliki perhitungan denda sesuai aturan.

## Keputusan desain
menggunakan konsep method overriding agar setiap subclass dapat memiliki implementasi hitungDenda() masing-masing. Dengan demikian, perhitungan denda dapat disesuaikan berdasarkan jenis aset tanpa harus membuat satu perhitungan yang sama untuk semua aset.

## Kendala
memahami penerapan overriding dan memastikan perhitungan denda pada setiap subclass sesuai dengan ketentuan.
Saya mengatasinya dengan memeriksa kode program, memperbaiki bagian yang diperlukan, dan menjalankan pengujian kembali
## Penggunaan AI
- Alat yang dipakai: (ChatGPT)
- Bagian yang dibantu AI: (memahami konsep method overriding dan membantu memeriksa implementasi method hitungDenda() pada kelas Laptop, Ruang, dan AlatLab.)
- Prompt utama:
"Jelaskan cara menerapkan method overriding pada Java."
"Bantu periksa implementasi method hitungDenda() pada setiap subclass aset."

- Yang saya ubah atau tolak dari saran AI, dan alasannya:menyesuaikan kode dengan struktur project dan ketentuan yang diberikan agar implementasinya tetap sesuai dengan kebutuhan project.
- Satu hal yang saya pahami lebih baik sekarang: lebih memahami konsep method overriding, yaitu kemampuan subclass untuk menyediakan implementasi sendiri dari method yang diwariskan dari superclass.
