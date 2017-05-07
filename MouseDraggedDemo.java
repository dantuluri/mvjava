import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

class MouseDraggedDemo {
  public int xfind;
  public int commax;
  public int yfind;
  public int brackety;
  public int xpos;
  public int ypos;
  public static void main(String args[]) {
    Frame frame = new Frame("MouseMotionListenerExample");
    frame.setSize(new Dimension(350, 250));
    frame.setVisible(true);
    frame.addMouseMotionListener(new MouseMotionAdapter() {

      // invoked when mouse is dragged
      public void mouseDragged(MouseEvent me) {

        String stringo  = me.toString();
        System.out.println(stringo);
        int stringa = stringo.indexOf("absolute");
        System.out.println(stringa);

      }
    });
  }
}
