// File: Whirligig2.java - Demo radio button creation, grouping, layout.
// Version: 2002-02-25 (Sicilia), minor updates 2009-01-01
// Author: Fred Swartz, Placed in public domain.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

///////////////////////////////////////////////////////////////// Whirligig2
class Whirligig2 extends JFrame {
    //========================================================== constructor
    Whirligig2() {
        //... Create the buttons.
        JRadioButton onep   = new JRadioButton("1");
        JRadioButton twop    = new JRadioButton("2");
        JRadioButton threep = new JRadioButton("3");
        JRadioButton fourp = new JRadioButton("4");


        //... Create a button group and add the buttons.
        ButtonGroup bgroup = new ButtonGroup();
        bgroup.add(onep);
        bgroup.add(twop);
        bgroup.add(threep);
        bgroup.add(fourp);


        //... Arrange buttons vertically in a panel
        JPanel radioPanel = new JPanel();
        radioPanel.setLayout(new GridLayout(4, 1));
        radioPanel.add(onep);
        radioPanel.add(twop);
        radioPanel.add(threep);
        radioPanel.add(fourp);


        //... Add a titled border to the button panel.

                radioPanel.setBorder(BorderFactory.createTitledBorder(
                                   BorderFactory.createEtchedBorder(), "How many people did you share your food with today?"));
        //
        // //... Set window attributes.
         setContentPane(radioPanel);  // Button panel is only content.
         pack();                      // Layout window.
    }

    //================================================================= main
    public static void main(String[] args) {
        JFrame window = new Whirligig2();
        window.setTitle("Whirligig2");  // But window is too small to show it!
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }


}

class RadioPanel extends JPanel implements ActionListener
{
  private boolean pressed;	// used to tell is button pressed
  private JButton button;

////////////// write constructor
  public PillsburyPanel()
  {
    pressed=false;
    button=new JButton("Enter");
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
  g.drawString("tee hee",10,100);//call CardLayout
  pressed=false;
}

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
