
import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
	class Face extends JFrame{
		Face(){
		}
			public void paintComponent(Graphics g){
							int[] X ={150,170,180,190};
				int[] Y ={200,180,180,200};
				Font f= new Font("Serif",Font.BOLD,40);
				super.paintComponent(g);
					g.setColor(Color.yellow);
					setBackground(Color.white);
					g.fillOval(70,40,200,200);///draw the face
					g.setFont(f);
					g.setColor(Color.BLACK);
					g.drawString("Derp Face!",400,175); //Draw the nose
					g.fillArc(80,0,200,100,0,180);//draw top of hat
					g.drawLine(70,50,300,50);//Draw bottom of hat
					g.setColor(Color.red);
					g.fillPolygon(X,Y,4);//Draw mouth
					g.setColor(Color.BLACK);
					g.drawArc(90,90,60,80,0,90);//draw left eye curcve
					g.drawLine(117,90,117,129);//draw side of eye
					g.drawLine(117,129,148,129);//draw bottom part of eye
					g.drawArc(200,90,60,80,180,-90);//draw right eye curve
					g.drawLine(200,129,230,129);//draw bottom part of eye
					g.drawLine(230,90,230,129);//draw side of right eye

			}
			}
