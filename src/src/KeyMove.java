

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyMove implements KeyListener, FocusListener, MouseListener   {

	private int xpos, ypos, radius;
	private boolean covertracks;

	private JFrame frame;
	private DrawingArea canvas;

	public KeyMove ( )   {
		xpos = ypos = 5;
		radius = 50;
		covertracks = true;
	}

	public static void main(String[] args) {
		KeyMove km = new KeyMove();
		km.Run();
	}

	public void Run ( )   {
		// Create a frame to hold everything
		frame = new JFrame ("KeyMove");
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setBackground(Color.black);	// only needed if frame is larger than panel

		// Define panel to draw on
		canvas = new DrawingArea();		// create a panel to draw on
      	canvas.setBackground(Color.gray);
		canvas.addFocusListener(this);
		canvas.addKeyListener(this);
		canvas.addMouseListener(this);	// connects the MouseListerner to the panel window

		// Put frame together
		frame.getContentPane().add(canvas);	// puts panel on frame
		frame.setVisible(true);
	}

	class DrawingArea extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor ( Color.blue );
			g.fillOval ( xpos, ypos, 2 * radius, 2 * radius );
		}
	}

	public void focusGained(FocusEvent evt) {
		canvas.repaint();
	}

	public void focusLost(FocusEvent evt) {
		canvas.repaint();
	}

	public void mousePressed(MouseEvent evt) {
		canvas.requestFocus();
	}

   	public void mouseEntered(MouseEvent evt) { }
	public void mouseExited(MouseEvent evt) { }
	public void mouseReleased(MouseEvent evt) { }
	public void mouseClicked(MouseEvent evt) { }

	public void keyTyped ( KeyEvent e )   {}

	public void keyPressed ( KeyEvent e )    {
		int value = e.getKeyCode();
		switch ( value )    {
			case KeyEvent.VK_DOWN:  	ypos += 8; 	break;
			case KeyEvent.VK_UP:    	ypos -= 8;	break;
			case KeyEvent.VK_RIGHT:  	xpos += 8;	break;
			case KeyEvent.VK_LEFT:  	xpos -= 8;	break;
			case KeyEvent.VK_ENTER:
				xpos = (int)( Math.random ( ) * ( 500 - (2 * radius) ) );
				ypos = (int)( Math.random ( ) * ( 500 - (2 * radius) ) );
				break;
		}
		canvas.repaint ( );
	}

	public void keyReleased ( KeyEvent e )   {}
}		
