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
    JPanel boardPanel=new JPanel();            //for the boardtext or space
    JButton[] board = new JButton[9];           //for array button
    

    //takiing image resources-----------------------------------------------------
    ImageIcon image1;
    ImageIcon image2;

    
    //for randomely placing monty and captos on board tiles =-----------------------------------------
    JButton for_monty;
    JButton for_captos;
    Random random = new Random();


    //for timer and delay in placing characters---------------------------------------------------------
    Timer set_for_monty;
    Timer set_for_captos;

    //Defining variable for trakinf score .......
    int Score=0;
    

    GameStructur(){

        //defined the windo dimentions.-------------------------------------------------------
        
        frame.setVisible(true);
        frame.setSize(WinWidth,WinHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        //for text (Title of game)-----------------------------------------------------------
        
        textLabel.setFont(new Font ("Ariel", Font.PLAIN, 50));
        textLabel.setHorizontalAlignment(JLabel.CENTER);          // for aligining the text into the center os window 
        textLabel.setText("Score : 0");
        textLabel.setOpaque(true);

        //adding textlabel into the text panel to show up on screem.-----------------------------------------------
        
        textPanel.setLayout(new BorderLayout());
        textPanel.add(textLabel);                               //Seted the text to the upper north position.
        frame.add(textPanel, BorderLayout.NORTH);               //frame.add(<>)  this is for addinf the updates into the frame       
        
        //this is for board panel -----------------------------------------------------------------
        
        boardPanel.setLayout(new GridLayout(3,3));
        boardPanel.setBackground(Color.black);               //the background color is optional 
        frame.add(boardPanel);

        //For adding button (clickable) used JButton from JFrame and added them into the frame------------------------------
        //and the images on the tiles
        //here instead of taking direct image we reduce the size of an image from its actual size to fit in a tile perfectly


        // image1 = new ImageIcon(getClass().getResource("./Char1_monty.png"));                     //this is for captos image
        Image captos = new ImageIcon(getClass().getResource("./Char2_capto.png")).getImage();
        image2 = new ImageIcon(captos.getScaledInstance(150, 150,java.awt.Image.SCALE_SMOOTH));


        Image monty= new ImageIcon(getClass().getResource("./Char1_monty.png")).getImage();   //this is for moel image
        image1 = new ImageIcon(monty.getScaledInstance(150, 150,java.awt.Image.SCALE_SMOOTH));


        for(int i=0;i<9;i++){
            JButton tile = new JButton();                //using for loop for buttons 
            board[i]=tile;
            boardPanel.add(tile);
            tile.setFocusable(false);
            //tile.setIcon(image2);                     //comemt it temp.
            //tile.setIcon(image1);

            //have to add action listener within loop
            tile.addActionListener(new ActionListener(){
               public void actionPerformed(ActionEvent e){
                   JButton tile = (JButton) e.getSource();   //here get source is an object type so we need to first cast it into the JButton
                   //now the if else
                   
               } 
            });
        }

        // hopping the monty character on tiles =========================================================
        
          set_for_monty=new Timer(1000, new ActionListener(){
              public void actionPerformed(ActionEvent e){
                  if(for_monty!=null){
                      for_monty.setIcon(null);
                      for_monty=null;
                  }
                  
                  //for randomely select another tile
                  int num=random.nextInt(9);  //from 0-9
                  JButton tile=board[num];

                  //if tile if alreadt taken by char_1 then skip this 
                  if(for_monty==tile) return;


                  for_monty = tile;
                  for_monty.setIcon(image1);

              }
          });


        //Hopping the captos character on tiles =======================================================

             set_for_captos=new Timer(1500, new ActionListener(){
              public void actionPerformed(ActionEvent e){
                  if(for_captos!=null){
                      for_captos.setIcon(null);
                      for_captos=null;
                  }
                  
                  //for randomely select another tile
                  int num=random.nextInt(9);  //from 0-8
                  JButton tile=board[num];

                  
                   //if tile if alreadt taken by char_1 then skip this 
                  if(for_captos==tile) return;


                  for_captos = tile;
                  for_captos.setIcon(image2);

              }
          });

                  

          set_for_monty.start();
          set_for_captos.start();
        
    }
}
