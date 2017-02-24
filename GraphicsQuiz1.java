/*
* Surya Dantuluri
* February 17, 2017
*  Pajamas.java
* Simple program that finds out slope and y-intercept depending on inputted equation
* Uses printf() and format, if and else, do while loops
* Uses double, integer, character, and float.
* Uses Scanner class
*
* initializes all needed variables
* input equation
* output trimmed equation, and form of line
* output slope and y-intercept
*
*Testing Plan:
*input: no input
*output:
*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

    public class Pajamas extends JFrame
    {

        public static void main (String[]args)
        {
            Pajamas pjs = new Pajamas();
        }

        public Pajamas()
        {
        super("Pajamas");
        setSize(710,702);
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
            setBackground(Color.RED);
        }

        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);

            for (int y=0; y<=660; y+=30){
            for (int x = 0; x <=690; x+=30){
            g.drawOval( x, y, 20, 20);
            g.drawRect(x,y,26,26);
            g.fillArc(x+5,y+5,10,20,0,180);
          }} //end of for loops on x and y axis

        	g.setColor(Color.BLACK);

      int [] xleftsleevebottom = {0, 200, 200, 0};
			int [] yleftsleevebottom = {300, 200, 700, 700};
			g.fillPolygon(xleftsleevebottom, yleftsleevebottom, 4);

      int [] xrightsleevebottom = {710, 510, 510, 710};
			int [] yrightsleevebottom = {300, 200, 700, 700};
			g.fillPolygon(xrightsleevebottom, yrightsleevebottom, 4);

      int [] xleftsleevetop = {0, 200, 0};
			int [] yleftsleevetop = {0, 0, 200};
			g.fillPolygon(xleftsleevetop, yleftsleevetop, 3);

      int [] xrightsleevetop = {710, 510, 710};
			int [] yrightsleevetop = {0, 0, 200};
			g.fillPolygon(xrightsleevetop, yrightsleevetop, 3);


      g.fillArc(200,-100,310,200,180,180);



        }



    }
}
