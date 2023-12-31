package TampilanAwal;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
// import java.io.File;

public class CSVWriterDaftar {

    public void simpanData(ArrayList<userDaftar> dataUser) {
        String csvFile = "ProjectExpo//src//TampilanAwal//userDaftar.csv";
        String delimiter = ";"; // Pemisah dalam file CSV

        // Menghapus isi file CSV yang sudah ada
        try {
            PrintWriter writer = new PrintWriter(csvFile);
            writer.print("");
            writer.close();
            System.out.println("Isi file CSV berhasil dihapus.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Menyimpan data ke file CSV
        try (FileWriter fileWriter = new FileWriter(csvFile, true)) {
            PrintWriter writer = new PrintWriter(fileWriter);

            // writer.println("ID" + delimiter + "Nama"); // Menambahkan header jika
            // diperlukan

            // Menambahkan data mahasiswa ke file CSV
            for (userDaftar i : dataUser) {
                writer.println(i.getNama() + delimiter + i.getNo() + delimiter + i.getAlamat() + delimiter+ i.getPassword());
            }
            // writer.println("1" + delimiter + "John Doe");
            // writer.println("2" + delimiter + "Jane Smith");
            // writer.println("3" + delimiter + "Michael Johnson");

            writer.flush();
            writer.close();
            System.out.println("Data berhasil disimpan ke file CSV.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

