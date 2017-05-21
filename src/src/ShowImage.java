/*
 * ShowImage.java
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


public class ShowImage
{
	private DrawingArea canvas;
	private Image image;
	private JLabel label;
	private int xpos, ypos;
	private boolean keyClear;
	private int sizeX, sizeY;
	private String imageName;

	public ShowImage()
	{
		sizeX=50;
		sizeY=50;
		imageName="calvin.jpg";
		xpos=ypos=210;
		keyClear=true;
	}
	public static void main(String[]args)
	{
		ShowImage si= new ShowImage();
		si.run();
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
		JFrame frame = new JFrame("ShowImage");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setLayout(null); //get ContentRaw().setLayout(null);
		label=new JLabel("Calvin");
		Font font =new Font("Arial",Font.BOLD,40);
		label.setFont(font);
		frame.getContentPane().add(label);
		canvas=new DrawingArea();
		frame.getContentPane().add(canvas);
		getMyImage();
		label.setBounds(355,0,300,100);
		frame.setBackground(Color.GRAY);
		frame.setSize(800,750);
		frame.setLocation(300,0);
		frame.setResizable(false);
		frame.setVisible(true);
	}

	class DrawingArea extends JPanel implements MouseListener,KeyListener
	{
		public DrawingArea()
		{
			setBackground(Color.GRAY);
			setLocation(0,100);
			setSize(800,650);
			addMouseListener(this);
			addKeyListener(this);
		}

		public void mousePressed(MouseEvent e)
		{
			requestFocus();
			xpos=e.getX()-50;
			System.out.println("THIS IS THE XPOS"+xpos);
			ypos=e.getY()-50;
			repaint();
		}

		public void mouseClicked(MouseEvent e){}
		public void mouseReleased(MouseEvent e){}
		public void mouseEntered(MouseEvent e){}
		public void mouseExited(MouseEvent e){}

		public void keyPressed(KeyEvent e)
		{
			int code = e.getKeyCode();
			if(code==KeyEvent.VK_SPACE||code==KeyEvent.VK_SHIFT)
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
				g.drawImage(image,xpos,ypos,this);
			}
			keyClear=false;

		}

	}

}
