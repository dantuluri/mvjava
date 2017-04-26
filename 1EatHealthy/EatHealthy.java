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
      landingPan = new LandingPage();
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

    class WelcomePage extends JPanel
      {

         boolean isPressed;                //make proper boolean variables for directions, start button, and the scores button, so it can can conduct the corresponding actions
         String username;
         Image Background = Toolkit.getDefaultToolkit().getImage("welcome.jpg");
        JTextField enterName;
        String name;
        boolean somethingEntered;

         public WelcomePage()//constructor initlizses the backgound, bottom panel as well as the name field for the user to enter their name to be displayed, and to make it a more personal experience.
         {
           setLayout(cards);                                //Use BorderLayout in main panel. Incorporate Card Layout for all the others
          //Card Layout made( needs more pseudocode)
          setBackground(Color.WHITE);
          Font titleFont = new Font("Serif", Font.BOLD, 20);                //Set Fonts
           setFont(titleFont);
          //BottomPanel bp = new BottomPanel();                //Instantiate the Start Panel
          //bp.setBounds(0,600,1500,50);                //set bounds for bottom panel
           //add(bp);

           enterName = new JTextField("Enter Name");    // intializes JTextField to enter the name of the person
           SPTF sptf = new SPTF();
           enterName.addActionListener(sptf); //add action listener for intering names
           enterName.setBounds(0,0,0,0);
           add(enterName);

          }

        public void paintComponent(Graphics g)    //paint compoenent to set bottom image as well as the bottom panel for button
        {                //graphics method header
           super.paintComponent(g);                        // draw Images first, draws background then Pokemath logo
           g.drawImage(background, 0,0,1500,850,this);
          g.drawImage(PokeMathLogo, 600,10,250,130,this);
           //g.drawImage(PokeBack, 0,0,600,400,this);
           if (startPressed)
           {                                //boolean for startPressed and hsPressed to trigger thecorresponding CardLayout. For testing we'll just use a String
              enterName.setBounds(650,500,200,50);      //enter name as string in order for game to be more interactive
              startPressed = false;
              if(somethingEntered)
                cards.show(pHolder, "Landing Page");
           }
           if (hsPressed)
           {
               g.drawString("you just pressed high scores bro", 100, 100);  //impossible to press hsPressed	 NOT POSSIBLE
               isPressed = false;

           }

        }
        class StartGameButton implements ActionListener//implement SPTF for action command regarding the text field
        {
          public void actionPerformed(ActionEvent e)
          {
            sgb.name = e.getActionCommand();
            sgb.somethingEntered = true;
            sgb.repaint();
          }
        }
      }

      class BottomPanel extends JPanel
      {
        public BottomPanel()
        {
          setLayout(cards);

          JButton start = new JButton("Start Game!");
          JButtonHandlerS buttonHandler = new JButtonHandlerS();
          start.addActionListener(buttonHandler);
          start.setBounds(0,0,1500,50);
          add(start);

    }
    class Mouth extends JPanel implements ActionListener//mouth class not finished(unneccesary buttons)
    {
      //variables
        public Mouth(int numIn, Color colorIn) 		//numbers on the panel
        {
            JRadioButton radiobutton = new JRadioButton("1"); //add buttons (unneccesary)
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
        public void paintComponent(Graphics g)  //paintComponent for implementing image
        {
            //super.paintComponent(g);
            //g.setFont(new Font("Arial", Font.BOLD, 18));
            //g.setColor(Color.RED);
            //g.drawString(num, 10, 20);
        }

        public void actionPerformed(ActionEvent evt)//to set borders for panels
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

    //start Esophogous class panels
