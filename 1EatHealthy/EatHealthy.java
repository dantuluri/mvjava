/*Surya Dantuluri
* April 17th 2017
*
* Digestive System Game
*
* Welcome screen starts and button is under title
*
* Human, health bar and foods are present. A drawing on the human pops up trying to signify that s(he) should  feed the human food.
*
* Should have 6 different classes signifying each of the stages: Mouth, Esophogous, Stomach, Duodenum, Small intestine, *Large intestine
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
	private Image image;
	private PanelHolder pHolder;//panel holder
	private CardLayout cards;//card layout
	private FlowLayout flow;
	private BorderLayout border;
	private GridLayout grid;
	private String name;

	private InitializeGame initPan;
	private WelcomePage welcomePan;//welcome screen                      ADD THAT THE GOAL IS TO MAKE THE PERSON HAPPY
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
	public static void main(String[] args)
	{
		System.out.println("CheckPoint1");
		EatHealthy eaty = new EatHealthy();//initialize main frame
	}

	public EatHealthy()
	{
		super("Eat Healthy!");
		//	setLayout(new BorderLayouyt());
		setSize(800, 800);		//will change later
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);//set close operation
		setLocation(0,0);//set location of frame
		setResizable(false);//set not to resize

		pHolder = new PanelHolder();//where I will hold all the panels to be shown
		cards = new CardLayout();//card layout
		flow = new FlowLayout();//init flow layout
		border = new BorderLayout();//init border layout
		grid = new GridLayout();//init grid

		pHolder.setLayout(cards);//set the layout for the panel holder as card layout

		initPan = new InitializeGame();
		welcomePan = new WelcomePage();
		landingPan = new LandingPage();
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


		pHolder.add(welcomePan, "WelcomePage");//add welcome page to the panel holder
		pHolder.add(initPan, "InitializeGame");//add the InitializeGame to the panel holder, although it should be taken out
		pHolder.add(landingPan, "LandingPage");//add the landing page to the panel holder
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
		add(pHolder);//add the panel holder
		setVisible(true);//set everything to visible.

		welcomePan.setBounds(0, 0, 800, 600);//trying to set the bounds of the welcome panel
		initPan.setBounds(0,600,800,600);//tring to set the bounds of the init panel to be at the bottom

	}

	class PanelHolder extends JPanel
	{
		public PanelHolder()
		{
			setBackground(Color.GREEN);//set the background of a panel holder as green
			System.out.print("PanelHolder");//this is a checkpoint
		}                                //  Panel holder (Holds all the Panels,for the Card Layout)(essentially)
	}



	class WelcomePage extends JPanel
	{

		Image welcomeBackground = Toolkit.getDefaultToolkit().getImage("welcome.jpg");//getsImage from my computer using the get DefaultToolKit sets the background
		String name;//name of the user
		boolean somethingEntered;//if something has been entered in the JTextField
		Integer asciiInput;//set the input for the integer
		JLabel labelo = new JLabel();//set the JLabel for making sure the JTextField works, but will take this out in the next revision

		public WelcomePage()
		{
			setLayout(flow);			//Card Layout made( needs more pseudocode)
			setBackground(Color.WHITE);
			//add(textFieldo, BorderLayout.NORTH);

		}//end panel

		public void paintComponent(Graphics g)
		{                //graphics method header
			System.out.println("WelcomePage paintComponent");//another checkpoint
			super.paintComponent(g);                        // draw Images first, draws background
			g.drawImage(welcomeBackground, 0,0,800,600,this);//this makes the image
			//g.drawImage(back, 0,0,600,400,this);
			Font font = new Font ("Sans", Font.BOLD, 30);//initializes font
			g.setFont(font);//sets font int graphics
			g.drawString("Welcome to the Eat Healthy Game!",100,100);//sets the string that is displayed on the panel
			System.out.println("WelcomePage painComponent pt.2");//another checkpoint



		}//end of paintComponent

		// class SPTF implements ActionListener
		// {
		// 	public void actionPerformed(ActionEvent e)
		// 	{
		// 		welcomePan.name = e.getActionCommand();
		// 		welcomePan.somethingEntered = true;
		// 		welcomePan.repaint();
		// 	}
		// }

	}//end of welcomePage

	class InitializeGame extends JPanel//bottom panel
	{
		String name;//still figuring out the layout of the game
		JLabel labelo = new JLabel();//need to cleanup
		public InitializeGame()
		{
			setLayout(flow);
			//JButton start = new JButton("Start Game");
			//JButtonHandlerS jbhs = new JButtonHandlerS();
			//start.addActionListener(this);
			//start.addActionListener(jbhs);
			//start.setBounds(0,0,700,70);
			//add(start);
			JButton enterGameButton = new JButton("enterGameButton");//set the game button for entering the game
			JButtonHandlerStart buttonHandle = new JButtonHandlerStart();//set the game button for entering the game
			JTextField textFieldo = new JTextField(10);//set the text field of the name
			enterGameButton.setPreferredSize(new Dimension(50, 50));//set the preffered size of the button
			enterGameButton.addActionListener(buttonHandle);//button handling but need to figure that too
			add(enterGameButton, BorderLayout.NORTH);//add the button in the north part of the panel on the bottom

			textFieldo = new JTextField("Enter Name");//add a textfield for entering the name
			 textFieldo.setBounds(10,20,40,50);//set the bounds or dimesions for the JTextField as the bottom and small
			textFieldo.addActionListener(new ActionListener()//adding an actionListner
			{
						 public void actionPerformed(ActionEvent e)
						 {
									 String input = textFieldo.getText();//set the input to get more text
									 name = input;//setting the input of the buttom
						 }
			});

			add(enterGameButton);
			enterGameButton.addActionListener(new ActionListener()//button handler
			{
							public void actionPerformed(ActionEvent e)
							{
									//going to set the values if the button was pressed or not
							}
			});

			add(labelo);
			add(textFieldo);
			System.out.println(name);
		}

		public void paintComponent(Graphics g)
		{
			if(somethingEntered)//if something has been entered in the text field
			{
				cards.show(pHolder, "LandingPage");//go to next panel if something has been entered in the new field
				System.out.println("CardLayout changes to LandingPage");
				//HOLY SHUIT THIS IS WHAT IVE BEEN LOOOKING GOR FOR SO MANY UEARS
			}
			System.out.println(name);//another checkpoint

		}

		public void actionPerformed(ActionEvent e)
		{

			name = e.getActionCommand();//gets the action command check what evt.getActionCommand does too
			System.out.println(name);
			// if something ahppens this POPs UPP WOOOT   add(new JButton("Center"),BorderLayout.CENTER);
			String enteringGameButton = enterGameButton.getText();
			if (enteringGameButton == "Enter the game")//if the action command works properly this should be true
			{
				System.out.println("Action Performed Works!");//another checkpoint to make sure the action performed works
			}
			System.out.println("Checkpoint TextField Handler");
			repain();
		}


	}//end of InitializeGame

	class JButtonHandlerStart implements ActionListener//button handler
	{
		public void actionPerformed(ActionEvent e)
		{
			initPan.tempString = "you just pressed start bro";//if button is pressed
			initPan.enterName.setBounds(650,500,200,50);//set bounds of button if pressed
			initPan.startPressed = true;//if pressed then repaint
			initPan.repaint();
		}
	}

	class SPTF implements ActionListener//action listener to the init panel going to change this
		{
			public void actionPerformed(ActionEvent e)
			{
				initPan.name = e.getActionCommand();//sets the name to be a hot key
				initPan.somethingEntered = true;//if something is enetered repain
				initPan.repaint();
			}
		}
	}

	//
	// class JButtonHandlerS implements ActionListener
	// {
	// 	public void actionPerformed(ActionEvent e)
	// 	{
	// 		welcomePan.tempString = "you just pressed start bro";
	// 		welcomePan.enterName.setBounds(650,500,200,50);
	// 		welcomePan.startPressed = true;
	// 		welcomePan.repaint();
	// 	}
	// }

	// class JButtonHandlerH implements ActionListener
	// {
	// 	public void actionPerformed(ActionEvent e)
	// 	{
	// 		welcomePan.tempString = "you just pressed the high scores button brodie";
	// 		welcomePan.hsPressed = true;
	// 		welcomePan.repaint();
	// 	}
	// }

	class LandingPage extends JPanel//sets the Landing page
	{

		public LandingPage()
		{
			setBackground(Color.RED

			);
			setLayout(flow);//sets the layout to flow
			//Card Layout made( needs more pseudocode)
			setBackground(Color.YELLOW);//set background to yello
			Font titleFont = new Font("Serif", Font.BOLD, 20);                //Set Fonts
			setFont(titleFont);//sets the title gont
			System.out.println("Houston, we've landed");//another checkpoint
		}
	}//end of landing page



//correct
// class Mouth extends JPanel implements ActionListener//mouth class not finished(unneccesary buttons)
// {
//   //variables
//     public Mouth(int numIn, Color colorIn) 		//numbers on the panel
//     {
//         JRadioButton radiobutton = new JRadioButton("1"); //add buttons (unneccesary)
//         radiobutton.addActionListener(this);
//         add(radiobutton);
//         JRadioButton radiobutton2 = new JRadioButton("2");
//         radiobutton2.addActionListener(this);
//         add(radiobutton2);
//         JRadioButton radiobutton3 = new JRadioButton("3");
//         radiobutton3.addActionListener(this);
//         add(radiobutton3);
//         JRadioButton radiobutton4 = new JRadioButton("4");
//         radiobutton4.addActionListener(this);
//         add(radiobutton4);
//
//     }
//     public void paintComponent(Graphics g)  //paintComponent for implementing image
//     {
//         //super.paintComponent(g);
//         //g.setFont(new Font("Arial", Font.BOLD, 18));
//         //g.setColor(Color.RED);
//         //g.drawString(num, 10, 20);
//     }
//
//     public void actionPerformed(ActionEvent evt)//to set borders for panels
//     {
//         String command=button.getText();
//         if(command.equals("Press my belly."))
//         {
//             pressed=true;
//             button.setText("reset");
//         }
//
//         else
//         {
//             button.setText("Press my belly.");
//         }
//         repaint();

//  }
// end class Mouth

//start Esophogous class panels
