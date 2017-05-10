/*Surya Dantuluri
* April 17th 2017
*
* Digestive System Game
*
* Welcome screen starts and button is under title
*
* Human, health bar and foods are present. A drawing on the human pops up trying to signify that s(he) should  feed the human food.
*
* Should have 6 different classes signifying each of the stages: Mouth, Esophogous, Stomach, Small intestine, *Large intestine
*
*-------
* Game starts off with welcome screen.
* Human points to the food options on the right
* Health bar is shown.
* Virtual human player urges normal human player to eat food by showing food on the right.
*
WelcomePage panel shows up with the background
Asks for name and you press start Game
If name is not provided and they press start:::: give them alert asking them to enter a name

LandingPage
User moves desired food to the mouth of hungry calvin, which goes to mouth panel to show process of breakdown of food





*/



// import javax.swing.JFrame;	//import javax.swing.*;
// import javax.swing.JPanel;
//
// //import java.awt.event.MouseEvent;
//
// import java.awt.Color;		//import java.awt.*;
// import java.awt.Font;
// import java.awt.Dimension;
///////////////////////// import Classes needed for Layouts ////////////////////////
// import java.awt.BorderLayout;
// import java.awt.GridLayout;
// import java.awt.CardLayout;
// import java.awt.FlowLayout;
// import javax.swing.JButton;
// import javax.swing.JRadioButton;

import java.awt.Color;     //imports abstract window toolkit
import java.awt.Graphics; //imports possible events of abstract window toolkit
import java.awt.Image; //imports graphics components with swing
import java.awt.Font; //imports fonts
import java.awt.event.MouseListener; //imports package for mouse listener
import java.awt.event.KeyListener; //imports packaga for any key listener
import java.awt.event.MouseEvent; //imports package for any mouse events
import java.awt.event.KeyEvent; //imports packsage for any key events;
import javax.swing.JFrame; //iexpansion pack used for importing GUI JFrame
import javax.swing.JPanel; //imports JPanel
import javax.swing.JLabel; //imports JLabel
import java.io.File; //imports file io
import java.io.IOException; //imports for input out io exception
import javax.imageio.ImageIO; //imports image io

import java.util.ArrayList;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import java.util.Scanner;

import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;


import java.awt.Color;     //imports abstract window toolkit
import java.awt.Graphics; //imports possible events of abstract window toolkit
import java.awt.Image; //imports graphics components with swing
import java.awt.Font;
import java.awt.event.MouseListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;
import javax.imageio.ImageIO;
import java.io.File;
import javax.swing.JFrame;	//import javax.swing.*;
import javax.swing.JPanel;

import java.awt.event.MouseListener;	// or import java.awt.event.*;
import java.awt.event.MouseEvent;
import java.awt.Image; //imports graphics components with swing

import java.awt.Color;		//import java.awt.*;
import java.awt.Graphics;
import java.awt.Font;
import java.awt.Dimension;
///////////////////////// import Classes needed for Layouts ////////////////////////
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import java.io.BufferedWriter;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;


public class EatHealthy extends JFrame//JFrame that holds all panels
{
  private Image image;//sets the image name
  private PanelHolder pHolder;//panel holder
  private CardLayout cards;//card layout
  private FlowLayout flow;
  private BorderLayout border;
  private GridLayout grid;
  public String name;
  public boolean tfinput;
  public boolean noName;//asks for name
  public boolean isPressed;
  public boolean gotoLanding;
  public String input;
  public JTextField enterName;
  private LandingPage canvas;


  private WelcomePanelHolder welcomeHold;
  private LandingPage landingPan;//where the user is most of the time
  // private HealthBarPanel healthyBar;//health bar panel in LandingPage
  // //Mouth, Esophogous, Stomach, Duodenum, Small intestine, *Large intestine
  //private MouthPanel mouthProcess;
  //private MouthQuestions mouthQuiz;
  // private EsophogousPanel esophogousProcess;
  // private EsophogousQuestions esophogousQuiz;
  // private StomachPanel stomachProcess;
  // private StomachQuestions stomachQuiz;
  // private SmallIntestinePanel smallIntestineProcess;
  // private SmallIntestineQuestions smallintestineQuiz;
  // private LargeIntestinePanel largeIntestineProcess;
  // private LargeIntestineQuestions largeIntestineQuiz;
  // private EndingPanel ending;
  public static void main(String[] args)//main method of the eat healthy game and initialize the frame
  {
    System.out.println("class EatHealthy main method");
    EatHealthy eaty = new EatHealthy();
  }

