import java.awt.*;
import java.awt.event.*;
import java.util.Random;   //IMPORTED NEEDED PACAKGES FOR MAKING WINDOWS
import javax.swing.*;    // TO PLACR THE CHARACTER IN THE GAME AT RANDOM TILES
public class GameStructur {
    int WinWidth=600;
    int WinHeight= 650;
    //needed bigger window this time.

    //Defined the classes for window 
    JFrame frame=new JFrame("MAARIIYOO");      //for game window modification.
    JLabel textLabel=new JLabel();             //for title of game in big font.
    JPanel textPanel=new Japnel();             //Panel to hold the lable.
    

    GameStructur(){

        //defined the windo dimentions.
        frame.setVisible(true);
        frame.setSize(WinWidth,WinHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        //for text (Title of game)
        textLabel.setFont(new font ("Ariel", Font PLAIN, 50);
        textLabel.setHorizontalAlignment(JLabel.CENTER);
        
    }
  }
