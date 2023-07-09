package TampilanAwal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class CSVReaderLokasi {

    public ArrayList<Lokasi> readCSVFile(){
        String csvFile = "ProjectExpo//ProjectExpo//src//TampilanAwal//lokasi.csv"; // Ganti dengan path file CSV yang ingin Anda baca
        String delimiter = ";"; // Pemisah dalam file CSV

        ArrayList<Lokasi> LokasiList = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(csvFile)));
            String line;
            while ((line = br.readLine()) != null) {
            String[] data = line.split(delimiter);
                if (data.length == 7) {
                String NamaJalan = (data[0].trim());
                String Rt = data[1].trim();
                String Rw = data[2].trim();
                String KodePos = data[3].trim();
                String Kelurahan = data[4].trim();
                String Kecamatan = data[5].trim();
                String Provinsi = data[6].trim();
                Lokasi lokasiAdmin = new Lokasi(NamaJalan, Rt, Rw, KodePos, Kelurahan, Kecamatan, Provinsi);
                LokasiList.add(lokasiAdmin);
                }
            }
        } catch (IOException e) {
            System.out.println("Fail tidak ditemukan");
            e.printStackTrace();
            //return;
        }

        return LokasiList;
    }

}

