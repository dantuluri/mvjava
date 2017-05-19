/*Surya Dantuluri
 * September 22, 2016
 * RollDie2.java  
 * Simple program that rolls die to find random number
 * Uses main method and 
 * Math.random to another method generate random number
 */


public class RollDie2 
{	
	public static void main (String args[]) 
	{
	byte die = 0;
	die = roll();
	
	}

	public static int roll()
	{
	byte rolldie = 0;
	die = (byte)(Math.random()*6+1);
	return rolldie;
	}
	
}



