//  CompassTest.java
//  Use the left and right keys to move the hand of a compass.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CompassTest extends JApplet implements KeyListener, FocusListener, MouseListener
{

	Compass mycompass = new Compass ( 200, 120, 80, 0, Color.gray, Color.blue );
	Compass myothercompass = new Compass ( 60, 300, 30, 90, Color.yellow, Color.magenta );
	private DrawStuff paintarea;

	public CompassTest ( )
	{
		mycompass = new Compass ( 200, 120, 80, 0, Color.gray, Color.blue );
		myothercompass = new Compass ( 60, 300, 30, 90, Color.yellow, Color.magenta );
	}

	public CompassTest(Compass mycompass) {
		this.mycompass = mycompass;
	}

	public static void main(String[]args)
	{
		CompassTest compasstesto = new CompassTest();//instantiates class
		compasstesto.init();//calls run
	}

	public void init ( )
	{
		paintarea = new DrawStuff();
		setContentPane(paintarea);
		paintarea.setBackground(Color.gray);
		paintarea.addFocusListener(this);
		paintarea.addKeyListener(this);
		paintarea.addMouseListener(this);
	}

	class DrawStuff extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			mycompass.draw ( g );
			myothercompass.draw ( g );
		}
	}

	public void focusGained(FocusEvent evt)
	{
		paintarea.repaint();
	}

	public void focusLost(FocusEvent evt)
	{
		paintarea.repaint();
	}

	public void mousePressed(MouseEvent evt)
	{
		paintarea.requestFocus();
	}

   	public void mouseEntered(MouseEvent evt) { }
	public void mouseExited(MouseEvent evt) { }
	public void mouseReleased(MouseEvent evt) { }
	public void mouseClicked(MouseEvent evt) { }

	public void keyTyped ( KeyEvent e )    {}

	public void keyPressed ( KeyEvent e )
	{
		int value = e.getKeyCode();
		if ( value == KeyEvent.VK_RIGHT )
		{
  			mycompass.changedegree ( 3 );
  			myothercompass.changedegree ( 9 );
			paintarea.repaint ();
		}
		else if ( value == KeyEvent.VK_LEFT )
		{
			mycompass.changedegree ( -3 );
  			myothercompass.changedegree ( -9 );
			paintarea.repaint ();
		}
	}

	public void keyReleased ( KeyEvent e )   {}
}

class Compass
{
	private int xpos, ypos, radius, degree;
	private Color face, arrow;

	public Compass ( int x, int y, int r, int d, Color f, Color a )
	{
		xpos = x;
		ypos = y;
		radius = r;
		degree = d;
		face = f;
		arrow = a;
	}

	public void draw ( Graphics g )
	{
		g.setColor ( face );
		g.fillOval ( xpos - radius, ypos - radius, 2 * radius, 2 * radius );
		g.setColor ( Color.black );
		g.drawOval ( xpos - radius, ypos - radius, 2 * radius, 2 * radius );
		g.drawLine ( xpos, ypos - radius, xpos, ypos + radius );
		g.drawLine ( xpos - radius, ypos, xpos + radius, ypos );
		g.drawLine ( xpos + 2 * radius / 3, ypos - 2 * radius / 3, xpos - 2 * radius / 3, ypos + 2 * radius / 3 );
		g.drawLine ( xpos - 2 * radius / 3, ypos - 2 * radius / 3, xpos + 2 * radius / 3, ypos + 2 * radius / 3 );
		drawarrow ( g );
		g.setColor ( Color.black );
		g.fillOval ( xpos - radius / 16, ypos - radius / 16, radius / 8, radius / 8 );
		drawletters ( g );
	}

	public void drawarrow ( Graphics g )
	{
		int [] x = new int [7];
		int [] y = new int [7];
		double dx = Math.PI / 32;
		x[0] = (int) ( xpos + radius / 10 * Math.cos ( degree * Math.PI / 180 + 3 * Math.PI / 4 ));
		x[1] = (int) ( xpos + 4 * radius / 5 * Math.cos ( degree * Math.PI / 180 + dx ));
		x[2] = (int) ( xpos + 4 * radius / 5 * Math.cos ( degree * Math.PI / 180 + 2 * dx ));
		x[3] = (int) ( xpos + radius * Math.cos ( degree * Math.PI / 180 ));
		x[4] = (int) ( xpos + 4 * radius / 5 * Math.cos ( degree * Math.PI / 180 - 2 * dx ));
		x[5] = (int) ( xpos + 4 * radius / 5 * Math.cos ( degree * Math.PI / 180 - dx ));
		x[6] = (int) ( xpos + radius / 10 * Math.cos ( degree * Math.PI / 180 - 3 * Math.PI / 4 ));
		y[0] = (int) ( ypos + radius / 10 * Math.sin ( degree * Math.PI / 180 + 3 * Math.PI / 4 ));
		y[1] = (int) ( ypos + 4 * radius / 5 * Math.sin ( degree * Math.PI / 180 + dx ));
		y[2] = (int) ( ypos + 4 * radius / 5 * Math.sin ( degree * Math.PI / 180 + 2 * dx ));
		y[3] = (int) ( ypos + radius * Math.sin ( degree * Math.PI / 180 ));
		y[4] = (int) ( ypos + 4 * radius / 5 * Math.sin ( degree * Math.PI / 180 - 2 * dx ));
		y[5] = (int) ( ypos + 4 * radius / 5 * Math.sin ( degree * Math.PI / 180 - dx ));
		y[6] = (int) ( ypos + radius / 10 * Math.sin ( degree * Math.PI / 180 - 3 * Math.PI / 4 ));
		g.setColor ( arrow );
		g.fillPolygon ( x, y, 7 );
	}

	public void drawletters ( Graphics g )
	{
		g.setColor ( Color.black );
		Font letters  = new Font("Serif", Font.BOLD, radius / 3);
		g.setFont(letters);
		g.drawString ( "N", xpos - radius / 12, ypos - radius - radius / 12 );
		g.drawString ( "NE", xpos + 3 * radius / 4, ypos - 3 * radius / 4 );
		g.drawString ( "E", xpos + radius + radius / 12, ypos + radius / 12 );
		g.drawString ( "SE", xpos + 3 * radius / 4, ypos + radius );
		g.drawString ( "S", xpos - radius / 12, ypos + radius + radius / 3 );
		g.drawString ( "SW", xpos - 4 * radius / 3, ypos + radius );
		g.drawString ( "W", xpos - radius - radius / 3, ypos + radius / 12 );
		g.drawString ( "NW", xpos - 4 * radius / 3, ypos - 3 * radius / 4 );
	}

	public void changedegree ( int addto )
	{
		degree += addto;
		if  ( degree >= 360 )
			degree -= 360;
		else if ( degree <= 0 )
			degree += 360;
	}
}
