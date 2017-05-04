/*Surya Dantuluri
Accessibility.java
3/6/17

*/

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
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
		public static void main(String[] args)
		{
			AccessibilityRunner ar = new AccessibilityRunner();
		}
		
		public AccessibilityRunner()
		{
			JFrame frame = new JFrame("Accessibility");
			frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
			frame.setLayout(null);    //getContentRaw().setLayout(null);
			frame.getContentPane();
			frame.setSize(1000, 800);
			frame.setLocation(0, 0);
			frame.setResizable(false);
			frame.setVisible(true);        
		}
}

class Accessibility extends JPanel implements MouseListener,KeyListener
{
	private Color backgroundColor;
	private int fontSize;
	private int x;
	private int y;
	
	public Accessibility()
	{
		x = 100;
		y=12;
		
		backgroundColor = new Color(x, x, x);
		fontSize = y;
		
		addMouseListener(this);
        addKeyListener(this);
	}
	
	public void drawRectanglesWithLabels(Graphics g)
	{
		g.setColor(Color.RED);
		g.fillRect(10,10,100,20);
		g.fillRect(115,10,100,20);
		g.setColor(Color.BLACK);
		g.drawString("brighter", 15, 80);
		g.drawString("darker", 115, 80);
	}
	
	public void medicalPageContent(Graphics g){ } /*Assume this method is complete. */
	
	public void paintComponent(Graphics g)
	{
		setBackground(backgroundColor);
		//draw background color
		drawRectanglesWithLabels(g);
		g.setColor(Color.BLACK);
		Font f = new Font("Serif", Font.PLAIN, fontSize);
		g.setFont(f);
		medicalPageContent(g);
	}
	
	public void keyPressed(KeyEvent e)		
	{
		int code = e.getKeyCode();
		
		if(code == KeyEvent.VK_UP)
		{
			if(x+3 <= 255)
			{	
				x += 3;
				repaint();
			}
		}
		/*determine if the user used the keyboard appropriately to elicit a graphical response, record or
		change information as appropriate, and call the method to make the appropriate graphical response */
		if(code == KeyEvent.VK_DOWN)
		{
			if(x-3 >= 34)
			{	
				x -= 3;
				repaint();
			}
		}
	}
	
	public void keyTyped (KeyEvent e){}
	public void keyReleased (KeyEvent e){}
	
	public void mousePressed(MouseEvent e)
	{
		requestFocusInWindow();
	}
	
	public void mouseClicked(MouseEvent e)
	{
		int a = e.getX();
		int b = e.getY();
	}

	public void mouseReleased(MouseEvent e){}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
}
