/*Surya Dantuluri
September 7, 2016
CalculatePi
Simple program that calculates Pi
* Uses: double data type 
* 		 printf
* */


public class CalculatePi {      //class declaration
	

double approx1 = 22.0/7;										//calculating approximation 1
double approx2 = ((4.0+100.0)*8.0+62000.0)/20000;				//calculating approximation 2
double diff1 = approx1-3.141592;										
double diff2 = approx2-3.141592;
String line1 = ("I am approximating pi (a bit more than 3.141592) \n"); 	
String calc1 = (" (4+100)x8 + 62000 all divided by 20000 ");

	System.out.print("\n");
	System.out.print(line1);
  			System.out.print("\n");
	System.out.println("The calculation 22/7 yields " + Format.center(approx1,1,2 ) + " \n or more specifically " 		//first sentence including println
	+ Format.right(approx1,8,6) + " shown to 6 places. \n It is " + Format.right(diff1,11,9) + 
	" different from 3.141592 ");
  			System.out.print("\n");
  			System.out.print("\n");
	System.out.printf("The calculation %s yields %s or \n more specificallly %s shown to 6 places. \n It is %f different from 3.141592",	//second sentence
	 calc1, Format.center(approx2,1,2),Format.center(approx2,1,6), diff2);
   			System.out.print("\n");
  			System.out.print("\n");
	}
}

