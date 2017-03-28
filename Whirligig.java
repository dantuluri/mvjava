/*
	March  2017
	Whiligig.java
	This program provides examples of:

	1. BorderLayout
	2. GridLayout
	3. FlowLayout
	4. CardLayout
	5. Nested layouts
*/
import javax.swing.JFrame;	//import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.ButtonGroup;


//import java.awt.event.MouseEvent;

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
import javax.swing.JCheckBox;

public class Whirligig
{
	JFrame flowFrame;
	public Whirligig()
	{
		RadioProbability panFL1;
		ScrollRisk panFL2;
		// Create a JFrame with BorderLayout
		flowFrame = new JFrame("FlowLayout");	// Create the JFrame

		/////////////////////////////////////////////////
		// Set the layout to FlowLayout
		flowFrame.setLayout(new FlowLayout());
		//


		// notice this has DISPOSE.  What is the effect of that?
		flowFrame.setDefaultCloseOperation(flowFrame.DISPOSE_ON_CLOSE);
		flowFrame.setSize(1400, 1100);
		flowFrame.setLocation(0, 0);

		// Initialize panels
		panFL1 = new RadioProbability(1, Color.RED);
		panFL2 = new ScrollRisk(2, Color.BLUE);

		/////////////////////////////////////////////////
		// setPreferredSize for all panels - 1st we will run the prog with out this.
		//
		panFL1.setPreferredSize(new Dimension(450,400));
		panFL2.setPreferredSize(new Dimension(450,400));


		flowFrame.getContentPane().add(panFL1);
		flowFrame.getContentPane().add(panFL2);


		// Make the JFrame visible
		flowFrame.setVisible(true);
	}//end constructor

	public static void main(String[] args)
	{
		System.out.println("I will remember to log out.");
		Whirligig gig = new Whirligig();
		//gig.run();
	}

	//public void run()
	//{
		//makeFlowLayout();		// FlowLayout window
	//}


	//public void makeFlowLayout()
	//{

	//}
}
class RadioProbability extends JPanel implements ActionListener
{
	private String num;
	private Color color;
	private boolean pressed;	// used to tell is button pressed
	private JButton button;
	public RadioProbability(int numIn, Color colorIn) 		//numbers on the panel
	{
		JRadioButton radiobutton1 = new JRadioButton("1");
		radiobutton1.addActionListener(this);
		add(radiobutton1);
		JRadioButton radiobutton2 = new JRadioButton("2");
		radiobutton2.addActionListener(this);
		add(radiobutton2);
		JRadioButton radiobutton3 = new JRadioButton("3");
		radiobutton3.addActionListener(this);
		add(radiobutton3);
		JRadioButton radiobutton4 = new JRadioButton("4");
		radiobutton4.addActionListener(this);
		add(radiobutton4);

		ButtonGroup group = new ButtonGroup();
	 group.add(radiobutton1);
	 group.add(radiobutton2);
	 group.add(radiobutton3);
	 group.add(radiobutton4);
	}
<<<<<<< HEAD

