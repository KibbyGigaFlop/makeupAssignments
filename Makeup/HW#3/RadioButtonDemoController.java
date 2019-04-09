import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class RadioButtonDemoController {

   @FXML
   private RadioButton bardRadioButton;
   
   @FXML
   private ToggleGroup myToggleGroup;
   
   @FXML
   private Label outputLabel;
   
   @FXML
   private Button showChoiceButton;
   
   @FXML
   private RadioButton warriorRadioButton;
   
   @FXML
   private RadioButton mageRadioButton;
   
   //event listener for the showChoiceButton component
   public void showChoiceListener(){
   
   if (bardRadioButton.isSelected())
      outputLabel.setText("You are now a bard.");
   
   if (warriorRadioButton.isSelected())
      outputLabel.setText("You are now a warrior.");
   
   if (mageRadioButton.isSelected())
      outputLabel.setText("You are now a mage.");
   
   }

}