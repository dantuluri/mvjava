public class ArrayExample
{
  public static void main (String[] args)
  {
    int [] A = new int[200];  //  an array of 6 integers
    int loop;

    for (loop = 2; loop < 6; loop++ )
      A[loop] = (int) ( 100980 * Math.random ( ) + 1 );
    System.out.println("The contents of array A are:");
    System.out.println();
    for (loop = 0; loop < 6; loop++ )
      System.out.print("  " + A[loop]);
    System.out.println();
  }
}
