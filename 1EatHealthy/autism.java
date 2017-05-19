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
  doneEsophogous=true;
}
if(oatmealX<0)
{
  oatmealX=0;
}
if(oatmealX>800)
{
  oatmealX=800;
}
if(oatmealY<0)
{
  oatmealX=0;
}
if(oatmealY>800)
{
  oatmealX=800;
}
g.drawImage(oatmeal,oatmealX,oatmealY,40,40,this);
