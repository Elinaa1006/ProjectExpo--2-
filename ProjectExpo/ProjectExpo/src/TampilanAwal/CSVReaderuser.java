package TampilanAwal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVReaderuser {

    public ArrayList<User> readCSVFile() {
        String csvFile = "C://Users//acer//OneDrive//Documents//Funfor Presentasi//ProjectExpo//ProjectExpo//src//TampilanAwal//User.csv"; // Ganti
                                                                                                                                           // dengan
                                                                                                                                           // path
                                                                                                                                           // file
                                                                                                                                           // CSV
                                                                                                                                           // yang
                                                                                                                                           // ingin
                                                                                                                                           // Anda
                                                                                                                                           // baca
        String delimiter = ";"; // Pemisah dalam file CSV

        ArrayList<User> userList = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(csvFile)));
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(delimiter);
                if (data.length == 4) {
                    String username = (data[0].trim());
                    String nama = data[1].trim();
                    String alamat = data[2].trim();
                    String noTelepon = data[3].trim();

                    User user = new User(username, nama, alamat, noTelepon);
                    userList.add(user);
                }
            }
        } catch (IOException e) {
            System.out.println("Fail tidak ditemukan");
            e.printStackTrace();
            // return;
        }

        return userList;
    }

}
