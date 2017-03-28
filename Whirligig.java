/*
	March  2017
	Whiligig.java
	This program provides examples of:

	1. BorderLayout
	2. GridLayout
	3. onlyFrame
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
	JFrame onlyFrame;

	public Whirligig()
	{
		RadioProbability panFL1;
		ScrollRisk panGL1;
		// Create a JFrame with BorderLayout
		onlyFrame = new JFrame("onlyLayout");	// Create the JFrame

		/////////////////////////////////////////////////
		// Set the layout to onlyFrame
		onlyFrame.setLayout(new GridLayout());
		//
		panFL1 = new RadioProbability(1, Color.RED);
		panGL1 = new ScrollRisk();



		// notice this has DISPOSE.  What is the effect of that?
		onlyFrame.setDefaultCloseOperation(onlyFrame.DISPOSE_ON_CLOSE);
		onlyFrame.setSize(450, 400);
		onlyFrame.setLocation(0, 0);

		onlyFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		onlyFrame.setSize(450, 400);
		onlyFrame.setLocation(0, 0);
		// Initialize panels

		/////////////////////////////////////////////////
		// setPreferredSize for all panels - 1st we will run the prog with out this.
		//
		panFL1.setPreferredSize(new Dimension(450,400));
		panFL1.setPreferredSize(new Dimension(450,400));


		onlyFrame.getContentPane().add(panFL1);
		onlyFrame.getContentPane().add(panGL1);


		// Make the JFrame visible
		onlyFrame.setVisible(true);
		onlyFrame.setVisible(true);
	}//end constructor

	public static void main(String[] args)
	{
		System.out.println("I will remember to log out.");
		Whirligig gig = new Whirligig();
		//gig.run();
	}

	//public void run()
	//{
		//makeonlyFrame();		// onlyFrame window
	//}


	//public void makeonlyFrame()
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

class ScrollRisk extends JPanel

{

	// public void makeGridLayout()
	// {
	// 	MyPanel panGL1, panGL2, panGL3, panGL4, panGL5, panGL6;
	// 	// Create a JFrame with BorderLayout
	// 	onlyFrame = new JFrame("GridLayout");	// Create the JFrame
	//
	// 	/////////////////////////////////////////////////
	// 	// Set the layout to GridLayout
	// 	onlyFrame.setLayout(new GridLayout(5,2));
	//
	// 	onlyFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	// 	onlyFrame.setSize(300, 300);
	// 	onlyFrame.setLocation(210, 120);
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
	// 	onlyFrame.getContentPane().add(panGL1);
	// 	onlyFrame.getContentPane().add(panGL2);
	// 	onlyFrame.getContentPane().add(panGL3);
	// 	onlyFrame.getContentPane().add(panGL4);
	// 	onlyFrame.getContentPane().add(panGL5);
	// 	onlyFrame.getContentPane().add(panGL6);

		// Make the JFrame visible
	//	onlyFrame.setVisible(true);
}
