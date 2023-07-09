package TampilanAwal;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.Node;

public class controllerKelolaPoin implements Initializable{

    private Stage stage;
    
    private Scene scene;
    
    private Parent root;

    
    @FXML
    private Label Point;

    @FXML
    private TextField alamatKontributor;

    @FXML
    private Button btnKelolaPoin;

    @FXML
    private Button btnKeluar;

    @FXML
    private Button btnPofilKontributor;

    @FXML
    private Button btnTambahData;

    @FXML
    private Button btnTukarPoin;

    @FXML
    private TextField namaKontributo;

    @FXML
    private TextField telpKontributor;

    @FXML
    private TextField usernameKontributor;

    @FXML
    void notifTukarPoin(MouseEvent event) throws IOException {
        Alert alert = new Alert(Alert.AlertType.NONE,"",ButtonType.NEXT);
        alert.setTitle("Berhasil");
        // alert.setHeaderText(null);
        alert.setContentText("Selamat Anda Berhasil Menukar Poin");

        alert.showAndWait();
       
        root = FXMLLoader.load(getClass().getResource("TampilanTambahdata.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    public static int poinse;
    ArrayList <poin> dataPoin = new CSVReaderPoin().readCSVFile();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        String a = "";
        System.out.println("Masuk");
        for(int i=0; i<dataPoin.size();i++){
            poin poins = dataPoin.get(i);
            a = poins.getPoin();

        }
        Point.setText(a);
    }

    @FXML
    public void pindahTambahData(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("TampilanTambahdata.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void pindahAwal(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("tampilan1.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void pindahProfilKontributor(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("TampilanProfilKontributor.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    
    @FXML
    void pindahslide(MouseEvent event) {

    }


    public controllerKelolaPoin(){

    }
}


