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
//no static
import java.util.Scanner;												//import Scanner

public class UnitConverter3 												//makes class UnitConverter
{	
	
	public static void main (String args[]) 							//main () method headera
	{
	Scanner input = new Scanner(System.in);								//initializes scanner class
	UnitConverter3 conversion = new UnitConverter3()

	double dollars;														//declaring variable double dollars
	double euros;
	double rupee;
	double pesos;
	
	System.out.println("Enter your dollar amount");	
	dollars = input.nextDouble();										//asks user for dollar amount to convert	
	
	euros = converteuro(dollars);										//declares euros as return value of converteuro
	pesos = convertpesos(dollars);										//declares pesos as return value of converteuro
	rupee = convertrupee(dollars);										//declares rupee as return value of converteuro
	printvalues (dollars, euros, rupee, pesos);							// parameters of method printvalues
	}
	
	public double converteuro(double dollars)					//euro conversion method
	{
		double euros;									
		final double conveuro = 0.89;									//declares and intantiates conversion rate of dollars to euros
		euros = conveuro*dollars;										//calculates euro conversion from dollars
		return euros;													//returns converted dollars
	}
	public double convertpesos(double dollars)					//pesos conversion method 
	{
		double pesos;
		final double convpesos = 19.52;									//declares and intantiates conversion rate of dollars to pesos
		pesos = convpesos*dollars;
		return pesos;													//returns converted dollars
	}
	public double convertrupee(double dollars)					//rupee conversion method
	{
		double rupee;
		final double convrupee = 66.33;									//declares and intantiates conversion rate of dollars to rupee
		rupee = convrupee*dollars;
		return rupee;													//returns converted dollars
	}
	public void printvalues (double dollars, double euros, double rupee, double pesos)
	{
		System.out.print("\n");
		System.out.printf("$%.2f (USD) can be converted to %.2f euros, %.2f rupees, and %.2f mexican pesos", dollars, euros, rupee, pesos);	//prints output of conversionss
		System.out.print("\n");
	}
}



