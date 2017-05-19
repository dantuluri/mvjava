/*Surya Dantuluri
*September 28, 2016
*Date.java
* Simple program that prints out bill from what user has spent.
* Uses printf() and format
* Uses double, integer, character, and float.
* Uses Scanner class
* 
* initializes all needed variables
* input entree cost for one person
* input beverage cost for one person
* input movie cost for one person
* calculates tax and tips for meal/movie
* outputs entree cost
* outputs beverage cost
* outputs meal tax
* outputs tip
* outputs meal total
* outputs movie subtotal
* outputs movie tax
* outputs movie total
* outputs grand total on bill
* outputs grand total in sentence
* 
* Testing plan:
* input: any positive integer, short, long, float, double
* 		 all positive real numbers can be used as input
 */

import java.util.Scanner;

public class Date
{    
    public static void main (String args[])
    {
    Scanner input = new Scanner(System.in);
    
    double entree;														//declares entree as double
    double beverage;													//declares beverage as double
    double movie;														//declares movie as double
    double tax;															//declares tax as double
    double tip;															//declares tip as double
    double mealtax;														//declares mealtax as double
    double mealtip;														//declares mealtip as double
    double mealtotal;													//declares mealtotal as double
    double movietax;													//declares movietax as double
    double movietotal;													//declares movietotal as double
    double grandtotal;													//declares grandtotal as double
    tax = 0.0925;														//instantiates tax as .0925
    tip = 0.15;															//instantiates tip as .15

    
    System.out.println("Enter your entree cost for one person");		//asks user for entree cost for one person
    entree = input.nextDouble();
    System.out.println("Enter your beverage cost for one person");		// asks user for beverage cost for one person
    beverage = input.nextDouble();
    System.out.println("Enter your movie cost for one person");			//asks user for movie cost for one person
    movie = input.nextDouble();
    
    entree = entree*2;													//doubles entree costs because of two people
    beverage = beverage*2;												//doubles beverage cost because of two people
	mealtax = (entree + beverage)*tax;									//calculates meal tax
	mealtip = (entree + beverage + mealtax)*tip;						//adds meal costs and tax to calculate tip
	mealtotal = entree + beverage + mealtax + mealtip;					//calculates meal total
    movie = movie*2;													//doubles movie cost for two people
    movietax = movie*tax;												//calculates tax for movie
    movietotal = movie + movietax;										//calculates movie total
    grandtotal = mealtotal + movietotal;
            System.out.print("\n");
            
	System.out.printf("%-20s = $%5.2f\n","Entree subtotal",entree);		//prints entree cost with format
		System.out.print("\n");
		
	System.out.printf("%-20s = $%5.2f\n","Beverage subtotal",beverage);	//prints beverage cost with format
		System.out.print("\n");
		
	System.out.printf("%-20s = $%5.2f\n","Tax",mealtax);					//prints tax for meal cost with format
		System.out.print("\n");
		
	System.out.printf("%-20s = $%5.2f\n","Tip",mealtip);					//prints tip for meal cost with format
		System.out.print("\n");
		
	System.out.printf("%-20s = $%5.2f\n","Meal total",mealtotal);		//prints meal total cost with format
		System.out.print("\n");
		
	System.out.printf("%-20s = $%5.2f\n","Movie subtotal",movie);		//prints movie subtotal cost with format
		System.out.print("\n");
		
	System.out.printf("%-20s = $%5.2f\n","Tax",movietax);				//prints tax for movie cost with format
		System.out.print("\n");
		
	System.out.printf("%-20s = $%5.2f\n","Movie total",movietotal);		//prints total movie cost with format
		System.out.print("\n");
		
	System.out.printf("%-20s = $%5.2f\n","Grand total",grandtotal);		//prints grand total cost with format
		System.out.print("\n");

	System.out.printf("You spent $%6.2f on your date!",grandtotal);		//prints grand total cost with format, and justification
			System.out.print("\n");        
    }
}