	public void makeFlowLayout()
	{
		RadioProbability panFL1;
		//
		// // Create a JFrame with BorderLayout
		// flowFrame = new JFrame("FlowLayout");	// Create the JFrame
		//
		// /////////////////////////////////////////////////
		// // Set the layout to FlowLayout
		// flowFrame.setLayout(new FlowLayout());
		// //
		//
		//
		// // notice this has DISPOSE.  What is the effect of that?
		// flowFrame.setDefaultCloseOperation(flowFrame.DISPOSE_ON_CLOSE);
		// flowFrame.setSize(300, 300);
		// flowFrame.setLocation(310, 220);
		//
		// // Initialize panels
		//
		// panFL6 = new MyPanel(6, Color.YELLOW);
		//
		// /////////////////////////////////////////////////
		// // setPreferredSize for all panels - 1st we will run the prog with out this.
		// //
		// panFL1.setPreferredSize(new Dimension(40,100));
		// panFL2.setPreferredSize(new Dimension(50,200));
		// panFL3.setPreferredSize(new Dimension(60,300));
		// panFL4.setPreferredSize(new Dimension(70,100));
		// panFL5.setPreferredSize(new Dimension(40,300));
		// panFL6.setPreferredSize(new Dimension(40,300));
		//
		// flowFrame.getContentPane().add(panFL1);
		// flowFrame.getContentPane().add(panFL2);
		// flowFrame.getContentPane().add(panFL3);
		// flowFrame.getContentPane().add(panFL4);
		// flowFrame.getContentPane().add(panFL5);
		// flowFrame.getContentPane().add(panFL6);
		//
		// // Make the JFrame visible
		// flowFrame.setVisible(true);
	}






=======
>>>>>>> parent of 44844ef... done
	public void paintComponent(Graphics g)
	{
		//super.paintComponent(g);
		//g.setFont(new Font("Arial", Font.BOLD, 18));
		//g.setColor(Color.RED);
		//g.drawString(num, 10, 20);
	}
	public void actionPerformed(ActionEvent evt)
	{
		String command=button.getText();
		if(command.equals("Press my belly."))
		{
			pressed=true;
			button.setText("reset");
		}
		else
		{
			button.setText("Press my belly.");
		}
		repaint();
	}
}	// end class MyPanel

class ScrollRisk extends JPanel implements ActionListener
{
	private String num;
	private Color color;
	private boolean pressed;	// used to tell is button pressed
	private JButton button;
	public ScrollRisk(int numIn, Color colorIn) 		//numbers on the panel
	{
		JRadioButton radiobutton = new JRadioButton("1");
		radiobutton.addActionListener(this);
		add(radiobutton);
		JRadioButton radiobutton2 = new JRadioButton("2");
		radiobutton2.addActionListener(this);
		add(radiobutton2);
		JRadioButton radiobutton3 = new JRadioButton("3");
		radiobutton3.addActionListener(this);
		add(radiobutton3);
		JRadioButton radiobutton4 = new JRadioButton("4");
		radiobutton4.addActionListener(this);
		add(radiobutton4);
		if(radiobutton.isSelected())
		{
			System.out.println("it works woot");
		}
	}
<<<<<<< HEAD
	// public void makeGridLayout()
	// {
	// 	// Create a JFrame with BorderLayout
	// 	gridFrame = new JFrame("GridLayout");	// Create the JFrame
	//
	// 	/////////////////////////////////////////////////
	// 	// Set the layout to GridLayout
	// 	gridFrame.setLayout(new GridLayout(5,2));
	//
	// 	gridFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	// 	gridFrame.setSize(300, 300);
	// 	gridFrame.setLocation(210, 120);
	//
	// 	// Create panels
	// 	panGL1 = new MyPanel(1, Color.RED);
	// 	panGL2 = new MyPanel(2, Color.BLUE);
	// 	panGL3 = new MyPanel(3, Color.GREEN);
	// 	panGL4 = new MyPanel(4, Color.ORANGE);
	// 	panGL5 = new MyPanel(5, Color.MAGENTA);
	// 	panGL6 = new MyPanel(6, Color.YELLOW);
	//
	// 	// Add panels to the frame
	// 	gridFrame.getContentPane().add(panGL1);
	// 	gridFrame.getContentPane().add(panGL2);
	// 	gridFrame.getContentPane().add(panGL3);
	// 	gridFrame.getContentPane().add(panGL4);
	// 	gridFrame.getContentPane().add(panGL5);
	// 	gridFrame.getContentPane().add(panGL6);
	//
	// 	// Make the JFrame visible
	// 	gridFrame.setVisible(true);
	// }
=======
	public void paintComponent(Graphics g)
	{
		//super.paintComponent(g);
		//g.setFont(new Font("Arial", Font.BOLD, 18));
		//g.setColor(Color.RED);
		//g.drawString(num, 10, 20);
	}
	public void actionPerformed(ActionEvent evt)
	{


	}
>>>>>>> parent of 44844ef... done
}
