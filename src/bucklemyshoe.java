/*Surya Dantuluri
 * Period 2
 * October 26, 2016
 * bucklemyshoe.java
 * 
 * Simple program that takes input from user to output line of poem corresponding with input integer
 * Imports scanner first, and then makes main method
 * Gets input from user in different getInput() method
 * Then another method computes which number corresponds with poem line
 * Last method prints out output
 * 
 * Uses: 
 * if-else statements
 * 
 * 
 * Testing plan:
 * Valid Inputs: 0.0, 0.1, 1.5, 51.2, 103.7, or any positive integer
 * Invalid Inputs: Negative numbers, characters, strings, numbers less that 1 or greater than 10
 */
import java.util.Scanner;												//imports Scanner class

public class bucklemyshoe {
	
		
	public int getInput()
	{
		Scanner input = new Scanner(System.in);		
		System.out.println("\n\n\n");		
		System.out.println("Enter a positive integer from 1 to 10");	//inputs number from 1-10
		int number=input.nextInt();										//input is equal to number variable
		System.out.println("\n\n\n");								
		return number;													//returns number to class
	}
	public String decideWhich (int number)			
	{
		if(number ==1 || number ==2)									//decides sentence based on user answer
		{
			return "1,2, Buckle my shoe";		
		}
		if(number ==3 || number ==4)									//decides sentence based on user answer
		{
			return "3,4 Shut the door";
		}
		if(number ==5 || number ==6)									//decides sentence based on user answer
		{
			return "5,6 Pick up sticks";
		}
		if(number ==7 || number ==8)									//decides sentence based on user answer
		{
			return "7, 8, lay them straight";
		}
		if(number ==9 || number ==10)									//decides sentence based on user answer
		{
			return" 9, 10, A big fat hen";								
		}
		else
		{
			return "Sorry, you have entered an invalid answer. Run the program again and remember to input an integer from 1 to 10."; //when user input is invalid this is the output
		}
	}

	
	public void poemLine(String line)
	{

		System.out.println(line);
		System.out.print("\n\n\n");
		
	}
	
}


