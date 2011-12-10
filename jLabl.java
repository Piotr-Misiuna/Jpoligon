import java.awt.*;
 import java.util.*;
import java.text.*;
import javax.swing.JLabel;

public class jLabl extends JLabel
{
   jLabl()
   {
      Date today = new Date();
      DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, Locale.US);
      String strDate = df.format(today);
      setText("Today is " + strDate);
   
   }
}




