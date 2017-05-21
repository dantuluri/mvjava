// File : EZRadioButtonPanel.java - Convenience class for radio buttons.
// Version: 2009-01-02
// Author : Fred Swartz, Placed in public domain.
// Enhancements: Could add more general borders and layouts, but I chose the
//               simplest thing that works for me.  Modify it as you wish.

import java.awt.*;
import javax.swing.*;

/** A conventience class to avoid the work of putting buttons in a
 * group and laying them out in a panel with a titled border.
 * @author Fred Swartz, placed in the public domain.
 */
public class EZRadioButtonPanel extends JPanel {
    //==================================================================== types
    private enum Orientation {_VERTICAL, _HORIZONTAL}

    //================================================================ constants
    public static final Orientation VERTICAL   = Orientation._VERTICAL;
    public static final Orientation HORIZONTAL = Orientation._HORIZONTAL;

    //=================================================================== fields
    //... The button group is saved only for clearSelection and reference it.
    private ButtonGroup _buttonGroup = new ButtonGroup();

    //============================================================== constructor
    /** This most common constructor creates a vertical layout of
     *  the radio buttons with an etched titled border (if title is non-null).
     * @param title   Text to use in the titled border.  No border if this is null.
     * @param buttons The radio buttons.
     */
    public EZRadioButtonPanel(String title, JRadioButton... buttons) {
        this(VERTICAL, title, buttons);
    }

    //============================================================== constructor
    /** This more general constructor allows specification of the orientation,
     * either horizontal or vertical.
     * @param orientation EZRadioButtonPanel.Orientation.VERTICAL or
     *                    EZRadioButtonPanel.Orientation.HORIZONTAL
     *                    (I could have used a "magic value", like
     *                     a true/false, 0/1, ... but the extra typing
     *                     may be worth it because the meaning will be clear.)
     *
     * @param title   Text to use in the titled border.  No border if this is null.
     * @param buttons The radio buttons.
     */
    public EZRadioButtonPanel(Orientation orientation, String title, JRadioButton... buttons) {
        //... Create a button group.

        //... Selet layout.
        if (orientation == VERTICAL) {
            this.setLayout(new GridLayout(buttons.length, 1));
        } else {
            this.setLayout(new FlowLayout(FlowLayout.LEADING));
        }

        //... Add buttons to the button group and the layout.
        for (JRadioButton button : buttons) {
            _buttonGroup.add(button);
            this.add(button);
        }

        //... Add a border if required.
        if (title != null) {
            this.setBorder(BorderFactory.createTitledBorder(
                   BorderFactory.createEtchedBorder(), title));
        }
    }

    //=========================================================== clearSelection
    /** Makes all radio buttons in the group unselected. */
    public void clearSelection() {
        _buttonGroup.clearSelection();
    }
}

class MyPanel extends JPanel
{
	private String num;
	private Color color;
	public MyPanel(int numIn, Color colorIn)
	{
		num = "" + numIn;
		setBackground(colorIn);
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setFont(new Font("Arial", Font.BOLD, 18));
		g.setColor(Color.WHITE);
		g.drawString(num, 10, 20);
	}
}	// end clasz
