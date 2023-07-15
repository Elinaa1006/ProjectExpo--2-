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
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import static javafx.collections.FXCollections.observableArrayList;


public class controller2 implements Initializable{
    ObservableList <dataEcobrick> data =  observableArrayList();

    private Stage stage;
    
    private Scene scene;
    
    private Parent root;

    @FXML
    private TextField namaKontributo;

    @FXML
    private TextField telpKontributor;

    @FXML
    private TextField usernameKontributor;
    
    @FXML
    private TextField alamatKontributor;


    @FXML
    private Button btnKelolaPoin;

    @FXML
    private Button btnKeluar;

    @FXML
    private Button btnTambahData;

    @FXML
    private Button btnProfilKontributor;

    @FXML
    private TextField jumlah;

    @FXML
    private TableColumn<dataEcobrick, String> jumlahTambahData;

    @FXML
    private Button submitTambahData;

    @FXML
    private DatePicker tanggal;

    @FXML
    private TableColumn<dataEcobrick, String> tanggalPengepulan;

    @FXML
    private TextField ukuran;

    @FXML
    private TableView<dataEcobrick> tabelTambahData;

    @FXML
    private TableColumn<dataEcobrick, String> ukuranTambahData;

    @FXML
    private Button btnHapusData;

    @FXML
    private ChoiceBox<String> pilihUser;

    

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

 
    }

    ArrayList<poin> dataPoins= new ArrayList<>();
    CSVWriterPoin writer = new CSVWriterPoin();
    CSVWriterEcobrick tulis = new CSVWriterEcobrick();
    @FXML
    void SubmitData(MouseEvent event) throws IOException {
        // ArrayList <dataEcobrick> writer = new CSVReaderEcobrick().readCSVFile();
        // ArrayList <dataEcobrick> ecobrick = new CSVReaderEcobrick().readCSVFile();

        // String Ukuran = ukuran.getText();
        // String Jumlah = jumlah.getText();
        // String Tanggal = tanggal.getPromptText();

        // ecobrick.add(new dataEcobrick(Ukuran, Jumlah, Tanggal));
        // writer.simpanData(ecobrick);


        String StringTanggal;

        //String Tanggal = tanggal.getValue().toString();
        String Tanggal1 = tanggal.getValue().toString();
        String Ukuran1 = ukuran.getText();
        String Jumlah1 = jumlah.getText();
        int poin = 0;

        data.add(new dataEcobrick(Ukuran1, Jumlah1, Tanggal1));
        tulis.simpanData(data);

        ukuran.setText("");
        jumlah.setText("");

        if(Ukuran1.equalsIgnoreCase("Kecil")){
            poin = 5 * Integer.valueOf(Jumlah1);
        }else if (Ukuran1.equalsIgnoreCase("Sedang")){
            poin = 10 * Integer.valueOf(Jumlah1);
        }else{
            poin = 15 * Integer.valueOf(Jumlah1);
        }

        String poinse = Integer.toString(poin);
        dataPoins.add(new poin(poinse));
        writer.simpanData(dataPoins);
        


        // controllerKelolaPoin point = new controllerKelolaPoin();
        // point.poinse =poin;

        root = FXMLLoader.load(getClass().getResource("TampilanKelolaPoin.fxml"));
        
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        
        
    }

    @FXML
    void hapusData(MouseEvent event) {
        tabelTambahData.getItems().remove(tabelTambahData.getSelectionModel().getSelectedItem());
    }



    @FXML
    public void pindahKelolaPoin(MouseEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("TampilanKelolaPoin.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void pindahTambahData(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("TampilanTambahdata.fxml"));
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

    public void pindahProfilKontributor(MouseEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("TampilanProfilKontributor.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    @FXML
    void pindahslide(MouseEvent event) {

    }

}