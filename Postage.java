/*Surya Dantuluri
 * Period 2
 * November 1, 2016
 * Postage.java
 * 
 */

import java.util.Scanner;

public class Postage
{
	private int weightOunces;
	private int category;
	private String categoryName;
	private double charge;
	public static void main (String[] args) 
	{
		Postage sendthis = new Postage ( );
	sendthis.getData ( );
	sendthis.calculateCost ( );
	sendthis.printInfo ( );
	}
	
	public void getData()
	{
	Scanner input = new Scanner(System.in);
	System.out.println("\n");		//asks user for entree cost for one person
	System.out.println("Hello, and welcome to the US Post Office.");		//asks user for entree cost for one person
    System.out.print("\n");
    System.out.printf("%-20s","(1) First class, domestic");
    System.out.println("\n");
    System.out.printf("%-20s","(2) Postcards, domestic");
	System.out.println("\n");
    System.out.printf("%-20s","(3) Media Mail");
    System.out.println("\n");
	System.out.println("Using the menu above, please enter the category of your postage ->");
    category = input.nextInt();
    System.out.println("Enter the weight, in ounces, of your letter (an integer)");
    weightOunces = input.nextInt();
	}
	public void calculateCost()
	{
		double weightPounds;
		double charge
		weightPounds = weightOunces/16;
		if (category == 1 && weightOunces >=1) 
		{
			charge = ((weightOunces-1)*0.21)+0.47;
		}
		else if (category == 2 && weightOunces >=1)
		{
			charge = weightOunces*0.34;
		}
		else if (category == 3 && weightPounds ==1)
		{
			weightPounds = weightOunces/16;
			charge = weightPounds*2.61;
		}
		else if (category == 3 && weightPounds/16 >=2 && weightPounds <=7)
		{
			weightPounds = weightOunces/16;
			charge = 2.61 + (weightPounds*0.48);
		}
		else if (category == 3 && weightPounds >7)
		{
			charge = 5.97 + (weightPounds*0.39);
		}
		else 
		{
		System.out.print("\n");    
		System.out.print("\n");    
		System.out.print("\n");    
		System.out.println("Reread the prompt. Enter a valid input! Make sure you have a package that has weight! And/or enter a valid number!");
		System.out.print("\n");    
		System.out.print("\n");    
		System.out.print("\n");    

	}
}
	public void printInfo()
	{
	if (category == 1)
	{
		categoryName = ("(1) First class, domestic");
	}
	if (category == 2)
	{
		categoryName = ("(2) Postcards, domestic");
	}
	if (category == 3)
	{
		categoryName = ("(3) Media Mail");
	}
	
	System.out.printf("%-20s : %5.2f\n","Your postage class ", categoryName);					//prints tip for meal cost with format
		System.out.print("\n");    
	System.out.printf("%-20s : %5.2f\n","Weight", weightOunces);
		System.out.print("\n");    
	System.out.printf("%-20s : %5.2f\n","Charge", charge);
			System.out.print("\n");    
    

	}
}

