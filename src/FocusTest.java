import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Main {

  public static void main(String[] a) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JTextField textField = new JTextField("A TextField");
    textField.addFocusListener(new FocusListener() {
      public void focusGained(FocusEvent e) {
        displayMessage("Focus gained", e);
      }

      public void focusLost(FocusEvent e) {
        displayMessage("Focus lost", e);
      }

      void displayMessage(String prefix, FocusEvent e) {
        System.out.println(prefix
            + (e.isTemporary() ? " (temporary):" : ":")
            + e.getComponent().getClass().getName()
            + "; Opposite component: "
            + (e.getOppositeComponent() != null ? e.getOppositeComponent().getClass().getName()
                : "null"));
      }

    });

    frame.add(textField,"North");
    frame.add(new JTextField(),"South");
    frame.setSize(300, 200);
    frame.setVisible(true);
  }

}
