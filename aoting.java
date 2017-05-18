//WRITTEN BY ARUSHI (April 20)
 import java.awt.Graphics; //import for the graphics, color, frame, panel, font, and layouts
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.JButton; //imports for components like buttons, text fields, sliders, and menus
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.ActionEvent; //actionevent and actionlistener imports
import java.awt.event.ActionListener;
import java.io.File; //imports necessary for images and text files
import java.io.IOException;
import java.awt.Image;
import javax.imageio.ImageIO;
public class SwineMaster extends JFrame // class header
{
    JFrame frame; //variables
    boolean learnBoolean;
    boolean quizBoolean;
    boolean practiceBoolean;
    CardLayout cards;
    JPanel test;
    JButton back;
    Boolean goBack;

    public SwineMaster() //constructor to make a new frame
    {

        frame = new JFrame("SWINE MASTER");
    }

    public static void main (String [] args) //main method to call the run method
    {
        SwineMaster sM = new SwineMaster();
        sM.run();
    }

    public void run() //run method
    {
        frame.setSize(500, 500);
        cards = new CardLayout();//initialization of the frame and making instances of other panels

        frame.setBackground(Color.PINK);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        MainPanel mainP = new MainPanel();
        LearnPanel learn = new LearnPanel();
        QuizPanel quiz = new QuizPanel();
        PracticePanel practice = new PracticePanel();


        test = new JPanel(cards);
        test.add(mainP, "Main");
        test.add(learn, "Learn");
        test.add(practice, "Practice");
        test.add(quiz, "Quiz");

        frame.add(test);


        frame.setResizable(false);
        frame.setVisible(true);
    }


    class MainPanel extends JPanel implements ActionListener //class header for the main panel in the beginning
    {
        JButton learnMode;
        JButton practiceMode;
        JButton quizMode;
        //ButtonGroup modeGroup;

        public MainPanel() //initialize panel and add a label and 3 buttons allowing user to choose which mode they want to go to
        {
            setLayout(new GridLayout(0, 1, 50, 50));
            setBackground(Color.PINK);

            JLabel title = new JLabel("Swine Master", JLabel.CENTER);
            title.setFont(new Font("Arial", Font.BOLD, 30));
            add(title);

            JLabel instructions = new JLabel("Click one of the buttons below to start a mode.", JLabel.CENTER);
            instructions.setFont(new Font("Arial", Font.PLAIN, 20));
            add(instructions);

            //modeGroup = new ButtonGroup();

            learnMode = new JButton("Learn mode");
            practiceMode = new JButton("Practice mode");
            quizMode = new JButton("Quiz mode");

            learnMode.addActionListener(this);
            practiceMode.addActionListener(this);
            quizMode.addActionListener(this);

            /*modeGroup.add(learnMode);
            modeGroup.add(practiceMode);
            modeGroup.add(quizMode);*/

            add (learnMode);
            add(practiceMode);
            add(quizMode);


        } //END OF WRITTEN BY ARUSHI ON April 20

       //WRITTEN BY ARUSHI (April 21)
        public void actionPerformed(ActionEvent e) //check which button the user clicked and make an instance of the appropriate class
        {
            String command = e.getActionCommand();

                if (command.equals("Learn mode")) //use boolean to determine which class to instantiate in the paint component method
                {
                   learnBoolean = true;
                   quizBoolean = false;
                   practiceBoolean = false;

                }
                else if (command.equals("Quiz mode"))
                {
                    quizBoolean = true;
                    learnBoolean = false;
                    practiceBoolean = false;

                }
                else if (command.equals("Practice mode"))
                {
                    practiceBoolean = true;
                    learnBoolean = false;
                    quizBoolean = false;


                }
                repaint();
            }

        public void paintComponent(Graphics g) //check which boolean is true to see what class to instantiate
        {
            super.paintComponent(g);
            if (learnBoolean == true)
            {
                cards.next(test);
                learnBoolean = false;
                repaint();
            }

            else if (practiceBoolean == true)
            {

                cards.show(test, "Practice");
                practiceBoolean = false;
                repaint();

            }
            else if (quizBoolean == true)
            {
                cards.show(test, "Quiz");
                quizBoolean = false;
                repaint();

            }

        } //END OF Written by Arushi (April 21)
    }

//  WRITTEN BY HERMAN (April 20)
   class LearnPanel extends JPanel implements ActionListener //an instance of this class is made when the user chooses learn mode
    {


        public LearnPanel() //initializes panel
        {
            goBack = false;
            //setLayout(new GridLayout());
            setBackground(Color.CYAN);
            repaint();
            back = new JButton("Back");
            back.addActionListener(this);
            add(back);
        }



        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            Font f = new Font("Arial", Font.BOLD, 20);
            g.setFont(f);
            g.drawString("Welcome to the learn mode!", 100, 200);
            if (goBack == true)
            {
                goBack = false;
                cards.show(test, "Main");
                repaint();
            }
        }

        public void actionPerformed(ActionEvent e)
        {
            String command = e.getActionCommand();
            if (command.equals("Back"))
            {
                goBack = true;
                repaint();
            }
        }


    }// end of WRITTEN BY HERMAN (April 20)

    class QuizPanel extends JPanel implements ActionListener
    {


        public QuizPanel()
        {
            goBack = false;
            setBackground(Color.YELLOW);
            repaint();
            back = new JButton("Back");
            back.addActionListener(this);
            add(back);
        }

        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            Font f = new Font("Arial", Font.BOLD, 20);
            g.setFont(f);
            g.drawString("Welcome to the quiz mode!", 100, 200);
            if (goBack == true)
            {
                goBack = false;
                cards.show(test, "Main");
                repaint();
            }
        }

        public void actionPerformed(ActionEvent e)
        {
            String command = e.getActionCommand();
            if (command.equals("Back"))
            {
                goBack = true;
                repaint();
            }
        } //written by arushi (april 21)
    }


   // WRITTEN BY HERMAN (April 21)
      class PracticePanel extends JPanel implements ActionListener
    {

        public PracticePanel()
        {
            goBack = false;
            setBackground(Color.GREEN);
            repaint();
            back = new JButton("Back");
            back.addActionListener(this);
            add(back);
        }

        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            Font f = new Font("Arial", Font.BOLD, 20);
            g.setFont(f);
            g.drawString("Welcome to the practice mode!", 100, 200);
            if (goBack == true)
            {
                repaint();
                goBack = false;
                cards.show(test, "Main");
            }
        }

        public void actionPerformed(ActionEvent e)
        {
            String command = e.getActionCommand();
            if (command.equals("Back"))
            {
                goBack = true;
                repaint();
            }
        }
    } //END OF WRITTEN BY HERMAN (April 21) */
}
