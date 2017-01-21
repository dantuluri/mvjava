import java.util.Scanner;
public class PhoneBook

{ 	private String name, city, phone;
	private int length;
	private int spaceat;
	private char initials;
	private String lastname;
	private int endoffirstname;
	private String firstname;
	
	
	
	
	public PhoneBook ( )
	{	name = new String ( "Thomas Jefferson" ); // Default values,
		city = new String ( "New York" ); // to be changed
		phone = new String ( "123-4567" ); // within the methods
	}
	
	public static void main ( String [] args )
	{
		 PhoneBook book = new PhoneBook ( );
		book.getInput ( );
		book.processInputAndPrint ( );
	}
		
	public void getInput ( )
	{
		Scanner input = new Scanner(System.in);	
		System.out.print("Enter name as first last:");
		name = input.nextLine();
		
		System.out.print("Enter city of residence:");
		city = input.nextLine(); 
		
		System.out.print("Enter phone number (without area code):");
		phone = input.nextLine();
	}
	public void processInputAndPrint()
	{
		name = name.trim();
		spaceat = name.indexOf(' ');
		spaceat = spaceat+1;
		initials = name.charAt(spaceat);
		length = name.length();
		lastname = name.substring(spaceat,length);
		endoffirstname = spaceat-2;
		firstname = substring(0,endoffirstname);
		
		city = city.trim();
		if (city=="Mountain View")
		{
			extension = "(650)";
		}
		else if(city=="Palo Alto")
		{
			extension = "(650)";
		}
		else if(city=="Cupertino")
		{
			extension = "(408)";
		}
		else
		{
			extension = "(408)";
		}
		
		System.out.print("The phone number will be alphabetized under " + initials + ", under " + lastname + ", " + firstname + "at " + extension + " " + phone);
	}
	
}
