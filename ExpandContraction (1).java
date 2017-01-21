/*
 * ExpandContraction.java
 * 
 */

import java.util.Scanner;

public class ExpandContraction.java

	{
	private String contracted;
	private String expanded;
	private Scanner input;

	public ExpandConstructor( ) //this is the constructor
	{
		contracted = "";
		expanded = "";		
	}

	public static void main(String [] args)
	{
	ExpandContraction ec = new ExpandContraction();
	ec.run();
	}

	public void run()		
	{
		do
		{
			Scanner input = new Scanner(System.in);	
			getInput();
			processString();
			System.out.println("Would you like to expand another contraction? Type quit to stop");
			contracted = input.nextLine();
		}while(contracted.equalsIgnoreCase("quit"));
	}

	public void getInput ( )
	{
	System.out.println("What contraction would you like to expand?");
	contracted = input.nextLine();
	}

	public void processString ( )
	{
		contracted.trim();
		if(contracted.equalsIgnoreCase("don't")
		{
			expanded = "do not";
		}
		
		if(contracted.equalsIgnoreCase("shouldn't")
		{
			expanded = "should not";
		}
		
		if(contracted.equalsIgnoreCase("didn't")
		{
			expanded = "did not";
		}
		if(contracted.equalsIgnoreCase("can't")
		{
			expanded = "can not";
		if(contracted.equalsIgnoreCase("couldn't")
		{
			expanded = "could not";
		}
		if(contracted.equalsIgnoreCase("hadn't")
		{
			expanded = "had not";
		}
		if(contracted.equalsIgnoreCase("won't")
		{
			expanded = "would not";
		}
		if(contracted.equalsIgnoreCase("shant")
		{
			expanded = "shall not";
		}
		}
	}

	public void printResult()
	{
	}
}
