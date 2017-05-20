import java.awt.event.FocusEvent;
import java.awt.event.FocusListenesr;

import javax.swing.JTextField;

public class CustomFocusListener implements FocusListener {
    JTextField txt;
    String textWhenFocusGained;
    String textWhenFocusLost;

      }

    @Override
    public void focusGained(FocusEvent arg0) {
        txt.setText(textWhenFocusGained);
    }

    @Override
    public void focusLost(FocusEvent arg0) {
        txt.setText(textWhenFocusLost);
    }


}
