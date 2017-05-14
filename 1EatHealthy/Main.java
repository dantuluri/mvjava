import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;     //imports abstract window toolkit
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyEvent; //imports packsage for any key events;
import java.awt.event.KeyListener; //imports packaga for any key listener
import java.awt.event.MouseEvent; //imports package for any mouse events
import java.awt.event.MouseListener; //imports package for mouse listener
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.FlowLayout;
import java.awt.Font; //imports fonts
import java.awt.Frame;
import java.awt.Graphics; //imports possible events of abstract window toolkit
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.awt.Image; //imports graphics components with swing
import java.awt.Point;
import java.awt.Toolkit;
import java.io.BufferedWriter;
import java.io.File; //imports file io
import java.io.FileWriter;
import java.io.IOException; //imports for input out io exception
import java.lang.Object;
import java.util.ArrayList;
import java.util.Scanner;
import javax.imageio.ImageIO; //imports image io
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFrame; //iexpansion pack used for importing GUI JFrame
import javax.swing.JLabel; //imports JLabel
import javax.swing.JOptionPane;
import javax.swing.JPanel; //imports JPanel
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.imageio.ImageIO;

import java.awt.Graphics2D;


public class Main {
  public static void main(String[] argv) throws Exception {
    Main mainy = new Main();
    mainy.velocity();

}


    public void velocity()
    {
      // try{
        Image  img = new ImageIcon("test.png").getImage();

        BufferedImage bufferedImage = new BufferedImage(img.getWidth(null), img.getHeight(null),
            BufferedImage.TYPE_INT_RGB);

        Graphics g = bufferedImage.createGraphics();
        g.drawImage(img, 0, 0, null);
        // g.dispose();
        //
        // ImageIO.write(bufferedImage, "png", new File("a.png"));

      // catch(IOException e)
      // {
      // System.out.println("catch some!");
      // }
    }


  }
