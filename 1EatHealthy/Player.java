

public class Player
{

private double x;
private double y;
private BufferedImage player;

public Player(double x, double y, Game game)
{
this.x=x;
this.y=y;

}

public void tick()
{

}

public void render(Graphics g)
{
g.drawImage(player, (int)x,(int)y,null);
}

}
