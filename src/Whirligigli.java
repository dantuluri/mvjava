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
