package TampilanAwal;

import java.util.ArrayList;

public class demo {
    public static void main(String[] args) {
        CSVWriter writer = new CSVWriter();
        ArrayList<User> dataUser = new CSVReaderuser().readCSVFile();
        
        dataUser.add(new User("sopojarwo","sopo","manggadua","081234"));
        writer.simpanData(dataUser);
        for (User i : dataUser){
            System.out.println(i.toString());
        }
    }
}
