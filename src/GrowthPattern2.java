// Richard Yen
// 1/6/17
// GrowthPattern2
// This code will calculate the grtowth of the plant, using symbols to determine the difference in height after a certain amount of time. 1, 2, 3, etc. will determine the amount of time passed.
// TESTING PLAN:
// Everythig will work; No user input. Output is already decided. (No scanner) Only the numbers in the array shopuld be used
public class GrowthPattern2 {

    private char sign;                                                                                // declaring a character variable
    private int[] height;                                                                            // declaring an array variable
    private final int PLUS = 5;                                                                      // declaring int variables
    private int time;                                                                                // ("the blbkbk " + increment++ + "fsdfsdf.") increment = 0
    private int number;
    private double growthRate;                                                                        // declaring double variable
    public GrowthPattern2() {                                                                        // class name(GrowthPattern2)

        sign = ' ';                                                                                    // initializing character(sign)
        height = new int[]{0, -3, 1, 2, 3, 4, 3, 4, 4, 6, 8, 6, 6, 7, 10};                            // intitialiing array(height);
        time = 0;                                                                                    // initializing integers:time, number
        number = 0;
        growthRate = 0;                                                                                // initializing double(growthRate)
    }
    public static void main(String[]args) {                                                            // main method
        GrowthPattern2 gp2 = new GrowthPattern2();                                                        // declaring and initializing GrowthPattern object
        gp2.run();                                                                                    // calling run method
    }

    public void run() {                                                                                // run method
        System.out.print("\n\n\n");                                                                    // opening 3 lines at the beginning of output

        printHistogram();                                                                            // calling the printHistogram

        System.out.print("\n\n\n");                                                                    // opening 3 lines at the end of the code
    }
    public void printHistogram() {                                                                    // printHistogram method

        int last = 0;                                                                                // declaring and intializing a variable(only acsesible inside method)
        for (int i = 0; i < height.length; i++) {                                                    // for loop (for printing the + - o multuple times

            if(height[i] == last)                                                                    // if statements(printing out o = + depending on condition)
                sign = 'o';

            else if(height[i] > last)
                sign = '+';

            else
                sign = '-';

            time = i;                                                                                // calculating the time

            number = height[i] + PLUS;                                                                // claculating number

            printPlant();                                                                            // calling printPlant method

            last = height[i];

        }
    System.out.printf("\n\nThe Growth Pattern is : %.2f",(double)(height[14])/height.length);        // Printing out growth rate
    System.out.println();                                                                            // opening a single space
    }



    public void printPlant() {                                                                        // printPlant method
        System.out.print("\n");                                                                        // printing an open line
        System.out.printf("t%d\t", time);                                                            // printing out the time

        for(int i = 0; i < number; i++) {                                                            // if statement; printing out characters
            System.out.print(sign);
        }
        }

}
