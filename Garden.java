import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Garden {

	private int x, y, flower;

	private JFrame frame;
	private DisplayPanel canvas;
	private ButtonPanel buttonPanel;

	public Garden ( )   {
		x = y = flower = 0;
	}

	public static void main(String[] args) {
		Garden g = new Garden();
		g.Run();
	}

	public void Run() {
		// Create a frame to hold everything
		frame = new JFrame ("Hear Mouse");
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setBackground(Color.black);	// only needed if frame is larger than panel

		// Define panel to draw on
		canvas = new DisplayPanel();		// create a panel to draw on
      	canvas.setBackground(new Color(130,50,40));
		frame.addMouseListener(canvas);	// connects the MouseListerner to the panel window
       	buttonPanel = new ButtonPanel ( );

		// Put frame together
		frame.getContentPane().add(canvas);	// puts panel on frame
       	frame.getContentPane().add( buttonPanel, BorderLayout.SOUTH );
		frame.setVisible(true);
	}

   	public Insets getInsets() {
      		return new Insets ( 10, 10, 10, 10 );
   	}

	class DisplayPanel extends JPanel implements MouseListener   {

		public DisplayPanel ( )   {
			setBackground ( Color.green );
			addMouseListener ( this );
		}

		public void paintComponent(Graphics g) {
			super.paintComponent ( g );
		}

		public void PaintFlower ( Graphics g )    {
			switch ( flower )   {
				case 0:  g.setColor ( Color.red );
					 g.fillArc ( x - 25, y - 13, 50, 50, 55, 70 );
					 break;
				case 1:  g.setColor ( Color.white );
					 g.fillOval ( x - 13, y - 13, 26, 26 );
					 g.setColor ( Color.yellow );
					 g.fillOval ( x - 5, y - 5, 10, 10 );
					 break;
				case 2:  g.setColor ( Color.blue );
					 g.fillRect ( x - 13, y - 13, 25, 25 );
					 break;
				case 3:  g.setColor ( Color.white );
					 g.fillRect ( x - 5, y - 15, 10, 30 );
					 g.fillRect ( x - 15, y - 5, 30, 10 );
					 break;
			}
		}

		public void mousePressed(MouseEvent evt) {
			x = evt.getX ( );
			y = evt.getY ( );
			Graphics gr = getGraphics ( );
			PaintFlower ( gr );
		}

   		public void mouseEntered(MouseEvent evt) { }
		public void mouseExited(MouseEvent evt) { }
		public void mouseReleased(MouseEvent evt) { }
		public void mouseClicked(MouseEvent evt) { }
	}

	class ButtonPanel extends JPanel implements ActionListener   {

		public ButtonPanel ( )   {
			setBackground ( Color.black );

       			JButton roseButton = new JButton ( "ROSE" );
       			roseButton.addActionListener ( this );
       			this.add ( roseButton );

       			JButton marigoldButton = new JButton ( "MARIGOLD" );
       			marigoldButton.addActionListener ( this );
       			this.add ( marigoldButton );

       			JButton cornButton = new JButton ( "CORNFLOWER" );
       			cornButton.addActionListener ( this );
       			this.add ( cornButton );

       			JButton irisButton = new JButton ( "IRIS" );
       			irisButton.addActionListener ( this );
       			this.add ( irisButton );

       			JButton resetButton = new JButton ( "RESET" );
       			resetButton.addActionListener ( this );
       			this.add ( resetButton );
		}

   		public void actionPerformed ( ActionEvent evt ) {
      			String command = evt.getActionCommand();

      			if ( command.equals ( "ROSE" ) )
 	        		flower = 0;
      			else if ( command.equals ( "MARIGOLD" ) )
         			flower = 1;
      			else if ( command.equals ( "CORNFLOWER" ) )
         			flower = 2;
      			else if ( command.equals ( "IRIS" ) )
         			flower = 3;
      			else if ( command.equals ( "RESET" ) )
				canvas.repaint ( );
   		}
	}
}
