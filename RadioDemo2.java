// File: RadioDemo2.java - Demo radio buttons using convenience class.
// Author: Fred Swartz, 2009-01-02, Placed in public domain.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

///////////////////////////////////////////////////////////////// RadioDemo2
class RadioDemo2 extends JFrame {

    //========================================================== constructor
    RadioDemo2() {
        //... Create the buttons.
        JRadioButton yesButton   = new JRadioButton("Yes", true);
        JRadioButton noButton    = new JRadioButton("No");
        JRadioButton maybeButton = new JRadioButton("Maybe");

        //... Use convenience class to group and layout buttons.
        EZRadioButtonPanel radioPanel = new EZRadioButtonPanel("Married?"
                                          , yesButton, noButton, maybeButton);

        //... Set window attributes.
        setContentPane(radioPanel);  // Button panel is only content.
        pack();                      // Layout window.
    }

    //================================================================= main
    public static void main(String[] args) {
        JFrame window = new RadioDemo2();
        window.setTitle("RadioDemo2");  // But window is too small to show it!
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);  // Center window.
        window.setVisible(true);
    }
}
