package TampilanAwal;

public class Lokasi {

    String namajalan;
    String rt;
    String rw;
    String kodePos;
    String kelurahan;
    String kecamatan;
    String provinsi;

    

    public Lokasi(String namajalan, String rt, String rw, String kodePos, String kelurahan, String kecamatan,
            String provinsi) {
        this.namajalan = namajalan;
        this.rt = rt;
        this.rw = rw;
        this.kodePos = kodePos;
        this.kelurahan = kelurahan;
        this.kecamatan = kecamatan;
        this.provinsi = provinsi;
    }



    public void setNamajalan(String namajalan) {
        this.namajalan = namajalan;
    }



    public void setRt(String rt) {
        this.rt = rt;
    }



    public void setRw(String rw) {
        this.rw = rw;
    }



    public void setKodePos(String kodePos) {
        this.kodePos = kodePos;
    }



    public void setKelurahan(String kelurahan) {
        this.kelurahan = kelurahan;
    }



    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }



    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }



    public String getNamajalan() {
        return namajalan;
    }



    public String getRt() {
        return rt;
    }



    public String getRw() {
        return rw;
    }



    public String getKodePos() {
        return kodePos;
    }



    public String getKelurahan() {
        return kelurahan;
    }



    public String getKecamatan() {
        return kecamatan;
    }



    public String getProvinsi() {
        return provinsi;
    }



    @Override
    public String toString() {
        return "Lokasi [namajalan=" + namajalan + ", rt=" + rt + ", rw=" + rw + ", kodePos=" + kodePos + ", kelurahan="
                + kelurahan + ", kecamatan=" + kecamatan + ", provinsi=" + provinsi + "]";
    }

    
    
}
