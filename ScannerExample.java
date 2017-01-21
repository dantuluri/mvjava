/*Surya Dantuluri
 * 9.12.2016
 * ScannerExample.java
 * This program  is an example of using the scanner class */

import.java.util.Scanner								//import Scanner

public class ScannerExample								//class Header
{
	public static void main (String args[]) 		//main method header
{		
		Scanner keyboard = new Scanner(System.in)	//instantiate the scanner (System.in the keyboard)
		
		System.out.print("\n\n\n");
		System.out.print("Input an integer");		//prompt the user for an integer

		int input = 0;
		input = keyboard.nextInt();
		System.out.println(" Your integer is " + input);
		
		keyboard.nextLine();
	
		
	}
}

