// JC
// 2017
// Pillsbury.java  
// A panel in which a button is used to make the panel giggle.
// Pillsbury Dough Boy. poke his belly and he giggled.  
// User interacts with a button labeled "press my tummy."  Upon pressing, "tee hee" is drawn
// and the button gets relabeled "reset."  Upon pressing, screen refreshes, 
// meaning the text goes away.

// 1.  create an ActionListener class
// 2.  create a button to print a string when pressed.
// 3.  print string when button is pressed

import java.awt.Color;	
import java.awt.Graphics;
import java.awt.Font;

import javax.swing.JFrame;	
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
///////////////////////////////////
// 1.  import libraries for JButton


public class Pillsbury2
{	
	public static void main( String[] args )
	{
		Pillsbury2 pills2 = new Pillsbury2();
		pills2.runIt();
	}
	
	public Pillsbury2()
	{
	}
	
	public void runIt()
	{
		JFrame frame = new JFrame("Pillsbury Dough boy");
		frame.setSize( 400, 300);				
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		frame.setLocation(400,50);
		frame.setResizable(true);
		PillsburyPanel2 pillsPanel = new PillsburyPanel(); 		
		frame.getContentPane().add( pillsPanel );	
		frame.setVisible(true);		
	}
}

////////////////////////////// class with ActionListener  /////////////////
// 1.  
		class PillsburyPanel2 extends JPanel implements ActionListener
		{
			private boolean pressed;	// used to tell is button pressed
			private JButton button;
	
		////////////// write constructor
			public PillsburyPanel2()
			{
				pressed=false;
				button=new JButton("Press my belly.");
				button.addActionListener(this);
				add(button);
			
			}
		//////
		// 2.  instantiate the button.  add everything needed.

	
	public void paintComponent(Graphics g)	// paint component
	{
		super.paintComponent (g);	// draw background		
		Font font = new Font ("Serif", Font.BOLD, 30);
		g.setFont( font );	
		
		if(pressed)
		{
			g.drawString("tee hee",10,100);
			pressed=false;
		}
		
	}
			
		public void actionPerformed(ActionEvent evt)
		{
			String command=button.getText();
			if(command.equals("Press my belly"))
			{
				pressed=true;
				button.setText("reset");
			} 
			
			else
			{
				button.setText("Press my belly");
			}
			repaint();

		}
		
		class buttonHandler implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				String command=evt.getActionCommand();
				button1.setText("reset");
				
				Button1Handler b1Handler = new Button Handler();
				button1.addActionListener(b1hander)
			}
		}



}
