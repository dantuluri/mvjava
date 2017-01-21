/*
 * Finals.java
 * 
 * Copyright 2016 Surya Dantuluri <surya@Suryas-MacBook-Pro.local>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */


public class Finals
{
	private double var1;
	private char var2;
	private double var3;
	private double var4;
	private double var5;
	private double var6;
	private double var7;
	private double var8;
	private double var9;
	private double var10;
	private double var11;


	
	private int amigo;
	private int hola;
	
	public static void main (String[] args)
		{
			Finals tests = new Finals ();
			tests.numbers();	
		}
	
	
	public void numbers()
	{
	var1 = 	8.4/2.1-(int)(5)%10*5/2+20/7*4;
	var2 = (char)(86+39/16%3-29%10*2);
	var3 = (double) 43/5-(byte)(39.6)/12+4;
	var4 =  5+2*8%3-59%12/3;
	var5 = (int)(43.7/10.2)-(int)(7)/11.0*2;
	var7 = (double)(8/5);
	var8 = 20/6;
	var9 = (short)(53.6+67.2/14)%(byte)(12);
	var10 = (double)(35/4)-(int)4.6*3;
	var11 = (char)(82+5%6-(int)(2)/9%12);

	System.out.println("1)	8.4/2.1-(int)(‘5’)%10*5/2+20/7*4 ==%f", var1) ;	
	System.out.println("2)	(char)(86+39/16%3-29%10*2) ==%c" , var2) ;
	System.out.println("3)	(double) 43/5-(byte)(39.6)/12+4 ==%d" , var3);
	System.out.println("4)	5+2*8%3-59%12/3 ==%f" , var4);
	System.out.println("5)	(int)(43.7/10.2)-(int)(‘7’)/11.0*2 ==%i" , var5) ;
	System.out.println("7)	(double)(8/5)==(double)8/5 ==%f" , var7) ;
	System.out.println("8)	20/6 ==%d" , var8);
	System.out.println("9)	(short)(53.6+67.2/14)%(byte)(12) ==%f" , var9);
	System.out.println("10)	(double)(35/4)-(int)4.6*3 ==%d" , var10);
	System.out.println("11)	(char)(82+5%6-(int)(‘2’)/9%12) == %c" , var11);
}
}



