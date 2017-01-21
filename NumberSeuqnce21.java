import java.util.Scanner;

public class NumberSequence21
{
	private int guess;
	private String pattern;
	private String word;
	private String word1;
	private String word2;
	private String word3;
	private String word4;
	private int initial;
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
	private int guess;
	
	
	public static void main (String [] args) 
	{
		NumberSequence21 sequence = new NumberSequence21 ();
		sequence.selectmethod();		
	}


	public void selectmethod()
	{
		int patternnumber = (int)(Math.random() * 4 + 1);
		if (patternnumber == 1)
		{
		additionpattern();
		}
		else if (patternnumber==2)
		{
		subtractionpattern();
		}
		else if (patternnumber==3)
		{
		multiplypattern();
		}
		else if (patternnumber==4)
		{
		dividepattern();
		}
	}
	
	public void additionpattern () 
	{
		int initial = 1;
		int randNum = (int)(Math.random() * 20 + 1);
		int loopnumber;
		for (loopnumber=1;loopnumber<6;loopnumber++)
		{
			System.out.printf("%2d, ",initial);
			initial = initial + randNum;
		}
		System.out.print("\n\n\n");
		identifypatternen = "add";
		identifypatternby = "add by";
		identifypatternnu = "plus";
		identifypatternbo = "positive";
		findpattern = "add";
		globalinitial = initial;
		numWord();
	}
	
	public void subtractionpattern ()
	{
		int initial = 1;
		int randNum = (int)(Math.random() * 20 + 1);
		int loopnumber;
		for (loopnumber=1;loopnumber<6;loopnumber++)
		{
			System.out.printf("%2d, ",initial);
			initial = initial - randNum;
		}
		System.out.print("\n\n");
		identifypatternby = "subtract by";
		identifypatternen = "subtract";
		identifypatternnu = "minus";
		identifypatternbo = "negative";
		findpattern = "subtract";
		globalinitial = initial;
		
		numWord();
	}
	
	public void multiplypattern ()
	{
		int initial = 1;
		int randNum = (int)(Math.random() * 5 + 1);
		int loopnumber;
		for (loopnumber=1;loopnumber<6;loopnumber++)
		{
			System.out.printf("%2d, ", initial);
			initial = initial*randNum;
		}
		System.out.print("\n\n");
		identifypatternby = "multiply by";
		identifypatternen = "multiply";
		identifypatternnu = "times";
		identifypatternbo = "product";
		findpattern = "multiply";
		globalinitial = initial;
		numWord();
	}
	
	public void dividepattern ()
	{
		int initial = 1;
		int randNum = (int)(Math.random() * 5 + 2);		
		int loopnumber;
		for (loopnumber=1;loopnumber<6;loopnumber++)
		{
			System.out.printf("%2d, ",initial);
			initial= initial/randNum;
		}
		System.out.print("\n\n");
		identifypatternby = "divide by";
		identifypatternen = "divide";
		identifypatternnu = "by";
		identifypatternbo = "quotient";
		findpattern = "divide";
		globalinitial = initial;
		numWord();
	}

	
	public void numWord ()
	{
		word1 = String.format("%s %d",identifypatternbo, randNum);
		word2 = String.format("%s %d",identifypatternby, randNum);
		word3 = String.format("%s %d",identifypatternnu, randNum);
		word4 = String.format("%s %d",identifypatternen, randNum);
		globalword1 = word1;
		globalword2 = word2;
		globalword3 = word3;
		globalword4 = word4;
		nextNumber();
	}
	
	public void nextNumber()
	{
		if (findpattern.equalsIgnoreCase("add"))
		{
		nextnumber = globalinitial + randNum;
				System.out.print(nextnumber);
		}
		if (findpattern.equalsIgnoreCase("subtract"))
		{
		nextnumber = globalinitial - randNum;
				System.out.print(nextnumber);
		}
		if (findpattern.equalsIgnoreCase("multiply"))
		{
		nextnumber = globalinitial*randNum;
				System.out.print(nextnumber);
		}
		if (findpattern.equalsIgnoreCase("divide"))
		{
		nextnumber = globalinitial/randNum;
		System.out.print(nextnumber);
		}
		printPattern();
	}

	public void printPattern () 
	{
		Scanner input = new Scanner(System.in);	
		loopnumberguess=1;	
		System.out.print("What is the next number: ");
		guess = input.nextInt();
		
		if (guess==nextnumber)
		{
		System.out.print("\n What is the pattern: ");
		pattern = input.nextLine();
		}
			
		else if 
		{
		for (guess!=nextnumber && loopnumberguess<4)
		System.out.print("\nTry again. What is the next number: ");
		loopnumberguess++;
		guess = input.nextInt();
		}
			
			if (pattern.equalsIgnoreCase(globalword1))
			{
				System.out.println("\nYou got it correct again! You win!");
				findingword = identifypatternbo;
			}
			
			if (pattern.equalsIgnoreCase(globalword2))
			{
				System.out.println("\nYou got it correct again! You win!");
				findingword = identifypatternby;
			}
			
			if (pattern.equalsIgnoreCase(globalword3))
			{
				System.out.println("\nYou got it correct again! You win!");
				findingword = identifypatternnu;
			}
			
			if (pattern.equalsIgnoreCase(globalword4))
			{
				System.out.println("\nYou got it correct again! You win!");
				findingword = identifypatternen;
			}
			
			else
			{
				System.out.printf("\nIncorrect. It was " + "%s %d", findingword, randNum);
			}
		
		
		

		
		
		
		
	}
	
}

				
			
		 
		
