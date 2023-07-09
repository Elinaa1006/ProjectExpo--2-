package TampilanAwal;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.Node;

public class controllerProfilKontributor{

    private Stage stage;
    
    private Scene scene;
    
    private Parent root;

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
    private TextField namaKontributo;

    @FXML
    private TextField telpKontributor;

    @FXML
    private TextField usernameKontributor;

    @FXML
    public void pindahTambahData(MouseEvent event) throws IOException {
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
    public void pindahKelolaPoin(MouseEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("TampilanKelolapoin.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void pindahslide(MouseEvent event) {

    }

}


