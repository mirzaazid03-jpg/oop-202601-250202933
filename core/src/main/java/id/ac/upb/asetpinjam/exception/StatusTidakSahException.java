
package id.ac.upb.asetpinjam.exception;

import id.ac.upb.asetpinjam.model.StatusPeminjaman;

/**
 * Minggu 9: perpindahan status peminjaman tidak sah.
 */
public class StatusTidakSahException extends AsetPinjamException {

    public StatusTidakSahException(
            StatusPeminjaman asal,
            StatusPeminjaman tujuan) {

        super(
            "Perpindahan status tidak sah dari "
            + asal + " ke " + tujuan
        );
    }
}
