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


public class EquationAnalystBeta
{
	private String equation;
	private int xloc;
	private int equalloc;
	private String equationtemp;
	private Scanner input;
	private int length;
	private String trimmedEquation;
	private int findMethod;
	private int preslope;
	private int yintercept;
	private int paraloc;
	private int poarding;
	private int xloc;
	private int ylocation;

 main (String[] args)
	{
		EquationAnaylstBeta banalysis = new EquationAnaylstBeta()
		analysis.run();
		analysis.decideEquationType();
	}

	public EquationAnalyst( ) //this is the constructor
	{
		equation = "";
		trimmedEquation = ""
		xloc=;
	}

	public void run()
	{
	Scanner input = new Scanner(System.in);
	System.out.println("Welcome to EquationAnalyst. Please enter a linear equation in either standard, point-slope, \n or slope- intercept form. All signs need to be directly next to numbers.");
	equation = input.nextInt();
	}

	public void decideEquationType()
	{
		equation = equation.trim();
		length = equation.length();
		equation = equation.toLowerCase();

		int loopnumber = 1;
    int proofread = 0;
        while (loopnumber <= length + 1)
           {
	            int charNum = (int)(equation.charAt(proofread));
	            if (charNum != 32)
		            {
		                char newChar = equation.charAt(proofread);
		                trimmedEquation = trimmedEquation + newChar;
		            }
	            loopnumber++;
	            proofread++;
        		}

		if (trimmedEquation.indexOf("y=",0))
			{
				findMethod = 1
			}
		else if (trimmedEquation.indexOf("(",0)
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
			if(trimmedEquation.indexOf('-')==2)
			{
				preslope = trimmedEquation.charAt(3);
				preslope = -(preslope);
				negativenumber = 5;

			}

			else
			{
				preslope = trimmedEquation.charAt(2);
				negativenumber = 4;
			}

			if(trimmedEquation.indexOf('-')==negativenumber)
			{
				yintercept = trimmedEquation.charAt(6);
				yintercept = -(yintercept);
			}

			else
			{
				yintercept = trimmedEquation.charAt(5);
			}
		}

	public void breakPointSlopeEquation()
		{
			paraloc = trimmedEquation.indexOf('(');
			paraloc = paraloc-1;
			preslope = trimmedEquation.charAt(int paraloc);
			paraloc = paraloc-1;
			if (trimmedEquation.charAt(int paraloc)=='-')
			{
				preslope = -preslope;
			}
			else
			{
				preslope = preslope;
			}

			endingBracket = trimmedEquation.indexOf(')');
			negx1 = trimmedEquation.charAt(endingbracket-2);
			forx1 = trimmedEquation.charA;
			forslope = -(preslope);
			forslope*varx1 =
		}

	public void breakStandardForm()
		{

		}

	public void printSlopeNIntercept()
		{

		}
}
