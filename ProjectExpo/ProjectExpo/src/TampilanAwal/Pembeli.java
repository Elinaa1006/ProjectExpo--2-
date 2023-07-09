package TampilanAwal;

public class Pembeli {
    
    String Nama;
    String Usename;
    String Alamat;
    int NoTelp;
    String Ukuran;
    int Jumlah;
    int Harga;


    public Pembeli(String nama, String usename, String alamat, int noTelp) {
        Nama = nama;
        Usename = usename;
        Alamat = alamat;
        NoTelp = noTelp;
    }

    public String getNama() {
        return Nama;
    }
    public String getUsename() {
        return Usename;
    }
    public String getAlamat() {
        return Alamat;
    }
    public int getNoTelp() {
        return NoTelp;
    }
    public void setNama(String nama) {
        Nama = nama;
    }
    public void setUsename(String usename) {
        Usename = usename;
    }
    public void setAlamat(String alamat) {
        Alamat = alamat;
    }
    public void setNoTelp(int noTelp) {
        NoTelp = noTelp;
    }

    public Pembeli(String ukuran, int jumlah, int harga) {
        Ukuran = ukuran;
        Jumlah = jumlah;
        Harga = harga;
    }

    public void setUkuran(String ukuran) {
        Ukuran = ukuran;
    }

    public void setJumlah(int jumlah) {
        Jumlah = jumlah;
    }

    public void setHarga(int harga) {
        Harga = harga;
    }

    public String getUkuran() {
        return Ukuran;
    }

    public int getJumlah() {
        return Jumlah;
    }

    public int getHarga() {
        return Harga;
    }      


}
