package TampilanAwal;

public class User {
    String Username;
    String nama;
    String Alamat;
    String noTelepon;

    public String getUsername() {
        return Username;
    }
    public void setUsername(String username) {
        Username = username;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getAlamat() {
        return Alamat;
    }
    public void setAlamat(String alamat) {
        Alamat = alamat;
    }
    public String getNoTelepon() {
        return noTelepon;
    }
    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }
      // konstruktor kosong

    public User(String username, String nama, String alamat, String noTelepon) {
        Username = username;
        this.nama = nama;
        Alamat = alamat;
        this.noTelepon = noTelepon;
    }
    public User() {
    }
    @Override
    public String toString() {
        return "User [Username=" + Username + ", nama=" + nama + ", Alamat=" + Alamat + ", noTelepon=" + noTelepon
                + "]";
    }

    

  

    
    
    

}
