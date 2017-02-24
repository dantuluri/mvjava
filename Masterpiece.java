/*
* Surya Dantuluri
* February 8,2017
*  Masterpiece.java
* Simple program that finds out slope and y-intercept depending on inputted equation
* Uses printf() and format, if and else, do while loops
* Uses double, integer, character, and float.
* Uses Scanner class
*
* initializes all needed variables
* input equation
* output trimmed equation, and form of line
* output slope and y-intercept
*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

    public class Masterpiece extends JFrame
    {

        public static void main (String[]args)
        {
            Masterpiece mp = new Masterpiece();
        }

        public Masterpiece()
        {
        super("Masterpiece");
        setSize(700,700); // each unit is
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(0,0);
        setResizable(false);

        Panel pan = new Panel();
        setContentPane(pan);
        setVisible(true);
        }


    class Panel extends JPanel
    {

        public Panel()
        {
            setBackground(Color.BLUE);
        }

        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);

            g.drawOval(600,150,100, 200); //draws oval with x and y changing to draw repetitively
            g.drawRect(100,100,450,300); //draws rectangle with x and y changing to draw repetitively
            g.fillArc(375,600,150,110,0,180);

            Font serifBold20 = new Font("Serif",Font.BOLD,20);
            g.setFont(serifBold20);
            g.drawString("Yipee!",100,250);

    //COLOR purplo = new Color(255,0,255);




        }



    }
}
