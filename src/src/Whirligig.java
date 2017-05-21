/* Ulric Wu, Urvi Shah, Madisen Vongnakhone, Udbhav Venkataraman, Surya Dantuluri
 * 3/29/2017
 * This program runs 7 JPanels with individual activities displayed on top of a JFrame.
 * Each activity is aimed at teaching students about shared drinks and food, the health problems
 * of such.
 *
 * Testing Plan:
 * Attempt to interact with each panel, and observe the results
 * */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;

import javax.swing.*;
import javax.swing.JButton;
import java.awt.event.*;
import java.awt.*;
import java.io.IOException;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Whirligig//main frame by Ulric
{
	public MenuPanel menuPanel;
	public JFrame frame;
	public static void main( String[] args )
	{
		Whirligig wg = new Whirligig();
		wg.runIt();
	}

	public Whirligig()
	{
	}

	public void runIt()
	{
		frame = new JFrame("Sharing Food and Drinks");
		frame.setSize(1400, 1200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(0,0);
		frame.setResizable(false);
		JPanel background = new JPanel();
		background.setBackground(Color.CYAN);
		frame.getContentPane().add(background);
		background.setLayout(new FlowLayout());
		SliderActivtiy sActivity = new SliderActivtiy();
		background.add(sActivity);
		menuPanel = new MenuPanel();
		UVPanel2 uv2 = new UVPanel2();
        background.add(uv2);
        UVPanel uv = new UVPanel();
        background.add(uv);
        Backwash bw = new Backwash();
		background.add(bw);
		background.add(menuPanel);
		TextArea ta = new TextArea();
		background.add(ta);
		ScrollRisk demo = new ScrollRisk();
		background.add(demo.createContentPane());
		frame.setVisible(true);
	}

	/*class Something extends JPanel implements ActionListener
	{    Surya RadioButton
		public Something()
		{
			//... Create the buttons.
			JRadioButton onep = new JRadioButton("1");
			JRadioButton twop = new JRadioButton("2");
			JRadioButton threep = new JRadioButton("3");
			JRadioButton fourp = new JRadioButton("4");

			onep.addActionListener(this);
			twop.addActionListener(this);
			threep.addActionListener(this);
			fourp.addActionListener(this);

			//... Create a button group and add the buttons.
			ButtonGroup bgroup = new ButtonGroup();
			bgroup.add(onep);
			bgroup.add(twop);
			bgroup.add(threep);
			bgroup.add(fourp);

			//... Arrange buttons vertically in a panel

			setLayout(new GridLayout(5, 1));
			add(onep);
			add(twop);
			add(threep);
			add(fourp);


			//... Add a titled border to the button panel.

				   //setBorder(BorderFactory.createTitledBorder(
					 //                  BorderFactory.createEtchedBorder(), "How many people did you share your food with today?"));
		Code is nonfunctional*/
    //public void actionPerformed(ActionEvent evt)
    // {
    //     JButton button=new JButton("Enter");
    //     button.addActionListener(this);
    //     add(button);
    // }
// }
	// //public class ScrollRisk{//Surya JScrollbar
	//
	// 	public JPanel createContentPane (){
	//
	// 		// As usual, we create our bottom-level panel.
	// 		JPanel totalGUI = new JPanel();
	//
	// 		// This is the story we took from Wikipedia.
	// 		String story = ("1. Make sure your food is away from others, so that your friends don't feel the urge to take your fot your friends don't feel the urge to take your. ALso excerzie more so that you won't get diseases or bacteria from other's food. 2.Make sure your food is covered with protective layers such as aluminum foil so that it won't be vulnerable to others sptting on your food.");
	//
	// 		// We create the TextArea and pass the story in as an argument.
	// 		// We also set it to be non-editable, and the line and word wraps set to true.
	// 		JTextArea storyArea = new JTextArea(story);
	// 		storyArea.setEditable(false);
	// 		storyArea.setLineWrap(true);
	// 		storyArea.setWrapStyleWord(true);
	//
	// 		// We create the ScrollPane and instantiate it with the TextArea as an argument
	// 		// along with two constants that define the behaviour of the scrollbars.
	// 		JScrollPane area = new JScrollPane(storyArea,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
	// 										   JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	//
	// 		// We then set the preferred size of the scrollpane.
	// 		area.setPreferredSize(new Dimension(300, 200));
	//
	// 		// and add it to the GUI.
	// 		totalGUI.add(area);
	// 		totalGUI.setOpaque(true);
	// 		return totalGUI;

}


	class MenuPanel extends JPanel implements ActionListener
	{  //Ulric Wu, JMenu
		/////////
		// 2.  declare the button
		private FoodPanel fp;
		private JMenuBar jMenuBar;
		private JMenu foodMenu;
		private JMenuItem drinks, sauces, soups, solids;

		////////////// write constructor
		public MenuPanel()
		{
			//////
			// 2.  instantiate the button.  add everything needed.
			setPreferredSize(new Dimension(450,400));
			fp = new FoodPanel();
			jMenuBar = new JMenuBar();
			foodMenu = new JMenu("Foods");
			drinks = new JMenuItem("Drinks");//needs listener
			sauces = new JMenuItem("Sauces and Dip");
			soups = new JMenuItem("Soups");//needs listener
			solids = new JMenuItem("Solid Foods");
			drinks.addActionListener(this);
			sauces.addActionListener(this);
			soups.addActionListener(this);
			solids.addActionListener(this);
			foodMenu.add(drinks);
			foodMenu.add(sauces);
			foodMenu.add(soups);
			foodMenu.add(solids);
			jMenuBar.add(foodMenu);
			add(jMenuBar);
			add(fp);
		}
			////////////////////////////////
		// 2. write event handler method for button
		public void actionPerformed(ActionEvent e)
		{
			String command = e.getActionCommand();
			if(command.equals("Drinks")) fp.setPanel(1);
			if(command.equals("Sauces and Dip")) fp.setPanel(2);
			if(command.equals("Solid Foods")) fp.setPanel(3);
			if(command.equals("Soups")) fp.setPanel(4);
			repaint();
		}

		public void paintComponent(Graphics g)	// paint component
		{
			super.paintComponent(g);	// draw background
			setBackground(Color.RED);
		}
		class FoodPanel extends JPanel
		{
			private String level, description, description2;
			private Image nachos, soda, salad, soup, foodImage;

			public FoodPanel() 			// constructor
			{
				description = "";
				description2 = "";
				level = "";
				setPreferredSize(new Dimension(400,350));
				loadFoodImages();
				foodImage = null;
			}
			public void loadFoodImages()
			{
				try
				{
					nachos = ImageIO.read(new File("nachos.jpg"));
					soda = ImageIO.read(new File("soda.jpg"));
					salad = ImageIO.read(new File("salad.jpg"));
					soup = ImageIO.read(new File("soup.jpg"));
				}
				catch(IOException e)
				{
					System.err.println("/n/n an image file can't be found.\n\n");
					e.printStackTrace();
				}
			}
			public void setPanel(int food)
			{
				switch (food)
				{
					case 1:
						foodImage = soda;
						level = "VERY HIGH";
						description = "Direct contact with saliva makes sharing";
						description2 = "of bacteria especially dangerous.";
						break;
					case 2:
						foodImage = nachos;
						level = "HIGH";
						description = "Liquid nature and indirect saliva contact";
						description2 = "makes this a potent sharing threat.";
						break;
					case 3:
						foodImage = salad;
						level = "MILD";
						description = "Solid foods suffer from little saliva";
						description2 = "contact, and as such pose less danger.";
						break;
					case 4:
						foodImage = soup;
						level = "HIGH";
						description = "Liquid nature and indirect saliva contact";
						description2 = "through spoon can be slightly dangerous.";
						break;
					default:
						foodImage = null;
						level = "NULL";
						description = "Something went wrong";
						break;
				}
				repaint();
			}
			public void paintComponent(Graphics g)	// paint component
			{
				super.paintComponent(g);	// draw background
				g.drawString("Ulric Wu, JMenu", 10, 390);
				setBackground(Color.YELLOW);
				Font font = new Font("Serif", Font.BOLD, 20);
				g.setFont(font);
				g.drawString("Threat Level:" + level,10,30);
				g.drawImage(foodImage,10,40,100,100,this);
				g.drawString(description,5,160);
				g.drawString(description2,5,180);
			}
		}
	}//end of Ulric's code
	class UVPanel2 extends JPanel implements ActionListener
    {//Udbhav, JCheckBox
        private JCheckBox shared1;
        private JCheckBox shared2;
        private JCheckBox shared3;
        private JCheckBox shared4;

        private Font font;

        private boolean box1Selected;
        private boolean box2Selected;
        private boolean box3Selected;
        private boolean box4Selected;

        public UVPanel2()
        {
            setLayout(new FlowLayout());
            setPreferredSize(new Dimension(450,400));

            font = new Font("Lucida Fax", Font.BOLD, 15);

            setFont(font);

            //setBackground(Color.CYAN);

            shared1 = new JCheckBox("Shared Burrito");
            shared2 = new JCheckBox("Shared Soda");
            shared3 = new JCheckBox("Shared Ice Cream");
            shared4 = new JCheckBox("Shared Cheese");

            shared1.addActionListener(this);
            shared2.addActionListener(this);
            shared3.addActionListener(this);
            shared4.addActionListener(this);

            add(shared1);
            add(shared2);
            add(shared3);
            add(shared4);

            box1Selected = false;
            box2Selected = false;
            box3Selected = false;
            box4Selected = false;
        }

        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            g.drawString("Udbhav Venkataraman, JCheckBox", 10, 390);

            if(box1Selected == false && box2Selected == false && box3Selected == false && box4Selected == false)
            {
                g.setColor(Color.YELLOW);
                g.fillOval(50, 60, 300, 275);
                g.setColor(Color.BLACK);
                g.fillOval(100,100, 50, 50);
                g.fillOval(250, 100, 50, 50);
                g.drawArc(100, 150, 200, 100, 180, 180);
            }
            else if((box1Selected == true && box2Selected == false && box3Selected == false && box4Selected == false) || (box1Selected == false && box2Selected == true && box3Selected == false && box4Selected == false) || (box1Selected == false && box2Selected == false && box3Selected == true && box4Selected == false) || (box1Selected == false && box2Selected == false && box3Selected == false && box4Selected == true))
            {
                g.setColor(Color.YELLOW);
                g.fillOval(50, 60, 300, 275);
                g.setColor(Color.BLACK);
                g.fillOval(100,100, 50, 50);
                g.fillOval(250, 100, 50, 50);
                g.drawLine(100, 250, 300, 250);
            }
            else if((box1Selected == true && box2Selected == true && box3Selected == false && box4Selected == false) || (box1Selected == true && box2Selected == false && box3Selected == true && box4Selected == false) || (box1Selected == true && box2Selected == false && box3Selected == false && box4Selected == true) || (box1Selected == false && box2Selected == true && box3Selected == true && box4Selected == false) || (box1Selected == false && box2Selected == true && box3Selected == false && box4Selected == true) || (box1Selected == false && box2Selected == false && box3Selected == true && box4Selected == true))
            {
                g.setColor(Color.GREEN);
                g.fillOval(50, 60, 300, 275);
                g.setColor(Color.BLACK);
                g.fillOval(100,100, 50, 50);
                g.fillOval(250, 100, 50, 50);
                g.drawLine(100, 250, 300, 250);
            }
            else if((box1Selected == false && box2Selected == true && box3Selected == true && box4Selected == true) || (box1Selected == true && box2Selected == false && box3Selected == true && box4Selected == true) || (box1Selected == true && box2Selected == true && box3Selected == false && box4Selected == true) || (box1Selected == true && box2Selected == true && box3Selected == true && box4Selected == false))
            {
                g.setColor(Color.GREEN);
                g.fillOval(50, 60, 300, 275);
                g.setColor(Color.BLACK);
                g.fillOval(100,100, 50, 50);
                g.fillOval(250, 100, 50, 50);
                g.drawArc(100, 200, 200, 100, 0, 180);
            }
            else if(box1Selected == true && box2Selected == true && box3Selected == true && box4Selected == true)
            {
                g.setColor(Color.BLUE);
                g.fillOval(50, 60, 300, 275);
                g.setColor(Color.BLACK);
                g.fillOval(100,100, 50, 50);
                g.fillOval(250, 100, 50, 50);
                g.drawArc(100, 200, 200, 100, 0, 180);
            }
        }

        public void actionPerformed(ActionEvent e)
        {
            if(shared1.isSelected())
            {
                box1Selected = true;
            }
            else
            {
                box1Selected = false;
            }
            if(shared2.isSelected())
            {
                box2Selected = true;
            }
            else
            {
                box2Selected = false;
            }
            if(shared3.isSelected())
            {
                box3Selected = true;
            }
            else
            {
                box3Selected = false;
            }
            if(shared4.isSelected())
            {
                box4Selected = true;
            }
            else
            {
                box4Selected = false;
            }

            repaint();
        }
    }
    class UVPanel extends JPanel implements ActionListener
    {//Udbhav, JTextField
        private TextFieldPanel tfp;

        private boolean resetPressed;
        private boolean enterPressed;

        private int numberSelected;
        private int pixelLength;

        private JTextField tf;
        private String previousText;
        private String currentText;

        private String text;
        private Image image;

        public UVPanel()
        {
            setPreferredSize(new Dimension(450, 400));
            setLayout(new FlowLayout());
            tryCatch();

            tfp = new TextFieldPanel();

            resetPressed = false;
            enterPressed = false;

            numberSelected = 0;
            pixelLength = 450;

            previousText = "";
            currentText = "";

            tf = new JTextField(35);

            add(tf);
            tf.addActionListener(this);

            text = "";

            add(tfp);
        }
        public void tryCatch()
		{
			try
			{
				image = ImageIO.read(new File("BacteriumPic.jpg"));
			}
			catch(IOException e)
			{
				System.err.println("\n\nBacteriaPic.jpg can't be found.\n\n");
				e.printStackTrace();
			}
		}

        public void actionPerformed(ActionEvent e)
        {
            if(tf.getText().equalsIgnoreCase("Reset"))
            {
                resetPressed = true;
            }
            repaint();
        }

        public void paintComponent(Graphics g)
        {

            g.setColor(Color.BLACK);
            g.drawString("Udbhav Venkataraman, JText", 10, 390);
            g.drawString("Enter shared food or drink in the text field above. Then hit the enter button", 0, 50);
            g.drawString("Type in the word reset to reset the bacteria count", 0, 60);

            if(resetPressed == true)
            {
                numberSelected = 0;
                pixelLength = 450;

                g.drawImage(image, 0, 70, 450, 330, this);

                text = "";
                resetPressed = false;
                enterPressed = false;
            }

            else
            {
                numberSelected++;
                pixelLength = 450/numberSelected;

                for(int x = 0; x<450; x += pixelLength)
                {
                    g.drawImage(image, x, 70, pixelLength, 330, this);
                }

                enterPressed = false;
            }
        }



        class TextFieldPanel extends JPanel implements KeyListener
        {
            public void keyPressed(KeyEvent e)
            {
                int code = e.getKeyCode();
                if(code == KeyEvent.VK_ENTER)
                {
                    enterPressed = true;
                    repaint();
                }
            }

            public void keyTyped(KeyEvent e){}
            public void keyReleased(KeyEvent e){}


        }
    }//end of Udbhav's code
    class Backwash extends JPanel implements ActionListener
	{//Urvi, JButton
		private JButton button;
		private Color bottle;
		private int count;
		private boolean text;
		public Backwash()
		{
			button = new JButton("Share Drink");
			bottle = new Color(0,0,255);
			count = 0;
			setPreferredSize(new Dimension(450,400));

			button.addActionListener(this);
			add(button);

			//setBackground(Color.PINK);
		}

		public void paintComponent(Graphics g)	// paint component
		{
			super.paintComponent(g);
			g.drawString("Urvi Shah, JButton", 10, 390);
			g.setColor(bottle);
			g.fillOval(50,100,50,150);
			g.fillRect(52,201,48,50);

			g.setColor(Color.BLACK);
			g.fillRect(63,85,25, 25);

			for(int a=150; a<=250; a+=25)
				g.drawLine(52,a,99,a);
			if (text == true)
			{
				g.drawString("After sharing your drink so many times, it no", 105, 200);
				g.drawString("longer tastes like water. Each person contaminated the",105,211);
				g.drawString("drink even more. Press reset if you want to try again.",105,222);
				text = false;
			}
		}

		public void actionPerformed(ActionEvent evt)
		{
			String pressed = button.getText();
			if (pressed == "Share Drink")
			{
				count++;
				int blue = 255 - count*25;
				int gar = count*25;
				bottle = new Color(gar,gar,blue);
				if(count==10)
				{
					button.setText("reset");
					text = true;
				}
			}
			else if(pressed == "reset")
			{
				bottle = new Color(0,0,255);
				button.setText("Share Drink");
				count = 0;
			}

			repaint();
		}
	} //end of Urvi's code
	class SliderActivtiy extends JPanel
	{//Madisen, JSlider
	private ImagePanel imageP;
	private TextPanel textP;
	private SliderPanel sliderP;
	private boolean check1, check2, check3, check4, check5;
	private JSlider slider;
	private Image image; //add other images
	private String imageName; //add images names

		public SliderActivtiy()
		{
			setBackground(Color.PINK );
			check1 = check2 = check3 = check4 = check5 = false;
			imageName = "";
			image = null;
			setPreferredSize(new Dimension(1400,300));

			slider = new JSlider(JSlider.HORIZONTAL,1,1400,700);

			SliderHandler sHandler = new SliderHandler();
			slider.addChangeListener(sHandler);

			sliderP = new SliderPanel();
			imageP = new ImagePanel();
			textP = new TextPanel();

			setLayout(new BorderLayout(10,10));

			add(slider, BorderLayout.NORTH);
			add(imageP, BorderLayout.WEST);
			add(sliderP, BorderLayout.CENTER);
			add(textP,BorderLayout.EAST);
		}

		public void getMyImage()
		{
			try
			{
				image = ImageIO.read(new File(imageName));
			}
			catch(IOException e)
			{
				System.err.println("\n\n" + imageName + " can't be found.\n\n");
				e.printStackTrace();
			}
		}

		public class ImagePanel extends JPanel
		{
			public ImagePanel()
			{
				setPreferredSize(new Dimension(500, 200));
				setBackground(Color.PINK);
			}

			public void paintComponent(Graphics g)
			{
				super.paintComponent(g);

				if(check1)
					g.drawImage(image,250,0,250,250,this); //get image


				if(check2)
					g.drawImage(image,250,0,250,250,this);//get image

				if(check3)
					g.drawImage(image,250,0,250,250,this);//get image


				if(check4)
					g.drawImage(image,250,0,250,250,this);//get image

				if(check5)
					g.drawImage(image,250,0,250,250,this);//get image
			}
		}

		public class TextPanel extends JPanel
		{
			public TextPanel()
			{
				setPreferredSize(new Dimension(500, 200));
				setBackground(Color.PINK);
			}

			public void paintComponent(Graphics g)	// paint component
			{
				super.paintComponent(g);

				if(check1 == true)
				{
					g.drawString("This snack is great for sharing with friends! ",15,15);
					g.drawString("You won't have to worry about sharing germs unless",15,45);
					g.drawString(" you don't wash your hands. Make sure to always wash",15,75);
					g.drawString(" your hands before eating.",15,105);
					check1 = false;
				}

				 if(check2 == true)
				{
					g.drawString("This snack isn't a good snack to share with your friends.",15,15);
					g.drawString("Sharing a bottle of juice with ur friends can be very unhealthy.",15,45);
					g.drawString("Great ways of sharing this snack is pouring the juice into different cups.",15,75);
					check2 = false;
				}

				if(check3 == true)
				{
					g.drawString("Lollipops may be very delicous and tempting to let others taste",15,15);
					g.drawString("the the tasty flavor, but by doing this it could make you very sick.",15,45);
					g.drawString("Unless you want to stay inside all day instead of hanging out with",15,75);
					g.drawString("your friends, don't share germs with others.",15,105);
					check3 = false;
				}

				if(check4 == true)
				{
					g.drawString("Popcorn is excellent when sharing food with others! You won't be ",15,15);
					g.drawString("getting germs from others, but make sure you always wash your hands ",15,45);
					g.drawString("before eating. Make some popcorn, call your friends and enjoy a movie!",15,75);
					check4 = false;
				}

				if(check5 == true)
				{
					g.drawString("This snack is meant to be shared with others durring potlucks or parties.",5,15);
					g.drawString("I encourage you guys to eat lots of vegetables and share it with your friends.",5,45);
					g.drawString("You will get all the nutrients need and you have a less chance of getting sick!",5,75);
					check5 = false;
				}
			}
		}

		public class SliderPanel extends JPanel
		{
			public SliderPanel()
			{
				setPreferredSize(new Dimension(10, 200));
				setBackground(Color.PINK);
			}
		}

		class SliderHandler implements ChangeListener
		{
			public SliderHandler()
			{
			}
			public void stateChanged(ChangeEvent e)
			{
				int position = slider.getValue();

				if(position <= 300)
				{
					check1 = true;
					imageName = "chips.jpg";
					getMyImage();
				}

				else if(position >= 300 && position <= 550)
				{
					check2 = true;
					imageName = "drinks.jpg";
					getMyImage();
				}

				else if(position >= 550 && position <= 850)
				{
					imageName = "lollipop.jpg";
					getMyImage();
					check3 = true;
				}

				else if(position >= 850 && position <= 1100)
				{
					check4 = true;
					imageName = "popcorn.jpg";
					getMyImage();
				}

				else if(position >= 1100 && position <= 1400)
				{
					check5 = true;
					imageName = "vegBowl.jpg";
					getMyImage();
				}

				imageP.repaint();
				textP.repaint();
			}
		}
	}//End of Madisen's code
