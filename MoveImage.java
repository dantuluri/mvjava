package mx.gcross.samples;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

/**
 *
 * @author René Cruz - G-Cross Studio 2011
 */
public class MoveImage extends JFrame implements KeyListener {
    //Objects for images

    private BufferedImage background;
    private BufferedImage bird;
    //First coordinates of bird image
    private int cordX = 50;
    private int cordY = 250;

    public MoveImage() {
        setTitle("Move Image Sample");
        setSize(512, 512); //set window dimension 480x320px
        loadImages();
        setVisible(true); //make window visible
    }

    public void loadImages() {
        try {
            //path for image file
            String pathBackground = "images/background.jpg";
            background = ImageIO.read(new File(pathBackground));
            String pathBird = "images/bird.png";
            bird = ImageIO.read(new File(pathBird));

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        //asociate the keyboard listener with this JFrame
        addKeyListener(this);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //draw brackground image (first image)
        g.drawImage(background, 0, 0, this);
        //draw bird image (second image, in this order)
        g.drawImage(bird, cordX, cordY, this);
    }

    public static void main(String[] args) {
        new MoveImage();
    }


    //While a key is pressed
    public void keyPressed(KeyEvent ke) {
        switch (ke.getKeyCode()) {
            //if the right arrow in keyboard is pressed...
            case KeyEvent.VK_RIGHT: {
                cordX+=3;
            }
            break;
            //if the left arrow in keyboard is pressed...
            case KeyEvent.VK_LEFT: {
                cordX-=3;
            }
            break;
            //if the down arrow in keyboard is pressed...
            case KeyEvent.VK_DOWN: {
                cordY+=3;
            }
            break;
            //if the up arrow in keyboard is pressed...
            case KeyEvent.VK_UP: {
                cordY-=3;
            }
            break;
        }
        repaint();
    }

    //When a key is typed (once)
    public void keyTyped(KeyEvent ke) {}

    //When a key is released (typed or pressed)
    public void keyReleased(KeyEvent ke) {}
}
