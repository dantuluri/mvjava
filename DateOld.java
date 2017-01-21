/*Surya Dantuluri
September 28, 2016
Date.java
* Simple program that prints out bill from what user has spent.
* Uses: printf() and format
* Uses double, integer, character, and float. 
* Uses Scanner class
 */

import java.util.Scanner;

public class Date 
{	
	public static void main (String args[]) 
	{
	Scanner input = new Scanner(System.in);
	
	double entree;
	double beverage;
	double movie;
	double tax1;
	double tip1;

	
	System.out.println("What was your entree, beverage, and movie cost?");
	entree = input.nextDouble();
	beverage = input.nextDouble();
	movie = input.nextDouble();
	
	entree = entree*2;
	beverage = beverage*2;
	movie = movie*2;
			System.out.print("\n");
	tax1 = 0.0925;
	tip1 = 0.15;

	System.out.printf("%-30s", "Entree subtotal");
			System.out.print("\n");
	System.out.printf("= %f", entree);
		
	}
}

