import java.awt.Color;
import java.awt.Graphics;
import java.applet.Applet;

public class Box extends Applet
{
     public void paint (Graphics g)
     {
           g.setColor(Color.green);
           g.fillRect (10,130, 80, 140);
           g.setColor(Color.black);
           g.drawString("Java is Fun", 15 , 85);
     }
}
