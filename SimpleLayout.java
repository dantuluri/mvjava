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
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
public class SimpleLayout
{
	JFrame borderFrame, gridFrame, flowFrame, cardFrame;

	public static void main(String[] args)
	{
		SimpleLayout sl = new SimpleLayout();
		sl.run();
	}

	public void run()
	{
		// FlowLayout window
		makeCardLayout();		// CardLayout window
	}



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
// end class MyPanel


}
