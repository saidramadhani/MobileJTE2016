import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class KopiBerkas {
    /**
     * Fungsi untuk mengkopi isi suatu berkas ke berkas yang lain.
     *
     * Parameter:
     *   namaBerkasAsal = Nama berkas yang akan dikopi
     *   namaBerkasSasaran = Nama berkas yang akan dihasilkan
     * 
     * PERHATIKAN: Jika namaBerkasSasaran sudah ada maka akan ditimpa!
     */
    public void kopi(String namaBerkasAsal, String namaBerkasSasaran) 
                    throws IOException {
        // Deklarasi variabel
        FileInputStream masukan = null;
        FileOutputStream keluaran = null;

        try {
            // Object stream untuk masukkan
            masukan = new FileInputStream(namaBerkasAsal);
            // Object stream untuk masukkan
            keluaran = new FileOutputStream(namaBerkasSasaran);
            
            // Coba baca  dari stream
            int karakter = masukan.read();
            // Selama masih ada data yang bisa dibaca
            while (karakter != -1) {
                // Kirim ke keluaran
                keluaran.write(karakter);
                // Coba baca lagi dari stream
                karakter = masukan.read();
            }
        } 
        finally {
            // Tutup stream masukan
            if (masukan != null)
                masukan.close();
            // Tutup stream keluaran
            if (keluaran != null)
                keluaran.close();
        }
    }
}
