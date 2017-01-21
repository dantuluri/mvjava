/*Surya Dantuluri
 * October 26, 2016
 * Food.java
 * Simple program that inherites other classes' inputs to print out foods that will be sold at a bake sale
 */
public class Food	
{		
   protected String str;	
   public Food()	
   {	
   str="";	
   }	
   public Food (String prepMethod, String ingredient,String name, double priceperunit, String unitprice, 
   double numberoffood, String sinclude, double unitpriceadjust, String space)	
   {
	   double revenue;
	   double adjust;
	revenue = numberoffood*priceperunit;
	adjust = revenue/unitpriceadjust ;  
   str = "At the sale: " + name + " " + prepMethod + " with " + ingredient +
   " will be sold for " + priceperunit + " " + unitprice + " each. " + "With " + numberoffood + " " + name + 
   sinclude + ", $" + adjust + " can be made." + space;
  	
  
  
   }	
   public void printForSale()	
   {	
  System.out.println(str);
   }	
  
  
}
