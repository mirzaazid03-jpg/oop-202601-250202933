# Asumsi dan Keputusan Desain

Isi bagian ini sendiri. Satu entri per keputusan. Dinilai dari kejelasan alasan dan konsistensi dengan kode dan tes Anda,
bukan dari jawaban "benar".

Format tiap entri:

```
## A-NN: judul singkat
- Pertanyaan: ...
- Keputusan: ...
- Alasan: ...
- Dampak ke kode: ... (kelas/metode)
- Tes yang membuktikan: ... (nama tes di folder mahasiswa/)
```

## Aturan ambigu dari docs/aturan-bisnis.md

Salin setiap pertanyaan ambigu (nomor 1 sampai 7) ke sini dan jawab. Contoh:

## A-01: batas waktu bentrok
- Pertanyaan: 09:00-11:00 dan 11:00-13:00 pada aset yang sama bentrok atau tidak?
- Keputusan: (isi)
- Alasan: (isi)
- Dampak ke kode: (isi)
- Tes yang membuktikan: (isi)

## Asumsi lain

Tambahkan di sini keputusan lain yang Anda ambil: rumus denda progresif, perubahan skema database, format error API, dan seterusnya.

## Minggu 5 - rumus denda progresif

denda progresif dihitung berdasarkan denda flat
ditambah kenaikan sebesar denda flat dikalikan
jumlah hari keterlambatan dikali 30

rumus:
denda progresif = denda flat + (denda flat x hari / 30)

ketentuan:
- keterlambatan 0 hari  menghasilkan denda 0.
- denda progresif tidak lebih murah dari denda flat.
- denda meningkat seiring bertambahnya hari.
- pada hari ke-30, denda menjadi 2 kali denda flat.

## Aturan Denda Progresif

denda progresif dihitung berdasarkan denda flat
ditambah kenaikan sebesar 1/30 dari denda flat
untuk setiap hari keterlambatan.

Rumus.

Denda Progresif = Denda Flat +
(Denda Flat X hari terlambat / 30)

jika keterlambatan 0 hari atau kurang,
maka denda adalah Rp0.