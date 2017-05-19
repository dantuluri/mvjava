
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Target implements MouseListener
{
	private int x, y, xpos, ypos;
	private boolean initialscreen, press;

	JFrame frame;
	ThePanel canvas;

	public Target ( )
	{
		x = y = xpos = ypos = -5;
		initialscreen = true;
		press = false;
	}

	public static void main(String[] args)
	{
		Target t = new Target();
		t.Run();
	}

	public void Run ( )
    	{
		// Create a frame to hold everything
		frame = new JFrame ("Target");
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setBackground(Color.black);	// only needed if frame is larger than panel

		// Define panel to draw on
		canvas = new ThePanel();		// create a panel to draw on
		canvas.setBackground(Color.white);
		canvas.addMouseListener(this);	// connects the MouseListerner to the panel window

		// Put frame together
		frame.getContentPane().add(canvas);	// puts panel on frame
		frame.setVisible(true);

	}

   	class ThePanel extends JPanel
	{
        	public void paintComponent(Graphics g)
		{
      			super.paintComponent(g);
	   		Font MyFont = new Font ( "Arial", Font.PLAIN, 20 );
	   		g.setFont ( MyFont );

			g.setColor ( Color.lightGray );
			g.fillOval ( 100, 100, 200, 200 );
			g.setColor ( Color.blue );
			g.fillRect ( 20, 20, 120, 40 );
			g.setColor ( Color.blue );
			g.fillOval ( 120, 120, 160, 160 );
			g.setColor ( Color.yellow );
			g.fillOval ( 140, 140, 120, 120 );
			g.setColor ( Color.red );
			g.fillOval ( 160, 160, 80, 80 );

			xpos = 50  +  (int)( 300 * Math.random ( ) );
			ypos = 50  +  (int)( 300 * Math.random ( ) );
			g.setColor ( Color.black );
			g.drawString ( "PRESS ME", 30 , 50 );
			if ( !initialscreen )
			{
				g.fillOval ( xpos - 10, ypos - 10, 20, 20 );
			}
			double radius = Math.sqrt ( (double)((xpos - 200)*(xpos - 200) + (ypos - 200)*(ypos - 200)) );

			if ( initialscreen )
			{
				g.drawString ( "Press the Button to shoot an arrow", 20 , 350 );
				initialscreen = false;
			}
			else if ( radius <= 40.0 )
				g.drawString ( "Yes!  A Bull's Eye, worth 100 points!", 20 , 350 );
			else if ( radius <= 60.0 )
				g.drawString ( "Not bad, you scored 50 points!", 20 , 350 );
			else if ( radius <= 80.0 )
				g.drawString ( "Pretty good, you scored 30 points.", 20 , 350 );
			else if ( radius <= 100.0 )
				g.drawString ( "You hit the target and earned 10 points.", 20 , 350 );
			else
				g.drawString ( "Try again, you missed the target.", 20 , 350 );
      		}
   	}

   	public void mouseClicked ( MouseEvent e )   {}

   	public void mousePressed ( MouseEvent e )
		{
			x = e.getX();
			y = e.getY();
			if ( x >= 20 && x <= 140 && y >= 20 && y <= 60 )
				canvas.repaint ( );
		}

   	public void mouseReleased ( MouseEvent e )   {}

   	public void mouseEntered ( MouseEvent e )   {}

   	public void mouseExited ( MouseEvent e )     {}
}
