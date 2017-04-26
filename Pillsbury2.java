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
        PillsburyPanel2 pillsPanel2 = new PillsburyPanel2();
        frame.getContentPane().add( pillsPanel2 );
        frame.setVisible(true);
    }
}

////////////////////////////// class with ActionListener  /////////////////
// 1.
class PillsburyPanel2 extends JPanel
{
    private boolean pressed;	// used to tell is button pressed
    private JButton button;
    ////////////// write constructor
    public static void main( String[] args )
    {
        PillsburyPanel2 pillspanel2 = new PillsburyPanel2();
    }
    public PillsburyPanel2()
    {
        pressed=false;
        button=new JButton("Press my belly");
        ButtonHandler buttonhandle = new ButtonHandler();
        button.addActionListener(buttonhandle);
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
    class ButtonHandler implements ActionListener
    {

        public ButtonHandler()
        {

        }

        public void actionPerformed(ActionEvent evt)
        {
            String command1=evt.getActionCommand();

            if(command1.equals("Press my belly"))
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
    }


}
