import java.util.concurrent.TimeUnit;
import javax.swing.JFrame;
public class Driver
  {
  public static void main(String[] args) throws Exception
   {
      JFrame frame = new JFrame("Dance Dance Revolution");
      frame.setSize(600, 600);
      frame.setLocation(0, 0);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Display m = new Display();
         frame.add(m);
         m.timer.start();
         frame.setVisible(true);
         for (int i = 0; i < 10; i++) {
            TimeUnit.MILLISECONDS.sleep(5000);
            m.setY(1000);
            m.changeArrow();
            m.timer.restart();
         }
         
   }
}
