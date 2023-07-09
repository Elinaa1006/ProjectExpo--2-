package TampilanAwal;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class controllerPenjualan{

    private Stage stage;
    
    private Scene scene;
    
    private Parent root;

    @FXML
    private Button btnDataEcobrick;

    @FXML
    private Button btnJadwal;

    @FXML
    private Button btnKeluar;

    @FXML
    private Button btnLokasi;

    @FXML
    private Button btnPenjualan;

    @FXML
    private Button btnProfilAdministrator;

    @FXML
    private Button btnTambahJadwal;

    @FXML
    private Button btnSubmitPenjualan;

    
    public void pindahDataEcobrick(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Tampilandataecobrick.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void pindahJadwal(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Tampilanjadwalpengiriman.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void pindahJadwalPengiriman(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Tampilanjadwalpengiriman2.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void pindahPenjualan(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Tampilanuploadpenjualan.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void pindahLokasi(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Tampilanlokasi.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void pindahProfilAdministrator(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Tampilanprofiladmin.fxml"));
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

    @FXML
    void submitPenjualan(MouseEvent event) throws IOException {
        Alert alert = new Alert(Alert.AlertType.NONE,"",ButtonType.OK);
        alert.setTitle("Berhasil");
        // alert.setHeaderText(null);
        alert.setContentText("Upload Berhasil");

        alert.showAndWait();
       
        root = FXMLLoader.load(getClass().getResource("tampilan1.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void pindahProfilAdministrator(MouseEvent event) {

    }

}

