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
        setSize(900,900);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(0,0);
        setResizable(true);

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

            g.fillArc(20,20,80,120,60,60);
  g.drawLine(60,80,60,120);
  g.drawRect(40,120,40,60);
  for (int y=160; y<=170; y+=10){
  for (int x = 40; x <=70; x+=10){
  g.drawOval( x, y, 10, 10);
  }}

    //COLOR purplo = new Color(255,0,255);




        }



    }
}
