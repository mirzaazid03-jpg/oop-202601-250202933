
package id.ac.upb.asetpinjam.denda;

import id.ac.upb.asetpinjam.kontrak.AturanDenda;
import id.ac.upb.asetpinjam.model.Aset;

/**
 * Minggu 5: denda progresif yang makin berat
 * apabila keterlambatan semakin lama.
 */
public class DendaProgresif implements AturanDenda {

    @Override
    public long hitung(Aset aset, int hariTerlambat) {

        if (hariTerlambat <= 0) {
            return 0;
        }

        // Mengambil denda dasar (flat).
        long dendaFlat = aset.hitungDenda(hariTerlambat);

        // Denda progresif bertambah sesuai lama keterlambatan.
        long tambahan = dendaFlat * hariTerlambat / 30;

        return dendaFlat + tambahan;
    }
}
