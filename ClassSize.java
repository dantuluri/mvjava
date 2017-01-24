/*
* Surya Dantuluri
* January 5, 2017
* EquationAnalyst.java
* Simple program that finds out slope and y-intercept depending on inputted equation
* Uses printf() and format, if and else, do while loops
* Uses double, integer, character, and float.
* Uses Scanner class
*
* initializes all needed variables
* input equation
* output trimmed equation, and form of line
* output slope and y-intercept
*
*
* Testing plan:
* input: equation or characters and numbers
*
*y = -3x+2
*output: this is in slope intercept form, slope: -3, y-intercept: 2
*
*Y = -3     x + 2
output: this is in slope intercept form, slope:-3, y-intercept:2
*
*y-5 = 7(x  +1)
*output: this is in point-slope form, slope:
 */
import java.util.Scanner;


public class ClassSize
{
	private String equation;																											//instantiates all variables
	private String trimmedEquation;																											//instantiates all variables
	private int loopNumnber;																											//instantiates all variables
	private int proofread;																											//instantiates all variables
	private int charNum;																											//instantiates all variables
	private char newChar;																											//instantiates all variables
	private int findMethod; 																											//instantiates all variables
	private double slope;																											//instantiates all variables
	private double yIntercept1;																											//instantiates all variables
	private double yIntercept2;																											//instantiates all variables

		public CLassSize( )																											 //this is the constructor
		{
			height = new int[]{0, -3, 1, 2, 3, 4, 3, 4, 4, 6, 8, 6, 6, 7, 10};
			trimmedEquation = "";																															//instantiates Strings
			form = "";																															//instantiates Strings
			slopeSubstring = "";																															//instantiates Strings
			yInterceptSubstring1 = "";																															//instantiates Strings
			yInterceptSubstring2 = "";																															//instantiates Strings
			slopeStandardB = "";																															//instantiates Strings
			slopeStandardA = "";																															//instantiates Strings
			yInterceptSubstring = "";																															//instantiates Strings
		}

		public static void main (String args[])
		{
			EquationAnalyst analysis = new EquationAnalyst();													//instantiates class
			analysis.run();																														//calls method
		}


	public void run()
	{
	Scanner input = new Scanner(System.in);																				//initializes scanner input
	System.out.println("\n\n\nWelcome to EquationAnalyst. Please enter a linear equation in either standard, point-slope, \n or slope- intercept form. All signs need to be directly next to numbers.\n\n"); //asks user for intpu
	equation = input.nextLine();																											//user inputs
	System.out.print("\n");																													//sets space for formatting
	decideEquationType();																															//calls next method
	}

}
