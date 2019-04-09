import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.CheckBox;

public class CheckboxDemoController {

   @FXML
   private CheckBox checkBox;
   
   @FXML
   private Label outputLabel;
   
   @FXML
   private Button okButton;
   
   //event listener for the ok button
   public void okButtonListener() {
   
   if (checkBox.isSelected())
      outputLabel.setText("Yee");
   else
      outputLabel.setText("Haw");
   
   }

}