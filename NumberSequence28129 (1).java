/*
 * 
 */

import java.util.Scanner;
import java.lang.util.Math.random;

public class NumberSequence 
{
	private int choosepattern;
	private int addnumber;
	private int nextnumber;
	private String pattern;
	private int loopnumber;
	private int addon;
	
	public static void main (String[] args) 
	{
		NumberSequence sequence = new NumberSequence();
		choosepattern = (Math.random()*4+1)
		sequence.patternadd();
		sequence.patternsubstract();
		sequence.patternmultiply();
		sequence.patterndivide();
		sequence.getData();
		sequence.printSequence();
	}
	
	public void pattern()
	{
	
	}
}

