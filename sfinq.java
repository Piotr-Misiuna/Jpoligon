import java.awt.*; //gui
import javax.swing.*; //gui 
public class sfinq extends JFrame
{
   JLabel lblWelcome;
   jLabl dateLab;
   eXbutton Eb;

   sfinq()
   {
      dateLab = new jLabl();

      Container c = getContentPane();
      c.add(dateLab, BorderLayout.NORTH);
//eb stauff
Eb = new eXbutton();
getContentPane().add(Eb, BorderLayout.SOUTH);

      setTitle("my first sfinq ");
      setSize(400,300);
      show();
   }
}
