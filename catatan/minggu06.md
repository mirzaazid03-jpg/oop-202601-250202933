# Catatan Minggu 06: (UML dan SOLID)


## Yang saya kerjakan
Saya mengerjakan dokumentasi UML pada proyek siatem peminjaman aset.  saya membuat class Diagram untuk menggambarkan struktur kelas, atribut, method, dan hubungan antarkelas. selanjutnya membuat diagram Sequence diagram untuk menggambarkan proses pengajuan peminjaman dengan sekenario berhasil dan bentrok, selanjutnya saya menganalisis 2 prinsip solid, yaitu singgel resposibility principle dan Dependency inversion principle

## Keputusan desain
memilih SRP dan DIP karna kedua prinsip tersebut dapat ditemukan pada kode proyek yang dikerjan.

- SRP diterapkan melalui pemisahan tanggungjawab Kelas dan JdbcAsetDAO
- DIP ditunjukan pada kelas JdbcPeminjamanDAO menggunakan interface AsetDAO dan Suplier(Connection)

Class Diagram dan Sequence Diagram dibuat mengguanakn PlantUML agar stuktur dan alur sistem lebih mudah dipahami serta dapat di perbarui apabila terdapat perubahan pada kode program.

## Kendala
kesalah menyimpan file class diagram dan juga harus menyesuaikan kode-koddenya agar selalu terhubung sehingga di beberapa pengujian mengalami eror
## Penggunaan AI
- Alat yang dipakai: (gpt)
- Bagian yang dibantu AI: (Classdiagram,Sequence diagram analisis prinsip SRP dan DIP.)
- Prompt utama:priksa penyebab eror dokumentest pada file class diagram 
- Yang saya ubah atau tolak dari saran AI, dan alasannya:menyesuaikan lokasi file dokumentasi dengan struktur folder proyek dan hasil pengujian.
- Satu hal yang saya pahami lebih baik sekarang:SRP memisahkan tanggunga jawab setiap kelas, DIP  membuat kode bergantung pada abstaksi dan dokumen uml harus sesuai dengan implementasi program yang sebenarnya
