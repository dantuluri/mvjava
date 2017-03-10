/*
* Surya Dantuluri
* March 2, 2017
* Accessibility.java
*
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

import java.awt.Color;     //imports abstract window toolkit
import java.awt.Graphics; //imports possible events of abstract window toolkit
import java.awt.Image; //imports graphics components with swing
import java.awt.Font;
import java.awt.event.MouseListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class AccessibilityRunner
{
	private Accessibility canvas;
	private Image image;
	private JLabel label;
	private int xpos, ypos;
	private boolean keyClear;
	private int sizeX, sizeY;
	private String imageName;
	private boolean shiftkey;
	private boolean clicked;
	private boolean watered;
	private int clearcode;
	private boolean mouseWater;
	private boolean mouseFlower;
	private boolean waterBackground;
	private boolean flowerclick;
	private boolean cleargarden;

	public Accessibility()
	{
    //constructor
  }
  public static void main(String[]args)
  {
    AccessibilityRunner accrun = new AccessibilityRunner();
    accrun.run();
  }

  public void run()
	{
		JFrame frame = new JFrame("AccessibilityRunner");//sets up new jframe
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setLayout(null); //get ContentRaw().setLayout(null);
		frame.getContentPane();//sets content pane
		canvas=new Accessibility();//sets canvas as garden
		frame.getContentPane().add(canvas);//gets content pane and adds canvas
		frame.setBackground(Color.RED);//sets background color to pink
		frame.setSize(1000,800);//sets size for frame
		frame.setLocation(0,0);//sets origin
		frame.setResizable(false);//sets if resizable or not
		frame.setVisible(true);//sets if frame is visible or not
	}

	JPanel class: Accessibility
	// import each class needed
	//be sure to complete the class header
	public class Accessibility extends JPanel implements MouseListener, KeyListener
	{
	private Color backgroundColor;
	private int fontSize;
	public Accessibility() //add listeners as appropriate
	{
	backgroundColor = new Color(100,100,100);
	fontSize = 12;
	addMouseListener(this);
	addKeyListener(this);
	}
	public void drawRectanglesWithLabels(Graphics g) //This method is complete
	{
	g.setColor(Color.RED);
	g.fillRect(10,10,100,20);
	g.fillRect(115,10,100,20);
	g.setColor(Color.BLACK);
	g.drawString(“brighter”, 15, 80)
	g.drawString(“darker”, 115, 80);
	}
	public void medicalPageContent(Graphics g){ } /*Assume this method is complete. */
	public void paintComponent(Graphics g)
	{
	setBackground(Color.RED);
	//draw background color
	drawRectanglesWithLabels(g)
	g.setColor(Color.BLACK);
	g.setFont(“Serif”, Font.PLAIN, fontSize);
	medicalPageContent(g);
	}
	public void keyPressed(KeyEvent e) //fill in blank
	{ /*determine if the user used the keyboard appropriately to elicit a graphical response, record or
	change information as appropriate, and call the method to make the appropriate graphical response */
	int upcode = e.getKeyCode();
	if(upcode==KeyEvent.VK_UP)
	{
	  uparrow=true;
	  if(fontSize=+5>80)
	  {
	  fontSize=+5;
	  }
	}
	int downcode = e.getKeyCode();
	if(downcode==KeyEvent.VK_DOWN)
	{
	  downarrow=false;
	  if(fontSize=-5<8)
	  {
	  fontSize=-5;
	  }
	}
	}
	public void keyTyped (KeyEvent e){} //Fill in blank.
	public void keyReleased (KeyEvent e){} //Fill in blank.
	public void mousePressed(MouseEvent e)
	{ //make it so the keyboard will work!
	}
	public void mouseClicked(MouseEvent e)
	{ /*determine if the user is clicking on one of the appropriate rectangles to elicit a graphical response,
	record or change information as appropriate, and call the method to make the appropriate graphical
	response*/
	int xpos = e.getX();
	int ypos = e.getY();


	}
	public void mouseReleased(MouseEvent e){} //This method is complete.
	public void mouseEntered(MouseEvent e){} //This method is complete.
	public void mouseExited(MouseEvent e){} //This method is complete.
	}
