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
            private HomePage homePan;//welcome screen
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

		homePan = new HomePanel();
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
     ap = new AreaPanel();
     rp = new RadiusPanel();
     ep = new EndPanel();


		 pHolder.add(sp, "Start Panel");
                pHolder.add(pp, "PythagPanel");
                pHolder.add(pp1, "PythagPanel1");
                pHolder.add(pp2, "PythagPanel2");
                pHolder.add(pp3, "PythagPanel3");
                pHolder.add(pp4, "PythagPanel4");
                pHolder.add(pp5, "PythagPanel5");
                pHolder.add(pp6, "PythagPanel6");
                pHolder.add(pp7, "PythagPanel7");
                pHolder.add(pp8, "PythagPanel8");
                pHolder.add(cp, "Creation Panel");
                pHolder.add(pret, "PreTut");
                pHolder.add(tp, "Tutorial Panel");
                pHolder.add(bp, "Battle Panel");
                pHolder.add(circp, "Circumference Panel");
                pHolder.add(ap, "Area Panel");
                pHolder.add(rp, "Radius Panel");
                pHolder.add(ep, "End Panel");
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


}
