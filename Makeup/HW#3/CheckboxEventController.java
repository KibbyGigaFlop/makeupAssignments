import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.CheckBox;

public class CheckboxEventController {

   @FXML
   private CheckBox checkBox;
   
   @FXML
   private Label outputLabel;
   
   //event listener for checkBox
   
   public void checkBoxListener() {
   
      if(checkBox.isSelected())
         outputLabel.setText("yee");
      else
         outputLabel.setText("haw");
   
   }

}