
import java.util.Scanner;

public class ClassSize{

private int[] classes;
private int total;
private int numOfClasses;
private int average;

        public ClassSize(){

                classes = new int[30];
                total = 0;
                numOfClasses = 0;
                average = 0;

        }// end of constructor


        public static void main(String[] args){

                System.out.println("\n\n");

                ClassSize cs = new ClassSize();
                cs.run();

                System.out.println("\n\n");

        } // end of main


        public void run(){

                getInput();
                printArray();
                printStatistics();

        }// end of run


        public void getInput(){

                String temp;
                Scanner scanner = new Scanner(System.in);

                for(int i = 0; i<classes.length; i++){

                        System.out.println("Enter the number of students in class " +
numOfClasses);
                        temp = scanner.nextLine();

                        if(temp.equalsIgnoreCase("quit")){

                                i = 29;

                        }
                else{

                        classes[i] = Integer.parseInt(temp);
                        total += classes[i];
                        numOfClasses++;

                }

        }

                average = total/numOfClasses;

        }// end of getInput


        public void printArray(){

                int[] index = new int[numOfClasses];
                int count = 0;

                        for(int i = 0; i<index.length; i++){

                                System.out.println("Classroom " + count++ + " has " + classes[i] +
"people.");

                        }

        } // end of printArray


        public void printStatistics(){

                int[] index = new int[numOfClasses];
                int count = 0;

                System.out.println("\nThere are a total of " + numOfClasses + "
Classes.\n");
                System.out.println("The average people in each class is " + average +
"\n");

                        for(int i = 0; i<index.length; i++){

                                if(classes[i]<36){

                                        System.out.println("Classroom " + count++ + " does not exceed 36
people by " + -1*(classes[i]-36) + " people.");

                                }

                                else if(classes[i]>36){

                                        System.out.println("Classroom " + count++ + " exceeds 36 people by "
+ (classes[i]-36) + " people.");

                                }

                                else{

                                        System.out.println("Classroom " + count++ + " has exactly 36 people.");

                                }

                        }

        int max = classes[0];
        int keepTrack = 0;

                for(int j = 0; j<index.length; j++){

                        max = Math.max(classes[j], max);
                        keepTrack++;

                } System.out.println("\nClassroom " + keepTrack + " has the most people
with " + max + " people."); //

        int min = classes[0];
        int keepTrack2 = 0;

                for(int k = 0; k<index.length; k++){

                        min = Math.min(classes[k], min);
                        keepTrack2++;

                } System.out.println("\nClassroom " + keepTrack2 + " has the least
people with " + min + " people.");

        }// end of printStatistics


} // end of class
