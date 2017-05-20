/*Surya Dantuluri
 * 11/9/2016
 * AreWeThereYet.java
 */


public class AreWeThereYet2
 {
	private int miles = 50;
	
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
		do
		{
		System.out.println("Are we there yet? ");
		
		{
		System.out.printf("No, %d miles to go \n\n", miles);
				miles-=5;

	}
} while(miles<=50 && miles>0);
		if(miles==0) 
		{
			System.out.println("We are there");
			System.out.print("\n\n\n");
		}
	}
}

