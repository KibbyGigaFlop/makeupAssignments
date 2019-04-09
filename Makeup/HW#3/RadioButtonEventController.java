import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class RadioButtonEventController {

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
   
   //event listener for the bardRadioButton
   public void bardListener() {
   
      if (bardRadioButton.isSelected())
         outputLabel.setText("You chose the bard.");
         
         }

   //event listener for the warriorRadioButton
   public void warriorListener() {
      
      if (warriorRadioButton.isSelected())
         outputLabel.setText("You chose the warrior.");
         
         }
         
   //event listener for the mageRadioButton
   public void mageListener() { 
      
      if (mageRadioButton.isSelected())
         outputLabel.setText("You chose the mage.");
         
   
   }
   
}