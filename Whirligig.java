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
//     public void actionPerformed(ActionEvent evt)
//     {
//         JButton button=new JButton("Enter");
//         button.addActionListener(this);
//         add(button);
//     }
}

	//  class ScrollRisk{//Surya JScrollbar
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
	// 	}
	//
	//
	// }
	class MenuPanel extends JPanel implements ActionListener
	{  //Ulric Wu, JMenu
		/////////
		// 2.  declare the button
		private FoodPanel fp;						//THIS IS A PANEL
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
