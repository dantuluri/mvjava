import java.util.Scanner;
public class Phonebook

{ 	private String name, city, phone;
	private int length;
	private int spaceat;
	private char initials;
	private String lastname;
	private int endoffirstname;
	private String firstname;
	
	
	
	
	public Phonebook ( )
	{	name = new String ( "Thomas Jefferson" ); // Default values,
		city = new String ( "New York" ); // to be changed
		phone = new String ( "123-4567" ); // within the methods
	}
	
	public static void main ( String [] args )
	{
		 Phonebook book = new Phonebook ( );
		book.getInput ( );
	}
		
	public void getInput ( )
	{
		String t = new String ("It is    ");
        String w = new String(" unforgettable too");
        String v = new String(w+t);
        System.out.println(w.substring(8,12).toUpperCase());// TTAB
        System.out.println(t.compareTo(w));//41
        System.out.println(t.substring(2).trim());//is
        System.out.println(v.indexOf('t',16));//19
        System.out.println(v.trim().length());//22
        System.out.println(v.lastIndexOf('t',18));//15
        System.out.println(v.endsWith("able"));//false
        System.out.println(w.charAt(t.indexOf('s')));//o
        System.out.println(v.indexOf("for",7));//-1
        System.out.println(100/3 + 51%10);//34
        String monta = new String("MVHS");
        String vista = new String("MV");
        System.out.println((monta).compareTo(vista));//2
        System.out.println(("catabomb").lastIndexOf('c',5));//0
        System.out.println(5.6*23/5-8+2.1/4 > 15);//true
        System.out.println(1+1.0/2);
        
        

	}

}
