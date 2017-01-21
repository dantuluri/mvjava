/*Surya Dantuluri
* October 6, 2016
* UnitConverter.java
* Simple program that converts dollars to rupees, euros, and pesos.
* Uses double, and integer data types
* Uses Scanner class
* Uses multiple methods
* 
* initializes all needed variables
* input dollar amount
* calculates dollar amount to rupee, euro, and pesos
* outputs rupee, euro, and pesos conversion
* 
* 
* Testing plan:
* input: any USD amount. (i.e. 5, 20, 8.32)
* Input: double, integer
* Output: double
 */

import java.util.Scanner;												//import Scanner
//new class
public class UnitConverter2Tester
{
	
	public static void main (String args[]) 							//main () method headera
	{
	Scanner input = new Scanner(System.in);								//initializes scanner class
	UnitConverter2 uc2 = new UnitConverter2();

	
	double dollars;														//declaring variable double dollars
	double euros;
	double rupee;
	double pesos;
	
	System.out.println("Enter your dollar amount");	
	
	dollars = input.nextDouble();										//asks user for dollar amount to convert	
	euros = uc2.converteuro(dollars);										//declares euros as return value of converteuro
	pesos = uc2.convertpesos(dollars);										//declares pesos as return value of converteuro
	rupee = uc2.convertrupee(dollars);										//declares rupee as return value of converteuro
	uc2.printvalues (dollars, euros, rupee, pesos);							// parameters of method printvalues
	}
	
}
