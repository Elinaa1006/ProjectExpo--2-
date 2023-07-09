package TampilanAwal;
import javafx.event.ActionEvent;
import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;


public class controller1{

    private Stage stage;
    
    private Scene scene;
    
    private Parent root;


    @FXML
    private Button btnKontributor;

    @FXML
    private Button btnAdministrator;

    @FXML
    private Button btnPembeli;

    @FXML
    private Button btnDaftar;

    @FXML
    public void pindahKontributor(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("TampilanTambahdata.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    public void pindahAdministrator(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Tampilanprofiladmin.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void pindahPembeli(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Tampilanprofilpembeli.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void pindahDaftar(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("tampilanDaftar.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    @FXML
    void pindahslide(MouseEvent event) {

    }
}
