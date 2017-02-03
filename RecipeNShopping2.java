import java.util.Scanner;//import Scanner
import java.io.File;//import File
import java.io.FileNotFoundException;//import FileNotFOundException
import java.io.PrintWriter;//import printwriter

public class RecipeNShopping{//class Header
	private static String input = " ";
	private static String re = " ";
	private static String cipe = " ";

	public static void main(String[] allen){///main()
		RecipeNShopping run = new RecipeNShopping();
		run.Input();//call method
	}
	public static void Input(){///input method to sort food items
		String line = " ";
		File shop = new File("Shoppinglist.txt");
		File r = new File("Recipes.txt");

		Scanner read = null;
		PrintWriter Printer = null;//make a Scanner to read
		Scanner in = new Scanner(System.in);
		input = in.next();
		String[] ia=new  String[26];//array to store input
		ia[0]=input;
		for(int x = 1;x<25&&ia[x-1].equals("Quit")==false;x++){///use for loop to accept input
			input = in.next();//use Scanner to read input
			ia[x]=input;//an if else block to see if input is quit
				//for loop to store input in an array

		}
		try{///make try/catch block for scanner
			read = new Scanner(r);
			}catch(FileNotFoundException e){//catch FileNotFoundException e
			}
		try{
			Printer = new PrintWriter(shop);
		}catch(FileNotFoundException e ){
			System.out.println("Can't find file.");
			System.exit(1);
					///try for Printer
			//instantiate PrintWriter(Printer) to print in ShoppingList.txt in a try catch block
		///catch for FileNotFoundException
			//if caught exit using System.exit(1);
		}


		while(read.hasNextLine()){//use a loop to take a string from the array and look for it in Recipes.txt
			line=read.nextLine();//instantiate Scanner to look in Recipies.txt
			for(int a = 0 ; a<25;a++){
				if(ia[a].equals("Tacos")||ia[a].equals("tacos")){

				}
				else if (ia[a].equals("Chickpea Chicken Salad")||ia[a].equals("chickpea chicken salad")){
					cipe=line.substring(7);
					re=line.substring(0,5);
					while(re.equals("Recipe")==false
					){
						Printer.println(line);
					}
				}
				else if(ia[a].equals("Asparagus")||ia[a].equals("asparagus")){
					Printer.println(line);
				}
				if(ia[a].equals("Quit"))
					Printer.println("______________________");

			}

		}




		Printer.close();//close PrintWriter
		read.close();//close the Scanner



	}
}
