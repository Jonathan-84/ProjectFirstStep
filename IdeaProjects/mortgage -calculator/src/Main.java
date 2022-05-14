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


int myPrincipal =(int) readNumber( "Principal: ", 1000, 1_000_000);
float interest =(float) readNumber( "Annual Interest Rate: ", 0, 30);
byte mortgageLength =(byte) readNumber( "Mortgage Term (Years):", 1, 30);


double mortgage = calculateMortgage(myPrincipal, interest, mortgageLength );

          // monthly payment

          String mortgageForm = NumberFormat.getCurrencyInstance().format(mortgage);
          System.out.println("Monthly Payment: " + mortgageForm + " .");
      }

      public static double readNumber(String prompt, double min, double max ){
            Scanner scanner=new Scanner(System.in);
            double value;
        while(true) {
            //annual interest rate ex.3.92
            System.out.print(prompt);
            value = scanner.nextFloat();
            if (value > min && value <= max)
                break;
            System.out.println("Enter a value between " + min + " and " + max + ".");
        }
return value;
    }
      public static double calculateMortgage (
              int myPrincipal,
              float interest,
              byte mortgageLength ) {

          final byte Months = 12;
          final byte Percent = 100;

          float monthlyInt = interest / Percent / Months;
          short numberPayments =(short)(mortgageLength * Months);
          //onthly cost is off/ the first part of the double mortgage was wrong...
          double mortgage = myPrincipal * monthlyInt
                  / (1 - Math.pow(1 + monthlyInt, -numberPayments));
          return mortgage;
      }

}
