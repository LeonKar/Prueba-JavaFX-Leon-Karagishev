package clase;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 @author Leon Karagishev
 @version 1.0
 */
 
public class Main extends Application {
	
	private AnchorPane rootLayout;
	
	public Stage primaryStage;

	@Override
	public void start(Stage primaryStage){
		try {
			this.primaryStage = primaryStage;
			this.primaryStage.setTitle("My GitHub Profile");

			primaryStage.show();
		
			initRootLayout();
			
		} catch(Exception e) {
			e.printStackTrace();
			}
		}
		
	public void initRootLayout() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("/vista/Profile.fxml"));
			rootLayout = (AnchorPane) loader.load();
			
			Scene scene = new Scene(rootLayout, 600, 400);
			//scene.getStylesheets().add(getClass().getResource("mystylesheet.css").toExternalForm());
			
			primaryStage.setScene(scene);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		launch(args);
	}
}