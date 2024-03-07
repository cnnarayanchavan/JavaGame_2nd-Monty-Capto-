import java.awt.*;
import java.awt.event.*;
import.java.util.Random;   //IMPORTED NEEDED PACAKGES FOR MAKING WINDOWS
import javax.swing.*;    // TO PLACR THE CHARACTER IN THE GAME AT RANDOM TILES
public class GameStructur {
    int WinWidth=600;
    int WinHeight= 650;
    //needed bigger window this time.

    JFrame frame=new JFrame("MAARIIYOO");

    GameStructur(){
        frame.setVisible(true);
        frame.setSize(WinWidth,WinHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BoarderLayout());
    }
  }
