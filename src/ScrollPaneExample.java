
import javax.swing.*;
import java.awt.Dimension;

public class ScrollRisk{

    public JPanel createContentPane (){

        // As usual, we create our bottom-level panel.
        JPanel totalGUI = new JPanel();

        // This is the story we took from Wikipedia.
        String story = ("1. Make sure your food is away from others, so that your friends don't feel the urge to take your food. 2.Make sure your food is covered with protective layers such as aluminum foil so that it won't be vulnerable to others sptting on your food.");

        // We create the TextArea and pass the story in as an argument.
        // We also set it to be non-editable, and the line and word wraps set to true.
        JTextArea storyArea = new JTextArea(story);
        storyArea.setEditable(false);
        storyArea.setLineWrap(true);
        storyArea.setWrapStyleWord(true);

        // We create the ScrollPane and instantiate it with the TextArea as an argument
        // along with two constants that define the behaviour of the scrollbars.
        JScrollPane area = new JScrollPane(storyArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                                           JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        // We then set the preferred size of the scrollpane.
        area.setPreferredSize(new Dimension(300, 200));

        // and add it to the GUI.
        totalGUI.add(area);
        totalGUI.setOpaque(true);
        return totalGUI;
    }

    private static void createAndShowGUI() {

        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("[=] Embrace of the JScrollPane [=]");

        ScrollRisk demo = new ScrollRisk();
        frame.setContentPane(demo.createContentPane());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 300);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
