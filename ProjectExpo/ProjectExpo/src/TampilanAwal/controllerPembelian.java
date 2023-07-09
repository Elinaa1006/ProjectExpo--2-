package TampilanAwal;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import javax.swing.plaf.SpinnerUI;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
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
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class controllerPembelian implements Initializable {

    private Stage stage;

    private Scene scene;

    private Parent root;

    @FXML
    private TextField alamatPembeli;

    @FXML
    private Button btnDataBeli;

    @FXML
    private Button btnKeluar;

    @FXML
    private Button btnProfilPembeli;

    @FXML
    private TextField namaPembeli;

    @FXML
    private TextField noPembeli;

    @FXML
    private TextField usernamePembeli;

    @FXML
    private Label hargaBeliBesar;

    @FXML
    private Label hargaBeliKecil;

    @FXML
    private Label hargaBeliSedang;

    @FXML
    private Label jumlahBeliBesar;

    @FXML
    private Label jumlahBeliKecil;

    @FXML
    private Label jumlahBeliSedang;

    @FXML
    private Spinner<Integer> spinnerBesar;

    @FXML
    private Spinner<Integer> spinnerKecil;

    @FXML
    private Spinner<Integer> spinnerSedang;

    @FXML
    private Label totalHargaBeli;

    @FXML
    private Label totalPembelian;

    @FXML
    private Label totalJumlahBeli;

    @FXML
    private Button tombolTransaksi;

    int currentValue;
    int total;
    int currentValueBesar = 0;
    int currentValueSedang = 0;
    int currentValueKecil = 0;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub

        SpinnerValueFactory<Integer> valueFactory1 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100000);
        SpinnerValueFactory<Integer> valueFactory2 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100000);
        SpinnerValueFactory<Integer> valueFactory3 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100000);

        valueFactory1.setValue(0);
        valueFactory2.setValue(0);
        valueFactory3.setValue(0);

        spinnerKecil.setValueFactory(valueFactory1);
        spinnerSedang.setValueFactory(valueFactory2);
        spinnerBesar.setValueFactory(valueFactory3);

        currentValue = spinnerKecil.getValue();
        currentValue = spinnerSedang.getValue();
        currentValue = spinnerBesar.getValue();

        jumlahBeliKecil.setText(Integer.toString(currentValue));
        jumlahBeliSedang.setText(Integer.toString(currentValue));
        jumlahBeliBesar.setText(Integer.toString(currentValue));

        spinnerKecil.valueProperty().addListener(new ChangeListener<Integer>() {

            @Override
            public void changed(ObservableValue<? extends Integer> arg0, Integer arg1, Integer arg2) {

                currentValue = spinnerKecil.getValue();
                jumlahBeliKecil.setText(Integer.toString(currentValue));

                hargaBeliKecil.setText(Integer.toString(currentValue * 1000));
                int currentValuetemp = 1000;

                if (currentValue > currentValueKecil) {
                    currentValueKecil++;
                    int temp = Integer.valueOf(totalPembelian.getText());
                    temp = temp + currentValuetemp;
                    totalPembelian.setText(Integer.toString(temp));
                    total = temp;
                } else {
                    currentValueKecil--;
                    int temp = Integer.valueOf(totalPembelian.getText());
                    temp = temp - currentValuetemp;
                    totalPembelian.setText(Integer.toString(temp));
                    total = temp;
                }

            }

        });

        spinnerSedang.valueProperty().addListener(new ChangeListener<Integer>() {

            @Override
            public void changed(ObservableValue<? extends Integer> arg0, Integer arg1, Integer arg2) {

                currentValue = spinnerSedang.getValue();
                jumlahBeliSedang.setText(Integer.toString(currentValue));

                hargaBeliSedang.setText(Integer.toString(currentValue * 5000));

                int currentValuetemp = 5000;

                if (currentValue > currentValueSedang) {
                    currentValueSedang++;
                    int temp = Integer.valueOf(totalPembelian.getText());
                    temp = temp + currentValuetemp;
                    totalPembelian.setText(Integer.toString(temp));
                    total = temp;
                } else {
                    currentValueSedang--;
                    int temp = Integer.valueOf(totalPembelian.getText());
                    temp = temp - currentValuetemp;
                    totalPembelian.setText(Integer.toString(temp));
                    total = temp;
                }

            }

        });
        spinnerBesar.valueProperty().addListener(new ChangeListener<Integer>() {

            @Override
            public void changed(ObservableValue<? extends Integer> arg0, Integer arg1, Integer arg2) {

                currentValue = spinnerBesar.getValue();
                jumlahBeliBesar.setText(Integer.toString(currentValue));

                hargaBeliBesar.setText(Integer.toString(currentValue * 10000));

                int currentValuetemp = 10000;

                if (currentValue > currentValueBesar) {
                    currentValueBesar++;
                    int temp = Integer.valueOf(totalPembelian.getText());
                    temp = temp + currentValuetemp;
                    totalPembelian.setText(Integer.toString(temp));
                    total = temp;
                } else {
                    currentValueBesar--;
                    int temp = Integer.valueOf(totalPembelian.getText());
                    temp = temp - currentValuetemp;
                    totalPembelian.setText(Integer.toString(temp));
                    total = temp;
                }

            }

        });

    }

    @FXML
    public void pindahDataBeli(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Tampilanberandabeli.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void pindahProfilPembeli(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Tampilanprofilpembeli.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void pindahAwal(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("tampilan1.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void konfirmasitransaksi(MouseEvent event) throws IOException {
        if (total == 0) {
            Alert alert = new Alert(Alert.AlertType.NONE, "", ButtonType.OK);
            alert.setTitle("Error");
            alert.setContentText("Anda belum membeli apapun");
            alert.showAndWait();
        } else {
            Alert alert = new Alert(Alert.AlertType.NONE, "", ButtonType.OK, ButtonType.CLOSE);
            alert.setTitle("Berhasil");
            // alert.setHeaderText(null);
            alert.setContentText("Pembelian Berhasil");

            Optional<ButtonType> result = alert.showAndWait();
            if (result.isPresent() && result.get() == ButtonType.OK) {

            } else {
                root = FXMLLoader.load(getClass().getResource("Tampilan1.fxml"));
                stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();

            }
        }

    }

}
