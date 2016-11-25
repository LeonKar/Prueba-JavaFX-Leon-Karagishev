package vista;

import java.io.IOException;

import clase.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ControlFX {
/**
 @author Leon Karagishev
 */
	@FXML

    public void showSendProfile() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("/vista/Send.fxml"));
            AnchorPane page = (AnchorPane) loader.load();
            Stage sendStage = new Stage();
            sendStage.setTitle("Send Profile");
            Scene scene = new Scene(page);
             sendStage.setScene(scene);

            
            sendStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    private void sendStage() {
    	showSendProfile();
    }

    @FXML
    private void closeStage() {
   	        System.exit(0);
    }
    }