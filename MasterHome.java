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

    public class MasterHome extends JFrame
    {

        public static void main (String[]args)
        {
            MasterHome mp = new MasterHome();
        }

        public MasterHome()
        {
        super("MasterHome");
        setSize(270,270);
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
  g.drawRect(5, 10, 155, 50);
  g.drawLine(0, 0, 160, 0);
  g.fillArc(11,11,48,48,45,270);
  for (int y = 30; y<50; y+=25){
  for (int x = 70; x<=130; x+=30){
  g.fillOval(x, y, 20, 20);
  }}
  g.fillArc(100, 110, 80, 40, 330, 240);
  g.drawLine(140, 130, 140, 150);
  g.fillRect(138, 150, 4, 10);
  for(int y = 170; y<= 180; y+=10){
  for(int x = 80; x<=200; x+=100){
  g.drawOval(x, y, 20, 4);
  }}
  g.drawLine(150, 150, 340, 150);
  g.fillOval(200, 200, 100, 50);
  g.fillArc(220, 150, 150, 150, 330, 60);
  for(int y= 150; y<=190; y+=20){
  for(int x=200; x<210; x+=20){
  g.fillOval(x, y, 10, 10);
  }}
  g.drawOval(175, 175, 50, 50);
  g.fillArc(172, 85, 56, 100, 240, 60);
  g.fillRect(162, 175, 76, 10);
  for(int y= 245; y<=265; y+=10){
  for(int x = 190; x<200 ; x+=20 ){
  g.drawLine(x, y, x+20, y);
  }}


    //COLOR purplo = new Color(255,0,255);




        }



    }
  }
