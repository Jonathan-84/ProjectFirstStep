import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {

            /*
            prncipal, annual interest rate term length
            Monthly mortgage total

            annuual interest rate... user entry / 100 then /12

math pow 
            hints: principal * monthly interest rate

            annual interest rate 3.92 example needs to be divided by 12
             */
           /* Scanner age = new Scanner(System.in);
            System.out.print("age:");
            byte myAge = age.nextByte();
            System.out.println("I am " + myAge + " years old");

            Scanner name = new Scanner(System.in);
            System.out.print("name:");
            String myName = name.nextLine();
            System.out.println("My name is " + myName );*/
final byte Months = 12;
final byte Percent = 100;
int myPrincipal = 0;
int mortgageLength = 0;

float monthlyInt = 0;
int numberPayments =0;

            Scanner scanner = new Scanner(System.in);

      while(true) {
          System.out.print("Principal:");
          myPrincipal = scanner.nextInt();
          if (myPrincipal >= 1000 && myPrincipal <= 1_000_000)
              break;
          System.out.println("Enter a value between 1000 and 1,000,000");
      }

      while(true) {
          //annual interest rate ex.3.92
          System.out.print("Annual Interest:");
          float interest = scanner.nextFloat();
          if (interest > 0 && interest <= 30) {
              monthlyInt = interest / Percent / Months;
              break;
      }
          System.out.println("Enter a value greater than 0 but less than or equal to 30");
      }
      while(true) {
          System.out.print("year term:");
          mortgageLength = scanner.nextInt();
          if (mortgageLength > 1 && mortgageLength < 30) {
              numberPayments = mortgageLength * Months;
              break;
          }
          System.out.println("Enter a value between 1 and 30");

      }



//onthly cost is off/ the first part of the double mortgage was wrong...
          double mortgage = myPrincipal * monthlyInt
                  / (1 - Math.pow(1 + monthlyInt, -numberPayments));
          // monthly payment

          String mortgageForm = NumberFormat.getCurrencyInstance().format(mortgage);
          System.out.println("Monthly Payment: " + mortgageForm + " .");
      }


}
