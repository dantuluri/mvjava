/*
* Surya Dantuluri
* March 2, 2017
* GardenGrows.java
* Simple program that simulates a garden. Garden is watered and flowers are grown depending on if user clicks and *presses certain keys.
* Uses JFrame class and JPanel container.
* Uses integers and arrays.
*
*Only change on garden that can be done without doing anything to the frame is clicking on garden and pressing % to water garden.
Users then can grow flowers with clicking on the garden and pressing the up arrow key to grow flowers.
 Users then can clear the garden(reset to original garden) by pressing space at that point
*
*Testing Plan:
*input: Only input originally is clicking(in the pink garden) then pressing % to water garden. User then can click again on the garden and press the up arrow to grow flowers.
*output: After clicking and pressing, garden turns green. After another set of actions, flowers can grow as filled black circles with a radius of 50 pixels with a distance of 200 pixels between the circles
*/
import java.awt.Color;     //imports abstract window toolkit
import java.awt.Graphics; //imports possible events of abstract window toolkit
import java.awt.Image; //imports graphics components with swing
import java.awt.Font; //imports fonts
import java.awt.event.MouseListener; //imports package for mouse listener
import java.awt.event.KeyListener; //imports packaga for any key listener
import java.awt.event.MouseEvent; //imports package for any mouse events
import java.awt.event.KeyEvent; //imports packsage for any key events;
import javax.swing.JFrame; //iexpansion pack used for importing GUI JFrame
import javax.swing.JPanel; //imports JPanel
import javax.swing.JLabel; //imports JLabel
import java.io.File; //imports file io
import java.io.IOException; //imports for input out io exception
import javax.imageio.ImageIO; //imports image io


public class GardenGrows//instantiates gardengrows class
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
	private int clearcode;
	private boolean mouseWater;
	private boolean mouseFlower;
	private boolean waterBackground;
	private boolean flowerclick;
	private boolean cleargarden;
	public GardenGrows()
	{
		sizeX=0;//sets x variable to 0
		sizeY=0;//sets y variable to 0
		xpos=ypos=200;//sets xposypos to 200
		keyClear=true;//sets boolean to true
		mouseWater=false;//sets boolean to false
		waterBackground=false;//sets boolean to false
		mouseFlower=false;//sets boolean to false
		flowerclick=false;//sets boolean to false
		cleargarden=false;//sets boolean to false
	}
	public static void main(String[]args)
	{
		GardenGrows garden = new GardenGrows();//instantiates class
		garden.run();//calls run
	}

	public void run()
	{
		JFrame frame = new JFrame("Garden Grows");//sets up new jframe
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setLayout(null); //get ContentRaw().setLayout(null);
		frame.getContentPane();//sets content pane
		canvas=new Garden();//sets canvas as garden
		frame.getContentPane().add(canvas);//gets content pane and adds canvas
		frame.setBackground(Color.PINK);//sets background color to pink
		frame.setSize(1000,1000);//sets size for frame
		frame.setLocation(0,0);//sets origin
		frame.setResizable(false);//sets if resizable or not
		frame.setVisible(true);//sets if frame is visible or not
	}

	class Garden extends JPanel implements MouseListener, KeyListener//garden.java extends jpanel and implemetnts classes
	{
        public Garden()
        {
            setLocation(50,50);//sets panel origin
            setSize(1000,500);//sets size of panel
            addMouseListener(this);//adds MouseListener
            addKeyListener(this);//adds KeyListener
        }
        //user clicks and input % back become GREEN
        //user clicks and keyboard up then 50*50 circles popup and have 200 space from all sides  IF GARDEN IS WATERED
        //reset3
        public void mousePressed(MouseEvent e)		//every time user clicks method is run
        {
            requestFocus();//requests focus for mouse
            if(mouseWater==false)//if else statement for click
            {
                mouseWater=true;//if mouse is clicked then the click part for watered is done
            }
            if(watered && mouseFlower==false)//if else only if the garden is watered but doesn't have flowers
            {
                flowerclick=true;//decleares click part of flower done
            }
            repaint();//calls paintcomponent
            
        }
        
        public void mouseClicked(MouseEvent e){} //mouse is clicked
        public void mouseReleased(MouseEvent e){} //mouse is released
        public void mouseEntered(MouseEvent e){} //mouse is entered
        public void mouseExited(MouseEvent e){} //mouse exits
        
        public void keyPressed(KeyEvent e)//runs when a key is pressed
        {
            int shiftkeycode = e.getKeyCode();//looks for shiftkey
            if(shiftkeycode==KeyEvent.VK_SHIFT)//runs if shiftkey is pressed
            {
                shiftkey=true;//sets up boolean as true if shiftkey is pressed or not
                System.out.println("the shift key");
            }
            int number5code = e.getKeyCode();
            if(shiftkey && number5code==KeyEvent.VK_5)//if keycode is set up then paints in paintcomponent
            {
                watered=true;//sets up boolean as true if watered is true or not
                repaint();//calls paintComponent
            }
            int upkeycode = e.getKeyCode();//looks for key
            if(flowerclick && upkeycode==KeyEvent.VK_UP)//if key code is met then if/else runs
            {
                mouseFlower=true;//if all parts that make a flower are present then boolean is set true to be drawn in paintcomponent
                repaint();//calls paintComponent
            }
            int clearcode = e.getKeyCode();//finds key code
            if(mouseFlower && watered && clearcode==KeyEvent.VK_SPACE)//if following is correct then allows to clear the panel
            {
                cleargarden=true;//triggered to clear garden
            }
        }
        //clearcode = e.getKeyCode();
        
        public void keyTyped(KeyEvent e){}//keytyped method
        public void keyReleased(KeyEvent e){}//key released event
        
        public void paintComponent(Graphics g)//paint component to draw things
        {
            g.setColor(Color.PINK);
            g.fillRect(0, 0, 1000, 800);//sets background as pink before being watered
            if(watered)//if watered then turns background to green
            {
                super.paintComponent(g);
                setBackground(Color.GREEN);//sets background as green
            }
            if(mouseFlower)//if the garden is watered and correct keys and mice is pressed then the following
            {
                super.paintComponent(g);//clears paintComponent
                g.setColor(Color.BLACK);//sets color of circles as black
                for (int y=50; y<=500; y+=200) //for loop for shapes to draw vertically
                {
                    for (int x =50; x <=1000; x+=200) //for loop for shapes to draw horizontally
                    {
                        g.fillOval( x, y, 50, 50); //draws oval with x and y changing to draw repetitively
                    }
                }
            }
            if(cleargarden)
            {
                setBackground(Color.PINK);//sets background to pink
                super.paintComponent(g);//clears all paint component
                watered=false;
                mouseFlower=false;
                mouseWater=false;
            }
        }
    }
}
