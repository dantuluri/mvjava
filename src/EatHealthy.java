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


Calvin starts at 0 Health
+50 for avocado
+100 for oatmeal
-50 for soda
-100 for donut

You are reaching for 100 health!

If health is negative -> then angry Calvin

If health is more than 0 and less than 5- -> normal Calvin

If health is more than 150 including 150 then very happy calvin

Propmt user telling them that calvin will feel bad if you feed him the SAME FOOD


*/
///////////////////////// import Classes needed for Layouts ////////////////////////
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;     //imports abstract window toolkit
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyEvent; //imports packsage for any key events;
import java.awt.event.KeyListener; //imports packaga for any key listener
import java.awt.event.MouseEvent; //imports package for any mouse events
import java.awt.event.MouseListener; //imports package for mouse listener
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.FlowLayout;
import java.awt.Font; //imports fonts
import java.awt.Frame;
import java.awt.Graphics; //imports possible events of abstract window toolkit
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.awt.Image; //imports graphics components with swing
import java.awt.Point;
import java.awt.Toolkit;
import java.io.BufferedWriter;
import java.io.File; //imports file io
import java.io.FileWriter;
import java.io.IOException; //imports for input out io exception
import java.lang.Object;
import java.util.ArrayList;
import java.util.Scanner;
import javax.imageio.ImageIO; //imports image io
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFrame; //iexpansion pack used for importing GUI JFrame
import javax.swing.JLabel; //imports JLabel
import javax.swing.JOptionPane;
import javax.swing.JPanel; //imports JPanel
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.imageio.ImageIO;

import java.awt.Graphics2D;

