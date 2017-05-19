/*Surya Dantuluri
September 12, 2016
MathProblems.java
Simple program that prints out math problems and solutions. This is a formatted program.
* Uses: printf() and format
* Uses double, integer, character, and float. 
*  */

public class MathProblems {
	
	public static void main (String args[]) {
		
		System.out.print("\n");
	String answer1 = "5.6*17/3-49%11/2 ";
	double problem1 = 5.6*17/3-49%11/2;
	System.out.printf("1) \t %s=%5.2f", answer1, problem1);
		System.out.print("\n");
				System.out.print("\n");
				System.out.print("1)\t" + Format.right(answer1, 25) + "=" + Format.right(problem1,5,2));	
		
		
				System.out.print("\n");
				System.out.print("\n");

	String answer2 = "16-17*(5%6/3)";	
	int problem2 = 16-17*(5%6/3);
	System.out.printf("2) \t %s=%s", answer2, problem2);
			System.out.print("\n");
    			System.out.print("\n");

    String answer3 = "((char)(56/2+17*3-9%9))";
	char problem3 = (char)(56/2+17*3-9%9);
	System.out.printf("3) \t %s=%s", answer3, problem3);
			System.out.print("\n");
			System.out.print("\n");

    String answer4 = "(int)((double)9/12*3-6.5)";
	int problem4 = (int)((double)9/12*3-6.5);
	System.out.printf("4) \t %s=%s", answer4, problem4);
				System.out.print("\n");
							System.out.print("\n");

    String answer5 = "((int)('g')+(double)('1'))";
	int problem5 = (int)(('g')+(double)('1'));
	System.out.printf("5) \t %s=%s", answer5, problem5);	
				System.out.print("\n");
				System.out.print("\n");

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	}
}

