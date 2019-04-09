import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CheckboxDemo extends Application {

   public void start(Stage stage) throws Exception {
   
      //load the fxml file
      Parent parent = FXMLLoader.load(
      getClass().getResource("CheckboxDemo.fxml"));
      
      //build the scene graph
      Scene scene = new Scene(parent);
      
      //display our window, using the scene graph
      stage.setTitle("Checkbox thingy");
      stage.setScene(scene);
      stage.show();

   }
   
   public static void main(String args){
   
      //launch the application
      launch(args);
   
   }
   
}