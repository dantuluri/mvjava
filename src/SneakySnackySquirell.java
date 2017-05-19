/*Surya Dantuluri
* October 10, 2016
* SneakySnackySquirell.java
* Simple program that plays the game SneakySnackySquirell
* Uses double, and integer data types
* Uses Scanner class
* Uses multiple methods and classes
* 
* initializes all needed variables
* 
* calculates random numbers
* outputs amount of acorns holly has
* input: return
* 
* Testing plan:
* input: retur
* Output: double
 */


import java.util.Scanner;	//import library so have access to Scanner

public class SneakySnackySquirell 
{
	Player holly;
	public static void main (String[]args) 
	{
		SneakySnackySquirell sss = new SneakySnackySquirell(); //create an instance of the class SneakySnackySquirrel
		sss.run(); //use the instance your created to call the run method
	}
	
	public void run()
	{
		boolean again = true; //declare a boolean called again and initialize it with true.
		int rand = 56;   //declare the variable called rand and initialize it to 56.  You may have to read later to 
       						  //determine what data type to use.
		holly = new Player("holly");   //call constructor for the Player class; construct the Player
							      					//called holly
		while ( holly.acorn < 5 && again )	//this repeats the next four lines until you win.  You do not need to add 
		{									//anything to this line.
			rand = spin();   //call the method called spin and accept the result
			decide((byte)rand);  //call the decide method, passing the random number as the parameter
			holly.printScore();  //call printScore() in the Player class
			if (holly.acorn < 5)	        // this is so when the game ends, it does not ask to spin again.

				again = playAgain();  //call playAgain and accept returned value (local boolean already
											// declared)  
		}
	}

	public boolean playAgain()	//this method lets us control playing again, creating 
	{														//user-interaction
		Scanner reader = new Scanner(System.in);  //declare and instantiate a Scanner 
										      //called reader	
		String typed = new String ("");	
		System.out.println("Press return to spin again. ");
		typed = reader.nextLine();  
		return true;  //pass the value true (a variable is not needed) back to the method call for 
									  //playAgain()
	}

	public byte spin()  	 //spin() method generates random values
	{
		byte spun = -6;
		spun = (byte)(Math.random()*8+1);  //generate a random number btwn 1 and 8 
																	//inclusive
		return(spun);  //designate what will be sent back to the method call that got us to 
											    //spin() earlier
	}

	public void decide(byte input)	// This method is for deciding how to 
	{				//change the acorn count based on the spin.  Finish the header.  The body is complete.	
		System.out.println(holly.playerName + " spun " + input);
		if(input >= 1 && input <= 5)
			holly.acorn = holly.acorn + 1;
		else if (input == 6)
			holly.acorn = 0;
		else if (input == 7)
			holly.acorn = holly.acorn-1;
		else if (input == 8)
			holly.acorn = holly.acorn + 2;
	}	//close decide()
}	//close first class


///  CUT THE FOLLOWING CLASS OUT OF THIS FILE AND MAKE A NEW FILE CALLED:  Player.java

