

import java.util.Scanner;//import Scanner
import java.io.File;//import File
import java.io.FileNotFoundException;//import FileNotFOundException
import java.io.IOException;
import java.io.PrintWriter;//import printwriter


public class RecipeNShopping
{//class header

	private String[] array;
	private int counter;
	private String food;
	private String line;

	private Scanner readRecipe;
	private Scanner readStaples;
	PrintWriter printList;

		 private int number;

	public static void main(String[]args)
	{//main method header
		RecipeNShopping recipe = new RecipeNShopping();													//instantiates class
		recipe.getInput();
		recipe.getStaples();

	}


	public void getInput(){//input method header
		String [] array = new String[1000];//make array
		int counter = 0;//create counter to keep track of slots in array
		String food = " ";//create variable for input
		Scanner readRecipe = new Scanner(System.in);//declare and instantiate scanner
		try{//instantiate PrintWriter in a try catch block
			printList = new PrintWriter(new File("ShoppingList.txt")); // YO MA BOI
		}catch(IOException e){//to catch FileNotFoundException
			System.out.println("Cannot append to file");
			System.exit(1);
		}
		for(int i = 0; i!= -1; i++)
		{//for loop to save user input into array
			food = readRecipe.nextLine();
			if(food.equalsIgnoreCase("quit"))
				 i = -2;
			else
			{
				array[i] = food;
				counter++;
			}
		}
		for(int x = 0; x < counter; x++){//loop to call method to get ingredients
			findRecipe(array[x]);
		}
		printList.close();//saves PrintWriter
	}

	public void findRecipe(String name){//findRecipe method finds ingredients
		Scanner readRecipe = new Scanner(System.in);
		String line = " ";
		int num = 0;
		try{//instantiate Scanner in a try catch block
			readRecipe = new Scanner(new File("Recipes.txt"));
		}catch(FileNotFoundException e){//to catch FileNotFoundException
			System.out.println("Cannot find file");
			System.exit(1);
		}
		String prev = "";
		while(readRecipe.hasNext()){//while loop to get ingredients
			prev = line.nextLine()
			line = readRecipe.nextLine();//reads each line
			if(line.indexOf("Recipe: ")==0){//find keword 'recipe'
				if((line.substring(8,8+name.length())).equalsIgnoreCase(name)){//find recipe of inputted dish
					while(!line.equals("Directions:")){//while loop to print out inngredients to ShoppingList
						line = readRecipe.nextLine();
						if(line.equals("Ingredients:")){
							line = readRecipe.nextLine();
							while(line.length()!=0){
								printList.println(line);
								line = readRecipe.nextLine();
							}
							num = 1;
						}
					}
				}
			}
		}
		if(num == 0)//if inputted dish is not found in Recipes.txt, print directly to ShoppingList.txt
			printList.println(name + "(1)");
	}

	public void getStaples(){//getStaples method prints contents of staples.txt to ShoppingList.txt
		Scanner readStaples = new Scanner(System.in);
		String line = " ";
		try{
			readStaples = new Scanner(new File("Staples.txt"));
		}catch(FileNotFoundException e){//to catch FileNotFoundException
			System.out.println("Cannot find file");
			System.exit(1);
		}
		while(readStaples.hasNext()){
			line = readStaples.nextLine();
			printList.println(line);

		}
	}
}
