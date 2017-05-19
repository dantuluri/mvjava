// 3/13/2013 Greenstein: changed applet to JFrame


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Match implements MouseListener
{

	private int ro, co, roremember, coremember;
	private char [][] board;
	private boolean [][] show;
	private boolean initialscreen, endofpair;
	private JFrame frame;
	private APanel canvas;

	public Match ( )
	{
		roremember = coremember = ro = co = 0;
		initialscreen = endofpair = true;
		board = new char [4][4];
		for ( int i = 0; i < board.length; i++ )
			for ( int j = 0; j < board[i].length; j++ )
				board[i][j] = 'S';
		ShowBoard ( );
		Reset ( );
	}

	public static void main(String[] args)
	{
		Match m = new Match();
		m.Run();
	}

	public void Run ( )
	{
		// Create a frame to hold everything
		frame = new JFrame ("Match");
		frame.setSize(400, 425);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setBackground(Color.black);	// only needed if frame is larger than panel

		// Define panel to draw on
		canvas = new APanel();		// create a panel to draw on
		canvas.setBackground(Color.lightGray);
		canvas.addMouseListener(this);	// connects the MouseListerner to the panel window

		// Put frame together
		frame.getContentPane().add(canvas);	// puts panel on frame
		frame.setVisible(true);
	}

	public void ShowBoard ( )
	{
		show = new boolean [4][4];
		for ( int i = 0; i < show.length; i++ )
			for ( int j = 0; j < show[i].length; j++ )
				show[i][j] = false;
	}

	public void Reset ( )
	{
		for ( int i = 0; i < 16; i++ )
		{
			int row = (int)(Math.random() * 4);
			int col = (int)(Math.random() * 4);
			if ( board[row][col] == 'S' )
				board[row][col] = (char)(65 + i / 2);
			else
				i--;
		}

	}

   	class APanel extends JPanel
	{
        	public void paintComponent(Graphics g)
		{
      			super.paintComponent(g);

			DrawGrid ( g );

		   	Font MyFont = new Font ( "Arial", Font.PLAIN, 50 );
		   	g.setFont ( MyFont );
			g.setColor ( Color.blue );
			for ( int i = 0; i < board.length; i++ )
				for ( int j = 0; j < board[i].length; j++ )
					if ( show[j][i] == true )
						g.drawString ( "" + board[j][i], 100 * i + 30, 100 * j + 70 );
			if ( endofpair == true && board[ro][co] != board[roremember][coremember] )
            		{
				show[ro][co] = show[roremember][coremember] = false;
			}
			if ( Done() == true )
				g.drawString ( "YOU DID IT!", 40, 470 );
      		}
   	}

	public void DrawGrid ( Graphics g )
	{
		g.setColor ( Color.white );
		for ( int i = 0; i <= 4; i++ )
		{
			g.fillRect ( i * 100 - 3, 0, 6, 400 );
			g.fillRect ( 0, i * 100 - 3, 400, 6 );
		}
	}

	public boolean Done ( )
	{
		int count = 0;
		for ( int i = 0; i < show.length; i++ )
			for ( int j = 0; j < show[i].length; j++ )
				if ( show[i][j] == true )
					count++;
		if ( count == 16 )
			return true;
		return false;
	}

   	public void mouseClicked ( MouseEvent e )   {}

   	public void mousePressed ( MouseEvent e )
	{
		initialscreen = false;
		int xpos = e.getX();
		int ypos = e.getY();
		if ( xpos >= 0  && xpos <= 399 && ypos >= 0 && ypos <= 399 && show[ypos/100][xpos/100] == false )
        	{
			roremember = ro;
			coremember = co;
			ro = ypos / 100;
			co = xpos / 100;
			show[ro][co] = true;
			endofpair = !endofpair;
			canvas.repaint ( );
		}
	}

   	public void mouseReleased ( MouseEvent e )   {}

   	public void mouseEntered ( MouseEvent e )   {}

   	public void mouseExited ( MouseEvent e )     {}
}
