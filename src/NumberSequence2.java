import java.util.Scanner;

public class NumberSequence
{
	private int randNum;
	private int guess;
	private String pattern;
	private String word;
	
	public static void main (String [] args) 
	{
		NumberSequence sequence = new NumberSequence ();
		sequence.printPattern();
		sequence.numWord();
		sequence.ask();
	}
	
	public void printPattern () {
		randNum = Math.random()*9 + 1;
		
		for (int i = 1; i <= randNum; i = i + randNum) {
			System.out.print("\n\n\n" + i + ", ");
		}
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
	
	public void ask () {
		System.out.print("What is the next number: ");
		guess = input.nextInt();
		
		if (guess != (randNum*6 + 1) {
			System.out.print("\nTry again. What is the next number: ");
			guess = input.nextInt();
		}
		if (guess != (randNum*6 + 1) {
			System.out.print("\nTry again. What is the next number: ");
			guess = input.nextInt();
		}
		if (guess != (randNum*6 + 1) {
			System.out.print("\nTry again. What is the next number: ");
			guess = input.nextInt();
		}

		System.out.print("\nYou got it correct!\nWhat is the pattern: ");
		pattern = input.nextLine();
		if (pattern.equalsIgnoreCase(word)) {
			System.out.println("\nYou got it correct again! You win!");
		}
		if (!(pattern.equalsIgnoreCase(word))) {
			System.out.println("\nIncorrect. It was " + word);
		}
	}
	
}
				
			
		 
		
