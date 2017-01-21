/*Surya Dantuluri
 * FoodTester.java
 * 
 * 
 */


public class FoodTester {
	
	public static void main (String args[]) {
		Food food1 = new Food ("baked","bananas","muffins", 50, "cents", 12, "(s)", 100);	
		
   food1.printForSale();	

   Food food2 = new Food ("fried","yam","fritters", 1.00, "dollars", 1, "(s)", 1 );	
  
   food2.printForSale();	
 
   Pizza pizza = new Pizza (" anything");	
  	
   pizza.printForSale();	
  

	}
}

