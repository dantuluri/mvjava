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

    public class Masterpiece2 extends JFrame
    {

        public static void main (String[]args)
        {
            Masterpiece2 mp2 = new Masterpiece2();
        }

        public Masterpiece2()
        {
        super("Masterpiece2");
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
            g.fillArc(255,600,150,110,0,180);
            g.drawLine(100,100,550,400);
            Font serifBold50 = new Font("Serif",Font.BOLD,50);
            g.setFont(serifBold50);
            g.drawString("Yipee!",100,350);
            g.drawArc(50,450,100,100,0,180);

            int [] xpolygon = {200, 400, 600, 350,200}; //array for x values for the left bottom polygon
    			  int [] ypolygon = {450, 450, 550, 700,700}; //array for y values for the left bottom polygon
    			  g.drawPolygon(xpolygon, ypolygon, 5); //polygon with x,y array values to draw polygon


    //COLOR purplo = new Color(255,0,255);




        }



    }
}
