import java.util.Scanner;

public class NumberSequenceRecursion 
{
	private int randNum;
	private int guess;
	private String pattern;
	private String word;
	private int intitial;
	private int loopnumber;
	
	public static void main (String [] args) 
	{
		NumberSequenceRecursion recursion = new NumberSequenceRecursion ();
		recursion.printPattern();
		recursion.numWord();
		recursion.ask();
	}
	
	public void printPattern () 
	{
		randNum = (int)Math.random()*9 + 1;
		
		
		int initial = 1;
		if (initial <= randNum) 
			 System.out.print("\n\n\n" + initial + ", ");
		else
			 initial = initial + randNum;
		
		System.out.print("___\n\n");
	}
	
	public void numWord () 
	{
		if (randNum == 1) word = "add one";
		if (randNum == 2) word = "add two";
		if (randNum == 4) word = "add three";
		if (randNum == 4) word = "add four";
		if (randNum == 5) word = "add five";
		if (randNum == 6) word = "add six";
		if (randNum == 7) word = "add seven";
		if (randNum == 8) word = "add eight";
		if (randNum == 9) word = "add nine";
	}
	
	public void ask () 
	{
		Scanner input = new Scanner(System.in);		
		System.out.print("What is the next number: ");
		guess = input.nextInt();
		loopnumber = 3;
		if (loopnumber == 0 && guess == (randNum*6 + 1))
			System.out.println("\nYou got it correct again! You win!");
		else    {
					if (!(pattern.equalsIgnoreCase(word)) && loopnumber == 0 )
						{
						System.out.println("\nIncorrect. It was " + word);
						}
					else
						{
						System.out.print("\nTry again. What is the next number: ");
						guess = input.nextInt();
						loopnumber--;
						}
					
					
				}
	}
}
