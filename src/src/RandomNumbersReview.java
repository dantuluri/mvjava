/*Surya Dantuluri
*November 21, 2016
*NumberSequence.java
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
import java.util.Scanner;

public class RandomNumbersReview
{
	
	private String stringuno;
	private double a;
	private byte b;
	
	public static void main (String [] args) 
	{
		RandomNumbersReview random = new RandomNumbersReview ();
		random.print();		
	}
	
	
	public void print()
	{
		double a = 2/6;
		byte b = 7%2;
		System.out.print(a);
		System.out.print("\n");
		System.out.print(b);

	}
	
}

