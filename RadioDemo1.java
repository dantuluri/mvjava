// File: RadioDemo1.java - Demo radio button creation, grouping, layout.
// Version: 2002-02-25 (Sicilia), minor updates 2009-01-01
// Author: Fred Swartz, Placed in public domain.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

///////////////////////////////////////////////////////////////// RadioDemo1
class RadioDemo1 extends JFrame {
    //========================================================== constructor
    RadioDemo1() {
        //... Create the buttons.
        JRadioButton yesButton   = new JRadioButton("Yes", true);
        JRadioButton noButton    = new JRadioButton("No");
        JRadioButton maybeButton = new JRadioButton("Maybe");

        //... Create a button group and add the buttons.
        ButtonGroup bgroup = new ButtonGroup();
        bgroup.add(yesButton);
        bgroup.add(noButton);
        bgroup.add(maybeButton);

        //... Arrange buttons vertically in a panel
        JPanel radioPanel = new JPanel();
        radioPanel.setLayout(new GridLayout(3, 1));
        radioPanel.add(yesButton);
        radioPanel.add(noButton);
        radioPanel.add(maybeButton);

        //... Add a titled border to the button panel.
        radioPanel.setBorder(BorderFactory.createTitledBorder(
                   BorderFactory.createEtchedBorder(), "Married?"));

        //... Set window attributes.
        setContentPane(radioPanel);  // Button panel is only content.
        pack();                      // Layout window.
    }

    //================================================================= main
    public static void main(String[] args) {
        JFrame window = new RadioDemo1();
        window.setTitle("RadioDemo1");  // But window is too small to show it!
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);  // Center window.
        window.setVisible(true);
    }
}
