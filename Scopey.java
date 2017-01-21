public class Scopey
{
  private int test = 30;
  
  public void printLocalTest()
  {
    int test = 20;   
    System.out.println("\nprintLocalTest: test = " + test);
  }

  public void printInstanceTest()
  {
    System.out.println("\nprintInstanceTest: test = " + test);
    test =+21;
  }
  
  public void printedit()
  {
	System.out.println("\n justs wants make surse printeditTest: = "+ test);
  }
  
  public void printParamTest(int test)
  {
    System.out.println("\nprintParamTest: test = " + test);
  }

  public static void main (String[ ] args)
  {
    int test = 10;
    
    Scopey st = new Scopey();
    System.out.println("\nmain: test = " + test);
    
    st.printLocalTest();
    st.printInstanceTest();
    st.printedit();
    st.printParamTest(40);
  }
}