  public EatHealthy()//initializes location, size, close operation, and sets up canvas for landing page as well as intitalize panels/layouts
  {
    super("Eat Healthy!");//initlizes the parents class and names the Eat Healthy game
    setSize(800, 800);		//sets the eat healthy frame size
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);//sets default close opertation
    setLocation(0,0);//sets the "origin"
    setResizable(false);//does not allow the frame to be resized

    getContentPane();//sets content pane
    canvas=new LandingPage();//sets canvas as LandingPage
    getContentPane().add(canvas);//gets content pane and adds canvas

    pHolder = new PanelHolder();//initliazes the panel holder that "holds" all the panels
    cards = new CardLayout();//initilizes cards as CardLayout to be called
    flow = new FlowLayout();//initliazes flow as FlowLayout to be called
    border = new BorderLayout();//initliazes border as BorderLayout to be called
    grid = new GridLayout();//initliazes grid as GridLayout to be called

    pHolder.setLayout(cards);//sets the layout of the panel holder as cards to switch panels

    welcomeHold = new WelcomePanelHolder();//initializes the WelcomePanelHolder
    landingPan = new LandingPage();//initializes the WelcomePanelHolder
    //healthyBar = new HealthyBarPanel();
    //   foodyBar = new FoodPanel();
    //mouthProcess = new MouthPanel();
    //mouthQuiz = new MouthQuestions();
    //  esophogousProcess = new EsophogousPanel();
    //  esophogousQuiz = new EsophogousQuestions();
    //  stomachProcess = new StomachPanel();
    //  stomachQuiz = new StomachQuestions();
    //  smallIntestineProcess = new SmallIntestinePanel();
    //  smallintestineQuiz = new SmallIntestineQuestions();
    //  largeIntestineProcess = new LargeIntestinePanel();
    //  largeIntestineQuiz = new LargeIntestineQuestions();
    //  ending = new EndingPanel();


    pHolder.add(welcomeHold, "WelcomeHolder");//adds the WelcomeHolder to the panel holder panel
    pHolder.add(landingPan, "LandingPage");//adds the landing panel to the panel holder panel
    //pHolder.add(healthyBar, "HealthyBarPanel");
    // pHolder.add(foodyBar, "FoodPanel");
    //pHolder.add(mouthProcess, "MouthPanel");
    //pHolder.add(mouthQuiz, "MouthQuestions");
    // pHolder.add(esophogousProcess, "EsophogousPanel");
    // pHolder.add(esophogousQuiz, "EsophogousQuestions");
    // pHolder.add(stomachProcess, "StomachPanel");
    // pHolder.add(stomachQuiz, "StomachQuestions");
    // pHolder.add(smallIntestineProcess, "SmallIntestinePanel");
    // pHolder.add(smallintestineQuiz, "SmallIntestineQuestions");
    // pHolder.add(largeIntestineProcess, "LargeIntestinePanel");
    // pHolder.add(largeIntestineQuiz, "LargeIntestineQuestions");
    // pHolder.add(ending, "EndingPanel");
    add(pHolder);//adds panel holder to the frame
    setVisible(true);//sets the panel to be visible

