
package id.ac.upb.asetpinjam.exception;

/**
 * Exception ketika kuota peminjaman laptop habis.
 */
public class KuotaHabisException extends AsetPinjamException {

    public KuotaHabisException(String idPeminjam, int kuota) {
        super("Kuota laptop peminjam " + idPeminjam
                + " sudah habis. Batas kuota: " + kuota);
    }
}
