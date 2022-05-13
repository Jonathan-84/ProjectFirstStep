import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {

            /*
            Capture the user input, not restricted
            Using the switch method
            compare the inputed number with the /5 Fizz; /3 Buzz both
            both 3 && 5 FizzBuzz

            if not divisible by 3 && 5, then print the users inputted number
            figure out how to restrict the answer to only whole numbers


       ;*/


            Scanner scanner = new Scanner(System.in);

            System.out.print("Input a number:");
            int numInputted = scanner.nextInt();
            System.out.println(numInputted);

          /*  int buzz = numInputted / 3;
            int fizz = numInputted / 5;*/

           if (numInputted%5 == 0 && numInputted%3 == 0) {

                System.out.println("FizzBuzz");
            }

              else if  (numInputted%3 == 0) {
                   System.out.println("Buzz");
               }
               else if (numInputted%5 == 0) {
                   System.out.println("Fizz");
               }

                   else {
                System.out.println(numInputted);
            }

            }






}
