import java.awt.*;
import javax.swing.*;
public class Ex extends JFrame
{
    public static void main (String[]args)
    {
        Ex ex = new Ex();
    }

    public Ex()
    {
        super("Pink Panel in Frame");
        setSize(200,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(400,400);
        setResizable(true);
        Panel pan = new Panel();
        setContentPane(pan);
        setVisible(true);
    }
}
class Panel extends JPanel
{
    public Panel()
    {
        setBackground(Color.PINK);
    }
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
    }
}
