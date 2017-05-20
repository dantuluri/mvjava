import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;

public class CTetriMino {

public CTetriMino(int type, int x, int y, int w, int h, Color c)

public int getX() { return X; }
public void setX(int x) { X=x; }
public int getY() { return Y; }
public void setY(int y) { Y=y; }

public void draw(Graphics g) {
    g.setColor(FillColor);
    switch (Type) {
    case 0:
        //g.fillOval(X, Y, Width, Height);
        //break;
        g.fillOval(X, Y, d, d);
        g.fillOval(X+d,Y, d, d);
        g.fillOval(X+d,Y-d, d, d);
        g.fillOval(X+d+d,Y-d, d, d);
        break;
    case 1:
        g.fillRect(X, Y, Width, Height);
        //g.fillOval(X, Y, d, d);
        //g.fillOval(X+d,Y, d, d);
        //g.fillOval(X+d,Y+d, d, d);
        //g.fillOval(X+d+d,Y+d, d, d);
        break;
    case 2:
        g.fillOval(X, Y, d, d);
        g.fillOval(X+d,Y, d, d);
        g.fillOval(X,Y-d, d, d);
        g.fillOval(X+d,Y-d, d, d);
        break;
    case 3:
        g.fillOval(X, Y, d, d);
        g.fillOval(X,Y+d, d, d);
        g.fillOval(X,Y+d+d, d, d);
        g.fillOval(X,Y-d, d, d);
        break;
    case 4:
        g.fillOval(X, Y, d, d);
        g.fillOval(X,Y+d, d, d);
        g.fillOval(X,Y-d, d, d);
        g.fillOval(X+d,Y-d, d, d);
        break;
    case 5:
        g.fillOval(X, Y, d, d);
        g.fillOval(X,Y+d, d, d);
        g.fillOval(X,Y-d, d, d);
        g.fillOval(X-d,Y-d, d, d);
        break;
    case 6:
        g.fillOval(X, Y, d, d);
        g.fillOval(X+d,Y, d, d);
        g.fillOval(X,Y-d, d, d);
        g.fillOval(X-d,Y, d, d);
        break;
        }
    }

public boolean containPoint(int x, int y) {
        switch (Type) {
        case 0:
            {
                double a=Width/2.0;
                double b=Height/2.0;
                double xc=X+a;
                double yc=Y+b;
                System.out.println(a);
                System.out.println(b);
                System.out.println(xc);
                System.out.println(yc);
                System.out.println(((x-xc)*(x-xc)/(a*a)+(y-yc)*(y-yc)/(b*b)<=1.0));
                return ((x-xc)*(x-xc)/(a*a)+(y-yc)*(y-yc)/(b*b)<=1.0);

            }
        case 1:
            return (x>=X && y>=Y && x<X+Width && y<Y+Height);

        }

        return false;
    }

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {
              initialClick = evt.getPoint();
        }





         private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {

            int thisX = jLabel1.getLocation().x;
            int thisY = jLabel1.getLocation().y;

            // Determine how much the mouse moved since the initial click
            int xMoved = (thisX + evt.getX()) - (thisX + initialClick.x);
            int yMoved = (thisY + evt.getY()) - (thisY + initialClick.y);

            // Move picture to this position
            int X = thisX + xMoved;
            int Y = thisY + yMoved;

            jLabel1.setLocation(X, Y);
            jLabel1.repaint();


        }           



private int Type;
private int X;
private int Y;
private int Width;
private int Height;
private Color FillColor;
private int d;
}
