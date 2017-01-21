/*
 */


public class Final 
{
	private int int1;
	private int int2;
	private int amigo;
	private int hola;
	
	public static void main (String[] args)
	{
		Final test = new Final
		test.parameters();
		test.numbers();
	}
	
	public void parameters()
	{
	hola = 1;
	adios = 21;
	for (hola<adios);
	{
		hola++;
	}
	return (hola);
	}
	
	public void numbers()
	{
	System.out.println("1)	8.4/2.1-(int)(‘5’)%10*5/2+20/7*4 ==%f", 8.4/2.1-(int)(‘5’)%10*5/2+20/7*4);	
	System.out.println("2)	(char)(86+39/16%3-29%10*2) ==%c" , (char)(86+39/16%3-29%10*2));
	System.out.println("3)	(double) 43/5-(byte)(39.6)/12+4 ==%d" , (double) 43/5-(byte)(39.6)/12+4);
	System.out.println("5)	5+2*8%3-59%12/3 ==%f" , 5+2*8%3-59%12/3);
	System.out.println("6)	(int)(43.7/10.2)-(int)(‘7’)/11.0*2 ==%i" , (int)(43.7/10.2)-(int)(‘7’)/11.0*2);
	System.out.println("7)	((14%3*5>=9.7)&&!(10+7/2.0>=13)) ==%f" , ((14%3*5>=9.7)&&!(10+7/2.0>=13)));
	System.out.println("8)	(double)(8/5)==(double)8/5 ==%f" , (double)(8/5)==(double)8/5);
	System.out.println("9)	20/6 ==%d" , 20/6);
	System.out.println("10)	(short)(53.6+67.2/14)%(byte)(12) ==%f" , (short)(53.6+67.2/14)%(byte)(12));
	System.out.println("11)	(double)(35/4)-(int)4.6*3 ==%d" , (double)(35/4)-(int)4.6*3);
	System.out.println("12)	(char)(82+5%6-(int)(‘2’)/9%12) ==%c" , (char)(82+5%6-(int)(‘2’)/9%12));
	}
}