// public class ColorPan extends JComponent {
//   public void paint(Graphics g) {
//     int width = getSize().width;
//     int height = getSize().height;
//     int[] data = new int[width * height];
//     int i = 0;
//     for (int y = 0; y < height; y++) {
//       int red = (y * 255) / (height - 1);
//       for (int x = 0; x < width; x++) {
//         int green = (x * 255) / (width - 1);
//         int blue = 128;
//         data[i++] = (red << 16) | (green << 8) | blue;
//       }
//     }
//     BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
//     image.setRGB(0, 0, width, height, data, 0, width);
//     g.drawImage(image, 0, 0, this);
//   }
//
//   public static void main(String[] args) {
//     JFrame frame = new JFrame("ColorPan");
//     frame.getContentPane().add(new ColorPan());
//     frame.setSize(300, 300);
//     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     frame.setVisible(true);
//   }
// }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
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
  private LandingPage lancanvas;
  private MouthPanel mouthcanvas;
  public String food;
  public int fiber;
  public int protein;
  public int sugar;
  public int health;
  public String healthName;

  private WelcomePanelHolder welcomeHold;
  private LandingPage landingPan;//where the user is most of the time
  // private HealthBarPanel healthyBar;//health bar panel in LandingPage
  // //Mouth, Esophogous, Stomach, Duodenum, Small intestine, *Large intestine
  private MouthPanel mouthProcess;
  private MouthQuestions mouthQuiz;
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
    health=0;
    food = "surya";
    healthName="surya";
    getContentPane();//sets content pane
    lancanvas=new LandingPage();//sets canvas as LandingPage
    mouthcanvas=new MouthPanel();
    getContentPane().add(lancanvas);//gets content pane and adds canvas
    getContentPane().add(mouthcanvas);

    pHolder = new PanelHolder();//initliazes the panel holder that "holds" all the panels
    cards = new CardLayout();//initilizes cards as CardLayout to be called
    flow = new FlowLayout();//initliazes flow as FlowLayout to be called
    border = new BorderLayout();//initliazes border as BorderLayout to be called
    grid = new GridLayout();//initliazes grid as GridLayout to be called

    pHolder.setLayout(cards);//sets the layout of the panel holder as cards to switch panels

    welcomeHold = new WelcomePanelHolder();//initializes the WelcomePanelHolder
    landingPan = new LandingPage();//initializes the WelcomePanelHolder
    //healthyBar = new HealthyBarPanel();
    mouthProcess = new MouthPanel();
    mouthQuiz = new MouthQuestions();
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
    pHolder.add(mouthProcess, "MouthPanel");
    pHolder.add(mouthQuiz, "MouthQuestions");
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
  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  class PanelHolder extends JPanel//Panel Holder contains all the other panels in game. Background color and a debugging "checkpoint" are set
  {
    public PanelHolder()
    {
      setBackground(Color.GREEN);//sets the background of the panel to green
      System.out.print("PanelHolder is reached");//debugging checkpoint

    }                                //  Panel holder (Holds all the Panels,for the Card Layout)(essentially)
  }
  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
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
  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
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
      Font helvec = new Font ("Helvetica Neue", Font.BOLD, 40);//initializes font
      g.setFont(helvec);//sets font int graphics
      g.drawString("Welcome to the Eat Healthy Game!",60,100);//sets the string that is displayed on the panel
      Color purplo = new Color (194,24,91);
      g.setColor(purplo);
      Font chalkboard = new Font ("Chalkboard", Font.BOLD, 20);//initializes font
      g.setFont(chalkboard);//sets font int graphics
      g.drawString("Help Calvin restore his health after spending a fun filled afternoon of playing with Hobbes!",20,200);//sets the string that is displayed on the panel
      Color orango = new Color (255,23,68);
      g.setColor(orango);
      Font comic = new Font ("Comic Sans MS", Font.BOLD, 20);//initializes font
      g.setFont(comic);//sets font int graphics
      g.drawString("To start the game, please enter your name and press the Start Game button",20,500);//sets the string that is displayed on the panel

      System.out.println("WelcomePage paint");
      if(noName)
      {
        Font chalkboardbig = new Font ("Chalkboard", Font.BOLD, 50);//initializes font
        g.setFont(chalkboardbig);
        g.setColor(Color.RED);
        System.out.println("Please enter yur name!");
        g.drawString("Please enter your name!",100,400);
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
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
class InitializeGame extends JPanel//bottom panel of the welcome page
//Uses JButton and JTextField to ask for name
//uses flow layout and adds action listeners handlers different classes
{
  public InitializeGame()
  {
    System.out.println("InitializeGame reached");
    setLayout(flow);
    setBackground(Color.GREEN);//set background to yello

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
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
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


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

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

  public Image landingBackground;
  public Image calvinHungry;
  public Image calvinNormal;
  public Image calvinTriggered;
  public Image calvinHappy;
  public Image donut;
  public Image oatmeal;
  public Image soda;
  public Image avocado;
  public Image areaIn;

  public JLabel label;


  public boolean keyClear;

  public int donutX, donutY, oatmealX, oatmealY, sodaX, sodaY, avocadoX, avocadoY;

  public String landingBackgroundString;
  public String calvinHungryName;//name of the file name
  public String calvinNormalName;
  public String calvinTriggeredName;
  public String calvinHappyName;
  public String donutName;//file name
  public String avocadoName;//file name
  public String sodaName;//file name
  public String oatmealName;//file name
  public String areaInName;

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

    landingDonutX = new int[2262002];
    landingDonutY = new int[2262002];

    landingAvocadoX = new int[2262002];
    landingAvocadoY = new int[2262002];

    landingSodaX = new int[2262002];
    landingSodaY = new int[2262002];

    landingOatmealX = new int[2262002];
    landingOatmealY = new int[2262002];

    donutX = 640;//donut-(600 to 750 ,75 to 225) ORIGINAL POS
    donutY = 75;////donut-(600 to 750 ,75 to 225) ORIGINAL POS
    oatmealX = 640;////oatmeal-(640 to 790 ,255 to 405) ORIGINAL POS
    oatmealY = 280;//oatmeal-(640 to 790 ,255 to 405) ORIGINAL POS
    sodaX = 640;//soda-(640 to 790 ,440 to 590) ORIGINAL POS
    sodaY = 460;//donut-(soda-(640 to 790 ,440 to 590) ORIGINAL POS
    avocadoX = 640;//avocado-(640 to 790 ,620 to 770) ORIGINAL POS
    avocadoY = 640;//avocado-(640 to 790 ,620 to 770) ORIGINAL POS

    //find out what donutX is doing tbh
    landingBackgroundString="landing_back.png";
    calvinHungryName="calvin_hungry.png";//file name
    calvinHappyName="calvin_happy.png";
    calvinTriggeredName="calvin_triggered.png";
    calvinNormalName="calvin_normal.png";
    donutName="donut.png";//file name
    avocadoName="avocado.png";//file name
    sodaName="soda.png";//file name
    oatmealName="oatmeal.png";//file name
    areaInName="areain.png";
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
    getHealth();
  }

  public void mouseClicked(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
      public void mouseExited(MouseEvent e){}

        public void mousePressed(MouseEvent e)//if the image is selected then do the following
        {
          donutX = 640;//donut-(600 to 750 ,75 to 225) ORIGINAL POS
          donutY = 75;////donut-(600 to 750 ,75 to 225) ORIGINAL POS
          oatmealX = 640;////oatmeal-(640 to 790 ,255 to 405) ORIGINAL POS
          oatmealY = 280;//oatmeal-(640 to 790 ,255 to 405) ORIGINAL POS
          sodaX = 640;//soda-(640 to 790 ,440 to 590) ORIGINAL POS
          sodaY = 460;//donut-(soda-(640 to 790 ,440 to 590) ORIGINAL POS
          avocadoX = 640;//avocado-(640 to 790 ,620 to 770) ORIGINAL POS
          avocadoY = 640;//avocado-(640 to 790 ,620 to 770) ORIGINAL POS

          requestFocus();
          mousex=e.getX();
          mousey=e.getY();
          System.out.println("X: "+mousex+" , Y: "+mousey);
          System.out.println("mousexy");
          //System.out.println("MOUonutlandingX: " + landingDonutX[donutArrayNumber-1]);
          //System.out.println("MOUSEYdonutlandingY: " + landingDonutY[donutArrayNumber-1]);
          if(mousex>565 && mousex<715 && mousey>0 && mousey<150)//donut
          {
            donuton = true;
            System.out.println("donut_ pressed");
            oatmealon = false;
            sodaon = false;
            avocadoon = false;
          }
          if(mousex>565 && mousex<715 && mousey>205 && mousey<355)//oatmeal
          {
            oatmealon = true;
            System.out.println("oatmeal_ pressed");
            donuton = false;
            sodaon = false;
            avocadoon = false;
          }
          if(mousex>565 && mousex<715 && mousey>385 && mousey<535)//soda
          {
            sodaon = true;
            System.out.println("soda_ pressed");
            oatmealon = false;
            donuton = false;
            avocadoon = false;
          }
          if(mousex>565 && mousex<715 && mousey>565 && mousey<715)//avocado
          {
            avocadoon = true;
            System.out.println("avocado_ pressed");
            oatmealon = false;
            sodaon = false;
            donuton = false;
          }
          if(donuton && (mousex<(landingDonutX[donutArrayNumber]) || mousex>landingDonutX[donutArrayNumber]) && (mousey<(landingDonutY[donutArrayNumber]) || mousey>(landingDonutY[donutArrayNumber])))//the the array points
          {
            //then  donuton = true;
            donuton = true;
            System.out.println("donutARRAY pressed");
            oatmealon = false;
            sodaon = false;
            avocadoon = false;
          }
          if(sodaon && (mousex<(landingSodaX[sodaArrayNumber]) || mousex>landingSodaX[sodaArrayNumber]) && (mousey<(landingSodaY[sodaArrayNumber]) || mousey>(landingSodaY[sodaArrayNumber])))//the the array points
          {
            //then  donuton = true;
            sodaon = true;
            System.out.println("sodaARRAY pressed");
            oatmealon = false;
            donuton = false;
            avocadoon = false;
          }
          if(oatmealon && (mousex<(landingOatmealX[oatmealArrayNumber]) || mousex>landingOatmealX[oatmealArrayNumber]) && (mousey<(landingOatmealY[oatmealArrayNumber]) || mousey>(landingOatmealY[oatmealArrayNumber])))//the the array points
          {
            //then  donuton = true;
            oatmealon = true;
            System.out.println("oatmealARRAY pressed");
            donuton = false;
            sodaon = false;
            avocadoon = false;
          }
          if(avocadoon && (mousex<(landingAvocadoX[avocadoArrayNumber]) || mousex>landingAvocadoX[avocadoArrayNumber]) && (mousey<(landingAvocadoY[avocadoArrayNumber]) || mousey>(landingAvocadoY[avocadoArrayNumber])))//the the array points
          {
            //then  donuton = true;
            avocadoon = true;
            System.out.println("avocadoARRAY pressed");
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
            {
              landingDonutX[donutArrayNumber] = xpos;
            }
            else if(oatmealon)
            {
              landingOatmealX[oatmealArrayNumber] = xpos;
            }
            else if(sodaon)
            {
              landingSodaX[sodaArrayNumber] = xpos;
            }
            else if(avocadoon)
            {
              landingAvocadoX[avocadoArrayNumber] = xpos;
            }
            System.out.println("CURRxpos"+xpos+",");



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
            {
              landingDonutY[donutArrayNumber] = ypos;
              System.out.println("PREdonutlandingX: " + landingDonutX[donutArrayNumber-1]);
              System.out.println("PREdonutlandingY: " + landingDonutY[donutArrayNumber-1]);
              donutArrayNumber++;

            }
            else if(oatmealon)
            {
              landingOatmealY[oatmealArrayNumber] = ypos;
              System.out.println("oatmeallandingX: " + landingOatmealX[oatmealArrayNumber]);
              System.out.println("oatmeallandingY: " + landingOatmealY[oatmealArrayNumber]);
              oatmealArrayNumber++;

            }
            else if(sodaon)
            {
              landingSodaY[sodaArrayNumber] = ypos;
              System.out.println("sodalandingX: " + landingSodaX[sodaArrayNumber]);
              System.out.println("sodalandingY: " + landingSodaY[sodaArrayNumber]);
              sodaArrayNumber++;

            }
            else if(avocadoon)
            {
              landingAvocadoY[avocadoArrayNumber] = ypos;
              System.out.println("avolandingX: " + landingAvocadoX[avocadoArrayNumber]);
              System.out.println("avolandingY: " + landingAvocadoY[avocadoArrayNumber]);
              avocadoArrayNumber++;

            }
            System.out.println("CURRypos"+ypos);
            //once all arrays are updated

            //make array that sets x and y position as the array number and each time it changes the number increases, uses 2d array and
            //array

            if(donuton)
            {
              donutX = xpos;
              donutY = ypos;
              System.out.println("donutonX: "+donutX+"donutonY: "+donutY);
              if(donutX>225 && donutX<425 && donutY>465 && donutY<565)
              {
                // food = "donut";
                // cards.show(pHolder, "MouthPanel");
                String inputValue = JOptionPane.showInputDialog("Type in CONTINUE or CANCEL depending on if you intended to feed Calvin a donut");

                if(inputValue.equals("CONTINUE")||inputValue.equals("continue"))
                {
                  food = "donut";
                  System.out.println("INPUT VALUE WORKS AVOCADO MOUTH PANEL MOVE");
                  cards.show(pHolder, "MouthPanel");
                }
                else if(inputValue.equals("CANCEL") || inputValue.equals("NO") || inputValue.equals("cancel"))
                {
                  System.out.println("CANCEL INPUT VALUE");
                  cards.show(pHolder, "LandingPage");
                  repaint();
                }

              }
            }
            if(oatmealon)
            {
              oatmealX = xpos;
              oatmealY = ypos;
              System.out.println("oatmealX: "+oatmealX+"oatmealY: "+oatmealY);
              if(oatmealX>225 && oatmealX<425 && oatmealY>465 && oatmealY<565)
              {
                String inputValue = JOptionPane.showInputDialog("Type in CONTINUE or CANCEL depending on if you intended to feed Calvin oatmeal");

                if(inputValue.equals("CONTINUE")||inputValue.equals("continue"))
                {
                  food = "oatmeal";
                  System.out.println("INPUT VALUE WORKS AVOCADO MOUTH PANEL MOVE");
                  cards.show(pHolder, "MouthPanel");
                }
                else if(inputValue.equals("CANCEL") || inputValue.equals("NO") || inputValue.equals("cancel"))
                {
                  System.out.println("CANCEL INPUT VALUE");
                  cards.show(pHolder, "LandingPage");
                  repaint();
                }

              }
            }
            if(sodaon)
            {
              sodaX = xpos;
              sodaY = ypos;
              System.out.println("sodaX: "+sodaX+"sodaY: "+sodaY);
              if(sodaX>225 && sodaX<425 && sodaY>465 && sodaY<565)
              {

                String inputValue = JOptionPane.showInputDialog("Type in CONTINUE or CANCEL depending on if you intended to give Calvin soda");


                if(inputValue.equals("CONTINUE"))
                {
                  food = "soda";
                  System.out.println("INPUT VALUE WORKS AVOCADO MOUTH PANEL MOVE");
                  cards.show(pHolder, "MouthPanel");
                }
                else if(inputValue.equals("CANCEL") || inputValue.equals("NO"))
                {
                  System.out.println("CANCEL INPUT VALUE");
                  cards.show(pHolder, "LandingPage");
                  repaint();
                }

              }
            }
            if(avocadoon)
            {
              avocadoX = xpos;
              avocadoY = ypos;
              System.out.println("avocadoX: "+avocadoX+"avocadoY: "+avocadoY);
              if(avocadoX>225 && avocadoX<425 && avocadoY>465 && avocadoY<565)
              {

                String inputValue = JOptionPane.showInputDialog("Type in CONTINUE or CANCEL depending on if you intended to feed Calvin an avocado");

                if(inputValue.equals("CONTINUE"))
                {
                  food = "avocado";
                  System.out.println("INPUT VALUE WORKS AVOCADO MOUTH PANEL MOVE");
                  cards.show(pHolder, "MouthPanel");
                }
                else if(inputValue.equals("CANCEL") || inputValue.equals("NO"))
                {
                  System.out.println("CANCEL INPUT VALUE");
                  cards.show(pHolder, "LandingPage");
                  repaint();
                }

              }
            }

            repaint();
          }//MOUSEDRAGGED end




          public void mouseMoved(MouseEvent e){
            //System.out.println("mouse MOVED WRORORKRKRKRKRKRKKKRKRKRKRKRKRKRKKRKRKRKRKRKRKRKRS");
          }

          public void getMyImage()//gets image for use
          {
            try
            {
              landingBackground=ImageIO.read(new File(landingBackgroundString));
              System.out.println("landingBackground");
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
              //areaIn=ImageIO.read(new File(areaInName));//if user presses in
              //System.out.println("areaIn");
            }
            catch(IOException e)
            {
              System.err.println("\n\n"+landingBackgroundString+"can't be found. \n\n");
              System.out.println("catched landingBackground");
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
              //System.err.println("\n\n"+areaInName+"can't be found. \n\n");
              //System.out.println("catched areaInName");
              e.printStackTrace();
            }
          }//end of get my image

          public void getHealth()
          {
            switch(food) {
                case "donut":
                    health = health-50;
                    fiber=0;
                    sugar =50;
                    protein =0;
                    break;
                case "oatmeal":
                    health = health+ 100;
                    fiber =75;
                    sugar=10;
                    protein=50;
                    break;
                case "soda":
                    health = health+ 50;
                    sugar = 100;
                    protein=0;
                    fiber=0;
                    break;
                case "avocado":
                    health = health+50;
                    fiber=100;
                    protein=20;
                    sugar=10;
                    break;
                default:
                    break;
            }
          }

          public void paintComponent(Graphics g)
          {
            super.paintComponent(g);
            g.drawImage(landingBackground,0,0,800,800,null);
            if(health>40 && health<120)
            {
              g.drawImage(calvinNormal,120,200,420,600,null);
              healthName = "feeling okay";
              Font helvec = new Font ("Helvetica Neue", Font.BOLD, 48);//initializes font
              g.setFont(helvec);//sets font int graphics
              Color normal = new Color (39,174,96);
              g.setColor(normal);

              g.drawString("Calvin is "+ healthName ,10,100);//sets the string that is displayed on the panel ADD THE HEALTHA ND IF ELSE STATEMENTS

            }
            if(health<0)
            {
              g.drawImage(calvinTriggered,120,200,420,600,null);
              healthName="feeling so bad that Calvin is angry";
              Font helvec = new Font ("Helvetica Neue", Font.BOLD, 48);//initializes font
              g.setFont(helvec);//sets font int graphics
              Color angryio = new Color (243,156,18);
              g.setColor(angryio);

              g.drawString("Calvin is "+ healthName ,10,100);//sets the string that is displayed on the panel ADD THE HEALTHA ND IF ELSE STATEMENTS

            }
            if(health>121)
            {
              g.drawImage(calvinHappy,120,200,420,600,null);
              healthName="feeling really good!";
              Font helvec = new Font ("Helvetica Neue", Font.BOLD, 48);//initializes font
              g.setFont(helvec);//sets font int graphics
              Color happy = new Color (155,89,182);
              g.setColor(happy);

              g.drawString("Calvin is "+ healthName ,10,100);//sets the string that is displayed on the panel ADD THE HEALTHA ND IF ELSE STATEMENTS
            }
            if(health>=0 && health<40)
            {
              g.drawImage(calvinHungry,120,200,420,600,null);
              healthName="feeling hungry!";

              Font helvec = new Font ("Helvetica Neue", Font.BOLD, 48);//initializes font
              g.setFont(helvec);//sets font int graphics
              Color hungry = new Color (192,57,43);
              g.setColor(hungry);

              g.drawString("Calvin is "+ healthName ,10,100);//sets the string that is displayed on the panel ADD THE HEALTHA ND IF ELSE STATEMENTS
            }
            g.drawImage(avocado,avocadoX-75,avocadoY-75,this);
            g.drawImage(donut,donutX-75,donutY-75,this);// IF THE DONUT IS SELECTED
            g.drawImage(soda,sodaX-75,sodaY-75,this);
            g.drawImage(oatmeal,oatmealX-75,oatmealY-75,this);



            Font tahoma = new Font ("Tahoma", Font.BOLD, 28);//initializes font
            g.setFont(tahoma);//sets font int graphic
            Color maroon = new Color (212,193,145);
            g.setColor(maroon);
            g.drawString("Feed him some food or give him a drink!",20,150);
            Font apple = new Font ("Apple Casual", Font.BOLD, 10);
            g.setFont(apple);
            g.setColor(Color.BLACK);
            g.drawString("Drag the food/drinks to his mouth!",15,250);
            Font dido = new Font ("Apple Casual", Font.BOLD, 14);
            g.setFont(dido);
            g.setColor(Color.BLUE);
            g.drawString("Keep in mind that healthy food would give him more enegry and would help him heal better!",5,750);

          }
        }//end of landing page
        //start mouth class panels

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        class MouthPanel extends JPanel implements MouseListener, KeyListener//mouth panel that user moves food around to get digested. Uses key listner and bufferedimage
        //   //also tied in with MouthQuiz to ask questions regarding the class
        {
          // private BufferedImage donutm;
          // private BufferedImage sodam;
          // private BufferedImage oatmealm;
          // private BufferedImage avocadom;

          public String whatKey;

          public int oatmealwidth;
          public int oatmealheight;
          public int sodawidth;
          public int sodaheight;
          public int donutheight;
          public int donutwidth;
          public int avocadowidth;
          public int avocadoheight;


          public String slow;

          public int foodX;
          public int foodY;

          public Image mouthBackground;
          private boolean shiftkey;

          public int[] speedUp;
          public int[] speedDown;

          public int addvelo;
          public int subvelo;



          public Image donut;
          public Image oatmeal;
          public Image soda;
          public Image avocado;

          public String mouthBackgroundName;
          public String donutName;//file name
          public String avocadoName;//file name
          public String sodaName;//file name
          public String oatmealName;//file name


          public int donutX, donutY, oatmealX, oatmealY, sodaX, sodaY, avocadoX, avocadoY;


          public MouthPanel()
          {
            setBackground(Color.RED);//set background to yello
            mouthBackgroundName= ("mouth.png");
            donutName= ("donut.png");//file name
            avocadoName= ("avocado.png");//file name
            sodaName= ("soda.png");//file name
            oatmealName= ("oatmeal.png");//file name
            donutX = 20;//donut-(600 to 750 ,75 to 225) ORIGINAL POS
            donutY = 400;////donut-(600 to 750 ,75 to 225) ORIGINAL POS
            oatmealX = 20;////oatmeal-(640 to 790 ,255 to 405) ORIGINAL POS
            oatmealY = 400;//oatmeal-(640 to 790 ,255 to 405) ORIGINAL POS
            sodaX = 20;//soda-(640 to 790 ,440 to 590) ORIGINAL POS
            sodaY = 400;//donut-(soda-(640 to 790 ,440 to 590) ORIGINAL POS
            avocadoX = 20;//avocado-(640 to 790 ,620 to 770) ORIGINAL POS
            avocadoY = 400;//avocado-(640 to 790 ,620 to 770) ORIGINAL POS
            speedUp = new int[6999999];
            speedDown =new int[69099898];
            whatKey="";

            addvelo=0;
            subvelo=0;

//             BufferedImage off_Image =
//   new BufferedImage(100, 50,
//                     BufferedImage.TYPE_INT_ARGB);
//
// Graphics2D g2 = off_Image.createGraphics();

            setLayout(flow);//sets the layout to flow
            //Card Layout made( needs more pseudocode)
            setLocation(0,0);//sets panel origin

            System.out.println("MouthPanel reached");
            addMouseListener(this);
            addKeyListener(this);//adds KeyListener
            run();
          }//end of mouthconstructor

          public void run()
          {
            getMyImage();
            velocity(false,false);
          }


          public void getMyImage()//gets image for use
          {
            try
            {
              // Image i = javax.swing.ImageIcon("myimage.gif").getImage();

              mouthBackground=ImageIO.read(new File(mouthBackgroundName));
              System.out.println("mouthBackground");
              System.out.println("i tried to get metMyImageio suryas");


              // File oatmeal = new File(oatmealName);
              // BufferedImage oatmealm = ImageIO.read(oatmeal);
                oatmeal = ImageIO.read(new File(oatmealName));
              System.out.println("buffered oatmealsm");
              // oatmealwidth = oatmealm.getWidth();
              // oatmealheight = oatmealm.getHeight();


              // File soda = new File(sodaName);
              // BufferedImage sodam = ImageIO.read(soda);
                soda = ImageIO.read(new File(sodaName));
              System.out.println("buffered sodams");
              // sodawidth = sodam.getWidth();
              // sodaheight = sodam.getHeight();


              // File avocado = new File(avocadoName);
              // BufferedImage avocadom = ImageIO.read(avocado);
                avocado = ImageIO.read(new File(avocadoName));
              System.out.println("buffered avocadoms");
              // avocadowidth = avocadom.getWidth();
              // avocadoheight = avocadom.getHeight();




              // File donut = new File(donutName);
              // BufferedImage donutm = ImageIO.read(donut);
              // BufferedImage donutm = ImageIO.read(getClass().getResource("donut.png"));
  donut = ImageIO.read(new File(donutName));
              System.out.println("buffered donutm");
              // donutwidth = donutm.getWidth();
              // donutheight = donutm.getHeight();




            }
            catch(IOException e)
            {
              System.err.println("\n\n"+mouthBackgroundName+"can't be found. \n\n");
              System.out.println("catched mouthBackground");
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

          public void mousePressed(MouseEvent e)		//every time user clicks method is run
          {
            requestFocus();//requests focus for mouse
            repaint();//calls paintcomponent
          }
          public void mouseClicked(MouseEvent e){} //mouse is clicked
          public void mouseReleased(MouseEvent e){} //mouse is released
          public void mouseEntered(MouseEvent e){} //mouse is entered
          public void mouseExited(MouseEvent e){} //mouse exits


          public void keyPressed(KeyEvent e)
          {
            requestFocus();
            velocity(true,false);
            int upcode = e.getKeyCode();//looks for shiftkey
            if(upcode==KeyEvent.VK_W)//runs if shiftkey is pressed
            {
              repaint();
              whatKey="W";
              System.out.println("keyEvent W whatKeyW");
              wup(98);
              repaint();
            }
            int downcode = e.getKeyCode();
            if(downcode==KeyEvent.VK_S)
            {
              repaint();

              whatKey="S";
              System.out.println("keyEvent S whatKeyS");
              sup(98);
              repaint();

            }
            int leftcode = e.getKeyCode();
            if(leftcode==KeyEvent.VK_A)
            {
              repaint();

              whatKey="A";
              System.out.println("keyEvent A whatKeyA");
              aup(98);
              repaint();

            }
            int rightcode = e.getKeyCode();
            if(rightcode==KeyEvent.VK_D)
            {
              repaint();

              whatKey="D";
              System.out.println("keyEvent D whatKeyD");
              dup(98);
              repaint();

            }
          }//end of pressed
          ////////////////////////////////////////////////////////

          public void wup(int addy)
          {
            System.out.println("W");
            switch(food) {
            case "oatmeal":
              if(addy==98)
              {
                addy=0;//makes sure not to mess up where the image is going to be moved too
                velocity(true,false);//since the key has been pressed
              }
              oatmealY = oatmealY-addy;//oatmeal-(640 to 790 ,255 to 405) ORIGINAL POS
              repaint();
              break;
            case "soda":
              if(addy==98)
              {
                addy=0;
                velocity(true,false);//ask velocity to return the addy value
              }
              sodaY = sodaY-addy;//donut-(soda-(640 to 790 ,440 to 590) ORIGINAL POS
              repaint();
              break;
            case "avocado":
              if(addy==98)
              {
                addy=0;
                velocity(true,false);
              }
              avocadoY = avocadoY-addy;//avocado-(640 to 790 ,620 to 770) ORIGINAL POS
              repaint();
              break;
            case "donut":
              if(addy==98)
              {
                addy=0;
                velocity(true,false);
              }
              donutY = donutY-addy;////donut-(600 to 750 ,75 to 225) ORIGINAL POS
              repaint();
              break;
            }
          }
          ////////////////////////////////////////////////////////

          public void aup(int addy)
          {
            System.out.println("A");
            switch(food) {
            case "oatmeal":
              if(addy==98)
              {
                addy=0;
                velocity(true,false);
              }
              oatmealX = oatmealX-addy;//oatmeal-(640 to 790 ,255 to 405) ORIGINAL POS
              repaint();
              break;
            case "soda":
              if(addy==98)
              {
                addy=0;
                velocity(true,false);
              }
              sodaX = sodaX-addy;//donut-(soda-(640 to 790 ,440 to 590) ORIGINAL POS
              repaint();
              break;
            case "avocado":
              if(addy==98)
              {
                addy=0;
                velocity(true,false);
              }
              avocadoX = avocadoX-addy;//avocado-(640 to 790 ,620 to 770) ORIGINAL POS
              repaint();
              break;
            case "donut":
              if(addy==98)
              {
                addy=0;
                velocity(true,false);
              }
              donutX = donutX-addy;////donut-(600 to 750 ,75 to 225) ORIGINAL POS
              repaint();
              break;
            }
          }//end of aup
          ////////////////////////////////////////////////////////
          public void sup(int addy)
          {
            System.out.println("S");
            switch(food) {
            case "oatmeal":
              if(addy==98)
              {
                addy=0;
                velocity(true,false);
              }
              oatmealY = oatmealY+addy;//oatmeal-(640 to 790 ,255 to 405) ORIGINAL POS
              repaint();
              break;
            case "soda":
              if(addy==98)
              {
                addy=0;
                velocity(true,false);
              }
              sodaY = sodaY+addy;//donut-(soda-(640 to 790 ,440 to 590) ORIGINAL POS
              repaint();
              break;
            case "avocado":
              if(addy==98)
              {
                addy=0;
                velocity(true,false);
              }
              avocadoY = avocadoY+addy;//avocado-(640 to 790 ,620 to 770) ORIGINAL POS
              repaint();
              break;
            case "donut":
              if(addy==98)
              {
                addy=0;
                velocity(true,false);
              }
              donutY = donutY+addy;////donut-(600 to 750 ,75 to 225) ORIGINAL POS
              repaint();
              break;
            }
          }
          /////////////////////////////////////////////////////
          public void dup(int addy)
          {
            System.out.println("D");
            if(food.equals("oatmeal"))
            {
              if(addy==98)
              {
                addy=0;
                velocity(true,false);
              }
              oatmealX = oatmealX+addy;//oatmeal-(640 to 790 ,255 to 405) ORIGINAL POS
              repaint();

            }
            if(food.equals("soda"))
            {
              if(addy==98)
              {
                addy=0;
                velocity(true,false);
              }

              sodaX = sodaX+addy;//donut-(soda-(640 to 790 ,440 to 590) ORIGINAL POS
              repaint();

            }
            if(food.equals("avocado"))
            {
              if(addy==98)
              {
                addy=0;
                velocity(true,false);
              }

              avocadoX = avocadoX+addy;//avocado-(640 to 790 ,620 to 770) ORIGINAL POS
              repaint();

            }
            if(food.equals("donut"))
            {
              if(addy==98)
              {
                addy=0;
                velocity(true,false);
              }

              donutX = donutX+addy;////donut-(600 to 750 ,75 to 225) ORIGINAL POS
              repaint();
            }
          }
          //down//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
          public void wdow(int subby)
          {
            System.out.println("WSlow");
            if(food.equals("oatmeal"))
            {
              if(subby==99)
              {
                subby=0;
                velocity(false,true);
              }
              oatmealY = oatmealY-subby;//oatmeal-(640 to 790 ,255 to 405) ORIGINAL POS
              repaint();

            }
            if(food.equals("soda"))
            {
              if(subby==99)
              {
                subby=0;
                velocity(false,true);
              }

              sodaY = sodaY-subby;//donut-(soda-(640 to 790 ,440 to 590) ORIGINAL POS
              repaint();

            }
            if(food.equals("avocado"))
            {

              if(subby==99)
              {
                subby=0;
                velocity(false,true);
              }
              avocadoY = avocadoY-subby;//avocado-(640 to 790 ,620 to 770) ORIGINAL POS
              repaint();

            }
            if(food.equals("donut"))
            {
              if(subby==99)
              {
                subby=0;
                velocity(false,true);
              }

              donutY = donutY-subby;////donut-(600 to 750 ,75 to 225) ORIGINAL POS
              repaint();
            }
          }
          /////////////////////////////////////////////////////////////////down A
          public void adow(int subby)
          {
            System.out.println("A");
            if(food.equals("oatmeal"))
            {
              if(subby==99)
              {
                subby=0;
                velocity(false,true);
              }
              oatmealX = oatmealX+subby;//oatmeal-(640 to 790 ,255 to 405) ORIGINAL POS
              repaint();

            }
            if(food.equals("soda"))
            {
              if(subby==99)
              {
                subby=0;
                velocity(false,true);
              }
              sodaX = sodaX-subby;//donut-(soda-(640 to 790 ,440 to 590) ORIGINAL POS
              repaint();

            }
            if(food.equals("avocado"))
            {
              if(subby==99)
              {
                subby=0;
                velocity(false,true);
              }

              avocadoX = avocadoX-subby;//avocado-(640 to 790 ,620 to 770) ORIGINAL POS
              repaint();

            }
            if(food.equals("donut"))
            {
              if(subby==99)
              {
                subby=0;
                velocity(false,true);
              }

              donutX = donutX-subby;////donut-(600 to 750 ,75 to 225) ORIGINAL POS it is subtracted since although 32 pixels its going down
              repaint();
            }

          }
          //////////////////////////////////////////////////////////////////////////////sdown
          public int sdow(int subby)
          {
            System.out.println("S");
            if(food.equals("oatmeal"))
            {
              if(subby==99)
              {
                subby=0;
                velocity(false,true);
              }
              oatmealY = oatmealY+subby;//oatmeal-(640 to 790 ,255 to 405) ORIGINAL POS
              //repaint();
              return oatmealY;//call me on my cell phone

            }
            if(food.equals("soda"))
            {
              if(subby==99)
              {
                subby=0;
                velocity(false,true);
              }

              sodaY = sodaY+subby;//donut-(soda-(640 to 790 ,440 to 590) ORIGINAL POS
              //repaint();
              return sodaY;//call me on my cell phone

            }
            if(food.equals("avocado"))
            {
              if(subby==99)
              {
                subby=0;
                velocity(false,true);
              }

              avocadoY = avocadoY+subby;//avocado-(640 to 790 ,620 to 770) ORIGINAL POS
              //repaint();
              return avocadoY;//call me on my cell phone

            }
            if(food.equals("donut"))
            {
              if(subby==99)
              {
                subby=0;
                velocity(false,true);
              }
              donutY = donutY+subby;////donut-(600 to 750 ,75 to 225) ORIGINAL POS
              repaint();
              return donutY;//call me on my cell phone
            }
            return 99;
          }
          //////////////////////////////////////////////////////////////////////////////ddown
          public void ddow(int subby)
          {
            System.out.println("D");
            if(food.equals("oatmeal"))
            {
              if(subby==99)
              {
                subby=0;
                velocity(false,true);
              }
              oatmealX = oatmealX+subby;//oatmeal-(640 to 790 ,255 to 405) ORIGINAL POS
              repaint();

            }
            if(food.equals("soda"))
            {
              if(subby==99)
              {
                subby=0;
                velocity(false,true);
              }

              sodaX = sodaX+subby;//donut-(soda-(640 to 790 ,440 to 590) ORIGINAL POS
              repaint();

            }
            if(food.equals("avocado"))
            {
              if(subby==99)
              {
                subby=0;
                velocity(false,true);
              }

              avocadoX = avocadoX+subby;//avocado-(640 to 790 ,620 to 770) ORIGINAL POS
              repaint();

            }
            if(food.equals("donut"))
            {
              if(subby==99)
              {
                subby=0;
                velocity(false,true);
              }

              donutX = donutX+subby;////donut-(600 to 750 ,75 to 225) ORIGINAL POS
              repaint();
            }
          }

          public void keyTyped(KeyEvent e){}
            public void keyReleased(KeyEvent e)
            {

              velocity(false,true);
              int dupcode = e.getKeyCode();//looks for shiftkey
              if(dupcode==KeyEvent.VK_W)//runs if shiftkey is pressed
              {
                repaint();

                whatKey="W";

                wdow(99);
                repaint();

              }
              int ddowncode = e.getKeyCode();
              if(ddowncode==KeyEvent.VK_S)
              {
                repaint();

                whatKey="S";

                adow(99);
                repaint();

              }
              int dleftcode = e.getKeyCode();
              if(dleftcode==KeyEvent.VK_A)
              {
                repaint();

                whatKey="A";

                sdow(99);
                repaint();

              }
              int drightcode = e.getKeyCode();
              if(drightcode==KeyEvent.VK_D)
              {
                repaint();

                whatKey="D";
                ddow(99);
                repaint();

              }
            }

            public void velocity(boolean pressed, boolean released)
            {
              int ui=0;
              int di=0;
              int i = 0;
              //array generation
              for(int speed = 1; speed<33; speed=speed*2)//generates speed Up array
              {
                System.out.println("speedUp:  "+ui);
                speedUp[ui]=speed;
                repaint();
                if(pressed)
                {
                    repaint();
                    try
                    {
                      System.out.println("this is the addvelo: "+addvelo);
                      if(whatKey.equals("W"))
                      {
                        System.out.println("Wup");

                        wup(addvelo);
                         Thread.sleep(50);
                        repaint();

                      }

                      if(whatKey.equals("A"))
                      {
                        System.out.println("Aup");

                        aup(addvelo);
                        Thread.sleep(50);
                        repaint();

                      }
                      if(whatKey.equals("S"))
                      {
                        System.out.println("Sup");

                        sup(addvelo);
                         Thread.sleep(50);
                        repaint();

                      }
                      if(whatKey.equals("D"))
                      {
                        System.out.println("Dup");
                        dup(addvelo);
                        Thread.sleep(50);
                        repaint();
                      }
                    }
                    catch(InterruptedException ex)
                    {
                      System.out.println("catch some fish!");
                    }

                }
                if(released)
                {
                  i=0;

                    repaint();
                    try
                    {
                      subvelo=subvelo-speedDown[i];
                      System.out.println("this is the subvelo "+ subvelo);
                      if(whatKey.equals("W"))
                      {
                        System.out.println("Wdown");
                        wdow(subvelo);
                        Thread.sleep(200);
                        repaint();
                      }
                      if(whatKey.equals("A"))
                      {
                        System.out.println("Adow");
                        adow(subvelo);
                        Thread.sleep(200);
                        repaint();
                      }
                      if(whatKey.equals("S"))
                      {
                        System.out.println("Sdow");
                        oatmealY = sdow(subvelo);
                        Thread.sleep(200);
                        repaint();
                      }
                      if(whatKey.equals("D"))
                      {
                        System.out.println("Ddow");
                        ddow(subvelo);
                        Thread.sleep(200);
                        repaint();

                      }
                    }
                    catch(InterruptedException ex)
                    {
                      System.out.println("catch some fish!");
                    }

                }


                ui++;
              }
              for(int slowdown = 32; slowdown>0; slowdown=slowdown/2)
              {
                System.out.println("speedDown: "+di);
                repaint();
                speedDown[di]=slowdown;
                subvelo=slowdown;
                if(pressed)
                {
                    repaint();
                    try
                    {
              //1,3
                      System.out.println("this is the addvelo: "+addvelo);
                      if(whatKey.equals("W"))
                      {
                        System.out.println("Wup");

                        wup(addvelo);
                         Thread.sleep(300);
                        repaint();

                      }

                      if(whatKey.equals("A"))
                      {
                        System.out.println("Aup");

                        aup(addvelo);
                        Thread.sleep(300);
                        repaint();

                      }
                      if(whatKey.equals("S"))
                      {
                        System.out.println("Sup");

                        sup(addvelo);
                         Thread.sleep(300);
                        repaint();

                      }
                      if(whatKey.equals("D"))
                      {
                        System.out.println("Dup");
                        dup(addvelo);
                        Thread.sleep(300);
                        repaint();
                      }
                    }
                    catch(InterruptedException ex)
                    {
                      System.out.println("catch some fish!");
                    }

                }
                if(released)
                {
                  i=0;

                    repaint();
                    try
                    {
                      subvelo=subvelo-speedDown[i];
                      System.out.println("this is the subvelo "+ subvelo);
                      if(whatKey.equals("W"))
                      {
                        System.out.println("Wdown");
                        wdow(subvelo);
                        Thread.sleep(200);
                        repaint();
                      }
                      if(whatKey.equals("A"))
                      {
                        System.out.println("Adow");
                        adow(subvelo);
                        Thread.sleep(200);
                        repaint();
                      }
                      if(whatKey.equals("S"))
                      {
                        System.out.println("Sdow");
                        sdow(subvelo);
                        Thread.sleep(200);
                        repaint();
                      }
                      if(whatKey.equals("D"))
                      {
                        System.out.println("Ddow");
                        ddow(subvelo);
                        Thread.sleep(200);
                        repaint();

                      }
                    }
                    catch(InterruptedException ex)
                    {
                      System.out.println("catch some fish!");
                    }

                }

                di++;
              }
              //start velocity

              ///////end


            }//end of velocity

            public void paintComponent(Graphics g)
            {
              super.paintComponent(g);
              //Graphics2D g = donutm.createGraphics();    // Get a Graphics2D object
              g.drawImage(mouthBackground,0,0,800,800,this);

              if(food.equals("oatmeal"))
              {
                g.drawImage(oatmeal,oatmealX,oatmealY,40,40,this);
              }
              if(food.equals("soda"))
              {

                g.drawImage(soda,sodaX,sodaY,40,40,this);
                repaint();

              }
              if(food.equals("avocado"))
              {
                g.drawImage(avocado,avocadoX,avocadoY,40,40,this);
              repaint();

            }
            if(food.equals("donut"))
            {
              g.drawImage(donut,donutX,donutY,40,40,this);// IF THE DONUT IS SELECTED
              repaint();
            }
            Font aldo = new Font ("Apple Casual", Font.BOLD, 8);
            g.setFont(aldo);
            g.setColor(Color.ORANGE);
            g.drawString("Press the screen once in order to move the food/drinks with the WASD controls",5,690);
            g.dispose();

          }//end of paintcomponent



        }//end of mouth panel


        class MouthQuestions extends JPanel
        {
          public MouthQuestions()
          {
            System.out.println("mouthquiz");
          }
        }
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

      //
      // BufferedImage in = ImageIO.read(img);
      //
      // BufferedImage newImage = new BufferedImage(
      //     in.getWidth(), in.getHeight(), BufferedImage.TYPE_INT_ARGB);
      //
      // Graphics2D g = newImage.createGraphics();
      // g.drawImage(in, 0, 0, null);
      // g.dispose();
