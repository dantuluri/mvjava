/*
* Surya Dantuluri
* March 2, 2017
* GardenGrows.java
* Simple program that displays a repeated pattern of shapes *on a fabric, which is then covered by polygons to display a *picture of pajamas on a panel.
* Uses JFrame class and JPanel container.
* Uses integers and arrays.
*
* Class first declares extending JFrame class.
* Then sets size, sets size of origin of content panel, sets * if window is resizable or not.
*
* Sets new panel then sets background
* Sets pattern, covering all of the panel
* Overlays pattern with other shapes in panel to make the
* output look like pajamas.
*
*Testing Plan:
*input: no input
*output:
*/
import java.awt.Color;     //imports abstract window toolkit
import java.awt.Graphics; //imports possible events of abstract window toolkit
import java.awt.Image; //imports graphics components with swing
import java.awt.Font;
import java.awt.event.MouseListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public class GardenGrows
{
	private Garden canvas;
	private Image image;
	private JLabel label;
	private int xpos, ypos;
	private boolean keyClear;
	private int sizeX, sizeY;
	private String imageName;
	private boolean shiftkey;
	private boolean clicked;
	private boolean watered;
	private boolean clickedandwatered;

	public GardenGrows()
	{
		sizeX=0;  											//no size X or Y
		sizeY=0;
		xpos=ypos=200;											//x/ypos??
		keyClear=true;
	}
	public static void main(String[]args)
	{
		GardenGrows garden = new GardenGrows();
		garden.run();
	}

	public void run()
	{
		JFrame frame = new JFrame("Garden Grows");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setLayout(null); //get ContentRaw().setLayout(null);
		frame.getContentPane();
		canvas=new Garden();
		frame.getContentPane().add(canvas);
		frame.setBackground(Color.PINK);
		frame.setSize(1000,1000);
		frame.setLocation(0,0);
		frame.setResizable(false);
		frame.setVisible(true);
	}

	class Garden extends JPanel implements MouseListener, KeyListener
	{
		public Garden()
		{
			setBackground(Color.PINK);
			setLocation(50,50);
			setSize(1000,500);
			addMouseListener(this);
			addKeyListener(this);
		}
		//user clicks and input % back become GREEN
		//user clicks and keyboard up then 50*50 circles popup and have 200 space from all sides  IF GARDEN IS WATERED
		//reset3
		public void mousePressed(MouseEvent e)
		{
			requestFocus();
			clicked=true;
			repaint();
		}

		public void mouseClicked(MouseEvent e){}
		public void mouseReleased(MouseEvent e){}
		public void mouseEntered(MouseEvent e){}
		public void mouseExited(MouseEvent e){}

		public void keyPressed(KeyEvent e)
		{
			int shiftkeycode = e.getKeyCode();									// start of water
			if(clicked && shiftkeycode==KeyEvent.VK_SHIFT)
			{
				shiftkey=true;
			}
			int number5code = e.getKeyCode();
			if(shiftkey && number5code==KeyEvent.VK_5)
			{
			setBackground(Color.GREEN);
			watered = true;
			clicked=false;
			repaint();
			}
			int upkeycode = e.getKeyCode();
			if(clicked && upkeycode==KeyEvent.VK_UP)
			{
				if(watered)
				{
					clickedandwatered=true;
					repaint();
				}
			}
		}


		public void keyTyped(KeyEvent e){}
		public void keyReleased(KeyEvent e){}

		public void paintComponent(Graphics g)
		{
			if(clickedandwatered)
			{
				super.paintComponent(g);
				g.setColor(Color.BLACK);
				for (int y=0; y<=500; y+=200) //for loop for shapes to draw vertically
          {
          for (int x = 0; x <=1000; x+=200) //for loop for shapes to draw horizontally
            {
            g.drawOval( x, y, 20, 20); //draws oval with x and y changing to draw repetitively
            }
          }
			}
			else
			{
				//.drawImage(image,xpos,ypos,sizeX,sizeY,this);
			}
			keyClear=false;

		}

	}
}
