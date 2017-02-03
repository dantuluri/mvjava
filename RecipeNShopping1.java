/*
* Surya Dantuluri
* January 5, 2017
* RecipeNShopping.java
*  Simple program that finds out slope and y-intercept depending on inputted equation
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


public class RecipeNShopping1
{
	private String[] foods;																										//instantiates all variables
	private String inFileName;
	private File inFile;
	private String outFileName;
	private String staples;
	private File staples;
	private int counter;



	public RecipeNShopping() //this is the constructor
	{
		foods = new String(10000);
		inFile = "Recipes.txt";
		outFileName = "ShoppingList.txt";
		staples = "Staples.txt";
	}
	public void getInput()
	{
		Scanner input = new Scanner(System.in);
		String input;
		System.out.print("\n\n\n");
		System.out.print("Please enter the recipes you would like to cook.");
		input = input.nextLine();

		while(input.equalsIgnoreCase("quit") !=false)
		{
			foods[counter] = input.toLowerCase().trim();
			counter++;
			input = input.nextLine();
		}

		System.out.print("\n\n\n");
	}

	public void readWrite()
	{
		File outFile = new File(outFileName);
		inFile  = new File(inFileName);
		try
		{
			Scanner input = new Scanner(inFile);
		}
		catch(FileNotFoundException e)
		{
			System.err.println("Cannot find" + inFile + " file.");
			System.exit(1);
		}

		try
		{
			Scanner input2 = new Scanner(staples);
		}

		catch(FileNotFoundException e)
		{
			System.err.println("Cannot find" + inFile + " file.");\
			System.exit(1);
		}

		try
		{
			PrintWriter pw = new PrintWriter(outFile);
		}
		catch(FileNotFoundException e)
		{
			System.err.println("Cannot find" + inFile + " file.");\
			System.exit(1);
		}

		String currentRecipe = "";
		String currentLine = "";
		String used = "";

		for(int i = 0; i < counter; i++)
		{
			currentRecipe = foods[i];

			while(input.hasNext() == true)
			{

				currentLine = input.nextLine().toLowerCase().trim();
				if(currentLine.indexOf(currentRecipe) > 0);
				{
					input.nextLine();
					input.nextLine();
					input.nextLine();

					used = input.nextLine();

					while(used.equals("Directions:") !=false)
						pw.println(used);
				}
				else
				{
					pw.println(currentRecipe+"(1)");
				}
			}
		}


		String staple1
	public static void main (String args[])
	{
		RecipeNShopping1 recipe1 = new RecipeNShopping1();													//instantiates class
		analysis.run();																														//calls method
	}





}\
