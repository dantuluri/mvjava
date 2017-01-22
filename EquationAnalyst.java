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
* generates random number, and depending on number a method is selected
* input possible next number
* program gives user 3 tries
* no matter if user gets 3 tries or not, program asks what the number sequence is
* user can enter 4 or more different answers on what the pattern is
* ex. add, plus, add by, positive
*
* Testing plan:
* input: integer, selection of Strings
 */
import java.util.Scanner;


public class EquationAnalyst
{
	private String equation;
	private String trimmedEquation;
	private int loopNumnber;
	private int proofread;
	private int charNum;
	private char newChar;
	private int findMethod;
	private double slope;
	private double yIntercept1;
	private double yIntercept2;
	private double yIntercept;
	private String form;
	private int length;
	private int slopeIndexOf1;
	private int slopeIndexOf2;
	private double slopeDouble1;
	private double slopeDouble2;
	private int yInterceptIndexOf1;
	private int yInterceptIndexOf2;
	private int yInterceptIndexOf3;
	private int yInterceptIndexOf4;
	private String yInterceptSubstring1;
	private String yInterceptSubstring2;
	private String slopeSubstring;
	private String slopeStandardA;
	private String slopeStandardB;
	private double yInterceptC;
	private String yInterceptSubstring;

		public EquationAnalyst( ) //this is the constructor
		{
			equation = "";
			trimmedEquation = "";
			form = "";
			slopeSubstring = "";
			yInterceptSubstring1 = "";
			yInterceptSubstring2 = "";
			slopeStandardB = "";
			slopeStandardA = "";
			yInterceptSubstring = "";
		}

		public static void main (String args[])
		{
			EquationAnalyst analysis = new EquationAnalyst();
			analysis.run();
		}


	public void run()
	{
	Scanner input = new Scanner(System.in);
	System.out.println("\n\n\nWelcome to EquationAnalyst. Please enter a linear equation in either standard, point-slope, \n or slope- intercept form. All signs need to be directly next to numbers.\n\n");
	equation = input.nextLine();
	System.out.print("\n");
	decideEquationType();
	}

	public void decideEquationType()
	{
		equation = equation.trim();
		equation = equation.toLowerCase();
		length = equation.length();

		int num = 1;
        int charac = 0;
        while (charac <length)
           {
            int charNum = (int)(equation.charAt(charac));
            if (charNum != 32)
            {
                char newChar = equation.charAt(charac);
                trimmedEquation = trimmedEquation + newChar;
            }
            num++;
            charac++;
        }


		length = trimmedEquation.length();
		if (trimmedEquation.indexOf('=')==1)
			{
				findMethod = 1;
			}
		else if (trimmedEquation.endsWith(")"))
			{
				findMethod = 2;
			}
		else
			{
				findMethod = 3;
			}

		if (findMethod==1)
			{
				breakSlopeInterceptEquation();
			}

		else if (findMethod==2)
			{
				breakPointSlopeEquation();
			}

		else if (findMethod==3)
			{
				breakStandardForm();
			}
		else
			{
				decideEquationType();
			}

	}

	public void breakSlopeInterceptEquation()
		{
			slopeIndexOf1 = trimmedEquation.indexOf('=');
			slopeIndexOf2 = trimmedEquation.indexOf('x');
			slopeSubstring = trimmedEquation.substring(slopeIndexOf1 + 1,slopeIndexOf2);
			slope = Double.parseDouble(slopeSubstring);

			yInterceptIndexOf1 = trimmedEquation.indexOf('x');
			yInterceptSubstring = trimmedEquation.substring(yInterceptIndexOf1+1,length);
			yIntercept = Double.parseDouble(yInterceptSubstring);
			form = "slope intercept";
			printSlopeNIntercept();
		}

	public void breakPointSlopeEquation()
		{
			slopeIndexOf1 = trimmedEquation.indexOf('=');
			slopeIndexOf2 = trimmedEquation.indexOf('(');
			slopeSubstring = trimmedEquation.substring(slopeIndexOf1+1,slopeIndexOf2);
			slope = Double.parseDouble(slopeSubstring);

			yInterceptIndexOf1 = trimmedEquation.indexOf('x');
			yInterceptIndexOf2 = trimmedEquation.indexOf(')');
			yInterceptIndexOf3 = trimmedEquation.indexOf('y');
			yInterceptIndexOf4 = trimmedEquation.indexOf('=');
			yInterceptSubstring1 = trimmedEquation.substring(yInterceptIndexOf1+1,yInterceptIndexOf2);
			yInterceptSubstring2 = trimmedEquation.substring(yInterceptIndexOf3+1,yInterceptIndexOf4);
			yIntercept1 = Double.parseDouble(yInterceptSubstring1);
			yIntercept2 = Double.parseDouble(yInterceptSubstring2);
			yIntercept = (-1*slope*yIntercept1)+yIntercept2;
			form = "point slope";
			printSlopeNIntercept();
		}

	public void breakStandardForm()
		{
			slopeIndexOf1 = trimmedEquation.indexOf('x');
			slopeIndexOf2 = trimmedEquation.indexOf('y');
			slopeStandardA = trimmedEquation.substring(0,slopeIndexOf1);
			slopeStandardB = trimmedEquation.substring(slopeIndexOf1+1,slopeIndexOf2);
			slopeDouble1 = Double.parseDouble(slopeStandardA);
			slopeDouble2 = Double.parseDouble(slopeStandardB);
			slope = -1*slopeDouble1/slopeDouble2;

			yInterceptIndexOf1 = trimmedEquation.indexOf('=');
			yInterceptSubstring = trimmedEquation.substring(yInterceptIndexOf1+1,length);
			yInterceptC = Double.parseDouble(yInterceptSubstring);
			yIntercept = yInterceptC/slopeDouble2;
			form = "standard";
			printSlopeNIntercept();
		}

	public void printSlopeNIntercept()
		{
			System.out.printf("Thanks for entering your line, %s, in %s form.\n",trimmedEquation, form);
			System.out.printf("\n slope = %5.2f\n", slope);
			System.out.printf("\n y-intercept = %5.2f\n\n", yIntercept);

		}
}
