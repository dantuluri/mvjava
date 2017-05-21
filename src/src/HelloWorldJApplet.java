// An applet that says "Hello World" in a big bold font,
// with three buttons to change the color of the message.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HelloWorldJApplet extends JApplet implements ActionListener
{

   Display display;

   public void init()
   {
       display = new Display();

       getContentPane().add(display, BorderLayout.CENTER);

       JPanel buttonBar = new JPanel();
       buttonBar.setBackground(Color.gray);

       JButton redButton = new JButton("Red");
       redButton.addActionListener(this);
       buttonBar.add(redButton);

       JButton greenButton = new JButton("Green");
       greenButton.addActionListener(this);
       buttonBar.add(greenButton);

       JButton blueButton = new JButton("Blue");
       blueButton.addActionListener(this);
       buttonBar.add(blueButton);

       getContentPane().add(buttonBar, BorderLayout.NORTH);
   }

   class Display extends JPanel
   {

      int colorNum;

      Font textFont;

      Display()
      {
         setBackground(Color.black);
         colorNum = 1;
         textFont = new Font("Serif",Font.BOLD,36);
      }

      void setColor(int code)
      {
         colorNum = code;
         repaint();
      }

      public void paintComponent(Graphics g)
      {
         super.paintComponent(g);
         switch (colorNum)
         {
            case 1:
               g.setColor(Color.red);
               break;
            case 2:
               g.setColor(Color.green);
               break;
            case 3:
               g.setColor(Color.blue);
               break;
         }
         g.setFont(textFont);
         g.drawString("Hello World!", 25,50);
      }
   }

   public void actionPerformed(ActionEvent evt)
   {
      String command = evt.getActionCommand();

      if (command.equals("Red"))
         display.setColor(1);
      else if (command.equals("Green"))
         display.setColor(2);
      else if (command.equals("Blue"))
         display.setColor(3);
   }
}
