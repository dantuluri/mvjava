/*Surya Dantuluri
 * October 26, 2016
 * FoodTester.java
 * Simple program that holds ingredients and food that will be sold at a bake sale
 */


public class FoodTesterFinal {
	
	public static void main (String args[]) {
	Food food1 = new Food ("baked","bananas","muffins", 50, "cents", 12, "(s)", 100, "/n");	
		
   food1.printForSale();	

   Food food2 = new Food ("fried","yam","fritters", 1.00, "dollars", 1, "(s)", 1, "/n" );	
  
   food2.printForSale();	
 
   Pizza pizza = new Pizza (" anything");	
  	
   pizza.printForSale();	
  

	}
}

