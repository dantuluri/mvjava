//  Scott DeRuiter     7/9/2002
//  Grades.java
//  Calculate grades and eligibility for a user.

import java.util.Scanner;//import Scanner
import java.io.File;//import File
import java.io.FileNotFoundException;//import FileNotFOundException
import java.io.IOException;
import java.io.PrintWriter;//import printwriter


public class Grades
{
	private int total, counter;
	private double gpa;
	private boolean flagforf;

	public Grades ( )
	{
		total = counter = 0;
		gpa = 0.0;
		flagforf = false;
	}

	public static void main ( String [] args )
	{
		Grades grades = new Grades ( );
		grades.PickupGrades ( );
		grades.PrintGPA ( );
	}

	public void PickupGrades ( )
	{
		char letter;
		boolean goodletter = true;
		TextReader inFile;
		String name = "grades.txt";
		inFile = new TextReader ( name );
		letter = inFile.readlnChar ( );
		if (inFile.fail())
		{
			      System.err.println("Can't open " + name);
			      System.exit(1);

		}
		    while ( !inFile.eof ( ) )
		{

System.out.print ( "\n\nEnter a grade (a non-grade character to quit)  ->   " );
			if ( letter >= 'a' && letter <= 'z' )letter = (char)((int)letter - 32);
			counter++;
			switch  ( letter )
			{
				case 'A':   total += 4;
				    break;
				case 'B':   total += 3;
				       break;
				case 'C':   total += 2;
				       break;
				case 'D':   total += 1;
				    break;
				case 'F':   total += 0;
				   flagforf = true;
				    break;
				default:    counter--;
				    goodletter = false;
				    break;
			}
			letter = inFile.readlnChar ( );
		}

	}


public void PrintGPA ( )
	{
		TextWriter outFile;
		String name = "gpa.txt";
		outFile = new TextWriter ( name );
		if ( counter > 0 )
		{
			gpa = (double)total / (double)counter;
		}
		if ( counter < 4 )
		{
			outFile.println ( "\n\nYou are ineligible, enrolled in less than 4 classes" );
		}
		else if ( flagforf )
		{
			if ( gpa > 2.0 )
			{
				outFile.println ( "\n\nYou are ineligible, 'F' grade with GPA greater than 2.0" );
				outFile.println ( "Your GPA is:  " + Format.right ( gpa, 6, 3 ) + "\n\n" );
			}
			else if ( gpa <= 2.0 )
			{
				outFile.println ( "\n\nYou are ineligible, 'F' grade with GPA less than or equal to 2.0" );
				outFile.println ( "Your GPA is:  " + Format.right ( gpa, 6, 3 ) + "\n\n" );
			}
		}
		else if ( gpa < 2.0 )
		{
			outFile.println ( "\n\nYou are ineligible, GPA less than 2.0" );
			outFile.println ( "Your GPA is:  " + Format.right ( gpa, 6, 3 ) + "\n\n" );
		}
		else
		{
			outFile.println ( "\n\nYou are eligible and enrolled in " + counter + " classes\n" );
			outFile.println ( "Your GPA is:  " + Format.right ( gpa, 6, 3 ) + "\n\n" );
		}
		outFile.close ( );
	}
}
