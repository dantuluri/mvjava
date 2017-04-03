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
import javax.swing.JFrame;	//import javax.swing.*;
import javax.swing.JPanel;

import java.awt.event.MouseListener;	// or import java.awt.event.*;
import java.awt.event.MouseEvent;

import java.awt.Color;		//import java.awt.*;
import java.awt.Graphics;
import java.awt.Font;
import java.awt.Dimension;
///////////////////////// import Classes needed for Layouts ////////////////////////
// import java.awt.BorderLayout;
// import java.awt.GridLayout;
// import java.awt.CardLayout;
// import java.awt.FlowLayout;


class BorderLayout extends JFrame
{
	JFrame borderFrame;
	public void makeBorderLayout()
	{
		MyPanel panBL1, panBL2, panBL3, panBL4, panBL5;
		MyColorPanel colorPanel;
		// Create a JFrame with BorderLayout
		borderFrame = new JFrame("BorderLayout");	// Create the JFrame

		/////////////////////////////////////////////////
		// Set the layout to BorderLayout (default for JFrame)
		//
		borderFrame.setLayout(new BorderLayout());

		borderFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		borderFrame.setSize(300, 300);
		borderFrame.setLocation(10, 10);

		// Create panels
		panBL1 = new MyPanel(1, Color.RED);  panBL1.setPreferredSize(new Dimension(50, 30));
		panBL2 = new MyPanel(2, Color.BLUE);  panBL2.setPreferredSize(new Dimension(50, 20));
		panBL3 = new MyPanel(3, Color.GREEN);  panBL3.setPreferredSize(new Dimension(50, 30));
		panBL4 = new MyPanel(4, Color.ORANGE);  panBL4.setPreferredSize(new Dimension(50, 20));
		panBL5 = new MyPanel(5, Color.MAGENTA);  panBL5.setPreferredSize(new Dimension(50, 20));

		/////////////////////////////////////////////////
		// Initialize colorPanel (part 5)
		//
		colorPanel=new MyColorPanel();


		/////////////////////////////////////////////////
		// Add panels to the frame
		//
		borderFrame.getContentPane().add(panBL1,BorderLayout.NORTH);
		borderFrame.getContentPane().add(panBL2,BorderLayout.CENTER);
		borderFrame.getContentPane().add(colorPanel,BorderLayout.CENTER);
		borderFrame.getContentPane().add(panBL3,BorderLayout.SOUTH);
		borderFrame.getContentPane().add(panBL4,BorderLayout.EAST);
		borderFrame.getContentPane().add(panBL3,BorderLayout.WEST);

		// Make the JFrame visible
		borderFrame.setVisible(true);
	}
}

class GridLayout extends JFrame
{
	JFrame gridFrame;
	public void makeGridLayout()
	{
		MyPanel panGL1, panGL2, panGL3, panGL4, panGL5, panGL6;
		// Create a JFrame with BorderLayout
		gridFrame = new JFrame("GridLayout");	// Create the JFrame

		/////////////////////////////////////////////////
		// Set the layout to GridLayout
		gridFrame.setLayout(new GridLayout(3,2));

		gridFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gridFrame.setSize(300, 300);
		gridFrame.setLocation(210, 120);

		// Create panels
		panGL1 = new MyPanel(1, Color.RED);
		panGL2 = new MyPanel(2, Color.BLUE);
		panGL3 = new MyPanel(3, Color.GREEN);
		panGL4 = new MyPanel(4, Color.ORANGE);
		panGL5 = new MyPanel(5, Color.MAGENTA);
		panGL6 = new MyPanel(6, Color.YELLOW);

		// Add panels to the frame
		gridFrame.getContentPane().add(panGL1);
		gridFrame.getContentPane().add(panGL2);
		gridFrame.getContentPane().add(panGL3);
		gridFrame.getContentPane().add(panGL4);
		gridFrame.getContentPane().add(panGL5);
		gridFrame.getContentPane().add(panGL6);

		// Make the JFrame visible
		gridFrame.setVisible(true);
	}
}
class FlowLayout extends JFrame
{
	JFrame flowFrame;
	public void makeFlowLayout()
	{
		MyPanel panFL1, panFL2, panFL3, panFL4, panFL5, panFL6;
		// Create a JFrame with BorderLayout
		flowFrame = new JFrame("FlowLayout");	// Create the JFrame

		/////////////////////////////////////////////////
		// Set the layout to FlowLayout
		flowFrame.setLayout(new FlowLayout());
		//


		// notice this has DISPOSE.  What is the effect of that?
		flowFrame.setDefaultCloseOperation(flowFrame.DISPOSE_ON_CLOSE);
		flowFrame.setSize(300, 300);
		flowFrame.setLocation(310, 220);

		// Initialize panels
		panFL1 = new MyPanel(1, Color.RED);
		panFL2 = new MyPanel(2, Color.BLUE);
		panFL3 = new MyPanel(3, Color.GREEN);
		panFL4 = new MyPanel(4, Color.ORANGE);
		panFL5 = new MyPanel(5, Color.MAGENTA);
		panFL6 = new MyPanel(6, Color.YELLOW);

		/////////////////////////////////////////////////
		// setPreferredSize for all panels - 1st we will run the prog with out this.
		//
		panFL1.setPreferredSize(new Dimension(40,100));
		panFL2.setPreferredSize(new Dimension(50,200));
		panFL3.setPreferredSize(new Dimension(60,300));
		panFL4.setPreferredSize(new Dimension(70,100));
		panFL5.setPreferredSize(new Dimension(40,300));
		panFL6.setPreferredSize(new Dimension(40,300));

		flowFrame.getContentPane().add(panFL1);
		flowFrame.getContentPane().add(panFL2);
		flowFrame.getContentPane().add(panFL3);
		flowFrame.getContentPane().add(panFL4);
		flowFrame.getContentPane().add(panFL5);
		flowFrame.getContentPane().add(panFL6);

		// Make the JFrame visible
		flowFrame.setVisible(true);
	}
}

	class CardLayout extends JFrame
	{
		JFrame cardFrame;
	public void makeCardLayout()
	{
		MyColorPanel colorPanel;
		// Create a JFrame with BorderLayout

		cardFrame = new JFrame("CardLayout");	// Create the JFrame
		cardFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cardFrame.setSize(300, 300);
		cardFrame.setLocation(410, 320);

		// Create panels
		colorPanel = new MyColorPanel();

		// Add panels to the frame
		cardFrame.getContentPane().add(colorPanel);

		// Make the JFrame visible
		cardFrame.setVisible(true);
	}
}	// end SimpleLayout

// a simple panel with number and background color.
class MyPanel extends JPanel
{
	private String num;
	private Color color;
	public MyPanel(int numIn, Color colorIn)
	{
		num = "" + numIn;
		setBackground(colorIn);
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setFont(new Font("Arial", Font.BOLD, 18));
		g.setColor(Color.WHITE);
		g.drawString(num, 10, 20);
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

		color1.addMouseListener(this);
		color2.addMouseListener(this);
		color3.addMouseListener(this);
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
		cards.next(this);
		//

	}
	public void mouseEntered(MouseEvent evt) { }
	public void mouseExited(MouseEvent evt) { }
	public void mouseClicked(MouseEvent evt) { }
	public void mouseReleased(MouseEvent evt) { }
}
