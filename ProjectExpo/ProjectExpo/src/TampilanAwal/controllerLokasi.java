package TampilanAwal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Optional;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class controllerLokasi {

    CSVWriterLokasi writer = new CSVWriterLokasi();

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
    private Button btnPersetujuanJadwal;

    @FXML
    private DatePicker tanggalJadwal;

    @FXML
    private TextField Tkecamatan;

    @FXML
    private TextField Tkelurahan;

    @FXML
    private TextField TkodePos;

    @FXML
    private TextField TnamaJalan;

    @FXML
    private TextField Tprofinsi;

    @FXML
    private TextField Trt;

    @FXML
    private TextField Trw;

    @FXML
    void btnSimpanLokasi(MouseEvent event) throws IOException {
        ArrayList <Lokasi> dataLokasi = new CSVReaderLokasi().readCSVFile();

        String NamaJalan = TnamaJalan.getText();
        String RT = Trt.getText();
        String RW = Trw.getText();
        String KodePos = TkodePos.getText();
        String Kelurahan = Tkelurahan.getText();
        String Kecamatan = Tkecamatan.getText();
        String Provinsi = Tprofinsi.getText();

        dataLokasi.add(new Lokasi(NamaJalan, RT, RW, KodePos, Kelurahan, Kecamatan, Provinsi));
        writer.simpanData(dataLokasi);

        Alert alert = new Alert(Alert.AlertType.NONE,"",ButtonType.NEXT);
        alert.setTitle("Berhasil");
        // alert.setHeaderText(null);
        alert.setContentText("Upload Berhasil");

        alert.showAndWait();
       
        root = FXMLLoader.load(getClass().getResource("Tampilanjadwalpengiriman.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }


    
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

    public void pindahLokasi(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Tampilanlokasi.fxml"));
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
    void pindahProfilAdministrator(MouseEvent event) {

    }

}


