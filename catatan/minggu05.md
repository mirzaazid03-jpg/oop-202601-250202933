# Catatan Minggu 05: Abstraction (implementasi strategi denda)

## Yang saya kerjakan
saya mengerjakan implementasi perhitungan denda pada proyek aset-pinjam, dengan cara membuat 2 strategi perhitungan denda, yaitu DendaFlat dan DendaProgresif. DendaFlat digunakan untuk menghitung denda tetap berdasarkan denda aset, dan denda progresif di gunakan untuk menghitung denda yang semakin meningkat berdasarkan lama keterlambatan.

## Keputusan desain
menggunakan interface AturanDenda agar sistem memiliki aturan perhitungsn denda yang di tetapkan dengan beberapa strategi yang berbeda.
- denda flat: dihitung secara tetap berdasarkan tarif denda
- denda progresif: bertambah berdasarkan jumlah hari keterlambatan (dendaflat ditambah kenaikan sebesar 1/30 di dari setiap hari keterlambatan). 
## Kendala
muncul eror saat pengujujian maven dijalankan.
untuk mengatasinya, memperbaiki kode yang belum lengkap di minggu sebelumnya.
## Penggunaan AI
- Alat yang dipakai: (chatGPT)
- Bagian yang dibantu AI: implementasi DendaFlat.java dan DendaProgresif.java, rumus perhitungan denda dan analisis eror saat menjalankan maven.
- Prompt utama: .  priksa kode DendaFlat
 .  perbaiki implementasi denda agar semakin lama terlambat semakin besar dendanya
 . analisisi eror maven saat pengujian.
- Yang saya ubah atau tolak dari saran AI, dan alasannya:
menyempurnakan bagian rumus denda progresif yang sebelumnya masih berupa placeholder agar memiliki perhitungan yang jelas dan sesuai,
- Satu hal yang saya pahami lebih baik sekarang:
memahami bahwa interface bisa digunakan untuk membuat beberapa strategi perhitungan denda yang berbeda