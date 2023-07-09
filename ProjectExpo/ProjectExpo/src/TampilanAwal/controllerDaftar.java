package TampilanAwal;

import java.io.IOException;
import java.util.ArrayList;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class controllerDaftar {
    CSVWriterDaftar writer = new CSVWriterDaftar();
    
    private Stage stage;
    
    private Scene scene;
    
    private Parent root;
    
    @FXML
    private TextField alamatDaftar;

    @FXML
    private Button btnDaftar;

    @FXML
    private PasswordField konfirmasiDaftar;

    @FXML
    private TextField namaDaftar;

    @FXML
    private TextField noDaftar;

    @FXML
    private PasswordField passwordDaftar;

    @FXML
    private CheckBox perstujuan;
    
    @FXML
    void pindahTampilanAwal(MouseEvent event) throws IOException {
        ArrayList <userDaftar> dataDaftar = new CSVReader().readCSVFile();
        
        String Nama = namaDaftar.getText();
        String No = noDaftar.getText();
        String Alamat = alamatDaftar.getText();
        String Password = passwordDaftar.getText();
        String KonfirmasiPassw =konfirmasiDaftar.getText();

        dataDaftar.add(new userDaftar(Nama, No, Alamat, Password));
        writer.simpanData(dataDaftar);

        if(Password.equals(KonfirmasiPassw)){
            root = FXMLLoader.load(getClass().getResource("tampilan1.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }else{
            Alert alert = new Alert(Alert.AlertType.NONE,"",ButtonType.OK);
             alert.setTitle("Gagal");
            // alert.setHeaderText(null);
            alert.setContentText("Sandi tidak sama");
            alert.showAndWait();
        }
    }
}


