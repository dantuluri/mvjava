class largeIntestinePanel extends JPanel implements MouseListener, KeyListener//largeIntestine panel that user moves food around to get digested. Uses key listner and bufferedimage
//   //also tied in with largeIntestineQuiz to ask questions regarding the class
{
  // private BufferedImage donutm;
  // private BufferedImage sodam;
  // private BufferedImage oatmealm;
  // private BufferedImage avocadom;

  public String keychange;


  public String whatKey;

  public int oatmealwidth;
  public int oatmealheight;
  public int sodawidth;
  public int sodaheight;
  public int donutheight;
  public int donutwidth;
  public int avocadowidth;
  public int avocadoheight;


  public String slow;

  public int foodX;
  public int foodY;

  public Image largeIntestineBackground;
  private boolean shiftkey;

  public boolean wout;

  public int addy;
  public int subby;

  public boolean goAway;

  public Image donut;
  public Image oatmeal;
  public Image soda;
  public Image avocado;

  public String largeIntestineBackgroundName;
  public String donutName;//file name
  public String avocadoName;//file name
  public String sodaName;//file name
  public String oatmealName;//file name


  public int donutX, donutY, oatmealX, oatmealY, sodaX, sodaY, avocadoX, avocadoY;


  public largeIntestinePanel()
  {


    setBackground(Color.RED);//set background to yello
    largeIntestineBackgroundName= ("largeIntestine.png");
    donutName= ("donut.png");//file name
    avocadoName= ("avocado.png");//file name
    sodaName= ("soda.png");//file name
    oatmealName= ("oatmeal.png");//file name
    donutX = 20;//donut-(600 to 750 ,75 to 225) ORIGINAL POS
    donutY = 400;////donut-(600 to 750 ,75 to 225) ORIGINAL POS
    oatmealX = 20;////oatmeal-(640 to 790 ,255 to 405) ORIGINAL POS
    oatmealY = 400;//oatmeal-(640 to 790 ,255 to 405) ORIGINAL POS
    sodaX = 20;//soda-(640 to 790 ,440 to 590) ORIGINAL POS
    sodaY = 400;//donut-(soda-(640 to 790 ,440 to 590) ORIGINAL POS
    avocadoX = 20;//avocado-(640 to 790 ,620 to 770) ORIGINAL POS
    avocadoY = 400;//avocado-(640 to 790 ,620 to 770) ORIGINAL POS

    whatKey="";
    goAway=false;
    addy=0;
    subby=0;

    //             BufferedImage off_Image =
    //   new BufferedImage(100, 50,
    //                     BufferedImage.TYPE_INT_ARGB);
    //
    // Graphics2D g2 = off_Image.createGraphics();

    setLayout(flow);//sets the layout to flow
    //Card Layout made( needs more pseudocode)
    setLocation(0,0);//sets panel origin

    System.out.println("largeIntestinePanel reached");
    addMouseListener(this);
    addKeyListener(this);//adds KeyListener
    run();
  }//end of largeIntestineconstructor

  public void run()
  {
    getMyImage();
    velocity(false,false);
  }


  public void getMyImage()//gets image for use
  {
    try
    {
      // Image i = javax.swing.ImageIcon("myimage.gif").getImage();

      largeIntestineBackground=ImageIO.read(new File(largeIntestineBackgroundName));
      System.out.println("largeIntestineBackground");
      System.out.println("i tried to get metMyImageio suryas");


      // File oatmeal = new File(oatmealName);
      // BufferedImage oatmealm = ImageIO.read(oatmeal);
      oatmeal = ImageIO.read(new File(oatmealName));
      System.out.println("buffered oatmealsm");
      // oatmealwidth = oatmealm.getWidth();
      // oatmealheight = oatmealm.getHeight();


      // File soda = new File(sodaName);
      // BufferedImage sodam = ImageIO.read(soda);
      soda = ImageIO.read(new File(sodaName));
      System.out.println("buffered sodams");
      // sodawidth = sodam.getWidth();
      // sodaheight = sodam.getHeight();


      // File avocado = new File(avocadoName);
      // BufferedImage avocadom = ImageIO.read(avocado);
      avocado = ImageIO.read(new File(avocadoName));
      System.out.println("buffered avocadoms");
      // avocadowidth = avocadom.getWidth();
      // avocadoheight = avocadom.getHeight();




      // File donut = new File(donutName);
      // BufferedImage donutm = ImageIO.read(donut);
      // BufferedImage donutm = ImageIO.read(getClass().getResource("donut.png"));
      donut = ImageIO.read(new File(donutName));
      System.out.println("buffered donutm");
      // donutwidth = donutm.getWidth();
      // donutheight = donutm.getHeight();




    }
    catch(IOException e)
    {
      System.err.println("\n\n"+largeIntestineBackgroundName+"can't be found. \n\n");
      System.out.println("catched largeIntestineBackground");
      System.err.println("\n\n"+donutName+"can't be found. \n\n");
      System.out.println("catched donut");
      System.err.println("\n\n"+oatmealName+"can't be found. \n\n");
      System.out.println("catched oatmeal");
      System.err.println("\n\n"+sodaName+"can't be found. \n\n");
      System.out.println("catched soda");
      System.err.println("\n\n"+avocadoName+"can't be found. \n\n");
      System.out.println("catched avocado");

      e.printStackTrace();
    }
  }//end of get my image

  public void mousePressed(MouseEvent e)		//every time user clicks method is run
  {
    requestFocus();//requests focus for mouse
    System.out.println("start click");
    repaint();//calls paintcomponent
  }
  public void mouseClicked(MouseEvent e){} //mouse is clicked
  public void mouseReleased(MouseEvent e){} //mouse is released
  public void mouseEntered(MouseEvent e){} //mouse is entered
  public void mouseExited(MouseEvent e){} //mouse exits


  public void keyPressed(KeyEvent e)
  {
    keychange=""+e;

    System.out.println("keyP");
    requestFocus();
    int upcode = e.getKeyCode();//looks for shiftkey
    if(upcode==KeyEvent.VK_W)//runs if shiftkey is pressed
    {
      whatKey="W";
      System.out.println("whatKey W in keyPressed");
      velocity(true,false);

    }
    int downcode = e.getKeyCode();
    if(downcode==KeyEvent.VK_S)
    {
      whatKey="S";
      System.out.println("whatKey S in keyPressed");
      velocity(true,false);

    }
    int leftcode = e.getKeyCode();
    if(leftcode==KeyEvent.VK_A)
    {
      whatKey="A";
      System.out.println("whatKey A in keyPressed");
      velocity(true,false);

    }
    int rightcode = e.getKeyCode();
    if(rightcode==KeyEvent.VK_D)
    {

      whatKey="D";
      System.out.println("whatKey D in keyPressed");
      velocity(true,false);

    }
  }//end of pressed


  public void wup(int addy)
  {
    System.out.println("wup, addy: "+addy);
    switch(food) {
      case "oatmeal":
      System.out.println("\n\noriginal oatmealY: "+oatmealY);
      oatmealY = oatmealY-addy;//oatmeal-(640 to 790 ,255 to 405) ORIGINAL POS
      repaint();
      System.out.println("new OatMeal "+oatmealY);
      if(addy==32)
      {
        for(int i=0; i<10; i++)
        {
          oatmealY = oatmealY-32;
          if(keychange.substring(24,28).equals("KEY_R")) break;
          System.out.println("this is going down");
          System.out.println(keychange.substring(24,28).equals("KEY_R"));
          if(oatmealY<1)
          {
            oatmealY=0;
          }
          if(oatmealY>799)
          {
            oatmealY=799;
          }
          System.out.println("32 oatmealY: "+oatmealY);
        }
        System.out.println(keychange.substring(24,28).equals("KEY_R"));

      }
      repaint();
      break;
      case "soda":
      sodaY = sodaY-addy;//donut-(soda-(640 to 790 ,440 to 590) ORIGINAL POS
      do
      {
        sodaY = sodaY-32;
        repaint();
      }
      while(addy>31 && addy<33);

      repaint();
      break;
      case "avocado":
      avocadoY = avocadoY-addy;//avocado-(640 to 790 ,620 to 770) ORIGINAL POS
      do
      {
        avocadoY = avocadoY-32;
        repaint();
      }
      while(addy>31 && addy<33);

      repaint();
      break;
      case "donut":
      donutY = donutY-addy;////donut-(600 to 750 ,75 to 225) ORIGINAL POS
      do
      {
        donutY = donutY-32;
        repaint();
      }
      while(addy>31 && addy<33);

      repaint();
      break;
    }
  }
  ////////////////////////////////////////////////////////

  public void aup(int addy)
  {
    System.out.println("AUP,addy: "+addy);
    switch(food) {
      case "oatmeal":
      oatmealX = oatmealX-addy;//oatmeal-(640 to 790 ,255 to 405) ORIGINAL POS
      do
      {
        oatmealX = oatmealX-32;
        System.out.println("aup oatmeal: "+oatmealX);
        repaint();
      }
      while(addy>31 && addy<33);

      repaint();
      break;
      case "soda":
      sodaX = sodaX-addy;//donut-(soda-(640 to 790 ,440 to 590) ORIGINAL POS
      do
      {
        sodaX = sodaX-32;
        repaint();
      }
      while(addy>31 && addy<33);

      repaint();
      break;
      case "avocado":
      avocadoX = avocadoX-addy;//avocado-(640 to 790 ,620 to 770) ORIGINAL POS
      do
      {
        avocadoX = avocadoX-32;
        repaint();
      }
      while(addy>31 && addy<33);

      repaint();
      break;
      case "donut":
      donutX = donutX-addy;////donut-(600 to 750 ,75 to 225) ORIGINAL POS
      do
      {
        donutX = donutX-32;
        repaint();
      }
      while(addy>31 && addy<33);

      repaint();
      break;
    }
  }//end of aup
  ////////////////////////////////////////////////////////
  public void sup(int addy)
  {
    System.out.println("S");
    switch(food) {
      case "oatmeal":
      oatmealY = oatmealY+addy;//oatmeal-(640 to 790 ,255 to 405) ORIGINAL POS
      System.out.println("sup oatmeal: "+oatmealY);
      do
      {
        oatmealY = oatmealY+32;
        repaint();
      }
      while(addy>31 && addy<33);

      repaint();
      break;
      case "soda":
      sodaY = sodaY+addy;//donut-(soda-(640 to 790 ,440 to 590) ORIGINAL POS
      do
      {
        sodaY = sodaY+32;
        repaint();
      }
      while(addy>31 && addy<33);

      repaint();
      break;
      case "avocado":
      avocadoY = avocadoY+addy;//avocado-(640 to 790 ,620 to 770) ORIGINAL POS
      do
      {
        avocadoY = avocadoY+32;
        repaint();
      }
      while(addy>31 && addy<33);

      repaint();
      break;
      case "donut":
      donutY = donutY+addy;////donut-(600 to 750 ,75 to 225) ORIGINAL POS
      do
      {
        donutY = donutY+32;
        repaint();
      }
      while(addy>31 && addy<33);

      repaint();
      break;
    }
  }
  /////////////////////////////////////////////////////
  public void dup(int addy)
  {
    System.out.println("D");
    if(food.equals("oatmeal"))
    {
      oatmealX = oatmealX+addy;//oatmeal-(640 to 790 ,255 to 405) ORIGINAL POS
      System.out.println("dup oatmeal: "+oatmealX);
      do
      {
        oatmealX = oatmealX+32;
        repaint();
      }
      while(addy>31 && addy<33);

      repaint();

    }
    if(food.equals("soda"))
    {
      sodaX = sodaX+addy;//donut-(soda-(640 to 790 ,440 to 590) ORIGINAL POS
      do
      {
        sodaX = sodaX+32;
        repaint();
      }
      while(addy>31 && addy<33);

      repaint();

    }
    if(food.equals("avocado"))
    {
      avocadoX = avocadoX+addy;//avocado-(640 to 790 ,620 to 770) ORIGINAL POS
      do
      {
        avocadoX = avocadoX+32;
        repaint();
      }
      while(addy>31 && addy<33);

      repaint();

    }
    if(food.equals("donut"))
    {

      donutX = donutX+addy;////donut-(600 to 750 ,75 to 225) ORIGINAL POS
      do
      {
        donutX = donutX+32;
        repaint();
      }
      while(addy>31 && addy<33);

      repaint();
    }
  }

  public void wdow(int subby)
  {
    System.out.println("WSlow");
    if(food.equals("oatmeal"))
    {

      oatmealY = oatmealY-subby;//oatmeal-(640 to 790 ,255 to 405) ORIGINAL POS
      do
      {
        oatmealY = oatmealY-32;
        System.out.println("wdow oatmeal: "+oatmealY);

        repaint();
      }
      while(addy>31 && addy<33);

      repaint();

    }
    if(food.equals("soda"))
    {

      sodaY = sodaY-subby;//donut-(soda-(640 to 790 ,440 to 590) ORIGINAL POS
      do
      {
        sodaY = sodaY-32;
        repaint();
      }
      while(addy>31 && addy<33);

      repaint();

    }
    if(food.equals("avocado"))
    {

      avocadoY = avocadoY-subby;//avocado-(640 to 790 ,620 to 770) ORIGINAL POS
      do
      {
        avocadoY = avocadoY-32;
        repaint();
      }
      while(addy>31 && addy<33);

      repaint();

    }
    if(food.equals("donut"))
    {
      donutY = donutY-subby;////donut-(600 to 750 ,75 to 225) ORIGINAL POS
      do
      {
        donutY = donutY-32;
        repaint();
      }
      while(addy>31 && addy<33);

      repaint();
    }
  }
  /////////////////////////////////////////////////////////////////down A
  public void adow(int subby)
  {
    System.out.println("A");
    if(food.equals("oatmeal"))
    {
      oatmealX = oatmealX-subby;//oatmeal-(640 to 790 ,255 to 405) ORIGINAL POS
      System.out.println("adow oatmeal: "+oatmealX);

      do
      {
        oatmealX = oatmealX-32;
        repaint();
      }
      while(addy>31 && addy<33);

      repaint();

    }
    if(food.equals("soda"))
    {

      sodaX = sodaX-subby;//donut-(soda-(640 to 790 ,440 to 590) ORIGINAL POS
      do
      {
        sodaX = sodaX-32;
        repaint();
      }
      while(addy>31 && addy<33);

      repaint();

    }
    if(food.equals("avocado"))
    {

      avocadoX = avocadoX-subby;//avocado-(640 to 790 ,620 to 770) ORIGINAL POS
      do
      {
        avocadoX = avocadoX-32;
        repaint();
      }
      while(addy>31 && addy<33);

      repaint();

    }
    if(food.equals("donut"))
    {

      donutX = donutX-subby;////donut-(600 to 750 ,75 to 225) ORIGINAL POS it is subtracted since although 32 pixels its going down
      do
      {
        donutX = donutX-32;
        repaint();
      }
      while(addy>31 && addy<33);

      repaint();
    }

  }
  //////////////////////////////////////////////////////////////////////////////sdown
  public void sdow(int subby)
  {
    System.out.println("S");
    if(food.equals("oatmeal"))
    {

      oatmealY = oatmealY+subby;//oatmeal-(640 to 790 ,255 to 405) ORIGINAL POS
      System.out.println("sdow oatmeal: "+oatmealY);
      do
      {
        oatmealY = oatmealY+32;
        repaint();
      }
      while(addy>31 && addy<33);

      repaint();

    }
    if(food.equals("soda"))
    {

      sodaY = sodaY+subby;//donut-(soda-(640 to 790 ,440 to 590) ORIGINAL POS
      do
      {
        sodaY = sodaY+32;
        repaint();
      }
      while(addy>31 && addy<33);

      repaint();


    }
    if(food.equals("avocado"))
    {

      avocadoY = avocadoY+subby;//avocado-(640 to 790 ,620 to 770) ORIGINAL POS
      do
      {
        avocadoY = avocadoY+32;
        repaint();
      }
      while(addy>31 && addy<33);

      repaint();

    }
    if(food.equals("donut"))
    {

      donutY = donutY+subby;////donut-(600 to 750 ,75 to 225) ORIGINAL POS
      do
      {
        donutY = donutY+32;
        repaint();
      }
      while(addy>31 && addy<33);

      repaint();
    }

  }
  //////////////////////////////////////////////////////////////////////////////ddown
  public void ddow(int subby)
  {
    System.out.println("D");
    if(food.equals("oatmeal"))
    {

      oatmealX = oatmealX+subby;//oatmeal-(640 to 790 ,255 to 405) ORIGINAL POS
      System.out.println("dup oatmeal: "+oatmealX);
      do
      {
        oatmealX = oatmealX+32;
        repaint();
      }
      while(addy>31 && addy<33);

      repaint();

    }
    if(food.equals("soda"))
    {


      sodaX = sodaX+subby;//donut-(soda-(640 to 790 ,440 to 590) ORIGINAL POS
      do
      {
        sodaX = sodaX+32;
        repaint();
      }
      while(addy>31 && addy<33);

      repaint();

    }
    if(food.equals("avocado"))
    {

      avocadoX = avocadoX+subby;//avocado-(640 to 790 ,620 to 770) ORIGINAL POS
      do
      {
        avocadoX = avocadoX+32;
        repaint();
      }
      while(addy>31 && addy<33);

      repaint();

    }
    if(food.equals("donut"))
    {


      donutX = donutX+subby;////donut-(600 to 750 ,75 to 225) ORIGINAL POS
      do
      {
        donutX = donutX+32;
        repaint();
      }
      while(addy>31 && addy<33);

      repaint();
    }
  }
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  public void keyTyped(KeyEvent e){}
    public void keyReleased(KeyEvent e)
    {
      keychange=""+e;
      int dupcode = e.getKeyCode();//looks for shiftkey
      if(dupcode==KeyEvent.VK_W)//runs if shiftkey is pressed
      {
        System.out.println("W HAS BEEN RELEASED KEY");
        whatKey="W";
        velocity(false,true);

      }
      int ddowncode = e.getKeyCode();
      if(ddowncode==KeyEvent.VK_S)
      {
        whatKey="S";
        velocity(false,true);

      }
      int dleftcode = e.getKeyCode();
      if(dleftcode==KeyEvent.VK_A)
      {
        whatKey="A";
        velocity(false,true);

      }
      int drightcode = e.getKeyCode();
      if(drightcode==KeyEvent.VK_D)
      {
        whatKey="D";
        velocity(false,true);

      }
    }//end of released

    public void velocity(boolean pressed, boolean released)
    {
      // int ui=0;
      // int di=0;
      // int i = 0;
      //array generation

      /////////////??/////START
      System.out.println("speedUp");
      int speedUp[] = new int [6];
      for (int a = 0; a < speedUp.length; a++)
      {
        speedUp[a] = (int)(Math.pow(2,a));
        System.out.println(Arrays.toString(speedUp));
      }
      System.out.println("speedDOwn");
      int speedDown[] = new int[7];
      for(int b = 5; b>-1; b--)
      {
        speedDown[b] = (int)(Math.pow(2,(5-b)));
        System.out.println(Arrays.toString(speedDown));
      }
      //array generation done
      //1,2,4,8,16,32
      do
      {
        System.out.println("WUP");
        for(int i=0; i<6; i++)
        {
          try
          {
            if(released) break;
            wup(speedUp[i]);
            Thread.sleep(100);
          }
          catch(InterruptedException ex)
          {
            System.out.println("catch some fish!");
          }
        }
        wup(32);
      }
      while(pressed && whatKey.equals("W"));

      do
      {
        System.out.println("AUP");
        for(int i=0; i<6; i++)
        {
          try
          {
            if(released) break;
            aup(speedUp[i]);
            Thread.sleep(100);
          }
          catch(InterruptedException ex)
          {
            System.out.println("catch some fish!");
          }
        }
        aup(32);
      }
      while(pressed && whatKey.equals("A"));

      do
      {
        System.out.println("SUP");
        for(int i=0; i<6; i++)
        {
          try
          {
            if(released) break;
            sup(speedUp[i]);
            Thread.sleep(100);
          }
          catch(InterruptedException ex)
          {
            System.out.println("catch some fish!");
          }
        }
        sup(32);
      }
      while(pressed && whatKey.equals("S"));

      do
      {
        System.out.println("DUP");
        for(int i=0; i<6; i++)
        {
          try
          {
            if(released);
            dup(speedUp[i]);
            Thread.sleep(100);
          }
          catch(InterruptedException ex)
          {
            System.out.println("catch some fish!");
          }
        }
        dup(32);
      }
      while(pressed && whatKey.equals("D"));
////lifted////presslifteded/pressed/pressed/pressed/pressed/pressed
//32,16,8,4,2,1,0
      do
      {
        System.out.println("WDOW");
        for(int i=0; i<7; i++)
        {
          try
          {
            wdow(speedDown[i]);
            Thread.sleep(50);
          }
          catch(InterruptedException ex)
          {
            System.out.println("catch some fish!");
          }
        }
        wdow(0);
      }
      while(released && whatKey.equals("W"));////////check chcekc check

      do
      {
        System.out.println("AUP");
        for(int i=0; i<7; i++)
        {
          try
          {
            adow(speedDown[i]);
            Thread.sleep(50);
          }
          catch(InterruptedException ex)
          {
            System.out.println("catch some fish!");
          }
        }
        adow(0);
      }
      while(released && whatKey.equals("A"));////////check chcekc check

      do
      {
        System.out.println("SUP");
        for(int i=0; i<7; i++)
        {
          try
          {
            sdow(speedDown[i]);
            Thread.sleep(50);
          }
          catch(InterruptedException ex)
          {
            System.out.println("catch some fish!");
          }
        }
        sdow(0);
      }
      while(released && whatKey.equals("S"));////////check chcekc check

      do
      {
        System.out.println("DUP");
        for(int i=0; i<7; i++)
        {
          try
          {
            ddow(speedDown[i]);
            Thread.sleep(50);
          }
          catch(InterruptedException ex)
          {
            System.out.println("catch some fish!");
          }
        }
        ddow(0);
      }
      while(released && whatKey.equals("D"));////////check chcekc check

}//end of velocity

public void paintComponent(Graphics g)
{
  super.paintComponent(g);
  //Graphics2D g = donutm.createGraphics();    // Get a Graphics2D object
  g.drawImage(largeIntestineBackground,0,0,800,800,this);
  // JOptionPane.showMessageDialog (null, "Instructions", "Click anywhere on the screen to being after clicking OK to this message!", JOptionPane.INFORMATION_MESSAGE);

//Click anywhere on the screen to being after clicking OK to this message!
  if(food.equals("oatmeal"))
  {
    g.drawImage(oatmeal,oatmealX,oatmealY,40,40,this);
  }
  if(food.equals("soda"))
  {

    g.drawImage(soda,sodaX,sodaY,40,40,this);
    //repaint();

  }
  if(food.equals("avocado"))
  {
    g.drawImage(avocado,avocadoX,avocadoY,40,40,this);
    //repaint();

  }
  if(food.equals("donut"))
  {
    g.drawImage(donut,donutX,donutY,40,40,this);// IF THE DONUT IS SELECTED
    //repaint();
  }

  if(oatmealY>700&&oatmealY<750&&oatmealX>600&&oatmealX<650)
  {
cards.show(pHolder, "largeIntestineQuiz");
  if(sodaY>700&&sodaY<750&&sodaX>600&&sodaX<650)
  {
cards.show(pHolder, "largeIntestineQuiz");
  }
  if(donutY>700&&donutY<750&&donutX>600&&donutX<650)
  {
    cards.show(pHolder, "largeIntestineQuiz");

  }
  if(avocadoY>700&&avocadoY<750&&avocadoX>600&&avocadoX<650)
  {
    cards.show(pHolder, "largeIntestineQuiz");

  }
  Font aldo = new Font ("Apple Casual", Font.BOLD, 8);
  g.setFont(aldo);
  g.setColor(Color.ORANGE);
  g.drawString("Press the screen once in order to move the food/drinks with the WASD controls",5,690);
  //g.dispose();

}//end of paintcomponent

public void importTextFiles()										//method for try catch blocks to find the tutorial.txt text file
    {
      File inFile = new File(inFileName);
      try
      {
        input = new Scanner(inFile);

      }
      catch (FileNotFoundException e)
      {
        System.out.println("Error. Cannot Find/Open File " + inFileName );
        System.exit(1);

      }
    }

    public void getWords()										//method from reading input from the tutorial.txt file so we c an print the stuff from the tutorial.txt file on to the JTextArea
{
while(input.hasNext())
{
line = input.nextLine();

fullTutorial = fullTutorial + "\n" + line;			//creating a string to add to the textArea
}
backgroundInfo.setText(fullTutorial);					//setting the text to what is in the tutorial.txt file
}
public void adjustmentValueChanged(AdjustmentEvent e)
{
}


}//end of largeIntestine panel


class largeIntestineQuestions extends JPanel implements ActionListener
{

private String inFileName, line, fullQuestion, fullTextFile,qNumber, choiceA, choiceB, choiceC, choiceD, fullQuestion2;
private Scanner input;
private String[]QuizQs;
private int randomQuestion,x1,x2, x3;
private boolean ca1, ca2, ca3, ca4, sp, a1select, a2select, a3select, a4select, correct, wrong;
private JButton submit, next2;
private ButtonGroup answers;
private JRadioButton a1, a2, a3, a4;
private JTextArea question, foodCountDisplay;
private Font f, smallf, mediumf;
private UnlockTraitsPanel utp;


public largeIntestineQuestions()
{

  setLayout(null);
  setBackground(mainBlue);

  question = new JTextArea();
  question.setLineWrap(true);
  question.setSize(530, 70);
  question.setLocation(30, 50);
  question.setFont(smallf);
  question.setBackground(mainBlue);

  add(question);

  foodCountDisplay = new JTextArea();
  foodCountDisplay.setLineWrap(true);
  foodCountDisplay.setSize(100, 100);
  foodCountDisplay.setLocation(500, 0);
  foodCountDisplay.setFont(smallf);
  foodCountDisplay.setOpaque(false);

  //foodCountDisplay.setBackground(mainBlue);

  add(foodCountDisplay);


  submit = new JButton("Submit");
  submit.setFont(mediumf);
  submit.setText("Submit");
  submit.setSize(100, 50);
  submit.setLocation(300,500);
  submit.addActionListener(this);

  add(submit);

  next2 = new JButton("Next");
  next2.setFont(mediumf);
  next2.setText("Next");
  next2.setSize(100, 50);
  next2.setLocation(400,500);
  next2.addActionListener(this);

  add(next2);

  answers = new ButtonGroup();			//adding a buttongroup
  a1 = new JRadioButton();
  a2 = new JRadioButton();
  a3 = new JRadioButton();
  a4 = new JRadioButton();


  answers.add(a1);						//adding buttons to a buttongroup
  answers.add(a2);
  answers.add(a3);
  answers.add(a4);

  a1.addActionListener(this);				//setting all attributes to the buttons
  a2.addActionListener(this);
  a3.addActionListener(this);
  a4.addActionListener(this);

  a1.setSize(600,40);
  a2.setSize(600,40);
  a3.setSize(600,40);
  a4.setSize(600,40);

  a1.setLocation(30, 130);
  a2.setLocation(30, 230);
  a3.setLocation(30, 330);
  a4.setLocation(30, 430);

  a1.setFont(smallf);
  a2.setFont(smallf);
  a3.setFont(smallf);
  a4.setFont(smallf);

  a1.setBackground(mainBlue);
  a2.setBackground(mainBlue);
  a3.setBackground(mainBlue);
  a4.setBackground(mainBlue);


  add(a1);
  add(a2);
  add(a3);
  add(a4);

  ca1 = false;								//initializing all booleans as false/ they are eventually true when the buttons are clicked
  ca2 = false;
  ca3 = false;
  ca4 = false;
  sp = false;
  a1select = false;
  a2select = false;
  a3select = false;
  a4select = false;

  correct = false;
  wrong = false;

  inFileName = "QuizQuestions.txt";
  line = "";
  fullQuestion = "";
  QuizQs = new String[30];


  randomQuestion = (int)((Math.random()*29)+1);		//randomizing an integer when the user clicks submit in the question
  getTextFile();
  getText();
  setVariables();
  setQuestion();
  displayRadioButtons();

}
public void getTextFile() 								//method is just for making sure that the textFile for the quiz questions can be found
{
  File inFile = new File(inFileName);
  try
  {
    input = new Scanner(inFile);

  }
  catch (FileNotFoundException e)
  {
    System.out.println("Error. Cannot Find/Open File " + inFileName );
    System.exit(1);

  }
}


public void getText()									//method from reading input from the tutorial.txt file so we c an print the stuff from the tutorial.txt file on to the JTextArea
{

  while(input.hasNext())
  {
    line = input.nextLine();

    fullTextFile = fullTextFile + "\n" + line;		//creating a string to add to the textArea
  }

  for(x1=0;x1<29;x1++)
  {

    fullQuestion = fullTextFile.substring(0, fullTextFile.indexOf("---")+3)	;		//this separates the big string that is the textFile of quiz questions into individual questions
    fullTextFile = fullTextFile.substring(fullQuestion.length()+4);					//resets the big string of the text file as the text file minus the string that was just read
    QuizQs[x1] = fullQuestion;														//adds question to a value on the array
  }
  //System.out.print(fullQuestion);					//setting the text to what is in the tutorial.txt file
}
public void setVariables()								//this method is only fully excecuted if the random number generated is the loop integer value
{														/*when the random integer value has arrived then it separates the text file into choices ABCD to
                              to set the text to the radiobuttons*/


  for (x3 = 0; x3<29 ; x3++)
  {
    fullQuestion2 = QuizQs[x3];
    if(fullQuestion2.equals(""))
    {
      fullQuestion2 = QuizQs[x3 +1];
    }
    if (x3 == randomQuestion)
    {
      qNumber = fullQuestion2.substring((fullQuestion2.indexOf(">") +1), (fullQuestion2.indexOf("<")));
      fullQuestion2 = fullQuestion2.substring(qNumber.length() + 3);


      choiceA = fullQuestion2.substring(fullQuestion2.indexOf("a)")+2, fullQuestion2.indexOf("b)"));
      fullQuestion2 = fullQuestion2.substring(choiceA.length()+2);


      choiceB = fullQuestion2.substring(fullQuestion2.indexOf("b)")+2, fullQuestion2.indexOf("c)"));
      fullQuestion2 = fullQuestion2.substring(choiceB.length()+2);//choiceB = fullQuestion.substring(beginIndex, endIndex)

      choiceC = fullQuestion2.substring(fullQuestion2.indexOf("c)")+2, fullQuestion2.indexOf("d)"));
      fullQuestion2 = fullQuestion2.substring(choiceC.length() +2);//choiceB = fullQuestion2.substring(beginIndex, endIndex)


      choiceD = fullQuestion2.substring(fullQuestion2.indexOf("d)")+2, fullQuestion2.indexOf("---"));
      fullQuestion2 = fullQuestion2.substring(choiceD.length()+4);//choiceB = fullQuestion.substring(beginIndex, endIndex)

      QuizQs[x3] = "";
      if (choiceA.indexOf("!") == 0) 	//this if else block is to determine which one of the answers is correct, in the text file the correct answer has an ! in the front
      {								// boolean for each answer choice is set as true w respective correct answers
      //System.out.print(choiceA);
      ca1 = true;
      choiceA = choiceA.substring(1);
      }

      else if (choiceB.indexOf("!") == 0)
      {
      //System.out.print(choiceB);
      ca2 = true;
      choiceB = choiceB.substring(1);
      }

      else if (choiceC.indexOf("!") == 0)
      {
      //System.out.print(choiceC);
      ca3 = true;
      choiceC = choiceC.substring(1);
      }

      else if (choiceD.indexOf("!") == 0)
      {
      //System.out.print(choiceD);
      ca4 = true;
      choiceD = choiceD.substring(1);

      }

    }

  }
}
public void setQuestion()
{
  question.setText(qNumber);

}
public void displayRadioButtons()
{
  a1.setFont(smallf);
  a2.setFont(smallf);
  a3.setFont(smallf);
  a4.setFont(smallf);

  a1.setText(choiceA);
  a2.setText(choiceB);
  a3.setText(choiceC);
  a4.setText(choiceD);


}
public void actionPerformed(ActionEvent e){

  if(a1.isSelected())					//if else block for if a radiobutton is selected, respecitve booleans are set as true and others are set as false
  {
    a1select = true;
    a2select = false;
    a3select = false;
    a4select = false;
  }


  else if(a2.isSelected())
  {
    a2select = true;
    a1select = false;
    a3select = false;
    a4select = false;
  }

  else if(a3.isSelected())
  {
    a3select = true;
    a1select = false;
    a2select = false;
    a4select = false;

  }
  else if(a4.isSelected())
  {
    a4select = true;
    a1select = false;
    a2select = false;
    a3select = false;

  }
  String command = e.getActionCommand();
  if(command.equals("Submit"))			//tells the computer to go to changeQuestions when submit is pressed
  {
    sp = true;
    changeQuestions();

  }
  else if(command.equals("Next"))//&& correctCount >=6 )
  {

    System.out.print("/n + haha" + individual2);
    tntPanel2.getCards().show(tntPanel2, "Show Dog");

  }




}
public void changeQuestions()					//method that changes the text of the radiobuttons if the user answers correctly
{

  //System.out.println();
  if(sp == true &&  a1select == true && ca1 == true)
  {

    sp = false;
    a1select = false;
    ca1 = false;
    correct = true;
  }
  else if(sp == true &&  a2select == true && ca2 == true)
  {

    correct = true;
    sp = false;
    a2select = false;
    ca2 = false;
  }
  else if(sp == true &&  a3select == true && ca3 == true)
  {

    correct = true;
    sp = false;
    a3select = false;
    ca3 = false;
  }
  else if(sp == true &&  a4select == true && ca4 == true)
  {

    correct = true;
    sp = false;
    a4select = false;
    ca4 = false;
  }
  else
  {
    correct = false;
    wrong = true;
  }

  if (correct == true)
  {
    randomQuestion = (int)((Math.random()*29)+1);	//randomizes integer for the next question

    getTextFile();
    setVariables();
    setQuestion();
    displayRadioButtons();
    correctCount++;
    foodCount = foodCount + 3;
    foodCountDisplay.setText("food Count \n" + foodCount);
    getter();

    //System.out.println("correct");
  }
  else if (wrong == true)
  {
    foodCount = foodCount - 1;
    foodCountDisplay.setText("food Count \n" + foodCount);
    //System.out.println("wrong");

  }



}



}//end of largeIntestine questions
