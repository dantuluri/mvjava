//imageName = "jrJava/gameProject/lebronBackground.png.jpg";
//imageName2 = "jrJava/gameProject/lineBackground.jpg";
//import statements
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Image;
import java.awt.Font;
import java.io.File;
import java.io.IOException;
import java.awt.event.MouseMotionListener;
import javax.imageio.ImageIO;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Graphics;
//coordinator class extends JFrame
public class Coordinator extends JFrame
{
    // declare field variables
    public CardLayout cardLayout = new CardLayout();; //create cardLayout
    private int width=1400, height=800;
    private int squareWidth =75, squareHeight =75, squareX, squareY;
    private Image image, image2,image3 ;                //image variables
    private String imageName, imageName2, imageName3;
    private boolean gameOver;
    public boolean startPressed;
    public boolean directionPressed;
    public boolean backPressed, backPressed2;
    private StartPanel sp;
    private DirectionPanel dp;
    private GamePanel gp;
    public JPanel contentPanel = new JPanel();
    private JButton button1, button2, backButton1,backButton2 ;
    public Coordinator()
    {
        super("Game");        //set name of game/panel
        startPressed = false;
        directionPressed = false;
        backPressed=false;
        backPressed2=false;
        imageName = "jrJava/gameProject/lebronBackground.png.jpg";
        imageName2 = "jrJava/gameProject/lineBackground.jpg";
        imageName3 = "jrJava/gameProject/fireCircle.jpg";
        sp = new StartPanel();
        dp = new DirectionPanel();
        gp = new GamePanel();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(0,0);
        getMyImage();//call image method
        setResizable(true);
        contentPanel.setLayout(cardLayout);
        setSize(width,height);
        setVisible(true); //set visibility
        //add panels to contentPanel
        contentPanel.add(sp, "StartPanel");
        contentPanel.add(dp, "DirectionPanel");
        contentPanel.add(gp, "GamePanel");
        this.setContentPane(contentPanel);    //set content as contentPanel
        //getMyImage();//call image method
        cardLayout.show(contentPanel, "StartPanel"); //show startPanel in container contentPanel
    }
    public static void main(String[] args) //main()
    {
        //declare/instantiate classes
        Coordinator coordinator = new Coordinator();
        //square = new Square(400, 50, 100, Color.orange);
    }
    public void checkIfPressed()
    {
        //check is start button is pressed
        if(startPressed)
        {
            cardLayout.show(contentPanel, "GamePanel");    //start game if start is pressed
        }
        if(directionPressed)
        {
            cardLayout.show(contentPanel, "DirectionPanel");
        }
        if(backPressed ||backPressed2)
        {
            cardLayout.show(contentPanel, "StartPanel");
        }
    }
    public void getMyImage()
    {
        try//read file
        {
            image  = ImageIO.read(new File(imageName));
            image2 = ImageIO.read(new File(imageName2));
            image3 = ImageIO.read(new File(imageName3));
        }
        catch(IOException e)
        {
            System.err.println("\n\n\n" + imageName2+"can't be found. \n\n\n"); //print out which file that can't be found
            e.printStackTrace();
        }
    }
    class StartPanel extends JPanel implements ActionListener//classheader extends JPanel, implements ActionListener
    {
        public StartPanel()
        {
            setBackground(Color.BLACK);
            //set layout
            setLayout(null);
            //create button1, set its size and location
            button1 = new JButton("Start Game");
            button1.setSize(200,40);
            button1.setLocation(600,350);
            //create button1, set its size and location
            button2 = new JButton(" How To Play");
            button2.setSize(200,40);
            button2.setLocation(600, 400);
            //add actionListener to button
            button1.addActionListener(this);
            button2.addActionListener(this);
            button1.setBackground(Color.RED);
            button2.setBackground(Color.RED);
            //add button to panel
            add(button1);
            add(button2);
        }
        //action event method
        public void actionPerformed(ActionEvent evt)
        {
            String label = evt.getActionCommand();
            //check if start button is pressed
            if(startPressed==false && label=="Start Game")
            {
                startPressed=true;
                checkIfPressed();
                startPressed=false;
            }
            //check if direction button is pressed
            if(directionPressed==false && label==" How To Play")
            {
                directionPressed = true;
                checkIfPressed();
                directionPressed=false;
            }
        }
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);        // draw background
            setBackground(Color.BLACK);
            g.drawImage(image, 0,0, 1400,800,null);        //draw image
            Font bigBoldFont = new Font("SansSerif", Font.BOLD, 100);
            g.setFont(bigBoldFont);
            g.setColor(Color.WHITE);
            g.drawString("Cube Walk", 400, 200);
        }
    }
    class DirectionPanel extends JPanel implements ActionListener
    {
        private Font font;
        public DirectionPanel()
        {
            setLayout(null);
            backButton1 = new JButton("BACK");
            backButton1.setSize(100,40);
            backButton1.setLocation(10,10);
            backButton1.addActionListener(this);
            add(backButton1);
        }
        public void actionPerformed(ActionEvent evt)
        {
            String label1 = evt.getActionCommand();
            if(backPressed==false && label1=="BACK")
            {
                System.out.println("hi");
                backPressed=true;
                checkIfPressed();
                backPressed=false;
                //cards.next(this);
                //PanelC panel = new PanelC();
            }
        }
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            setBackground(Color.GREEN);
            font = g.getFont().deriveFont( 20.0f );
            g.setFont( font );
            g.drawString("How to play: ", 270, 25);
            g.drawString("1. Right arrow key or drag square to the right is to move right", 400, 25);
            g.drawString("2. Left arrow key or drag square to the left is to move left", 400, 48);
            g.drawString("Objective: ", 290, 150);
            g.drawString("To be able to learn how to solve system of equations ", 400, 150);
            g.drawString("using the different methods that are taught.", 400, 180);
            g.drawString("There are 2 important ways to solving system of equations.", 350, 250);
            g.drawString("One of them is elimination, which will be shown in example 1 and 2", 350, 280);
            g.drawString("and substitution, which will be shown in example 3 and 4.", 350, 310);
            g.drawString("|", 310, 400);
            g.drawString("|", 310, 440);
            g.drawString("|", 310, 480);
            g.drawString("|", 310, 520);
            g.drawString("|", 310, 560);
            g.drawString("|", 310, 600);
            g.drawString("|", 310, 640);
            g.drawString("|", 310, 680);
            g.drawString("|", 310, 720);
            g.drawString("|", 310, 760);
            g.drawString("|", 310, 800);
            g.drawString("|", 660, 400);
            g.drawString("|", 660, 440);
            g.drawString("|", 660, 480);
            g.drawString("|", 660, 520);
            g.drawString("|", 660, 560);
            g.drawString("|", 660, 600);
            g.drawString("|", 660, 640);
            g.drawString("|", 660, 680);
            g.drawString("|", 660, 720);
            g.drawString("|", 660, 760);
            g.drawString("|", 660, 800);
            g.drawString("|", 1010, 400);
            g.drawString("|", 1010, 440);
            g.drawString("|", 1010, 480);
            g.drawString("|", 1010, 520);
            g.drawString("|", 1010, 560);
            g.drawString("|", 1010, 600);
            g.drawString("|", 1010, 640);
            g.drawString("|", 1010, 680);
            g.drawString("|", 1010, 720);
            g.drawString("|", 1010, 760);
            g.drawString("|", 1010, 800);
            g.drawString("x+y=4", 130, 400);
            g.drawString("x- y=2", 130, 420);
            g.drawLine(110, 430, 210, 430);
            g.drawString("+", 110, 420);
            g.drawString("2x  =6", 130, 450);
            g.drawString("x=3", 140, 480);
            g.drawString("3+y=4  or  3-y=2", 100, 540);
            g.drawString("   y=1  or -y=-1", 100, 570);
            g.drawString("               y=1", 100, 600);
            g.drawRect(130, 460, 50, 30);
            g.drawRect(110, 550, 50, 30);
            g.drawString("2x+5y=3", 470, 400);
            g.drawString("x- 2y=6", 470, 420);
            //g.drawLine(460, 430, 560, 430);
            g.drawString("2(2x+5y)=(3)2", 460, 450);
            g.drawString("5(x- 2y)=(6)5", 460, 470);
            //g.drawLine(460, 430, 560, 430);
            g.drawString("4x+10y=6", 460, 500);
            g.drawString("5x-10y=30", 460, 520);
            g.drawString("+", 440, 520);
            g.drawLine(440, 530, 600, 530);
            g.drawString("9x    =36", 460, 550);
            g.drawString("x=4", 480, 575);
            g.drawString("4-2y=6", 460, 600);
            g.drawString("-2y=2", 460, 625);
            g.drawString("y=-1", 470, 650);
            g.drawRect(470, 557, 60, 20);
            g.drawRect(460, 632, 60, 25);
            g.drawString("x+y=4", 700, 400);
            g.drawString("x- y=2", 700, 420);
            g.drawString("y=4-x", 700, 450);
            g.drawString("x- y=4", 700, 470);
            g.drawString("x-(4-x)=2", 700, 500);
            g.drawString("x-4+x=2", 700, 530);
            g.drawString("2x-4=2", 700, 560);
            g.drawString("2x=6", 700, 590);
            g.drawString("x=3", 705, 620);
            g.drawRect(695, 602, 60, 20);
            g.drawString("3+y=4", 875, 400);
            g.drawString("y=1", 880, 430);
            g.drawRect(870, 412, 60, 25);
            g.drawString("2x+5y=3", 1100, 400);
            g.drawString("x- 2y=6", 1100, 420);
            g.drawString("2x+5y=3", 1100, 450);
            g.drawString("x=6+2y", 1100, 470);
            g.drawString("2(6+2y)+5y=3", 1100, 500);
            g.drawString("12+4y+5y=3", 1100, 530);
            g.drawString("9y=-9", 1100, 560);
            g.drawString("y=-1", 1100, 590);
            g.drawRect(1090, 572, 60, 25);
            g.drawString("2x+5(-1)=3", 1100, 620);
            g.drawString("2x-5=3", 1100, 650);
            g.drawString("2x=8", 1100, 670);
            g.drawString("x=4", 1100, 690);
            g.drawRect(1090, 672, 60, 20);
        }
    }
    class GamePanel extends JPanel implements ActionListener, MouseListener, KeyListener, MouseMotionListener
    {
        private boolean leftPressed;
        private boolean rightPressed;
        private boolean mousePressed;
        private boolean dragged;
        private int y=100;
        public GamePanel()
        {
            //set layout
            squareX = 700;
            squareY = 570;
            setLayout(null);
            leftPressed=false;
            rightPressed=false;
            mousePressed=false;
            dragged=false;
            //getContentPane().add(square);
            //create back button
            backButton2 = new JButton("BACK");
            backButton2.setSize(100,40);
            backButton2.setLocation(10,10);
            add(backButton2);
            addMouseListener(this);
            backButton2.addActionListener(this);
            addKeyListener(this);
            addMouseMotionListener(this);
        }
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            setBackground(Color.BLACK);
            g.drawImage(image2, 0,0, 1400,750, null);
            g.setColor(Color.BLACK);
            g.fillRect(0,0,1400,640);
            for(int x=-40;  x<1400;x+=350) // repeats design horizontally
            {
                g.drawImage(image3, x,y, 400,200, null);
            }
            g.setColor(Color.RED);
            // g.fillRect(700,400, 200,200);
            // g.fillRect(squareX,squareY, squareWidth, squareHeight);
            if(leftPressed==false && rightPressed==false && dragged==false && mousePressed==false)
            {
                Font bigBoldFont = new Font("SansSerif", Font.BOLD, 80);
                g.setFont(bigBoldFont);
                g.setColor(Color.WHITE);
                g.drawString("Click to begin ", 400, 400);
                g.setColor(Color.RED);
                g.fillRect(squareX,squareY, squareWidth, squareHeight);
            }
            if(leftPressed==false && rightPressed==false && dragged==false&&mousePressed)
            {
                g.setColor(Color.RED);
                g.fillRect(squareX,squareY, squareWidth, squareHeight);
                mousePressed=false;
            }
            if(leftPressed)
            {
                g.setColor(Color.RED);
                //g.fillRect(700,570, 75,75);
                g.fillRect(squareX,squareY, squareWidth, squareHeight);
                leftPressed=false;
            }
            if(rightPressed)
            {
                g.setColor(Color.RED);
                g.fillRect(squareX,squareY, squareWidth, squareHeight);
                rightPressed=false;
            }
            if(dragged)
            {
                g.setColor(Color.RED);
                g.fillRect(squareX,squareY, squareWidth, squareHeight);
                dragged=false;
            }
        }
        //key and mouse methods
        public void keyPressed(KeyEvent e)
        {
            System.out.println("Hello");
            int keyCode = e.getKeyCode();
            //check if left key is pressed
            if(keyCode==KeyEvent.VK_LEFT&&leftPressed==false)
            {
                leftPressed=true;
                System.out.println("Left");
                squareX = squareX-10;
                repaint();
            }
            //check if right key is pressed
            else if(keyCode==KeyEvent.VK_RIGHT&&rightPressed==false)
            {
                rightPressed=true;
                System.out.println("Right");
                squareX = squareX+10;
                repaint();
            }
            if(squareX<0)
            {
                squareX = 0;
            }
            else if(squareX>1280)
            {
                squareX = 1280;
                repaint();
            }
            repaint();
        }
        public void keyTyped(KeyEvent e){}
        public void keyReleased(KeyEvent e){}
        public void mouseDragged(MouseEvent e)
        {
            int mouseX = e.getX();
            squareX = mouseX - squareWidth/2;
            dragged=true;
            repaint();
            if(squareX<0)
            {
                squareX = 0;
            }
            else if(squareX>1280)
            {
                squareX = 1280;
                repaint();
            }
            /*
            if(squareX<wall.getXLeft()){
                x = wall.getXLeft();
            }
            else if(x>wall.getXRight()- width){
                x = wall.getXRight() - width;
            }
             */
        }
        public void mouseMoved(MouseEvent e){}
        public void mouseClicked(MouseEvent e)
        {
            mousePressed=true;
        }
        public void mousePressed(MouseEvent e) {
            requestFocus();
            mousePressed=true;
            repaint();

        }
        public void mouseReleased(MouseEvent e) {}
        public void mouseEntered(MouseEvent e) {}
        public void mouseExited(MouseEvent e) {}

        public void actionPerformed(ActionEvent evt)
        {
            String label1 = evt.getActionCommand();
            if(backPressed2 == false && label1=="BACK")
            {
                System.out.println("hi");
                backPressed2=true;
                checkIfPressed();
                backPressed2=false;
                //cards.next(this);
                //PanelC panel = new PanelC();
            }

        }
    }
}
