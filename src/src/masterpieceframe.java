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
      public double x;
      public double y;
        public Panel()
        {
            setBackground(Color.RED);
        }

        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            // int [] a = {0, 10, 70, 80, 100, 60, 40, 60};
            // int [] b = {90, 80, 140, 120, 140, 180, 160, 150};
            // setBackground(Color.CYAN); //cyan is blue-green
            // super.paintComponent(g);
            // g.setColor(Color.GREEN);
            // g.fillRect(0, 50, 240, 170);
            // g.setColor(Color.YELLOW);
            // g.fillPolygon(a, b, 8);
            // g.drawString("Sport", 90, 210);
            // g.setColor(Color.MAGENTA); //magenta is hot pink
            // for(int y = 90; y <= 150; y += 60)
            // g.fillOval(160, y, 30, 30);
            // g.setColor(Color.BLACK);
            // for (int x = 180; x <= 200; x += 10)
            // g.drawArc(x, 140, 40, 80, 0, 180);

            g.setColor(Color.CYAN);
g.drawRect(10,15,40,45);
g.fillRect(10,30,40,30);
g.setColor(Color.RED);
g.fillArc(0, 0, 30, 30, 30, 210);
g. setColor(Color. WHITE);
for (int i = 0; i<6; i++){
x=(int)(Math.random()*36 + 10);
y=(int)(Math.random()*36 + 10);
g.drawOval(x, y, 4, 4);
}

    //COLOR purplo = new Color(255,0,255);




        }



    }
}
