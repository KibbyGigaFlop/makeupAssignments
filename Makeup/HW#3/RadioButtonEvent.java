import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class RadioButtonEvent extends Application {

   public void start (Stage stage) throws Exception {
   
      //load the FXML file
      Parent parent = FXMLLoader.load(
      getClass().getResource("RadioButtonEvent.FXML"));
      
      //Build the scene graph.
      Scene scene = new Scene(parent);
      
      //Display our window, using the scene graph.
      stage.setTitle("RadioButtons");
      stage.setScene(scene);
      stage.show();
      
   }
   
   public static void main(String[] args) {
   
      //launch the application
      launch(args);
   
   }

}