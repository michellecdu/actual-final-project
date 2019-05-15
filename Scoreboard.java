import javax.swing.*;
import java.awt.*;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class Scoreboard extends JPanel //displays scoreboard, sets the points to 0, changes the points, displays new score 
{
   public Scoreboard()
   {
      System.out.println("Display Scoreboard");
      System.out.println("Create box, set points to 0"); 
      System.out.println("Adds text and points to the scoreboard");

   }
   
   public void checkClick() {
      System.out.println("check if the user pressed an arrow key");
   }

    public void newScore(int newScore) {
      System.out.println("determines new score");
    }
    
    public void updateScore(int newScore){
      System.out.println("updates scoreboard");
    }
}
