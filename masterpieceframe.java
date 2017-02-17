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

    public class masterpieceframe extends JFrame
    {

        public static void main (String[]args)
        {
            masterpieceframe mpf = new masterpieceframe();
        }

        public masterpieceframe()
        {
        super("masterpieceframe");
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
g.drawLine(150, 150, 340, 150);
g.fillOval(200, 200, 100, 50);
g.fillArc(220, 150, 150, 150, 360, 60);
for(int y= 150; y<=190; y+=20){
for(int x=200; x<210; x+=20){
g.fillOval(x, y, 10, 10);
}}

    //COLOR purplo = new Color(255,0,255);




        }



    }
}
