import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args){
        System.out.print("Principal: ");
        Scanner scanner = new Scanner(System.in); //create a scanner
        int principal = scanner.nextInt(); //reads in an integer

        System.out.print("Annual Interest Rate: ");
        double annual_int_rate = scanner.nextDouble(); //reads in a double

        System.out.print("Period(Years): ");
        int period = scanner.nextInt();

        double r = ((annual_int_rate/100)/12); //monthly interest rate
        double n = period*12; //number of payments
        double m = principal * ((r*Math.pow((1+r), n))/(Math.pow((1+r), n)-1));

        NumberFormat nf = NumberFormat.getCurrencyInstance();
        String mortgage = nf.format(m);
        System.out.println("Mortgage: " + mortgage);
    }
}
