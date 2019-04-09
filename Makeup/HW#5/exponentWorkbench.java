import javax.swing.JOptionPane;
/**
This program allows the user to enter
a number to exponentiate.
*/

public class exponentWorkbench{

   public static void main(String[] args){

      int baseNumber;
      int exponent;
      double product;
      String restartResponse;
      char restart;
      
      do{
      String baseInput = JOptionPane.showInputDialog("Enter the number " + 
      "you want to exponentiate: ");
      baseNumber = Integer.parseInt(baseInput);
      String exponentInput = JOptionPane.showInputDialog("Enter the power: ");
      exponent = Integer.parseInt(exponentInput);
      
      product = Math.pow(baseNumber, exponent);
      
      JOptionPane.showMessageDialog(null, "That is " + product);
      
      restartResponse = JOptionPane.showInputDialog("Would you like to " + 
      "enter in another number? (Y or N)");
      
      restart = restartResponse.charAt(0);
       
      }while(Character.toUpperCase(restart) == 'Y');
   
   }

}