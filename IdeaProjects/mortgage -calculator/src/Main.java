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

            Scanner scanner = new Scanner(System.in);

            System.out.print("Principal:");
            int myPrincipal = scanner.nextInt();


            //annual interest rate ex.3.92
            System.out.print("Annual Interest:");
            float interest = scanner.nextFloat();
            float monthlyInt = interest / Percent / Months;
            System.out.println(monthlyInt);

            System.out.print("year term:");
            int mortgageLength = scanner.nextInt();
            int numberPayments = mortgageLength * Months;

//onthly cost is off/ the first part of the double mortgage was wrong...
            double mortgage = myPrincipal *monthlyInt
            / (1-Math.pow(1+monthlyInt,-numberPayments));
            // monthly payment

            String mortgageForm = NumberFormat.getCurrencyInstance().format(mortgage);
            System.out.println("Monthly Payment: " + mortgageForm + " .");

        }

}
