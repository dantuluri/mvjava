import java.awt.event.FocusEvent;
import java.awt.event.FocusListenesr;

import javax.swing.JTextField;

public class CustomFocusListener implements FocusListener {
    JTextField txt;
    String textWhenFocusGained;
    String textWhenFocusLost;

    public CustomFocusListener(JTextField txt, String textWhenFocusGained,
            String textWhenFocusLost) {
        this.txt = txt;
        this.textWhenFocusGained = textWhenFocusGained;
        this.textWhenFocusLost = textWhenFocusLost;
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
