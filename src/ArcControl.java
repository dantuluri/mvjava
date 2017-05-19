import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ArcControl extends JApplet implements AdjustmentListener
{
	private DisplayPanel canvas;
	private JScrollBar width;
	private JScrollBar height;
	private JScrollBar startDeg;
	private JScrollBar endDeg;
	int widthof, heightof, startDegof, endDegof;


	public ArcControl ( )
	{
		widthof = heightof = startDegof = endDegof = 60;
	}

	public void init()
	{
		canvas = new DisplayPanel();
		getContentPane().add ( canvas, BorderLayout.CENTER );

		width = new JScrollBar(JScrollBar.HORIZONTAL, 60, 5, 0, 400);
		width.addAdjustmentListener(this);
		getContentPane().add ( width, BorderLayout.NORTH );

		height = new JScrollBar(JScrollBar.VERTICAL, 60, 5, 0, 400);
		height.addAdjustmentListener(this);
		getContentPane().add ( height, BorderLayout.EAST );

		startDeg = new JScrollBar(JScrollBar.VERTICAL, 60, 5, 0, 360);
		startDeg.addAdjustmentListener(this);
		getContentPane().add ( startDeg, BorderLayout.WEST );

		endDeg = new JScrollBar(JScrollBar.HORIZONTAL, 60, 5, 0, 370);
		endDeg.addAdjustmentListener(this);
		getContentPane().add ( endDeg, BorderLayout.SOUTH );
	}

	class DisplayPanel extends JPanel
	{

		public DisplayPanel ( )
		{
			setBackground ( Color.black );
		}

		public void paintComponent(Graphics g )
		{
			super.paintComponent ( g );
			g.setColor(Color.blue);
			g.fillArc(30, 30, widthof, heightof, startDegof, endDegof);
		}
	}

	public void adjustmentValueChanged( AdjustmentEvent e)
	{
        	widthof = width.getValue();
		heightof = height.getValue();
		startDegof = startDeg.getValue();
		endDegof = endDeg.getValue();
		canvas.repaint();
	}
}
