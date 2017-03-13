/*
* Surya Dantuluri
* March 2, 2017
* Accessibilty.java
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

public class
	{
		Accessibility extends JPanel implements MouseListener, KeyListener
	{
		private Color backgroundColor;
		private int fontSize;
		public Accessibility()
		//add listeners as appropriate
		{
			backgroundColor = new Color(100,100,100);
			fontSize = 12;
		}
		public void drawRectanglesWithLabels(Graphics g)
		{
			g.setColor(Color.RED);
			g.fillRect(10,10,100,20);
			g.fillRect(115,10,100,20);
			g.setColor(Color.BLACK);
			g.drawString(“brighter”, 15, 80)
			g.drawString(“darker”, 115, 80);
			//This method is complete
			}
		public void medicalPageContent(Graphics g){ } /*Assume this method is complete. */
		public void paintComponent(Graphics g)
			{
				setBackground(backgroundColor);
				//draw background color
				drawRectanglesWithLabels(g)
				g.setColor(Color.BLACK);
				g.setFont(“Serif”, Font.PLAIN, fontSize);
				medicalPageContent(g);
			}
		public void keyPressed(KeyEvent e)
			//fill in blank
			{
				/*determine if the user used the keyboard appropriately to elicit a graphical response, record or
				change information as appropriate, and call the method to make the appropriate graphical response */
			}
		public void keyTyped (KeyEvent e){}
		public void keyReleased (KeyEvent e){}
		//Fill in blank.
		//Fill in blank.
		public void mousePressed(MouseEvent e)
			{
				//make it so the keyboard will work!
			}
		public void mouseClicked(MouseEvent e)
		{
			/*determine if the user is clicking on one of the appropriate rectangles to elicit a graphical response,
			record or change information as appropriate, and call the method to make the appropriate graphical
			response*/
		}
		public void mouseReleased(MouseEvent e){}
		public void mouseEntered(MouseEvent e){}
		public void mouseExited(MouseEvent e){}
	}
	//This method is complete.
	//This method is complete.
	//This method is complete.
}
