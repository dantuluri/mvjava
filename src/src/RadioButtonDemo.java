// A little applet that demonstrates JRadionButton with a group
// of radio buttons that control the background color of a label.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RadioButtonDemo extends JPanel implements ActionListener {

  public static void main(String[] args)
  {
    System.out.println("I will remember to log out.");
    RadioButtonDemo rbd = new RadioButtonDemo();
    rbd.init();
  }
   JRadioButton redRadio, blueRadio, greenRadio, blackRadio;  // the buttons

   JLabel label;  // Will show the background color specified by
                  // the selected radio button.

   public void init() {

      getContentPane().setLayout( new GridLayout(5,1) );

      ButtonGroup colorGroup = new ButtonGroup();
         // A ButtonGroup is needed to synchronize the radio
         // buttons so that no more than one of them will
         // be selected at any given time.  Each button will be
         // added to this group.

      redRadio = new JRadioButton("Red");
      colorGroup.add(redRadio);
      redRadio.addActionListener(this);
      getContentPane().add(redRadio);

      blueRadio = new JRadioButton("Blue");
      colorGroup.add(blueRadio);
      blueRadio.addActionListener(this);
      getContentPane().add(blueRadio);

      greenRadio = new JRadioButton("Green");
      colorGroup.add(greenRadio);
      greenRadio.addActionListener(this);
      getContentPane().add(greenRadio);

      blackRadio = new JRadioButton("Black");
      colorGroup.add(blackRadio);
      blackRadio.addActionListener(this);
      getContentPane().add(blackRadio);

      redRadio.setSelected(true);  // Set an initial selection.

      label = new JLabel("Red is selected", JLabel.CENTER);
      label.setForeground(Color.white);
      label.setBackground(Color.red);
      label.setOpaque(true);
      getContentPane().add(label);

   } // end init()

   public void actionPerformed(ActionEvent evt) {
         // The applet serves as a listener for all the radio buttons,
         // so this method is called whenever the user clicks on one
         // of the buttons.
      if ( redRadio.isSelected() ) {
         label.setBackground(Color.red);
         label.setText("Red is selected");
      }
      else if ( blueRadio.isSelected() ) {
         label.setBackground(Color.blue);
         label.setText("Blue is selected");
      }
      else if ( greenRadio.isSelected() ) {
         label.setBackground(Color.green);
         label.setText("Green is selected");
      }
      else if ( blackRadio.isSelected() ) {
         label.setBackground(Color.black);
         label.setText("Black is selected");
      }
   } // end actionPerformed()

} // end class RadioButtonDemo
