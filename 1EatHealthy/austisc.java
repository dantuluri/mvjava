if(inSmallIntestine)
{
  inMouth=false;
  doneMouth=false;
  doneEsophogous=false;
  inEsophogous=false;
  inStomach=false;
  doneStomach=false;
  checkMouth1=false;
  checkMouth2=false;
  checkMouth3=false;
  System.out.println("stomach");
  g.drawImage(smallIntestineBackground,0,0,800,800,null);

  g.drawImage(villi,villiX1,514,15,12,this);
  g.drawImage(villi,villiX2,514,15,12,this);
  g.drawImage(villi,villiX3,514,15,12,this);
  g.drawImage(villi,villiX4,514,15,12,this);
  g.drawImage(villi,villiX5,514,15,12,this);
  g.drawImage(villi,villiX6,514,15,12,this);
  g.drawImage(villi,villiX7,514,15,12,this);


  //

  //

  if(smallInit)
  {
    donutX = 423;//donut-(600 to 750 ,75 to 225) ORIGINAL POS
    donutY = 5;////donut-(600 to 750 ,75 to 225) ORIGINAL POS
    oatmealX = 423;////oatmeal-(640 to 790 ,255 to 405) ORIGINAL POS
    oatmealY = 5;//oatmeal-(640 to 790 ,255 to 405) ORIGINAL POS
    sodaX = 423;//soda-(640 to 790 ,440 to 590) ORIGINAL POS
    sodaY = 5;//donut-(soda-(640 to 790 ,440 to 590) ORIGINAL POS
    avocadoX = 423;//avocado-(640 to 790 ,620 to 770) ORIGINAL POS
    avocadoY = 5;//avocado-(640 to 790 ,620 to 770) ORIGINAL POS
    stoInit=false;
  }
  //stomach
  if(food.equals("oatmeal"))
  {
    System.out.println("oatmeal sto");
    System.out.println("imageX: "+ oatmealX + ", imageY: "+oatmealY);
    if(oatmealX>416&&oatmealX<523&&oatmealY>208&&oatmealY<222)
    {
      checkMouth1=true;
      System.out.println("checkMouth1");
    }
    if(oatmealX>543&&oatmealX<590&&oatmealY>320&&oatmealY<545)
    {
      checkMouth2=true;
      System.out.println("checkMouth2");
    }
    if(oatmealX>10&&oatmealX<76&&oatmealY>675&&oatmealY<750)
    {
      checkMouth3=true;
      System.out.println("stomach oats checkMouth3");
    }
    if(checkMouth1&&checkMouth2&&checkMouth3)
    {
      doneStomach=true;
    }
    // if(oatmealX<0)
    // {
    //   oatmealX=0;
    // }
    // if(oatmealX>1000)
    // {
    //   oatmealX=1000;
    // }
    // if(oatmealY<0)
    // {
    //   oatmealX=0;
    // }
    // if(oatmealY>1000)
    // {
    //   oatmealX=1000;
    // }
    g.drawImage(oatmeal,oatmealX,oatmealY,40,40,this);
  }
  if(food.equals("soda"))
  {
    System.out.println("soda sto");
    System.out.println("imageX: "+ sodaX + ", imageY: "+sodaY);
    if(sodaX>416&&sodaX<523&&sodaY>208&&sodaY<222)
    {
      checkMouth1=true;
      System.out.println("checkMouth1");
    }
    if(sodaX>543&&sodaX<590&&sodaY>320&&sodaY<545)
    {
      checkMouth2=true;
      System.out.println("checkMouth2");
    }
    if(sodaX>10&&sodaX<76&&sodaY>675&&sodaY<750)
    {
      checkMouth3=true;
      System.out.println("stomach oats checkMouth3");
    }
    if(checkMouth1&&checkMouth2&&checkMouth3)
    {
      doneStomach=true;
    }
    if(sodaX<0)
    {
      sodaX=0;
    }
    if(sodaX>800)
    {
      sodaX=800;
    }


    g.drawImage(soda,sodaX,sodaY,40,40,this);


  }
  if(food.equals("avocado"))
  {
    System.out.println("avocado sto");
    System.out.println("imageX: "+ avocadoX + ", imageY: "+avocadoY);
    if(avocadoX>416&&avocadoX<523&&avocadoY>208&&avocadoY<222)
    {
      checkMouth1=true;
      System.out.println("checkMouth1");
    }
    if(avocadoX>543&&avocadoX<590&&avocadoY>320&&avocadoY<545)
    {
      checkMouth2=true;
      System.out.println("checkMouth2");
    }
    if(avocadoX>10&&avocadoX<76&&avocadoY>675&&avocadoY<750)
    {
      checkMouth3=true;
      System.out.println("stomach oats checkMouth3");
    }
    if(checkMouth1&&checkMouth2&&checkMouth3)
    {
      doneStomach=true;
    }
    if(avocadoX<0)
    {
      avocadoX=0;
    }

    if(avocadoY<0)
    {
      avocadoX=0;
    }

    g.drawImage(avocado,avocadoX,avocadoY,40,40,this);


  }
  if(food.equals("donut"))
  {
    System.out.println("donut sto");
    System.out.println("imageX: "+ donutX + ", imageY: "+donutY);
    if(donutX>416&&donutX<523&&donutY>208&&donutY<222)
    {
      checkMouth1=true;
      System.out.println("checkMouth1");
    }
    if(donutX>543&&donutX<590&&donutY>320&&donutY<545)
    {
      checkMouth2=true;
      System.out.println("checkMouth2");
    }
    if(donutX>10&&donutX<76&&donutY>675&&donutY<750)
    {
      checkMouth3=true;
      System.out.println("stomach oats checkMouth3");
    }
    if(checkMouth1&&checkMouth2&&checkMouth3)
    {
      doneStomach=true;
    }
    if(donutX<0)
    {
      donutX=0;
    }
    if(donutY<0)
    {
      donutX=0;
    }

    g.drawImage(donut,donutX,donutY,40,40,this);

  }
}//end of stomach
