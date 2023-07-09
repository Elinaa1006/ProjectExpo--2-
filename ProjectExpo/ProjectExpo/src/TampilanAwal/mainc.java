package TampilanAwal;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class mainc extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("tampilan1.fxml"));
        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.setTitle("ECOIN");

        Image foto = new Image("img/logoapk.jpg");
        primaryStage.getIcons().add(foto);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);

    }
}
