/*Surya Dantuluri
 * Food3.java
 * 
 *
 */
public class Food	
{		
   protected String str;	
   public Food()	
   {	
   str="";	
   }	
   public Food (String prepMethod, String ingredient,String name, double priceperunit, String unitprice, 
   double numberoffood, String sinclude, double unitpriceadjust)	
   {
	   double revenue;
	   double adjust;
	revenue = numberoffood*priceperunit;
	adjust = revenue/unitpriceadjust ;  
   str = "At the sale: " + name + " " + prepMethod + " with " + ingredient +
   " will be sold for " + priceperunit + " " + unitprice + " each. " + "With " + numberoffood + " " + name + 
   sinclude + ", $" + adjust + " can be made.";
  	
  
  
   }	
   public void printForSale()	
   {	
  System.out.println(str);
   }	
  
  
}
