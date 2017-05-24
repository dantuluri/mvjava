
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.File;

public class ReadWritePoem{

	private String inFileName, outFileName;
	private Scanner input;
	private PrintWriter output;

	public ReadWritePoem()
	{
		inFileName = "poem.txt";
		outFileName = "output.txt";
		input = null;
		output = null;
	}

	public void readIt()
	{
		File inFile = new File(inFileName);
		try
		{
			input = new Scanner(inFile);
		}
		catch(FileNotFoundException e)
		{
			System.err.printf("ERROR: Cannot Find the File: " + inFileName);
			System.exit(1);
		}
	}

	public void writeIt()
	{
		File outFile = new File(outFileName);

		try
		{
			output = new PrintWriter(outFile);
		}
		catch(IOException e)
		{
			System.err.print("ERROR: Cannot Create: " + outFileName+" file");
			System.exit(1);
		}

	}

	public void getWords()
	{
		System.out.println("\n\n\n");
		String word = "";
		while(input.hasNext())
		{
			word = input.next();
			input.nextLine();
			output.println(word);
		}
		output.close();
	}

	public static void main(String[] args)
	{
		ReadWritePoem rwp = new ReadWritePoem();
		rwp.readIt();
		rwp.writeIt();
		rwp.getWords();

	}
}
