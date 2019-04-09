
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class KilometerConverter extends Application{

	
	public void start(Stage stage) throws Exception{
		
		//load the FXML file
		Parent parent = FXMLLoader.load(
				getClass().getResource("KilometerConverter.fxml"));
		
		//build the scene graph.
		Scene scene = new Scene(parent);
		
		//display our window, using the scene graph.
		stage.setTitle("Miles to Kilometers Converter");
		stage.setScene(scene);
		stage.show();
		
	}
	
	public static void main(String[] args) {
		
		//launch the application
		launch(args);
		
	}
	
}
