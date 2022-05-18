import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    final static byte Months = 12;
    final static  byte Percent = 100;

        public static void main(String[] args) {


int myPrincipal =(int) readNumber( "Principal: ", 1000, 1_000_000);
float interest =(float) readNumber( "Annual Interest Rate: ", 0, 30);
byte mortgageLength =(byte) readNumber( "Mortgage Term (Years):", 1, 30);

            printMortgage(myPrincipal, interest, mortgageLength);
            printPaymentSchedule(myPrincipal, interest, mortgageLength);
        }

    private static void printMortgage(int myPrincipal, float interest, byte mortgageLength) {
        double mortgage = calculateMortgage(myPrincipal, interest, mortgageLength);
        String mortgageForm = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Monthly Payment: " + mortgageForm + " .");
        System.out.println();
        System.out.println("MoRTAGE");
        System.out.println("Mortgage Payments:" + mortgageForm);
    }

    private static void printPaymentSchedule(int myPrincipal, float interest, byte mortgageLength) {
        System.out.println();
        System.out.println("PayMENT SCHEDULE");
        System.out.println("-----------E");
        for(short month = 1; month<= mortgageLength * Months; month++ ){
          double balance = calculateBalance(myPrincipal, interest, mortgageLength, month);
          System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
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

    public static double calculateBalance (
            int myPrincipal,
            float interest,
            byte mortgageLength,
            short numberOfPaymentsMade
    ){

        float monthlyInt = interest / Percent / Months;
        short numberPayments =(short)(mortgageLength * Months);

        double balance= myPrincipal * (Math.pow(1+monthlyInt, numberPayments) - Math.pow(1 + monthlyInt, numberOfPaymentsMade))
                /(Math.pow(1 + monthlyInt, numberPayments)-1);
        return balance;
    }
      public static double calculateMortgage (
              int myPrincipal,
              float interest,
              byte mortgageLength ) {

          float monthlyInt = interest / Percent / Months;
          short numberPayments =(short)(mortgageLength * Months);
          //onthly cost is off/ the first part of the double mortgage was wrong...
          double mortgage = myPrincipal * monthlyInt
                  / (1 - Math.pow(1 + monthlyInt, -numberPayments));
          return mortgage;
      }

}
