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

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class EatHealthy extends JFrame
{
      private PanelHolder pHolder;//panel holder
            private CardLayout cards;//card layout
            private WelcomePage welcomePan;//welcome screen                      ADD THAT THE GOAL IS TO MAKE THE PERSON HAPPY
            private LandingPage landingPan;//where the user is most of the time
            private HealthBarPanel healthyBar;//health bar panel in LandingPage
            private FoodPanel foodyBar;//list of images regarding food in LandingPage
            //Mouth, Esophogous, Stomach, Duodenum, Small intestine, *Large intestine
            private MouthPanel mouthProcess;
            private MouthQuestions mouthQuiz;
            private EsophogousPanel esophogousProcess;
            private EsophogousQuestions esophogousQuiz;
            private StomachPanel stomachProcess;
            private StomachQuestions stomachQuiz;
            private SmallIntestinePanel smallIntestineProcess;
            private SmallIntestineQuestions smallintestineQuiz;
            private LargeIntestinePanel largeIntestineProcess;
            private LargeIntestineQuestions largeIntestineQuiz;
            private EndingPanel ending;



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
      landingPan = new LandingPage();  /// AKHIL, ADD TUTORIALPANEL INSTANCE (TP) AS A
      healthyBar = new HealthyBarPanel();
      foodyBar = new FoodPanel();
      mouthProcess = new MouthPanel();
      mouthQuiz = new MouthQuestions();
     esophogousProcess = new EsophogousPanel();
     esophogousQuiz = new EsophogousQuestions();
     stomachProcess = new StomachPanel();
     stomachQuiz = new StomachQuestions();
     smallIntestineProcess = new SmallIntestinePanel();
     smallintestineQuiz = new SmallIntestineQuestions();
     largeIntestineProcess = new LargeIntestinePanel();
     largeIntestineQuiz = new LargeIntestineQuestions();
     ending = new EndingPanel();


		 pHolder.add(welcomePan, "WelcomePage");
                pHolder.add(landingPan, "LandingPage");
                pHolder.add(healthyBar, "HealthyBarPanel");
                pHolder.add(foodyBar, "FoodPanel");
                pHolder.add(mouthProcess, "MouthPanel");
                pHolder.add(mouthQuiz, "MouthQuestions");
                pHolder.add(esophogousProcess, "EsophogousPanel");
                pHolder.add(esophogousQuiz, "EsophogousQuestions");
                pHolder.add(stomachProcess, "StomachPanel");
                pHolder.add(stomachQuiz, "StomachQuestions");
                pHolder.add(smallIntestineProcess, "SmallIntestinePanel");
                pHolder.add(smallintestineQuiz, "SmallIntestineQuestions");
                pHolder.add(largeIntestineProcess, "LargeIntestinePanel");
                pHolder.add(largeIntestineQuiz, "LargeIntestineQuestions");
                pHolder.add(ending, "EndingPanel");
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


    //     // Create a JFrame with BorderLayout
    //     frame = new JFrame("FlowLayout");	// Create the JFrame
    //
    //     // notice this has DISPOSE.  What is the effect of that?
    //     frame.setDefaultCloseOperation(flowFrame.DISPOSE_ON_CLOSE);
    //     frame.setSize(800, 800);
    //     frame.setLocation(0, 0);
    //
    //     // Initialize panels
    //     //send stuff to  panBar = new RadioProbability(1, Color.RED);
    //     //send stuff to panFL2 = new ScrollRisk(2, Color.BLUE);
    //
    //     /////////////////////////////////////////////////
    //     // setPreferredSize for all panels - 1st we will run the prog with out this.
    //     //
    //     landPage.setPreferredSize(new Dimension(800,800));
    //     panBar.setPreferredSize(new Dimension(220,70));
    //
    //
    //     frame.getContentPane().add(landPage);
    //     frame.getContentPane().add(panBar);
    //
    //
    //     // Make the JFrame visible
    //     frame.setVisible(true);
    // }
    //
    //
    //
    // //public void run()
    // //{
    // //makeFlowLayout();		// FlowLayout window
    // //}
    //
    //
    // //public void makeFlowLayout()
    // //{
    //
    // //}

    class Mouth extends JPanel implements ActionListener
    {
      //variables
        public Mouth(int numIn, Color colorIn) 		//numbers on the panel
        {
            JRadioButton radiobutton = new JRadioButton("1");
            radiobutton.addActionListener(this);
            add(radiobutton);
            JRadioButton radiobutton2 = new JRadioButton("2");
            radiobutton2.addActionListener(this);
            add(radiobutton2);
            JRadioButton radiobutton3 = new JRadioButton("3");
            radiobutton3.addActionListener(this);
            add(radiobutton3);
            JRadioButton radiobutton4 = new JRadioButton("4");
            radiobutton4.addActionListener(this);
            add(radiobutton4);

        }
        public void paintComponent(Graphics g)
        {
            //super.paintComponent(g);
            //g.setFont(new Font("Arial", Font.BOLD, 18));
            //g.setColor(Color.RED);
            //g.drawString(num, 10, 20);
        }

        public void actionPerformed(ActionEvent evt)
        {
            String command=button.getText();
            if(command.equals("Press my belly."))
            {
                pressed=true;
                button.setText("reset");
            }

            else
            {
                button.setText("Press my belly.");
            }
            repaint();

        }
    }	// end class Mouth
    class StartPanel extends JPanel
    	{

    		 boolean dirPressed;                //make proper boolean variables for directions, start button, and the scores button, so it can can conduct the corresponding actions
    		 boolean startPressed;
    		 boolean hsPressed;
    		 String tempString;
    		 Image PokeMathLogo = Toolkit.getDefaultToolkit().getImage("PokeLogo.JPG");//getsImage from my computer using the get DefaultToolKit
    		 Image PokeBack1 = Toolkit.getDefaultToolkit().getImage("PokeBack1.png");
    				//        g.drawImage(PokeMathLogo, 60,150,800,625,this);

    		boolean squirtleChosen;
    		boolean charizardChosen;
    		boolean bulbasaurChosen;

    		JTextField enterName;
    		String name;
    		boolean somethingEntered;

    		 public StartPanel()
    		 {
    		   setLayout(null);                                //Use BorderLayout in main panel. Incorporate Card Layout for all the others
    			//Card Layout made( needs more pseudocode)
    			setBackground(Color.WHITE);
    			Font titleFont = new Font("Serif", Font.BOLD, 20);                //Set Fonts
    			 setFont(titleFont);
    			BottomPanel bp = new BottomPanel();                //Instantiate the Start Panel
    			bp.setBounds(0,600,1500,50);
    			 add(bp);

    			 enterName = new JTextField("Enter Name");
    			 SPTF sptf = new SPTF();
    			 enterName.addActionListener(sptf);
    			 enterName.setBounds(0,0,0,0);
    			 add(enterName);

    		  }

    		public void paintComponent(Graphics g)
    		{                //graphics method header
    			 super.paintComponent(g);                        // draw Images first, draws background then Pokemath logo
    			 g.drawImage(PokeBack1, 0,0,1500,850,this);
    			g.drawImage(PokeMathLogo, 600,10,250,130,this);
    			 //g.drawImage(PokeBack, 0,0,600,400,this);
    			 if (startPressed)
    			 {                                //boolean for startPressed and hsPressed to trigger thecorresponding CardLayout. For testing we'll just use a String
    					enterName.setBounds(650,500,200,50);
    					startPressed = false;
    					if(somethingEntered)
    						cards.show(pHolder, "Creation Panel");
    			 }
    			 if (hsPressed)
    			 {
    					 g.drawString("you just pressed high scores bro", 100, 100);
    					 hsPressed = false;

    			 }

    		}
    		class SPTF implements ActionListener
    		{
    			public void actionPerformed(ActionEvent e)
    			{
    				sp.name = e.getActionCommand();
    				sp.somethingEntered = true;
    				sp.repaint();
    			}
    		}
    	}

    	class BottomPanel extends JPanel
    	{
    		public BottomPanel()
    		{
    			setLayout(null);

    			JButton start = new JButton("Start Game");
    			JButtonHandlerS jbhs = new JButtonHandlerS();
    			start.addActionListener(jbhs);
    			start.setBounds(0,0,1500,50);
    			add(start);

}
