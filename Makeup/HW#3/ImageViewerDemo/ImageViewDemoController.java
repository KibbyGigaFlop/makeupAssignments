import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class ImageViewDemoController {

   //private fields for components
   @FXML
   private ImageView imageDisplay;
   
   @FXML
   private ToggleGroup ocToggleGroup;
   
   @FXML
   private RadioButton randaRadioButton;
   
   @FXML
   private RadioButton ozRadioButton;
   
   @FXML
   private RadioButton chewyRadioButton;
   
   @FXML
   private RadioButton peachRadioButton;
   
   @FXML
   private RadioButton cepheiRadioButton;
   
   @FXML
   private RadioButton ariRadioButton;
   
   @FXML
   private RadioButton hyperlinkRadioButton;
   
   @FXML
   private RadioButton chromiumRadioButton;
   
   //private fields for the oc images
   
   private Image randaImage;
   private Image ozImage;
   private Image chewyImage;
   private Image cepheiImage;
   private Image peachImage;
   private Image hyperlinkImage;
   private Image chromiumImage;
   private Image ariImage;
   
   //initialize the method
   
   public void initialize() {
   
   //load the oc images
   
   ariImage = new Image("ari.png");
   randaImage = new Image("randa.png");
   cepheiImage = new Image("cephei.png");
   hyperlinkImage = new Image("hyperlink.png");
   chewyImage = new Image("chewy.png");
   ozImage = new Image("oz.png");
   chromiumImage = new Image("chromium.png");
   peachImage = new Image("peach.png");
   
   }
   
   //event listener for the ariRadioButton
   public void ariRadioButtonListener() {
   
      if (ariRadioButton.isSelected())
         imageDisplay.setImage(ariImage);
   
   }
   //event listener for the peachRadioButton
   public void peachRadioButtonListener() {
   
      if (peachRadioButton.isSelected())
         imageDisplay.setImage(peachImage);
   
   }
   //event listener for the randaRadioButton
   public void randaRadioButtonListener() {
   
      if (randaRadioButton.isSelected())
         imageDisplay.setImage(randaImage);
   
   }
   //event listener for the ozRadioButton
   public void ozRadioButtonListener() {
   
      if (ozRadioButton.isSelected())
         imageDisplay.setImage(ozImage);
   
   }
   //event listener for the chewyRadioButton
   public void chewyRadioButtonListener() {
   
      if (chewyRadioButton.isSelected())
         imageDisplay.setImage(chewyImage);
   
   }
   //event listener for the cepheiRadioButton
   public void cepheiRadioButtonListener() {
   
      if (cepheiRadioButton.isSelected())
         imageDisplay.setImage(cepheiImage);
   
   }
   //event listener for the chromiumRadioButton
   public void chromiumRadioButtonListener() {
   
      if (chromiumRadioButton.isSelected())
         imageDisplay.setImage(chromiumImage);
   
   }
   //event listener for the hyperlinkRadioButton
   public void hyperlinkRadioButtonListener() {
   
      if (hyperlinkRadioButton.isSelected())
         imageDisplay.setImage(hyperlinkImage);
   
   }
   
   
}