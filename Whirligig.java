/*
	March  2017
	SimpleLayout.java
	This program provides examples of:

	1. BorderLayout
	2. GridLayout
	3. FlowLayout
	4. CardLayout
	5. Nested layouts
*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;	//import javax.swing.*;
import javax.swing.JPanel;

import java.awt.event.MouseListener;	// or import java.awt.event.*;
import java.awt.event.MouseEvent;

import java.awt.Color;		//import java.awt.*;
import java.awt.Graphics;
import java.awt.Font;
import java.awt.Dimension;
///////////////////////// import Classes needed for Layouts ////////////////////////
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JRadioButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Whirligig
{
	JFrame flowFrame;

	public static void main(String[] args)
	{
		Whirligig gig = new Whirligig();
		gig.run();
	}

	public void run()
	{
		makeFlowLayout();		// FlowLayout window
	}


	public void makeFlowLayout()
	{
		MyPanel panFL1, panFL2;
		// Create a JFrame with BorderLayout
		flowFrame = new JFrame("FlowLayout");	// Create the JFrame

		/////////////////////////////////////////////////
		// Set the layout to FlowLayout
		flowFrame.setLayout(new FlowLayout());
		//


		// notice this has DISPOSE.  What is the effect of that?
		flowFrame.setDefaultCloseOperation(flowFrame.DISPOSE_ON_CLOSE);
		flowFrame.setSize(140, 110);
		flowFrame.setLocation(0, 0);

		// Initialize panels
		panFL1 = new MyPanel(1, Color.RED);
		panFL2 = new MyPanel(2, Color.BLUE);

		/////////////////////////////////////////////////
		// setPreferredSize for all panels - 1st we will run the prog with out this.
		//
		panFL1.setPreferredSize(new Dimension(450,400));
		panFL2.setPreferredSize(new Dimension(450,400));


		flowFrame.getContentPane().add(panFL1);
		flowFrame.getContentPane().add(panFL2);


		// Make the JFrame visible
		flowFrame.setVisible(true);
	}


// a simple panel with number and background color.
class MyPanel extends JPanel implements ActionListener
{
	private String num;
	private Color color;
	private boolean pressed;	// used to tell is button pressed
			private JButton button;
	public MyPanel(int numIn, Color colorIn) 		//numbers on the panel
	{
		JRadioButton radiobutton = new JRadioButton("hello");
			radiobutton.addActionListener(this);
				add(radiobutton);
				JRadioButton radiobutton2 = new JRadioButton("adios");
			radiobutton.addActionListener(this);
				add(radiobutton2);
				JRadioButton radiobutton3 = new JRadioButton("hsdfsfello");
			radiobutton.addActionListener(this);
				add(radiobutton3);
				JRadioButton radiobutton4 = new JRadioButton("hetghhfghllo");
			radiobutton.addActionListener(this);
				add(radiobutton4);
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setFont(new Font("Arial", Font.BOLD, 18));
		g.setColor(Color.RED);
		g.drawString(num, 10, 20);
	}

	public void actionPerformed(ActionEvent evt)
		{


	}
}	// end class MyPanel

class MyColorPanel extends JPanel implements MouseListener
{
	//////////////////////////////////////////////////////////
	// Declare CardLayout and JPanel objects
	//
	private CardLayout cards;
	private JPanel color1, color2, color3;

	public MyColorPanel() 			// constructor
	{	////////////////////////////////////////////////////////
		// Initialize CardLayout and setLayout() to this panel
		//
		cards = new CardLayout();
		setLayout(cards);

		// Create blue, green and red JPanels and set their backgrounds
		color1 = new MyPanel(1, Color.BLUE);
		color2 = new MyPanel(2, Color.GREEN);
		color3 = new MyPanel(3, Color.RED);

		////////////////////////////////////////////////////////
		// Add the MouseListener to *each* JPanel and add

		//color1.addMouseListener(this);
		//color2.addMouseListener(this);
		//color3.addMouseListener(this);
		// each JPanel to MyColorPanel (this)
		add(color1,"Panel 1");
		add(color2,"Panel 2");
		add(color3,"Panel 3");
		int counter = 0;
		//
	}
	public void mousePressed(MouseEvent evt)
	{
		////////////////////////////////////////////////////////
		// Select the next panel on the stack of panels
		//cards.next(this);
		//

	}
	public void mouseEntered(MouseEvent evt) { }
	public void mouseExited(MouseEvent evt) { }
	public void mouseClicked(MouseEvent evt) { }
	public void mouseReleased(MouseEvent evt) { }
}

public class ArcControl extends JApplet implements AdjustmentListener
{
	private DisplayPanel canvas;
	private JScrollBar width;
	private JScrollBar height;
	private JScrollBar startDeg;
	private JScrollBar endDeg;
	int widthof, heightof, startDegof, endDegof;


	public ArcControl ( )
	{
		widthof = heightof = startDegof = endDegof = 60;
	}

	public void init()
	{
		canvas = new DisplayPanel();
		getContentPane().add ( canvas, BorderLayout.CENTER );

		width = new JScrollBar(JScrollBar.HORIZONTAL, 60, 5, 0, 400);
		width.addAdjustmentListener(this);
		getContentPane().add ( width, BorderLayout.NORTH );

		height = new JScrollBar(JScrollBar.VERTICAL, 60, 5, 0, 400);
		height.addAdjustmentListener(this);
		getContentPane().add ( height, BorderLayout.EAST );

		startDeg = new JScrollBar(JScrollBar.VERTICAL, 60, 5, 0, 360);
		startDeg.addAdjustmentListener(this);
		getContentPane().add ( startDeg, BorderLayout.WEST );

		endDeg = new JScrollBar(JScrollBar.HORIZONTAL, 60, 5, 0, 370);
		endDeg.addAdjustmentListener(this);
		getContentPane().add ( endDeg, BorderLayout.SOUTH );
	}

	class DisplayPanel extends JPanel
	{

		public DisplayPanel ( )
		{
			setBackground ( Color.black );
		}

		public void paintComponent(Graphics g )
		{
			super.paintComponent ( g );
			g.setColor(Color.blue);
			g.fillArc(30, 30, widthof, heightof, startDegof, endDegof);
		}
	}

	public void adjustmentValueChanged( AdjustmentEvent e)
	{
        	widthof = width.getValue();
		heightof = height.getValue();
		startDegof = startDeg.getValue();
		endDegof = endDeg.getValue();
		canvas.repaint();
	}
}






}