    //welcomePan.setBounds(0, 0, 800, 600);
  }

  class PanelHolder extends JPanel//Panel Holder contains all the other panels in game. Background color and a debugging "checkpoint" are set
  {
    public PanelHolder()
    {
      setBackground(Color.GREEN);//sets the background of the panel to green
      System.out.print("PanelHolder is reached");//debugging checkpoint

    }                                //  Panel holder (Holds all the Panels,for the Card Layout)(essentially)
  }

  class WelcomePanelHolder extends JPanel//Another panel holder that holds both the top panel and bottom panel of the welcome page for layout purposes
  {
    public WelcomePanelHolder()//constructor that sets up the panel and makes border layout
    {
      System.out.println("WelcomePanelHolder reached");//Debugging checkpoint
      name="";//sets the username to null
      tfinput = false;//sets all variables to false
      noName = false;//sets all variables to false
      isPressed = false;//sets all variables to false
      gotoLanding = false;//sets all variables to false
      setLayout(new BorderLayout(5, 5)); //Use BorderLayout in main panel. Incorporate Card Layout for all the others
      //Card Layout made( needs more pseudocode)
      setBackground(Color.YELLOW);//sets the background color of the welcome panel holder to yellow
      Font titleFont = new Font("Serif", Font.BOLD, 20); //Set Fonts
      setFont(titleFont);
      WelcomePage welcomePan = new WelcomePage(); //Instantiate the Label Panel for the first Label
      InitializeGame initGame = new InitializeGame(); //Instantiate the Label Panel for the second Label that goes to the north
      add(welcomePan, BorderLayout.CENTER);
      add(initGame, BorderLayout.SOUTH);
      //add(lp, BorderLayout.WEST);
      //add(rp, BorderLayout.EAST);
    }
  }

  class WelcomePage extends JPanel//panel that holds text welcoming user, and other instructions to play game
  {
    Image welcomeBackground = Toolkit.getDefaultToolkit().getImage("welcome.jpg");//getsImage from my computer using the get DefaultToolKit sets the background
    public WelcomePage()//constructor that sets up the panel
    {
      setLayout(flow);
      setBackground(Color.YELLOW);
      System.out.println("WelcomePage constructor");
    }//end Constructor

    public void paintComponent(Graphics g)//paints the text and instructions for game
    {                //graphics method header
      super.paintComponent(g);                  // draw Images first, draws background
      g.drawImage(welcomeBackground, 0,0,800,600,this);//this makes the image
      //g.drawImage(back, 0,0,600,400,this);
      Font font = new Font ("Sans", Font.BOLD, 40);//initializes font
      g.setFont(font);//sets font int graphics
      g.drawString("Welcome to the Eat Healthy Game!",0,100);//sets the string that is displayed on the panel
      System.out.println("WelcomePage paint");
      if(noName)
      {
        g.setColor(Color.RED);
        System.out.println("Please enter yur name!");
        g.drawString("Please enter your name!",100,200);
        isPressed = false;

        if (enterName.getText() == null || enterName.getText().trim().isEmpty() || enterName.getText().equals("Enter Name"))//if else blocks to make sure user has entered name
        {
          System.out.println("Welcome Panel is reset");//debuggin
          isPressed = false;
          noName = true;
        }
        else
        {
          gotoLanding = true;
          repaint();
          System.out.println("gotoLanding is true, go to Landing Page");
        }//end of else
      }//end of noName if
      if (gotoLanding)
      { //boolean for startPressed and hsPressed to trigger thecorresponding CardLayout. For testing we'll just use a String
      cards.show(pHolder, "LandingPage");
      System.out.println("Card Layout go to Landing Page");
    }
  }//end of paintComponent
}//end of welcomePage
class InitializeGame extends JPanel//bottom panel of the welcome page
//Uses JButton and JTextField to ask for name
//uses flow layout and adds action listeners handlers different classes
{
  public InitializeGame()
  {
    System.out.println("InitializeGame reached");
    setLayout(flow);
    setBackground(Color.RED);//set background to yello

    enterName = new JTextField("Enter Name");
    StartAction login = new StartAction();
    enterName.addActionListener(login);
    enterName.setPreferredSize(new Dimension(300,70));
    add(enterName);
    setPreferredSize(new Dimension(600,200));//set Preferred Size of initialize game of the panel
    JButton enterGameButton = new JButton("Start Game");
    enterGameButton.addActionListener(login);//set the entergame button action listener
    enterGameButton.setPreferredSize(new Dimension(300,70));//prefereed size of button
    add(enterGameButton);//add the game button to the panel
  }
}//end of InitializeGame

