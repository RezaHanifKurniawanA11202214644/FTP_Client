package id.my.rezahanif.ftp_client;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application{
    @Override
    public void start(Stage primaryStage){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/id/my/rezahanif/ftp_client/apps-view.fxml"));
            primaryStage.setTitle("FTP Client - EarlyBird PBO");
            primaryStage.setScene(new Scene(root));
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();  // Print stack trace for debugging
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
