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
public class LayoutEx3 extends JFrame
{
LayoutEx3(); // a frame that is 600 by 600 pixels, PanelA added to the frame & visible
public static void main(String[] args)
{
LayoutEx3 le3 = new LayoutEx3();
}
class PanelA extends JPanel
{
public PanelA()
{
setLayout(new BorderLayout(5,5));
PanelB x = new PanelB();
PanelC y = new PanelC();
JPanel z = new JPanel();
//default size of a generic panel is about 10 x 10 pixels
PanelC a = new PanelC();
add(x, BorderLayout.SOUTH);
add(y, BorderLayout.NORTH);
add(z, BorderLayout.WEST);
add(a, BorderLayout.CENTER);
}
public void paintComponent(Graphics g)
{
setBackground(Color.BLACK);
super.paintComponent(g);
}
}
class PanelB extends JPanel
{
public PanelB()
{
setLayout( new GridLayout(1,2,5,5));
add(new JButton("items"));
add(new JTextArea("information", 25, 5));
}
public void paintComponent(Graphics g)
{
setBackground(Color.BLUE);
super.paintComponent(g);
}
}
class PanelC extends JPanel
{
public PanelC()
{
add (new JCheckBox("select"));
add (new JScrollBar(JScrollBar.VERTICAL, 50, 10, 0, 100));
add (new JRadioButton("choose"));
}
public void paintComponent(Graphics g)
{
setBackground(Color.RED);
super.paintComponent(g);
}
}
}