class StartAction implements ActionListener//action listener class that holds action listener for both the JTextField and JButton in InitializeGame class
{
  public void actionPerformed(ActionEvent e)//action performed method for both the button and the JTextField
  {
    input = e.getActionCommand();
    if(e.getActionCommand().equals("Start Game"))
    {
      System.out.println("button has been pressed");
      isPressed = true;
      input = e.getActionCommand();
      System.out.println("getText name");
      System.out.println(enterName.getText());
      if (enterName.getText() == null || enterName.getText().trim().isEmpty() || enterName.getText().equals("Enter Name"))
      {
        //if the textfield is empty and button is pressed
        noName = true;
        System.out.println("there is no name");
        //cards.show(pHolder, "LandingPage"); check if cards and Landing Page works
        input = e.getActionCommand();
        input = enterName.getText();//ask for text
        System.out.println(input);
        repaint();
      }
      else if(enterName.getText().equals("Enter Name"))
      {
        input = e.getActionCommand();
        System.out.println("This is the new input that has come through if the action commando is Enter Name");
        System.out.println(input);
      }
      else
      {
        gotoLanding = true;
        repaint();
      }
    }//end of if the BUTTON IS PRESSED

  }//end of action performed
}//end of start action class

class LandingPage extends JPanel implements MouseMotionListener, MouseListener//Landing Page panel where user feeds calvin food for digestion. User's goal is to feed Calvin healthy food for him to become a healthier person.

