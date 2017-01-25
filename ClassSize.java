/*
* Surya Dantuluri
* January 5, 2017
* EquationAnalyst.java
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


public class ClassSize
{
	int sum;
	int i;
	String students;
	int numberOfStudents;
		public ClassSize()																											 //this is the constructor
		{
			String[] size = new String[30];
		}

		public static void main (String args[])
		{
			ClassSize classroom = new ClassSize();													//instantiates class
			classroom.run();
			classroom.printData();																												//calls method
		}


	public void run()
	{

		Scanner input = new Scanner(System.in);																				//initializes scanner input
		System.out.println("\n\n\nWelcome to ClassSize. Please enter your class size. (Enter a positive integer, such as 39)");
		sum = 0;
		for(int i = 0; i < size.length(); i++)
		{
				System.out.print("\n");
				students = input.nextLine();
				students = students.trim();
				numberOfStudents = Double.parseDouble(students);
				sum = sum + numberOfStudents;
				size[i] = studnets;

		}
	}

	public void printData()
	{
		System.out.prtinf("There are %f total number of classrooms", size.length);
		System.out.prtinf("The average class size is %f students", sum/size.length);
		System.out.prtinf("The average class size is %f students", sum/size.length);

	}

}
