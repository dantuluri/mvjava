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

	public GardenGrows()
	{
		sizeX=217;
		sizeY=301;
		imageName="calvin.jpg";
		xpos=ypos=200;
		keyClear=true;
	}
	public static void main(String[]args)
	{
		GardenGrows garden = new GardenGrows();
		garden.run();
	}

	public void getMyImage()
	{
		try
		{
			image=ImageIO.read(new File(imageName));
		}
		catch(IOException e)
		{
		System.err.println("\n\n"+imageName+"can't be found. \n\n");
		e.printStackTrace();
		}
	}

	public void run()
	{
		JFrame frame = new JFrame("Garden Grows");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setLayout(null); //get ContentRaw().setLayout(null);
		frame.getContentPane();
		canvas=new Garden();
		frame.getContentPane().add(canvas);
		getMyImage();
		frame.setBackground(Color.PINK);
		frame.setSize(1000,1000);
		frame.setLocation(0,0);
		frame.setResizable(false);
		frame.setVisible(true);
	}

	class Garden extends JPanel implements MouseListener,KeyListener
	{
		public Garden()
		{
			setBackground(Color.PINK);
			setLocation(50,50);
			setSize(1000,500);
			addMouseListener(this);
			addKeyListener(this);
		}

		public void mousePressed(MouseEvent e)
		{
			requestFocus();
			repaint();
		}

		public void mouseClicked(MouseEvent e){}
		public void mouseReleased(MouseEvent e){}
		public void mouseEntered(MouseEvent e){}
		public void mouseExited(MouseEvent e){}

		public void keyPressed(KeyEvent e)
		{
			int code = e.getKeyCode();
			if(code==KeyEvent.VK_SHIFT)
			{
				shiftkey=true;
			}
			if(shiftkey&&code==KeyEvent.VK_5)
			{
			setBackground(Color.GREEN);
			}
			if(code==KeyEvent.VK_SPACE)
			{
				keyClear=true;
				repaint();
			}
		}

		public void keyTyped(KeyEvent e){}
		public void keyReleased(KeyEvent e){}

		public void paintComponent(Graphics g)
		{
			if(keyClear)
			{
				super.paintComponent(g);
			}
			else
			{
				g.drawImage(image,xpos,ypos,sizeX,sizeY,this);
			}
			keyClear=false;

		}

	}

}
