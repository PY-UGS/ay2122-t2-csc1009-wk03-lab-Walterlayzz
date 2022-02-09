import java.util.Scanner;

public class Bank {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter annual interest rate, for example, 8.25: ");
        double interestInput = input.nextDouble();
        System.out.print("Enter number of years as an integer: ");
        int numYears = input.nextInt();
        System.out.print("Enter loan amount, for example, 120000.95: ");
        double loanAmount = input.nextDouble();
        Loan application = new Loan(interestInput, numYears, loanAmount);
        System.out.println("The loan was created on " + application.getLoanDate());
        System.out.println("The monthly payment is " + String.format("%.2f", application.getMonthlyPayment()));
        System.out.println("The total payment is " + String.format("%.2f", application.getTotalPayment()));
    }
}
