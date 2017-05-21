/*Surya Dantuluri
*January 18, 2016
*GrowthPattern.java
* Simple program that outputs a numbersequence and asks user what the sequence is
* Uses printf() and format, if and else, do while loops
* Uses double, integer, character, and float.
* Uses Scanner class
*
* initializes all needed variables
* generates random number, and depending on number a method is selected
* input possible next number
* program gives user 3 tries
* no matter if user gets 3 tries or not, program asks what the number sequence is
* user can enter 4 or more different answers on what the pattern is
* ex. add, plus, add by, positive
*
* Testing plan:
* input: integer, selection of Strings
 */


public class GrowthPattern {

	private char symbol;
  private int number;
	private double growthRate;
	private int[] height;
	private final int ADD = 5;
	private int time;
	private int initialNumber;

	public GrowthPattern()
	{
		symbol = ' ';
		height = new int[]{0, -3, 1, 2, 3, 4, 3, 4, 4, 6, 8, 6, 6, 7, 10};
		time = 0;
		number = 0;
		growthRate = 0;
	}

	public static void main (String args[])
	{
		GrowthPattern gp = new GrowthPattern();
		gp.run();
	}

	public void run()
	{
		printHistogram();
	}

	public void printHistogram()
	{
		int initialNumber = 0;
		for (int i = 0; i < height.length; i++)
		{
			if(height[i] == initialNumber)
					symbol = 'o';

			else if(height[i] > initialNumber)
					symbol = '+';

			else
					symbol = '-';

				time = i;

				number = height[i] + ADD;

				printSummaryInfo();

				initialNumber = height[i];

		}

		System.out.printf("\nThe Growth Pattern is : %.2f",(double)(height[14])/height.length);
		System.out.print("\n\n");
	}


	public void printSummaryInfo()
	{
		System.out.print("\n");                                                                        // printing an open line
		System.out.printf("t%d\t", time);                                                            // printing out the time

		for(int i = 0; i < number; i++) {                                                            // if statement; printing out characters
				System.out.print(symbol);
		}

	}

}
