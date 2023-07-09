package TampilanAwal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class CSVReaderEcobrick {

    public ArrayList<dataEcobrick> readCSVFile(){
        String csvFile = "ProjectExpo\\ProjectExpo\\src\\TampilanAwal\\DataEcobrick.csv"; // Ganti dengan path file CSV yang ingin Anda baca
        String delimiter = ";"; // Pemisah dalam file CSV

        ArrayList<dataEcobrick> ecobrickList = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(csvFile)));
            String line;
            while ((line = br.readLine()) != null) {
            String[] data = line.split(delimiter);
                if (data.length == 3) {
                String Ukuran = (data[0].trim());
                String Jumlah = data[1].trim();
                String Tanggal = data[2].trim();
                dataEcobrick Ecobrick = new dataEcobrick(Ukuran, Jumlah, Tanggal);
                ecobrickList.add(Ecobrick);
                }
            }
        } catch (IOException e) {
            System.out.println("Fail tidak ditemukan");
            e.printStackTrace();
            //return;
        }

        return ecobrickList;
    }

}
