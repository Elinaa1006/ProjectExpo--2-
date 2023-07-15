package TampilanAwal;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import static javafx.collections.FXCollections.observableArrayList;

public class controllerDataEcobrickAdmin implements Initializable{
    ObservableList <dataEcobrick> data =  observableArrayList();
    

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
    private TableColumn<dataEcobrick, String> jumlahTambahData;

    @FXML
    private TableColumn<dataEcobrick, String> tanggalPengepulan;

    @FXML
    private TableView<dataEcobrick> tabelTambahData;

    @FXML
    private TableColumn<dataEcobrick, String> ukuranTambahData;

    @FXML
    private BarChart<String, Integer> chart;
    
    XYChart.Series <String,Integer> diagram = new XYChart.Series();

    
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



        @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub
        ukuranTambahData.setCellValueFactory(new PropertyValueFactory<dataEcobrick,String>("Ukuran"));
        jumlahTambahData.setCellValueFactory(new PropertyValueFactory<dataEcobrick,String>("Jumlah"));
        tanggalPengepulan.setCellValueFactory(new PropertyValueFactory<dataEcobrick,String>("Tanggal"));
        
        ArrayList<dataEcobrick> readerEcobrick = new CSVReaderEcobrick().readCSVFile();
        for(int i = 0 ; i< readerEcobrick.size(); i++){
            data.add(readerEcobrick.get(i));
        }
  
        tabelTambahData.setItems(data);

        // Membaca data dari tabel dan menambahkannya ke dalam series diagram
        for (dataEcobrick entry : tabelTambahData.getItems()) {
            String tanggal = entry.getTanggal();
            int jumlah = Integer.parseInt(entry.getJumlah());
            diagram.getData().add(new XYChart.Data<>(tanggal, jumlah));
        }

        // Menambahkan series diagram ke dalam bar chartS
        chart.getData().add(diagram);

        chart.getXAxis().setLabel("Tanggal");
        chart.getYAxis().setLabel("Jumlah");

        diagram.setName("Jumlah Ecobrick  per Tanggal");
    }

}

