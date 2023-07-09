package TampilanAwal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class CSVReaderPenjadwalan {

    public ArrayList<Penjadwalan> readCSVFile(){
        String csvFile = "ProjectExpo\\ProjectExpo\\src\\TampilanAwal\\penjadwalan.csv"; // Ganti dengan path file CSV yang ingin Anda baca
        String delimiter = ";"; // Pemisah dalam file CSV

        ArrayList<Penjadwalan> jadwal = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(csvFile)));
            String line;
            while ((line = br.readLine()) != null) {
            String[] data = line.split(delimiter);
                if (data.length == 1) {
                String Tanggal = data[0].trim();
                Penjadwalan dataJadwal = new Penjadwalan(Tanggal);
                jadwal.add(dataJadwal);
                }
            }
        } catch (IOException e) {
            System.out.println("Fail tidak ditemukan");
            e.printStackTrace();
            //return;
        }

        return jadwal;
    }

}
