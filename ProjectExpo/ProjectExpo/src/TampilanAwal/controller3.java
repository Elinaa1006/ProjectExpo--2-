package TampilanAwal;


import java.io.IOException;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class controller3 {

    private Stage stage;
    
    private Scene scene;
    
    private Parent root;

    CSVWriter writer = new CSVWriter();
    ArrayList<User> dataUser = new CSVReaderuser().readCSVFile();

    @FXML
    private TextField alamatPembeli;

    @FXML
    private Button btnDataBeli;

    @FXML
    private Button btnKeluar;

    @FXML
    private Button btnProfilPembeli;
  
    @FXML
    private TextField namaPembeli;

    @FXML
    private TextField noPembeli;

    @FXML
    private TextField usernamePembeli;


    @FXML
    private Label totalPembelian;

    @FXML
    private Button buttonoke;

    @FXML
    void savedata(ActionEvent event) {

        String username = usernamePembeli.getText();
        String nama = namaPembeli.getText();
        String Alamat = alamatPembeli.getText();
        String noTeleponpembeli = noPembeli.getText();

        dataUser.add(new User(username,nama,Alamat,noTeleponpembeli));
        writer.simpanData(dataUser);


        try {
            root = FXMLLoader.load(getClass().getResource("Tampilanberandabeli.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    
    }



    
    public void pindahDataBeli(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Tampilanberandabeli.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void pindahProfilPembeli(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Tampilanprofilpembeli.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void pindahAwal(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("tampilan1.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    
}
