package TampilanAwal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class CSVReader {

    public ArrayList<userDaftar> readCSVFile(){
        String csvFile = "C:/Users/acer/OneDrive/Documents/Funfor Presentasi/ProjectExpo/ProjectExpo/src/TampilanAwal/userDaftar.csv"; // Ganti dengan path file CSV yang ingin Anda baca
        String delimiter = ";"; // Pemisah dalam file CSV

        ArrayList<userDaftar> daftarList = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(csvFile)));
            String line;
            while ((line = br.readLine()) != null) {
            String[] data = line.split(delimiter);
                if (data.length == 4) {
                String Nama = (data[0].trim());
                String NoTelepon = data[1].trim();
                String Alamat = data[2].trim();
                String Password = data[3].trim();
                userDaftar daftarUser = new userDaftar(Nama, NoTelepon, Alamat, Password);
                daftarList.add(daftarUser);
                }
            }
        } catch (IOException e) {
            System.out.println("Fail tidak ditemukan");
            e.printStackTrace();
            //return;
        }

        return daftarList;
    }

}
