package TampilanAwal;

public class Administrator {

    String Nama;
    String Usename;
    String Alamat;
    int NoTelp;

    

    public Administrator(String nama, String usename, String alamat, int noTelp) {
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

    
    
}
