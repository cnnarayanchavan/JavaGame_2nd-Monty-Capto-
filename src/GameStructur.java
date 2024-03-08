import java.awt.*;
import java.awt.event.*;
import java.util.Random;   //IMPORTED NEEDED PACAKGES FOR MAKING WINDOWS
import javax.swing.*;    // TO PLACR THE CHARACTER IN THE GAME AT RANDOM TILES
public class GameStructur {
    int WinWidth=1550;
    int WinHeight=850;
    //needed bigger window this time.

    //Defined the classes for window 
    JFrame frame=new JFrame("MAARIIYOO");      //for game window modification.
    JLabel textLabel=new JLabel();             //for title of game in big font.
    JPanel textPanel=new JPanel();             //Panel to hold the lable.
    

    GameStructur(){

        //defined the windo dimentions.
        frame.setVisible(true);
        frame.setSize(WinWidth,WinHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        //for text (Title of game)
        textLabel.setFont(new Font ("Ariel", Font.PLAIN, 50));
        textLabel.setHorizontalAlignment(JLabel.CENTER);          // for aligining the text into the center os window 
        textLabel.setText("Score : 0");
        textLabel.setOpaque(true);

        //adding textlabel into the text panel to show up on screem.
        textPanel.setLayout(new BorderLayout());
        textPanel.add(textLabel);
        frame.add(textPanel);
    }
  }
