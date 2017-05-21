
import java.util.Scanner;//import Scanner
public class Platyuckicken{//class header

	//declare and initialize global variables
	private static int blood  = 0;
	private static int Input = 0;
	private static String surface = "";
	private static int milk = 0;
	private static int eggs = 0;
	private static int feet = 0;
	static String statement = " ";
	public static void main( String [] args){//main() header
		decideType();//call decidetype
		printAnimal();//call printAnimal
	}
	public static void decideType(){//decidetype method header
	System.out.println("Is your animal warmblooded or is it not ? If warm blooded please enter 1. If not enter 0.");//ask for input 0 to 1
	Scanner inputGetter = new Scanner(System.in);//Make scanner , send int to main method
	Input = inputGetter.nextInt();
	if(Input == 1 ){//if ( one ) for warm blooded then  ask surface or milk
		System.out.println("What surface does your animal have?");
		surface = inputGetter.next();
		//surface = inputGetter.next();
		if ( surface.equals ( "fur") || surface.equals ( "hair") ){//if (feathers(bird) or , fur or hair(mammal) ) surfaced
			statement = statement+statement;
			statement = "Your animal is a mammal .";
			System.out.println("Does your animal produce milk? If so , enter 1 . If not , enter 0 ");
			milk = inputGetter.nextInt();
			if (milk == 1){//if ( 0 or 1 ) no milk or milk ( mammal)
				statement = statement+statement;
				statement = "Your animal is a  mammal but not a platypus";
				System.out.println("Please enter 1 if your animal lays eggs and 0 if your animal doesn't lay eggs: ");
				eggs = inputGetter.nextInt();
					if(eggs == 1 ){//if ( 1 = platypus ) lays eggs
					statement = statement+statement;
					statement = "Your animal is a platypus.";
				}
			}
			if(milk == 0) {
				statement = statement+statement;
				statement = "Your animal is a bird.";
				System.out.println("If your bird has webbed feet please enter 1 if not, enter 0");
				feet = inputGetter.nextInt();
				if(feet == 1){// if feet (webbed duck  or not webbed then chicken )
					statement = statement+statement;
					statement = "Your bird is a duck";
				}
				if(feet == 0){
					statement = statement+statement;
					statement = "Your bird is a chicken";
				}
			}
				}
			}
	if(surface.equals ("feathers") ){
		statement = statement+statement;
			statement = "Your animal is a bird.";
			System.out.println("Does your animal produce milk? If so , enter 1 . If not , enter 0 ");
			milk = inputGetter.nextInt();
			if(milk == 0) {
				statement = statement+statement;
				statement = "Your animal is a bird.";
				System.out.println("If your bird has webbed feet please enter 1 if not, enter 0");
				feet = inputGetter.nextInt();
				if(feet == 1){// if feet (webbed duck  or not webbed then chicken )
					statement = statement+statement;
					statement = "Your bird is a duck";
				}
				if(feet == 0){
					statement = statement+statement;
					statement = "Your bird is a chicken";
				}
			}
	}
	else//else ( zero )
		statement = "Sorry,Inconclusive :(";

		}
	public static void printAnimal(){//printAnimal method header
		System.out.println(statement);//print out species of animal, surface and milk ,  and if warm blooded or not

	}

}
