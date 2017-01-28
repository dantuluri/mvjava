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
	int firstNumber;
	int secondNumber;

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

		for(int i = 0; i < 30; i++)
			{
			System.out.print("\n");
			students = input.nextLine();
			students = students.trim();
			students = Double.parseDouble(students);
			numberOfStudents = Double.parseDouble(students);
			sum = sum + numberOfStudents;
			size[i] = students;
			}
	}

	public void printData()
	{
		for(int i = 0; i < 30; i++)
			{
			System.out.println("Class size of inputted room %f: %s\n\n", i, size[i]);
			}

		for(int i = 0; i < 30; i++)
			{
				firstNumber = size[i];
				secondNumber = 1 + size[i];
				maxValue = Math.max(firstNumber, secondNumber);

				if (size[i] > maxValue)
				{
        maxValue = convertedValues[i];
    		}
			}

			for(int i = 0; i < 30; i++)
				{
					firstNumber = size[i];
					secondNumber = 1 + size[i];
					minValue = Math.min(firstNumber, secondNumber);

					if (size[i] < minValue)
					{
	        minValue = convertedValues[i];
	    		}
				}


		System.out.prtinf("There are %f total number of classrooms\n", size.length);
		System.out.prtinf("The average number of students in a class is %f students\n", sum/(size.length));
		System.out.prtinf("The biggest class has %f students", maxValue);
		System.out.prtinf("The smallest class has %f students", minValue);
		System.out.prtinf("These are the classes that exceeed the ideal maximum of students in a classroom (exceed 36 students)";

		for(int i = 0; i < 30; i++)
			{
				if(size[i]>36)
				{
				
				System.out.println
				}


			}



	}

}
