//  Labels.java
//  Simple example of a FlowLayout with Labels

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Labels extends JApplet
{
	public Labels ( )
	{
		getContentPane().setBackground( Color.gray );
		getContentPane().setLayout( new FlowLayout(FlowLayout.RIGHT, 320, 40) );

		JLabel message1 = new JLabel("",JLabel.CENTER);
		message1.setText("Hello World!");
		message1.setForeground(Color.red);
		message1.setBackground(Color.cyan);
		message1.setFont(new Font("Serif",Font.BOLD,18));
		message1.setOpaque(false);
       		getContentPane().add ( message1 );

		JLabel message2 = new JLabel("",JLabel.LEFT);
		message2.setText("Java is cool!");
		message2.setForeground(Color.blue);
		message2.setBackground(Color.black);
		message2.setFont(new Font("SansSerif",Font.ITALIC,30));
		message2.setOpaque(true);
       		getContentPane().add ( message2 );

		JLabel message3 = new JLabel("",JLabel.RIGHT);
		message3.setText(" What a nice day! ");
		message3.setForeground(Color.green);
		message3.setBackground(Color.white);
		message3.setFont(new Font("Monospaced",Font.PLAIN,24));
		message3.setOpaque(true);
       		getContentPane().add ( message3 );
	}


}
