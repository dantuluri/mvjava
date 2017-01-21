public class Player    
{
	int acorn;
	String playerName;
	
	public Player()   //constructor method for a player used if we do not have the player's information.
	{
		acorn = -5;		
		playerName = "";
	}
	
	public Player (String name)   // constructor method for a player  with a name & score
	{														// this overloads the constructor
		acorn = 0;  //set the player's acorn count to zero  the game has just begun!  Use 
											//the already declared field variable.
		playerName = name;  	//give the player the name that was passed to this method and save it as 
											//a field variable (already declared)
	}
	
	public void printScore()  //  complete the header for printScore().  The body of the method is 
	{			//complete.  This method generates appropriate output  number of acorns and a win message.
		System.out.println(playerName + " has this many acorns: " + acorn);
		if (acorn >= 5)
			System.out.println("You won!");
			
	}
}
