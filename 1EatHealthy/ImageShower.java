
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
*
* @author Vincent
*/
public class ImageShower { public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException { UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); JFrame window = new JFrame("Image showing program"); window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); JPanel panel_1 = new JPanel(); window.add(BorderLayout.NORTH, panel_1); ImageIcon ii = new ImageIcon("plus.png"); final JButton button_1 = new JButton(ii); button_1.setIcon(ii); button_1.setBorderPainted(false); button_1.addMouseListener(new MouseAdapter() { public void mouseEntered(MouseEvent evt) { ImageIcon pp = new ImageIcon("plus-hover.png"); button_1.setIcon(pp); } public void mouseExited(MouseEvent evt) { ImageIcon ppp = new ImageIcon("plus.png"); button_1.setIcon(ppp); } }); ImageIcon p = new ImageIcon(); BufferedImage img = ImageIO.read(new File("bluebert_large.png")); JLabel lbl = new JLabel(); p.setImage(img); lbl.setIcon(p); panel_1.add(button_1); panel_1.add(lbl); window.setSize(500, 500); window.setVisible(true); window.setLocationRelativeTo(null); }
