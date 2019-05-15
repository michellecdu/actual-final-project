import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.TimeUnit;
import java.util.Random;
import java.util.TimerTask;
 
public class Display extends JPanel implements ActionListener {
 
    int x, y;
    Timer timer;
    Timer timer1;
    Random r = new Random(); 
    int rand = r.nextInt(4);
    Display() {
        x = 0;
        y = 1000;
        timer = new Timer(2, this);
    }
    
    public void setY(int a) {
      y = a;
    }
    
    public void changeArrow() {
      rand = r.nextInt(4);
      System.out.println(rand + "");
    }
     
    public void actionPerformed(ActionEvent e) {
        y--;
        repaint();
    }
     
    public void paintComponent(Graphics g) {
     g.setColor(Color.WHITE);
     g.fillRect(0, 0, 1000, 1000);
     addKeyListener(new Key());
     setFocusable(true);
     ImageIcon background = new ImageIcon("images/olaf.gif");
     g.drawImage(background.getImage(), 50, 200, null);
     ImageIcon arrow = new ImageIcon("images/arrowkeys.jpg");
     g.drawImage(arrow.getImage(), 175, 0, null);
     
     
     ImageIcon[] movingArrows = {
         new ImageIcon("images/leftarrow.png"),
         new ImageIcon("images/downarrow.png"),
         new ImageIcon("images/uparrow.png"),
         new ImageIcon("images/rightarrow.png") 
     }; 
     
     
     ImageIcon currArrow = movingArrows[rand];
     if (rand == 0) {
      g.drawImage(currArrow.getImage(), 180, y, 50, 50, null); 
     }
     else if (rand == 1) {
      g.drawImage(currArrow.getImage(), 240, y, 50, 50, null); 
     }
     else if (rand == 2) {
      g.drawImage(currArrow.getImage(), 300, y, 50, 50, null); 
     }
     else {
      g.drawImage(currArrow.getImage(), 360, y, 50, 50, null); 
     }

 }

 private class Key extends KeyAdapter {
   public void keyPressed (KeyEvent e) { 
      if (e.getKeyCode() == KeyEvent.VK_LEFT) 
         System.out.println("hihih");
      System.out.println(timer.getDelay());
   }
 }
}

    
