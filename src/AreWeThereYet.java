/*Surya Dantuluri
 * 11/9/2016
 * AreWeThereYet.java
 */


public class AreWeThereYet
 {
	private int miles = 50;
	public static void main (String args[])
	{
		
	}
	public void run()
	{
		
		System.out.print("\n\n\n");
		while(miles>0)
		{
			
		printLines();
		miles-=5;
		}
		
				

	}
	public void printLines()
	{
		System.out.println("Are we there yet? ");
		if (miles<=50 && miles>0)
		{
		System.out.printf("No, %d miles to go \n\n", miles);
	}
		else 
		{
			System.out.println("We are there");
			System.out.print("\n\n\n");
		}
	}
}

