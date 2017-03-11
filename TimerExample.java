// 3/7/2017
// TimerExample.java
// This program demonstrates a simple timer animation with a bouncing ball.

// Topics:
//	1. Create an ActionListener class
//	2. Implement timer for JPanel
// After the program runs correctly, you will add the following:
//  3. Add in a MouseListner so that when you press the mouse on the panel, the ball slows down
//		When you click it again, it resumes the normal speed.
//	4.  Add in a KeyListener, so when you press the up/down/right/left arrow, the ball is
//		move 20 pixels in that direction.

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
//////////////////2.   import for Timer	///////////////


public class TimerExample
{
	public TimerExample()
	{
	}

	public static void main (String[] args)
	{
		TimerExample te = new TimerExample();
		te.run();
	}

	public void run()
	{
		JFrame frame = new JFrame("Timer Example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Create JPanel and add to frame

		DrawPanel panel = new DrawPanel();
		frame.getContentPane().add(panel);	// add panel to frame

		frame.setSize(500, 600);		// explicitly set size in pixels
		frame.setVisible(true);		// set to false to make invisible
	}

}	// end class TimerExample

// JPanel with a private ActionListener class called "Mover"
class DrawPanel extends JPanel
{
	private int x, y;
	private boolean left, up;

	///////////////////////////////////////////////////
	//	Create a class called Mover that implements ActionListener
	//


// For the addition, you also will need to add the listeners in the appropriate place
	//////////////////// MouseListener methods/////////////////////////

	//////////////////// KeyListener methods/////////////////////////


	// The JPanel's constructor
	public DrawPanel ()
	{
		x = 0; y = 30;			// initial upper left corner location of red ball
		left = up = false;		// initialize ball going right and down
		////////////////////////////////////////////////
		//	Declare and initialize
		//	- an ActionListener object
		//	- a Timer

		////////////////////////////////////////////////
		//	Start the timer

	}

	// paintComponent() draws the circle and increments the location.
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		setBackground(Color.MAGENTA);
		g.setColor(Color.RED);
		g.fillOval(x, y, 50, 50);

		// moves the ball right and left
		if (!left && x < getWidth()-50)
			x++;
		else
		{
			left = true;
			x--;
		}
		if ( left && x > 0 )
			x--;
		else
		{
			left = false;
			x++;
		}

		// moves the ball up and down
		if (!up && y < getHeight()-50)
			y++;
		else
		{
			up = true;
			y--;
		}
		if ( up && y > 0 )
			y--;
		else
		{
			up = false;
			y++;
		}
	}
}	// end class DrawPanel
