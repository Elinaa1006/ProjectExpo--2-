package TampilanAwal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class CSVReaderPoin {

    public ArrayList<poin> readCSVFile(){
        String csvFile = "ProjectExpo//ProjectExpo//src//TampilanAwal//Poin.csv"; // Ganti dengan path file CSV yang ingin Anda baca
        String delimiter = ";"; // Pemisah dalam file CSV

        ArrayList<poin> poinList = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(csvFile)));
            String line;
            while ((line = br.readLine()) != null) {
            String[] data = line.split(delimiter);
                if (data.length == 1) {
                // String userPemilik = data[0].trim();
                String Poin = (data[0].trim());;
                poin JPoin = new poin(Poin);
                poinList.add(JPoin);
                }
            }
        } catch (IOException e) {
            System.out.println("Fail tidak ditemukan");
            e.printStackTrace();
            //return;
        }

        return poinList;
    }

}
