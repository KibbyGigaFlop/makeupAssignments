import javax.swing.JOptionPane;

public class whitespaceCount{

   public static void main(String[] args){
   
   String str = JOptionPane.showInputDialog("Enter in a string.");
   char[] strArray = str.toCharArray();
   int whitespaces = 0;
   
   for (int i = 0; i < strArray.length; i++){
   
      if (Character.isWhitespace(strArray[i]))
         whitespaces++;
   
      }
      
   JOptionPane.showMessageDialog(null, "That string contained " + 
   whitespaces + " whitespace(s).");
   
   }

}