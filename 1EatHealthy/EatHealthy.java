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
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

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


public class EatHealthy extends JFrame
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

  private WelcomePanelHolder welcomeHold;
  private LandingPage landingPan;//where the user is most of the time
  // private HealthBarPanel healthyBar;//health bar panel in LandingPage
  // private FoodPanel foodyBar;//list of images regarding food in LandingPage
  // //Mouth, Esophogous, Stomach, Duodenum, Small intestine, *Large intestine
  // private MouthPanel mouthProcess;
  // private MouthQuestions mouthQuiz;
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

  public EatHealthy()
  {
    super("Eat Healthy!");//initlizes the parents class and names the Eat Healthy game
    setSize(800, 800);		//sets the eat healthy frame size
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);//sets default close opertation
    setLocation(0,0);//sets the "origin"
    setResizable(false);//does not allow the frame to be resized

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
    //   mouthProcess = new MouthPanel();
    //   mouthQuiz = new MouthQuestions();
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
    // pHolder.add(mouthProcess, "MouthPanel");
    // pHolder.add(mouthQuiz, "MouthQuestions");
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

  class WelcomePanelHolder extends JPanel//Another panel holder that holds both the top panel and bottom panel of the welcome page
  {
    public WelcomePanelHolder()//constructor
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

  class WelcomePage extends JPanel
  {
    Image welcomeBackground = Toolkit.getDefaultToolkit().getImage("welcome.jpg");//getsImage from my computer using the get DefaultToolKit sets the background
    public WelcomePage()
    {
      setLayout(flow);
      setBackground(Color.YELLOW);
       System.out.println("WelcomePage constructor");
    }//end Constructor

    public void paintComponent(Graphics g)
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

        if (enterName.getText() == null || enterName.getText().trim().isEmpty() || enterName.getText().equals("Enter Name"))
        {
          System.out.println("Welcome Panel is reset");
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
  class InitializeGame extends JPanel//init game has TEXTFIELD AND BUTTON
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

  class StartAction implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
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

      class LandingPage extends JPanel
      {//donut, oatmeal, soda, avocado
        public DrawingArea canvas;

        public Image donut;
        public Image oatmeal;
        public Image soda;
        public Image avocado;

        public JLabel label;

        public int xpos, ypos;

        public boolean keyClear;

        public int donutX, donutY, oatmealX, oatmealY, sodaX, sodaY, avocadoX, avocadoY;

        public String donutName;
        public String avocadoName;
        public String sodaName;
        public String oatmealName;

        public LandingPage()
        {
          donutX=217;
          donutY=301;
          oatmealX=217;
          oatmealY=301;
          sodaX=217;
          sodaY=301;
          avocadoX=217;
          avocadoY=301;
          donutX=217;
          donutY=301;
          imageName="calvin.jpg";

          //xpos=ypos=200;

          keyClear=true;

          System.out.println(name);
          setLayout(flow);//sets the layout to flow
          //Card Layout made( needs more pseudocode)
          setBackground(Color.BLUE);//set background to yello
          Font titleFont = new Font("Serif", Font.BOLD, 20);                //Set Fonts
          setFont(titleFont);
          System.out.println("LandingPage reached");
          addMouseMotionListener(new MouseMotionAdapter()
          {
            // invoked when mouse is dragged
            public void mouseDragged(MouseEvent me)
            {
              Point point = me.getPoint();
              System.out.println("HELLO"+point);
            }
          });
        }//end of constructor

        public void getMyImage()
	{
		try
		{
			image=ImageIO.read(new File(imageName));
		}
		catch(IOException e)
		{
		System.err.println("\n\n"+imageName+"can't be found. \n\n");
		e.printStackTrace();
		}
	}


      }//end of landing page
  //start mouth class panels
  //start Esophogous class panels
}