//Uses drawImage and FileIO
//uses mouseDragged method to drag images around and mousePressed to see if image is selected to move around
{//donut, oatmeal, soda, avocado

  public int xfind;
  public int commax;
  public int commay;//used to find the y value with comma of x plus 1
  public int parany;//paranthesis of y
  public int yfind;
  public int brackety;
  public int xpos;
  public int ypos;

  public Image calvinHungry;
  public Image donut;
  public Image oatmeal;
  public Image soda;
  public Image avocado;

  public JLabel label;


  public boolean keyClear;

  public int donutX, donutY, oatmealX, oatmealY, sodaX, sodaY, avocadoX, avocadoY;

  public String calvinHungryName;//name of the file name
  public String donutName;//file name
  public String avocadoName;//file name
  public String sodaName;//file name
  public String oatmealName;//file name

  public String originalme;//what is produced by action performed
  public int mouseDraggedPlace;//where the user drags the mouse to

  public int mousex;
  public int mousey;

  public String xstring;//the string where the x is substringed out of
  public String ystring;//the string whre the y is substringed out of

  public boolean donuton;//if donut is pressed
  public boolean avocadoon;//if avocado is pressed
  public boolean oatmealon;//if oatmeal is pressed
  public boolean sodaon;//if soda is pressed

  public int[] landingDonutX;
  public int[] landingDonutY;

  public int[] landingAvocadoX;
  public int[] landingAvocadoY;

  public int[] landingOatmealX;
  public int[] landingOatmealY;

  public int[] landingSodaX;
  public int[] landingSodaY;


  public int sodaArrayNumber;
  public int oatmealArrayNumber;
  public int donutArrayNumber;
  public int avocadoArrayNumber;



  //ArrayList landingX = new ArrayList();
  //ArrayList landingY = new ArrayList();

  public LandingPage()
  {
    //sizeX=217;
    //sizeY=301;

    sodaArrayNumber = 1;
    oatmealArrayNumber = 1;
    donutArrayNumber = 1;
    avocadoArrayNumber = 1;

    landingDonutX = new int[9999999];
    landingDonutY = new int[9999999];

    landingAvocadoX = new int[9999999];
    landingAvocadoY = new int[9999999];

    landingSodaX = new int[9999999];
    landingSodaY = new int[9999999];

    landingOatmealX = new int[9999999];
    landingOatmealY = new int[9999999];

    donutX = 600-75;//donut-(600 to 750 ,75 to 225)
    donutY = 75-75;////donut-(600 to 750 ,75 to 225)
    oatmealX = donutX;////oatmeal-(640 to 790 ,255 to 405)
    oatmealY = donutY+180-75;//oatmeal-(640 to 790 ,255 to 405)
    sodaX = donutX;//soda-(640 to 790 ,440 to 590)
    sodaY = 440-75;//donut-(soda-(640 to 790 ,440 to 590)
    avocadoX = donutX;//avocado-(640 to 790 ,620 to 770)
    avocadoY = sodaY+180-75;//avocado-(640 to 790 ,620 to 770)

    calvinHungryName="calvin_hungry.png";//file name
    donutName="donut.png";//file name
    avocadoName="avocado.png";//file name
    sodaName="soda.png";//file name
    oatmealName="oatmeal.png";//file name

    //xpos=ypos=200;//sets the inital location of the image

    keyClear=true;

    System.out.println(name);
    setLayout(flow);//sets the layout to flow
    //Card Layout made( needs more pseudocode)
    setBackground(Color.WHITE);//set background to yello
    Font titleFont = new Font("Serif", Font.BOLD, 20);                //Set Fonts
    setFont(titleFont);
    System.out.println("LandingPage reached");
    addMouseMotionListener(this);//adds the mouse motion listner for dragging images
    addMouseListener(this);//adds MouseListener for clicking on images
    run();
    //new MouseMotionAdapter()
  }//end of constructor
  public void run()//calls and runs getMyImage method to get image to use
  {
    getMyImage();//gets images
  }

  public void mouseClicked(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
      public void mouseExited(MouseEvent e){}

        public void mousePressed(MouseEvent e)//if the image is selected then do the following
        {
          requestFocus();
          mousex=e.getX();
          mousey=e.getY();
          System.out.println("mousexy");

          if(mousex>600 && mousex<750 && mousey>75 && mousey<225)//donut
          {
            donuton = true;
            System.out.println("donut pressed");
            oatmealon = false;
            sodaon = false;
            avocadoon = false;
          }
          if(mousex>640 && mousex<790 && mousey>255 && mousey<405)//oatmeal
          {
            oatmealon = true;
            System.out.println("oatmeal pressed");
            donuton = false;
            sodaon = false;
            avocadoon = false;
          }
          if(mousex>640 && mousex<790 && mousey>440 && mousey<590)//soda
          {
            sodaon = true;
            System.out.println("soda pressed");
            oatmealon = false;
            donuton = false;
            avocadoon = false;
          }
          if(mousex>640 && mousex<790 && mousey>620 && mousey<770)//avocado
          {
            avocadoon = true;
            System.out.println("avocado pressed");
            oatmealon = false;
            sodaon = false;
            donuton = false;
          }

          repaint();
        }
        public void mouseReleased(MouseEvent e) {}

          public void mouseDragged(MouseEvent e)//if the image is selected then do the following
          {
            requestFocus();



            originalme = e.toString();//holds the string that comes from the mouse event
            mouseDraggedPlace = originalme.indexOf("MOUSE_DRAGGED,");//returns the value of where MOUSE_DRAGGED is
            mouseDraggedPlace = mouseDraggedPlace+15;//go to front of mousedragged string
            commax = originalme.indexOf(',',mouseDraggedPlace);//sets the end of the x value
            xstring = originalme.substring(mouseDraggedPlace,commax);//finds the x position
            xpos = Integer.parseInt(xstring);//casts the string as an int
            if(xpos>800)
            {
              xpos = 800;
            }
            xpos = Math.max(0, xpos);//uses math methods to set negative x position to 0 if negative
            if(donuton)
            landingDonutX[donutArrayNumber] = xpos;
            else if(oatmealon)
            landingOatmealX[donutArrayNumber] = xpos;
            else if(sodaon)
            landingSodaX[donutArrayNumber] = xpos;
            else if(avocadoon)
            landingAvocadoX[donutArrayNumber] = xpos;

            System.out.print("xpos"+xpos+",");



            commay = commax+1;
            parany = originalme.indexOf(")");
            ystring  = originalme.substring(commay,parany);
            ypos = Integer.parseInt(ystring);
            if(ypos>800)
            {
              ypos = 800;
            }
            ypos = Math.max(0, ypos);//uses math methods to set negative y position to 0 if negative
            if(donuton)
            landingDonutY[donutArrayNumber] = ypos;
            else if(oatmealon)
            landingOatmealY[donutArrayNumber] = ypos;
            else if(sodaon)
            landingSodaY[donutArrayNumber] = ypos;
            else if(avocadoon)
            landingAvocadoY[donutArrayNumber] = ypos;
            System.out.println("ypos"+ypos);
            //once all arrays are updated

            //System.out.println("landingX: " + landingX[landingArray]);
            //System.out.println("landingY: " + landingY[landingArray]);
            landingArray = landingArray+1;


            //make array that sets x and y position as the array number and each time it changes the number increases, uses 2d array and
            //array

            /*
            int donutx;
            int donuty;
            donutx =;
            donuty = 200;
            int[][] positions = new int[4][2];
            positions[0][0] = mousex;
            positions[0][1] = mousey;
            */
            if(donuton)
            {
              donutX = xpos;
              donutY = ypos;
            }
            if(oatmealon)
            {
              oatmealX = xpos;
              oatmealY = ypos;
            }
            if(sodaon)
            {
              sodaX = xpos;
              sodaY = ypos;
            }
            if(avocadoon)
            {
              avocadoX = xpos;
              avocadoY = ypos;
            }
            repaint();
          }
          public void mouseMoved(MouseEvent e){
            //System.out.println("mouse MOVED WRORORKRKRKRKRKRKKKRKRKRKRKRKRKRKKRKRKRKRKRKRKRKRS");
          }

          public void getMyImage()//gets image for use
          {
            try
            {
              calvinHungry=ImageIO.read(new File(calvinHungryName));
              System.out.println("calvinHungryName");
              donut=ImageIO.read(new File(donutName));
              System.out.println("donutName");
              oatmeal=ImageIO.read(new File(oatmealName));
              System.out.println("oatmealName");
              avocado=ImageIO.read(new File(avocadoName));
              System.out.println("avocadoName");
              soda=ImageIO.read(new File(sodaName));
              System.out.println("sodaName");
            }
            catch(IOException e)
            {
              System.err.println("\n\n"+calvinHungryName+"can't be found. \n\n");
              System.out.println("catched calvinHungry");
              System.err.println("\n\n"+donutName+"can't be found. \n\n");
              System.out.println("catched donut");
              System.err.println("\n\n"+oatmealName+"can't be found. \n\n");
              System.out.println("catched oatmeal");
              System.err.println("\n\n"+sodaName+"can't be found. \n\n");
              System.out.println("catched soda");
              System.err.println("\n\n"+avocadoName+"can't be found. \n\n");
              System.out.println("catched avocado");
              e.printStackTrace();
            }
          }//end of get my image

          public void paintComponent(Graphics g)
          {
            super.paintComponent(g);
            g.drawImage(calvinHungry,150,140,300,600,null);
            g.drawImage(avocado,avocadoX-75,avocadoY-75,this);
            g.drawImage(donut,donutX-75,donutY-75,this);// IF THE DONUT IS SELECTED
            g.drawImage(soda,sodaX-75,sodaY-75,this);
            g.drawImage(oatmeal,oatmealX-75,oatmealY-75,this);
            System.out.println("paint donut");
          }
        }//end of landing page
        //start mouth class panels
        //   class Mouth extends JPanel//mouth panel that user moves food around to get digested. Uses key listner and bufferedimage
        //   //also tied in with MouthQuiz to ask questions regarding the class
        //   {
        //     public int foodX;
        //     public int foodY;
        //     public Mouth();
        // helping
        // int x, y; //of the thing you're controlling
        // int speed = 5; //how fast you want to move your ting
        // BufferedImage img = ImageIO.read("mouthpic.png");
        //
        // //In the key method
        //
        // if(up) {
        //   boolean collided = false;
        //   for(int i = 0; i < speed; i++) {
        //     int val = img.getRGB(x, y - i); //getRGB returns the color of the pixel, y - i because going up, & 0xffffff to get rid of first 8 bytes of color (unecessary right now)
        //     if(val == 0) {
        //       collided = true;
        //     }
        //   }
        //   if(collided) y -= speed;
        // }
        //  }
      }


      /*
      Why don't you just setLayout(null) on the parent panel and then, before adding the sub panel to parent , set it's position and dimensions using it's setBounds method. This way there is no need to use paintComponent for positioning the sub panel.

      Is case you parent panel should have specific layout with other components and sub should overlay all that, look into JLayer(Java 7) / JXLayer(Java 6).

      Third solution can be using JLayeredPane.
      */
