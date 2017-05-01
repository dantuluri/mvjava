import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Frame;

public class Main extends Frame {
  private JButton north, south, east, west, center;

  public Main(String title) {
    super(title);
    north = new JButton("North");
    south = new JButton("South");
    east = new JButton("East");
    west = new JButton("West");
    center = new JButton("Center");
    this.add(north, BorderLayout.NORTH);
    this.add(south, BorderLayout.SOUTH);
    this.add(east, BorderLayout.EAST);
    this.add(west, BorderLayout.WEST);
    this.add(center, BorderLayout.CENTER);
  }

  public static void main(String[] args) {
    Frame f = new Main("BorderLayout demo");
    f.pack();
    f.setVisible(true);
  }
}
