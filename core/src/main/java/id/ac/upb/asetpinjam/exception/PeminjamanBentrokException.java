
package id.ac.upb.asetpinjam.exception;

/**
 * Minggu 9: jadwal peminjaman bentrok.
 */
public class PeminjamanBentrokException extends AsetPinjamException {

    public PeminjamanBentrokException(String kodeAset) {
        super("Peminjaman bentrok dengan jadwal aset: " + kodeAset);
    }
}
