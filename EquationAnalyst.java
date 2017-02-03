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


public class EquationAnalyst
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
	private double yIntercept;																											//instantiates all variables
	private String form;																											//instantiates all variables
	private int length;																											//instantiates all variables
	private int slopeIndexOf1;																											//instantiates all variables
	private int slopeIndexOf2;																											//instantiates all variables
	private double slopeDouble1;																											//instantiates all variables
	private double slopeDouble2;																											//instantiates all variables
	private int yInterceptIndexOf1;																											//instantiates all variables
	private int yInterceptIndexOf2;																											//instantiates all variables
	private int yInterceptIndexOf3;																											//instantiates all variables
	private int yInterceptIndexOf4;																											//instantiates all variables
	private String yInterceptSubstring1;																											//instantiates all variables
	private String yInterceptSubstring2;																											//instantiates all variables
	private String slopeSubstring;																											//instantiates all variables
	private String slopeStandardA;																											//instantiates all variables
	private String slopeStandardB;																											//instantiates all variables
	private double yInterceptC;																											//instantiates all variables
	private String yInterceptSubstring;																											//instantiates all variables

		public EquationAnalyst( )																											 //this is the constructor
		{
			equation = "";																															//instantiates Strings
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

	public void decideEquationType()
	{
		equation = equation.trim();																									//trims user equation
		equation = equation.toLowerCase();																					//lower cases all characters in string
		length = equation.length();																									//finds length of string

		int num = 1;																																//loop to take out any white spaces
        int charac = 0;																													//initializes charac as 0
        while (charac <length)																									//loop to take out any white spaces
       {
          int charNum = (int)(equation.charAt(charac));												//starts reading equation
          if (charNum != 32)																									// if there is a space
	          {
	              char newChar = equation.charAt(charac);													//takes out character or space
	              trimmedEquation = trimmedEquation + newChar;										//starts "building" trimmedEquation
	          }
            num++;
            charac++;
      	}


		length = trimmedEquation.length();																		//finds out length of trimmedEquation
		if (trimmedEquation.indexOf('=')==1)														// decides if equation has = at 1 to slope intercept
			{
				findMethod = 1;
			}
		else if (trimmedEquation.endsWith(")"))														// if equation has ) then it must be point slope
			{
				findMethod = 2;
			}
		else																												//if equation is neither both above, it is standard form
			{
				findMethod = 3;
			}

		if (findMethod==1)
			{
				breakSlopeInterceptEquation();																					// calls methods
			}

		else if (findMethod==2)
			{
				breakPointSlopeEquation();																							// calls methods
			}

		else if (findMethod==3)
			{
				breakStandardForm();																										//calls methods
			}
		else
			{
				decideEquationType();																				//if any error occurs, program recures back to method
			}

	}

	public void breakSlopeInterceptEquation()
		{
			slopeIndexOf1 = trimmedEquation.indexOf('=');														// sets index of = sign
			slopeIndexOf2 = trimmedEquation.indexOf('x');														// sets index of x sign
			slopeSubstring = trimmedEquation.substring(slopeIndexOf1 + 1,slopeIndexOf2); // creates substring between both index numbers
			slope = Double.parseDouble(slopeSubstring);															// sets substring to double

			yInterceptIndexOf1 = trimmedEquation.indexOf('x');														// sets index of x sign
			yInterceptSubstring = trimmedEquation.substring(yInterceptIndexOf1+1,length); // creates usbtring between both index numbers
			yIntercept = Double.parseDouble(yInterceptSubstring);											 // creates double between for substring
			form = "slope intercept";																										//form of slope intercept for printing (to identify)
			printSlopeNIntercept();																										//calls next method
		}

	public void breakPointSlopeEquation()
		{
			slopeIndexOf1 = trimmedEquation.indexOf('=');															// sets index of = sign
			slopeIndexOf2 = trimmedEquation.indexOf('(');														// sets index of ( sign
			slopeSubstring = trimmedEquation.substring(slopeIndexOf1+1,slopeIndexOf2); // creates substring between both index numbers
			slope = Double.parseDouble(slopeSubstring);														// sets substring to double

			yInterceptIndexOf1 = trimmedEquation.indexOf('x');														// sets index of x sign
			yInterceptIndexOf2 = trimmedEquation.indexOf(')');														// sets index of ) sign
			yInterceptIndexOf3 = trimmedEquation.indexOf('y');														// sets index of y sign
			yInterceptIndexOf4 = trimmedEquation.indexOf('=');														// sets index of = sign
			yInterceptSubstring1 = trimmedEquation.substring(yInterceptIndexOf1+1,yInterceptIndexOf2);// creates substring between both index numbers
			yInterceptSubstring2 = trimmedEquation.substring(yInterceptIndexOf3+1,yInterceptIndexOf4); // creates substring between both index numbers
			yIntercept1 = Double.parseDouble(yInterceptSubstring1);										 // creates double between for substring
			yIntercept2 = Double.parseDouble(yInterceptSubstring2);										 // creates double between for substring
			yIntercept = (-1*slope*yIntercept1)+yIntercept2;													//calculates y-intercept
			form = "point slope";																												//form of slope intercept for printing (to identify)
			printSlopeNIntercept();																										//calls next method
		}

	public void breakStandardForm()
		{
			slopeIndexOf1 = trimmedEquation.indexOf('x');														// sets index of x sign
			slopeIndexOf2 = trimmedEquation.indexOf('y');														// sets index of x sign
			slopeStandardA = trimmedEquation.substring(0,slopeIndexOf1);							// creates substring between both index numbers
			slopeStandardB = trimmedEquation.substring(slopeIndexOf1+1,slopeIndexOf2);// creates substring between both index numbers
			slopeDouble1 = Double.parseDouble(slopeStandardA);													// sets substring to double
			slopeDouble2 = Double.parseDouble(slopeStandardB);													// sets substring to double
			slope = -1*slopeDouble1/slopeDouble2;																			// calculates slope

			yInterceptIndexOf1 = trimmedEquation.indexOf('=');														// sets index of x sign
			yInterceptSubstring = trimmedEquation.substring(yInterceptIndexOf1+1,length);			// creates substring between both index
			yInterceptC = Double.parseDouble(yInterceptSubstring);												 // creates double between index for substring
			yIntercept = yInterceptC/slopeDouble2;																			//calculates yIntercept
			form = "standard";																				//form of standard form for printing (to identify)
			printSlopeNIntercept();																										//calls next method
		}

	public void printSlopeNIntercept()
		{
			System.out.printf("Thanks for entering your line, %s, in %s form.\n",trimmedEquation, form); //prints out trimmedEquation and form of line
			System.out.printf("\n slope = %5.2f\n", slope);														//prints out slope (formatted)
			System.out.printf("\n y-intercept = %5.2f\n\n", yIntercept);							//prints out yIntercept (formatted)

		}
}
