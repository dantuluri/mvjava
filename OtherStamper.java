/*Surya Dantuluri*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class OtherStamper implements MouseListener
{

	private int x, y;
	private boolean rightclick, leftclick;

	JFrame frame;
	Paintstuff canvas;

	public OtherStamper ( )
	{
		x = y = 0;
		rightclick = leftclick = false;
	}

	public static void main(String[] args)
	{
		OtherStamper os = new OtherStamper();
		os.Run();
	}

	public void Run()
	{
		// Create a frame to hold everything
		frame = new JFrame ("Other Stamper");
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setBackground(Color.black);	// only needed if frame is larger than panel

		// Define panel to draw on
		canvas = new Paintstuff();		// create a panel to draw on
		canvas.setBackground(Color.lightGray);
		canvas.addMouseListener(this);	// connects the MouseListerner to the panel window

		// Put frame together
		frame.getContentPane().add(canvas);	// puts panel on frame
		frame.setVisible(true);
	}

	class Paintstuff extends JPanel
	{

		Paintstuff()
		{
			setBackground(Color.darkGray);
		}

		public void paintComponent(Graphics g)
		{
			if ( rightclick == true )
			{
				g.setColor(Color.blue);
				g.fillOval( x - 30, y - 15, 60, 30 );
				g.setColor(Color.black);
				g.drawOval( x - 30, y - 15, 60, 30 );
			}
			else if ( leftclick == true )
			{
				g.setColor(Color.red);
				g.fillRect( x - 30, y - 15, 60, 30 );
				g.setColor(Color.black);
				g.drawRect( x - 30, y - 15, 60, 30 );
			}
			else
				super.paintComponent(g);
		}
	}

	public void mousePressed(MouseEvent evt)
	{
 		rightclick = leftclick = false;
	 	if ( evt.isShiftDown() )
		{
			canvas.repaint();
			return;
	 	}

 		x = evt.getX();
		y = evt.getY();

	 	if ( evt.isMetaDown() )
			 rightclick = true;
		else
	 		leftclick = true;

		canvas.repaint();
		return;
	}

	public void mouseEntered(MouseEvent evt) { }
	public void mouseExited(MouseEvent evt) { }
	public void mouseClicked(MouseEvent evt) { }
	public void mouseReleased(MouseEvent evt) { }
}
