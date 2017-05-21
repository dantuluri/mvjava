/*Surya Dantuluri
*November 9, 2016
*PigOut.java
* Simple program that prints out "nom" for every character of food that user eats and "burps" at the end of every nom
* Uses printf(), println()
* Uses double, integer, character, and float.
* Uses Scanner class
* Uses while loop
* Uses do and for
* Uses if else statements
* 
* initializes all needed variables
* input food user wants
* calculates how many lines of "noms" and "burp" to eat food
* outputs number of noms (five per line) and burp at end of each line
* outputs extra noms, since not all noms can be fit in a 5 nom line
* 
* Testing plan:
* input: any positive integer, short, long, float, double, string
* 		 all positive real numbers can be used as input as well as all strings
 */

import java.util.Scanner;

public class PigOut
{
	private String word;												//declares private string word
	private int numLetters;												//declares private integer numLetters to store number of letters in word
	private int numNomsextra;											//declares private integer to store extra noms after 
	private int numLines;												//declares private integer numLines to find how many lines to print of noms and burp
	private int five;													//delcares private integer five to print nom five times in a line
	
	public static void main (String[] args) 
	{
		PigOut eating = new PigOut( );									//instantiates class					
	eating.getData ( );													// calls getData method
	}

	public void getData()
	{
		Scanner input = new Scanner(System.in);		
		System.out.println("\n\n\n");	
		System.out.println("What food would you like to eat?(Type 'I'm full' to terminate)  -->");		//asks user what he/she wants to eat
		word = input.nextLine();
		if	(word.equalsIgnoreCase("I'm full"))
		{
			System.out.println("\n\n\n");
			
		}		
		else
		{
			digest();													//if the user isn't "full" program resumes
		}

	}	
	public void digest()
	{
		numLetters=word.length();										//makes numLetters equal to length of string "word"
		numNomsextra = numLetters%5;									//makes numNomsextra the extra amount of noms after lines of five noms
		numLines = (numLetters/5);										//makes numLines number of letters by 5
		printInfo();

	}
	
	public void printInfo()
	{
		five=5;															//declares variable five as 5 to run loop "nom
		
		while(numLines>0)
		{
			do
			{
				System.out.print("Nom ");								//prints nom
				five-=1;												//counts number of noms it has done
			} while(five>0);											//continues loop only for five times per line
			System.out.print("burp \n");								//prints burp at end of every line
			numLines-=1;												//counts number of lines to print
			five+=5;													//replenishes loop for next line to run 5 times
		}
		
		if (numLines==0)
		{
			while (numNomsextra>=1)
				{
				System.out.print("Nom ");								//extra noms are printed on next line
				numNomsextra-=1;
				}
			System.out.print("\n\n\n");									//prints 3 lines after program ends
		}
		else
		{
			System.out.println("You have entered an invalid input");	//if  any invalid input (none) if given, this output is given
		}	
		
	}
	

	
}

