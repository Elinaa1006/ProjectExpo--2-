package TampilanAwal;

public class userDaftar {

    String Nama;
    String No;
    String Alamat;
    String Password;
    public userDaftar(String nama, String no, String alamat, String password) {
        Nama = nama;
        No = no;
        Alamat = alamat;
        Password = password;
    }

    public void setNama(String nama) {
        Nama = nama;
    }
    public void setNo(String no) {
        No = no;
    }
    public void setAlamat(String alamat) {
        Alamat = alamat;
    }
    public void setPassword(String password) {
        Password = password;
    }
    public String getNama() {
        return Nama;
    }
    public String getNo() {
        return No;
    }
    public String getAlamat() {
        return Alamat;
    }
    public String getPassword() {
        return Password;
    }

    @Override
    public String toString() {
        return "userDaftar [Nama=" + Nama + ", No=" + No + ", Alamat=" + Alamat + ", Password=" + Password + "]";
    }

    
}
