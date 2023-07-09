package TampilanAwal;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class controllerJadwal implements Initializable{


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
    private Label labeljadwalkan;

    @FXML
    private DatePicker tanggalJadwal;

    private ObservableList<Penjadwalan> observableArrayList;

    
    public void pindahDataEcobrick(MouseEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Tampilandataecobrick.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    ObservableList<Penjadwalan> data =  observableArrayList;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        Jadwal ja = new Jadwal();
        labeljadwalkan.setText(ja.getJadwal());

    }

    public void pindahJadwal(MouseEvent event) throws IOException {

        String x = tanggalJadwal.getValue().toString();
        Jadwal aj = new Jadwal();
        aj.setJadwal(x);
        root = FXMLLoader.load(getClass().getResource("Tampilanjadwalpengiriman.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }



    @FXML
    void pindah(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Tampilanjadwalpengiriman.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();


    }

    @FXML
    void pindahTambahJadwal(MouseEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Tampilanjadwalpengiriman2.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void pindahLokasi(MouseEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Tampilanlokasi.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void pindahPenjualan(MouseEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Tampilanuploadpenjualan.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void pindahProfilAdministrator(MouseEvent event) throws IOException {
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

}


