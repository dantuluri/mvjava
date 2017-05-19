/* Surya Dantuluri
 * September 22, 2016
 * RollDie1.java  
 * Simple program that rolls die to find random number
 * Uses main method and 
 * Math.random to another method generate random number
 */
public class RollDie1 													//class name
{	
	public static void main (String args[]) 							//main method header
	{
	byte die;															//random number
		
	die = (byte)(Math.random()*6+1);									//rolls die
	System.out.print("\n\n\n");					
	System.out.printf("%2d",die);										//printing number
	System.out.print("\n\n\n");
	}
}

