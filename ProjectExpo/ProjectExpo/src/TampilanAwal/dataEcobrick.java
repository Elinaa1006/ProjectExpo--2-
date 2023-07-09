package TampilanAwal;

public class dataEcobrick {
    String Ukuran;
    String Jumlah;
    String Tanggal;

    
    public dataEcobrick(String Ukuran, String Jumlah, String Tanggal) {
        this.Ukuran = Ukuran;
        this.Jumlah = Jumlah;
        this.Tanggal = Tanggal;
       
    }


    public dataEcobrick(int id, String nama) {
    }


    public void setUkuran(String ukuran) {
        Ukuran = ukuran;
    }

    public void setJumlah(String jumlah) {
        Jumlah = jumlah;
    }

    public String getUkuran() {
        return Ukuran;
    }

    public String getJumlah() {
        return Jumlah;
    }

    public String getTanggal() {
        return Tanggal;
    }

    public void setTanggal(String tanggal) {
        Tanggal = tanggal;
    }

     
    @Override
    public String toString() {
        return "dataEcobrick [Ukuran=" + Ukuran + ", Jumlah=" + Jumlah + ", Tanggal=" + Tanggal+"]";
    }


    public static void add(dataEcobrick dataEcobrick) {
    }
    
    
}
 