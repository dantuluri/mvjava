import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class MouseDraggedDemo {
  public static void main(String args[]) {
    Frame frame = new Frame("MouseMotionListenerExample");
    frame.setSize(new Dimension(350, 250));
    frame.setVisible(true);
    frame.addMouseMotionListener(new MouseMotionAdapter() {

      // invoked when mouse is dragged
      public void mouseDragged(MouseEvent me) {
        Point point = me.getPoint();
        System.out.println("HELLO"+point);
      }
    });
  }
}
