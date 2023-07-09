package TampilanAwal;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class controllersimpanjadwal {

    private Stage stage;
    
    private Scene scene;
    
    private Parent root;


    @FXML
    private Button btnPersetujuanJadwal;

    @FXML
    private DatePicker tanggalJadwal;

    @FXML
    void pindahJadwal(MouseEvent event) throws IOException {
        Jadwal ja = new Jadwal();
        String x = tanggalJadwal.getValue().toString();
        ja.setJadwal(x);

        root = FXMLLoader.load(getClass().getResource("Tampilanjadwalpengiriman.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
