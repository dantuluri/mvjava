/*Surya Dantuluri
*November 21, 2016
*NumberSequence.java
* Simple program that outputs a numbersequence and asks user what the sequence is
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

public class NumberSequence
{
	private int guess;
	private String pattern;
	private String word;
	private String word1;
	private String word2;
	private String word3;
	private String word4;
	private double initial;
	private int loopnumber;
	private int patternnumber;
	private String identifypatternen;
	private String identifypatternnu;
	private String identifypatternby;
	private String identifypatternbo;
	private String findingword;
	private int randNum;
	private String findpattern;
	private int nextnumber;
	private int loopnumberguess;
	private int globalinitial;
	private String globalword1;
	private String globalword2;
	private String globalword3;
	private String globalword4;
	private int loopnumberprint;
	private int guesspattern;
	private int globalnext;
	private int globalrandnum;
	private double divideinitial;
	private double divideglobalinitial;
	private double dividenextnumber;
	private double divideglobalnext;
	private String globalfinding;
	private boolean elsetrue;
	
	public static void main (String [] args) 
	{
		NumberSequence sequence = new NumberSequence ();
		sequence.selectmethod();		
	}


	public void selectmethod()
	{
		int patternnumber = (int)(Math.random() * 4 + 1);				//generates random number and selects method depending on random number
		if (patternnumber == 1)											//depending on random number, this sequence will execute
		{
		additionpattern();
		}
		else if (patternnumber==2)										//depending on random number, this sequence will execute
		{
		subtractionpattern();
		}
		else if (patternnumber==3)										//depending on random number, this sequence will execute
		{
		multiplypattern();
		}
		else if (patternnumber==4)										//depending on random number, this sequence will execute
		{
		dividepattern();
		}
	}
	
	public void additionpattern () 
	{
		int initial = 1;												//initializes first number as 1
		int randNum = (int)(Math.random() * 20 + 1);					//generates random number for sequence
		int loopnumber;
		for (loopnumber=1;loopnumber<6;loopnumber++)					//loops number 6 times, printing initial 5 times and storing the 6th initial
		{
			System.out.printf(", %d ",initial);
			initial = initial + randNum;
		}
		System.out.print("\n\n\n");
		identifypatternen = "add";										//declares what input the user can give
		identifypatternby = "add by";									//declares what input the user can give
		identifypatternnu = "plus";										//declares what input the user can give
		identifypatternbo = "positive";									//declares what input the user can give
		findpattern = "add";											//sends "add" to make sure program works
		globalrandnum = randNum;										//initializes global variables
		globalinitial = initial;										//initializes global variables
		numWord();
	}
	
	public void subtractionpattern ()
	{
		int initial = 1;												//initializes first number as 1
		int randNum = (int)(Math.random() * 20 + 1);					//generates random number for sequence
		int loopnumber;
		for (loopnumber=1;loopnumber<6;loopnumber++)					//loops number 6 times, printing initial 5 times and storing the 6th initial
		{
			System.out.printf("%d, ",initial);
			initial = initial - randNum;
		}
		System.out.print("\n\n");
		identifypatternby = "subtract by";								//declares what input the user can give
		identifypatternen = "subtract";									//declares what input the user can give
		identifypatternnu = "minus";									//declares what input the user can give
		identifypatternbo = "negative";									//declares what input the user can give
		findpattern = "subtract";										//sends "subtract" to make sure program works
		globalrandnum = randNum;										//initializes global variables
		globalinitial = initial;										//initializes global variables
		
		numWord();
	}
	
	public void multiplypattern ()
	{
		int initial = 1;												//initializes first number as 1
		int randNum = (int)(Math.random() * 5 + 1);						//generates random number for sequence
		int loopnumber;
		for (loopnumber=1;loopnumber<6;loopnumber++)					//loops number 6 times, printing initial 5 times and storing the 6th initial
		{
			System.out.printf("%d, ", initial);
			initial = initial*randNum;
		}
		System.out.print("\n\n");
		identifypatternby = "multiply by";								//declares what input the user can give
		identifypatternen = "multiply";									//declares what input the user can give
		identifypatternnu = "times";									//declares what input the user can give
		identifypatternbo = "product";									//declares what input the user can give
		findpattern = "multiply";										//sends "subtract" to make sure program works
		globalrandnum = randNum;										//initializes global variables
		globalinitial = initial;										//initializes global variables
		numWord();
	}
	
	public void dividepattern ()
	{
		double divideinitial = 1;										//initializes first number as 1
		int randNum = (int)(Math.random() * 5 + 2);						//generates random number for sequence	
		int loopnumber;
		for (loopnumber=1;loopnumber<6;loopnumber++)					//loops number 6 times, printing initial 5 times and storing the 6th initial
		{
			System.out.printf("%.4f, ",divideinitial);
			divideinitial= divideinitial/randNum;
		}
		System.out.print("\n\n");
		identifypatternby = "divide by";								//declares what input the user can give
		identifypatternen = "divide";									//declares what input the user can give
		identifypatternnu = "by";										//declares what input the user can give
		identifypatternbo = "quotient";									//declares what input the user can give
		findpattern = "divide";
		globalrandnum = randNum;										//initializes global variables
		divideglobalinitial = divideinitial;							//initializes global variables
		numWord();
	}

	
	public void numWord ()
	{
		word1 = String.format("%s %d",identifypatternbo, globalrandnum);//creates correct answer
		word2 = String.format("%s %d",identifypatternby, globalrandnum);//creates variation of correct answer
		word3 = String.format("%s %d",identifypatternnu, globalrandnum);//creates variation of correct answer
		word4 = String.format("%s %d",identifypatternen, globalrandnum);//creates variation of corect answer

		globalword1 = word1;											//creates global variable
		globalword2 = word2;											//creates global variable
		globalword3 = word3;											//creates global variable
		globalword4 = word4;											//creates global variable
		nextNumber();
	}
	
	public void nextNumber()
	{
		if (findpattern.equalsIgnoreCase("add"))
		{
		nextnumber = globalinitial;										//calculates and rearranges variables
		globalnext = nextnumber;										//creates global variable
		}
		if (findpattern.equalsIgnoreCase("subtract"))
		{
		nextnumber = globalinitial;										//calculates and rearranges variables
		globalnext = nextnumber;										//creates global variable
		}
		if (findpattern.equalsIgnoreCase("multiply"))
		{
		nextnumber = globalinitial;										//calculates and rearranges variables
		globalnext = nextnumber;										//creates global variable
		}
		if (findpattern.equalsIgnoreCase("divide"))
		{
		dividenextnumber = divideglobalinitial;							//calculates and rearranges variables
		divideglobalnext = dividenextnumber;							//creates global variable
		}
		printPatternnext();
	}

	public void printPatternnext () 
	{
		Scanner input = new Scanner(System.in);	
		loopnumberguess = 0;
		System.out.print("What’s the next number? (enter an integer or decimal if you think the sequence is division)"); //prompts user what next number in sequence is 
		guess = input.nextInt();
		
		if (guess==globalnext || guess==divideglobalnext)				//if user gets next number right, program moves on to ask what the sequence is
		{
		printPatternpattern();
		}
		
		else
		{
			do
			{
			loopnumberguess++;
			System.out.println("Try again. What’s the next number?");	//if user gets next number in sequence wrong, program gives three tries for the user
			guess = input.nextInt();
			} while(loopnumberguess<3 && (guess!=globalnext || guess!=divideglobalnext));
		printPatternpattern();											//no matter how many tries user takes, the program moves on
		}		
	}
	
	
	public void printPatternpattern ()
	{
	Scanner input = new Scanner(System.in);	
	System.out.println("What is the pattern? (enter arthemetic and number(as integer, not string): plus 1; divide by 2");							//prompts user for what the pattern is
	pattern = input.nextLine();
	
	
	
		if (pattern.equalsIgnoreCase(globalword1))
			{
				System.out.println("\nYou got it correct again! You win!"); //one varaition of correct answer
				findingword = identifypatternbo;
				globalfinding = findingword;
				elsetrue = true;
			}
			
			if (pattern.equalsIgnoreCase(globalword2))
			{
				System.out.println("\nYou got it correct again! You win!"); //one varaition of correct answer
				findingword = identifypatternby;
				globalfinding = findingword;
				elsetrue = true;
			}
			
			if (pattern.equalsIgnoreCase(globalword3))
			{
				System.out.println("\nYou got it correct again! You win!"); //one varaition of correct answer
				findingword = identifypatternnu;
				globalfinding = findingword;
				elsetrue = true;
			}
			
			if (pattern.equalsIgnoreCase(globalword4))
			{
				System.out.println("\nYou got it correct again! You win!"); //one varaition of correct answer
				findingword = identifypatternen;
				globalfinding = findingword;
				elsetrue = true;
			}
			
			else if (!elsetrue)											//if user gets the number sequence wrong, program moves to next method
			{
				printPatternvoid();
			}
			
		
	}
	
	public void printPatternvoid ()
	{
	System.out.printf("\nIncorrect. It was " + "%s %d", word1);			//prints correct answer
	}
	
}

				
			
		 
		
