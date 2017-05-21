/*Surya Dantuluri
September 28, 2016
Inches to Feet
* Simple program that prints out math problems and solutions. This is a formatted program.
* Uses: printf() and format
* Uses double, integer, character, and float. 
* Uses Scanner class
*  */

import java.util.Scanner;

public class InchestoFeet						//class declaration 
{	
	public static void main (String args[]) 	//method header
	{
	Scanner input = new Scanner(System.in);
	
	double feet;
	int inches;	
	
	System.out.println( "Please enter the number of inches.");
	inches = input.nextInt();
	feet= inches/12.0;
	System.out.printf("%d inches is equalivalent to %1.2f feet. \n", inches, feet);

	
	
	
		
		
			
	}
}

