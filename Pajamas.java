/*
* Surya Dantuluri
* February 17, 2017
*  Pajamas.java
* Simple program that displays a repeated pattern of shapes *on a fabric, which is then covered by polygons to display a *picture of pajamas on a panel.
* Uses JFrame class and JPanel container.
* Uses integers and arrays.
*
* Class first declares extending JFrame class.
* Then sets size, sets size of origin of content panel, sets * if window is resizable or not.
*
* Sets new panel then sets background
* Sets pattern, covering all of the panel
* Overlays pattern with other shapes in panel to make the
* output look like pajamas.
*
*Testing Plan:
*input: no input
*output:
*/
import java.awt.*;     //imports abstract window toolkit
import java.awt.event.*; //imports possible events of abstract window toolkit
import javax.swing.*; //imports graphics components with swing

public class Pajamas extends JFrame //class extends JFrame class
{

  public static void main (String[]args) //main method
    {
    Pajamas pjs = new Pajamas(); //instantiates program
    }

  public Pajamas() //constructor
    {
    super("Pajamas"); //name of window
    setSize(710,702); //size of content pane
    setDefaultCloseOperation(EXIT_ON_CLOSE); //exits pane on close
    setLocation(0,0); //sets origin of pane
    setResizable(true); //sets if resizable or not

    Panel pan = new Panel(); //creates new panel
    setContentPane(pan); //sets content pane on panel
    setVisible(true);  //sets if panel is visible
    }


  class Panel extends JPanel //class extends JPanel
    {
    public Panel() //constructor
      {
      setBackground(Color.RED); //sets background color red
      }

      public void paintComponent(Graphics g) //paintComponent method and has graphics g parameter
        {
        super.paintComponent(g); //fills background color

        for (int y=0; y<=660; y+=30) //for loop for shapes to draw vertically
          {
          for (int x = 0; x <=690; x+=30) //for loop for shapes to draw horizontally
            {
            g.drawOval( x, y, 20, 20); //draws oval with x and y changing to draw repetitively
            g.drawRect(x,y,26,26); //draws rectangle with x and y changing to draw repetitively
            g.fillArc(x+5,y+5,10,20,0,180); //draws arc with x and y changing to draw repetitively
            }
          }
        	g.setColor(Color.BLACK); //now draws components in black

        int [] xleftsleevebottom = {0, 200, 200, 0}; //array for x values for the left bottom polygon
			  int [] yleftsleevebottom = {300, 200, 700, 700}; //array for y values for the left bottom polygon
			  g.fillPolygon(xleftsleevebottom, yleftsleevebottom, 4); //polygon with x,y array values to draw polygon

        int [] xrightsleevebottom = {710, 510, 510, 710}; //array for x values for the right bottom polygon
		  	int [] yrightsleevebottom = {300, 200, 700, 700}; //array for y values for the right bottom polygon
		  	g.fillPolygon(xrightsleevebottom, yrightsleevebottom, 4); //polygon with x,y array values to draw polygon

        int [] xleftsleevetop = {0, 200, 0}; //array for x values for the left top polygon
		  	int [] yleftsleevetop = {0, 0, 200}; //array for y values for the left top polygon
		  	g.fillPolygon(xleftsleevetop, yleftsleevetop, 3); //polygon with x,y array values to draw triangle

        int [] xrightsleevetop = {710, 510, 710}; //array for x values for the left top polygon
		  	int [] yrightsleevetop = {0, 0, 200}; //array for y values for the left top polygon
		   	g.fillPolygon(xrightsleevetop, yrightsleevetop, 3); //polygon with x,y array values to draw triangle

        g.fillArc(200,-100,310,200,180,180); //overlay arc to show a "sleeve" on pajamas

        }
    }
}
