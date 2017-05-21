/*
 * 
 */
import java.util.Scanner;

public class Stringmethods 
{
	private int randNum;
	private String str1;
	private char ch;
	private int lengthnum;
	private String uppercasestring;
	private int length;
	private int asciivalue;
	private int loopnumber;
	private char uppercaseword;
	private char word;
	private int wordint;
	
	
	public static void main (String args[]) 
	{
	Stringmethods index = new Stringmethods ();
	index.charat();	
	index.uppercase();
	}
	
	public void charat()
	{
		System.out.println("\n\n\n");
		Scanner input = new Scanner(System.in);		
		System.out.print("What is your string: ");
		str1 = input.nextLine();
		
		int lengthnum = str1.length();
		int randNum = (int)(Math.random()*lengthnum);

		char ch = str1.charAt(randNum); // ch == 'o'
		System.out.println ( ch );
		System.out.println("\n\n\n");
	}
	
	public void uppercase()
	{
		Scanner input = new Scanner(System.in);		
		System.out.println("What is your string: ");
		str1 = input.nextLine();
				System.out.println("\n\n\n");
				
		length = str1.length();
	
		for (loopnumber=0;loopnumber<length;loopnumber++)
		{
		char word = str1.charAt(loopnumber);
		word = (int) word;
		char uppercaseword = word-32;
		System.out.print(uppercaseword);	
		}			
				
				
				System.out.println("\n\n\n");

	}
}

