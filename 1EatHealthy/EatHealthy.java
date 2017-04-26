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

import javax.swing.JLabel;
import javax.imageio.ImageIO;
import java.io.File;

import javax.swing.JLabel;

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

import java.io.BufferedWriter;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class EatHealthy extends JFrame
{
  private Image image;

      private PanelHolder pHolder;//panel holder
            private CardLayout cards;//card layout
            private WelcomePage welcomePan;//welcome screen                      ADD THAT THE GOAL IS TO MAKE THE PERSON HAPPY
            // private LandingPage landingPan;//where the user is most of the time
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
        EatHealthy eaty = new EatHealthy();
    }

    public EatHealthy()
	{
		super("Eat Healthy!");
	//	setLayout(new BorderLayouyt());
		setSize(800, 800);		//will change later
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocation(0,0);
		setResizable(false);

		pHolder = new PanelHolder();
		cards = new CardLayout();


		pHolder.setLayout(cards);

		welcomePan = new WelcomePage();
    //   landingPan = new LandingPage(); TEST
    //   healthyBar = new HealthyBarPanel();
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


		 pHolder.add(welcomePan, "WelcomePage");
                // pHolder.add(landingPan, "LandingPage"); TEST
                // pHolder.add(healthyBar, "HealthyBarPanel");
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
		add(pHolder);
		setVisible(true);
	}

class PanelHolder extends JPanel
{
	public PanelHolder()
	{
		setBackground(Color.BLUE);
	}                                //  Panel holder (Holds all the Panels,for the Card Layout)(essentially)
}

    class WelcomePage extends JPanel
      {

        private String imageName;
         public WelcomePage()
         {
           imageName="welcome.jpg";
           setLayout(new FlowLayout(FlowLayout.CENTER,1000,50));
           setLayout(cards);
          Font titleFont = new Font("Serif", Font.BOLD, 20);                //Set Fonts
           setFont(titleFont);                                      //WELCOME GUYS TEXTTTT

//		label=new JLabel("WelcomeHere");
		Font font =new Font("Arial",Font.BOLD,40);
//		label.setFont(font);
//	getContentPane().add(label);
//		getContentPane().add(canvas);
		getMyImage();
//		label.setBounds(355,0,300,100);
		setBackground(Color.GRAY);
		setSize(800,750);
		setLocation(300,0);
		setResizable(false);
		setVisible(true);
          }

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

  // public void run()
	// {
	// 	JFrame frame = new JFrame("ShowImage");
	// 	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	// 	frame.setLayout(null); //get ContentRaw().setLayout(null);
	// 	label=new JLabel("Calvin");
	// 	Font font =new Font("Arial",Font.BOLD,40);
	// 	label.setFont(font);
	// 	frame.getContentPane().add(label);
	// 	canvas=new DrawingArea();
	// 	frame.getContentPane().add(canvas);
	// 	getMyImage();
	// 	label.setBounds(355,0,300,100);
	// 	frame.setBackground(Color.GRAY);
	// 	frame.setSize(800,750);
	// 	frame.setLocation(300,0);
	// 	frame.setResizable(false);
	// 	frame.setVisible(true);
	// }

        public void paintComponent(Graphics g)
        {
          super.paintComponent (g);	// draw background
      Font font = new Font ("Serif", Font.BOLD, 30);
      g.setFont( font );
      g.drawString("Family Friendly",10,100);
        }

        }



    }//correct
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
