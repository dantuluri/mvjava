/*Surya Dantuluri
Accessibility.java
3/6/17
This program uses GUI and Key and Mouse events so that the user can change the background color and the font size of the page in real time.
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


public class AccessibilityRunner extends JFrame
{
		public static void main(String[] args)
		{
			AccessibilityRunner ar = new AccessibilityRunner();
		}
		
		public AccessibilityRunner()
		{
			JFrame frame = new JFrame("Accessibility");
			Accessibility ac = new Accessibility();
			setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
			setLayout(null);    //getContentRaw().setLayout(null);
			setContentPane(ac);
			setSize(1000, 800);
			setLocation(0, 0);
			setResizable(false);
			setVisible(true);        
		}
}

class Accessibility extends JPanel implements MouseListener,KeyListener
{
	private Color backgroundColor;
	private int fontSize;
	private int x;
	private int y;
	private boolean check1;
	
	public Accessibility()
	{
		x = 100;
		y=13;
		
		check1 = false;
		
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
	
	public void medicalPageContent(Graphics g){ }
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		setBackground(backgroundColor);
		
		g.setColor(Color.BLACK);
		Font f = new Font("Serif", Font.PLAIN, fontSize);
		
		g.setFont(f);
		drawRectanglesWithLabels(g);
	}
	
	public void keyPressed(KeyEvent e)		
	{
		int code = e.getKeyCode();
        System.out.println(code);
		
		if(code == KeyEvent.VK_UP)
		{
			if(y+5 <= 80)
			{	
				y += 5;
				fontSize = y;
				repaint();
			}
		}
		
		if(code == KeyEvent.VK_DOWN)
		{
			if(y-5 >= 8)
			{	
				y -= 5;
				fontSize = y;
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
		
		if((b <= 30 && b >= 10) && (a >= 10 && a <= 110))
		{
			if(x+3 <= 255)
			{	
				x += 3;
				backgroundColor = new Color(x, x, x);
				repaint();
			}
		}
		if((b <= 30 && b >= 10) && (a >= 115 && a <= 215))
		{
			if(x-3 >= 34)
			{	
				x -= 3;
				backgroundColor = new Color(x, x, x);
				repaint();
			}
		}
		
	}

	public void mouseReleased(MouseEvent e){}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
}
