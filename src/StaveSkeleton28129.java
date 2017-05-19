// Stave.java

import java.util.Scanner;

public class Stave 
{
/*Declare all field variables here (2 objects, at least five int variables).  Be sure they are private. */








	public Stave () 
	{  
			// instantiate both objects, initialize all ints
		







	} 
	
	public static void main (String [] args) 
	{ 				//main is complete except for pseudocode
				
		Stave st = new Stave (); 
		st.playGame(); 
		st.scoreGame();
		st.updateScore();
		st.playGame(); 
		st.scoreGame();
		st.updateScore();
		st.playGame(); 
		st.scoreGame();
		st.updateScore();
	} 
	
	public void playGame () 
	{
		








		
		roll1 = x.rollStave(); 
		y.displayStave(roll1); 
		
		roll2 = x.rollStave(); 
		y.displayStave(roll2); 
		
		roll3 = x.rollStave(); 
		y.displayStave(roll3); 
		
		roll4 = x.rollStave(); 
		y.displayStave(roll4); 
		
	} 
	
/* This method is complete.  scoreGame() builds a String of all 4 rolls as characters, then looks at all 4 characters, counting how many '$' there are.  If four or no '$' score increases by 2.  If two '$' score increases by 1.*/
	public void scoreGame() 
	{ 
		String rolls = "" + (char)roll1 + (char)roll2 + (char)roll3 + (char)roll4; 
		int count = 0;
		score=0;		
		for (int i = 0; i < 4; i++) 
		{  
			if (rolls.charAt(i) == '$')
				count++;
		} 
		
		if (count == 4 || count == 0) 
			score+=2; 
		else if (count == 2) 
			score++; 
	}
	
	public void updateScore () 
	{
		









	} 

} // end class Stave
// Be sure other two classes are written as well (both are very short).
// Neither class uses "static" in their methods - leave it out.  :)
