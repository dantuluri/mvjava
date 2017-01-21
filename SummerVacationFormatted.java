/*Surya Dantuluri
August 28, 2016
SummerVacationFormatted
Simple program that prints out what I did over the summer. This is a formatted program.*/
public class SummerVacationFormatted	//class declaration
{
	public static void main (String[]args)	//method header
	{
		String firstLine = "While I was there, I ate some cereal and then watched some Pokemon.";
		String contLine = "I had to go out of my couch and go and catch some Pokemon";
		 String thirdLine = "To catch Pikachu, he was 9.83 feet away.";

			int dist = 9;
			System.out.printf("Over the summer I went to my couch which was %f feet away, to watch TV", 8.93); 
			System.out.print("\n");
								System.out.print("\n");
			System.out.print(Format.right(firstLine, 100) + "my summer was really fun.");
			System.out.print("\n");
								System.out.print("\n");
			System.out.printf("%s \n %s", "Then I got bored, I played PokemonGo everyday, I played PokemonGo.", contLine);
											System.out.print("\n");
								System.out.print("\n");

			System.out.printf(Format.center(thirdLine,100));
			int number = 2;
			double numbertwo = 5.3;
			String line1 = "I played a lot of games over the summer";
			String line2 = "I also played and practiced soccer";
			String line3 = "I also did a lot of work for math and earned some money doing so";
			System.out.println(Format.left(line1, 75));
			System.out.print("\n");
			System.out.println(Format.right(line2, 75));
			System.out.print("\n");
			System.out.println(Format.center(line3, 75));
			System.out.print("\n");
	
			System.out.printf("I walked %d many miles over the summer", number);
						System.out.print("\n");
												System.out.print("\n");

			System.out.printf("I ran %f many miles over Hawaii", numbertwo);
									System.out.print("\n");
						System.out.print("\n");

			
		
	}
}

