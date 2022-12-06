package codecademy.learnJavaBegginerProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.*;

public class ASimpleCarLoanPaymentCalculator {

    /*
    This program will calculate the monthly car payment
    a user should expect to make after taking out a car loan.
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));

        out.println("Please enter the value of carLoan");
        int carLoan = Integer.parseInt(br.readLine());

        out.println("Please enter the loanLength");
        int loanLength = Integer.parseInt(br.readLine());

        out.println("Please enter the value of interestRate");
        int interestRate = Integer.parseInt(br.readLine());

        out.println("Please enter the value of downPayment");
        int downPayment = Integer.parseInt(br.readLine());

        if(loanLength <= 0 || interestRate <= 0) {
            out.println("Error! You must take out a valid car loan");

        } else if(downPayment >= carLoan) {
            out.println("The car can be paid in full");

        } else {
            int remainingBalance = carLoan - downPayment;
            int months = loanLength * 12;

            // monthly payment without interest included
            int monthlyBalance = remainingBalance / months;

            // monthly payment with interest included
            int interest = monthlyBalance * interestRate / 100;

            // final monthly payment
            int monthlyPayment = monthlyBalance + interest;
            out.println("================================");
            out.println("MonthlyPayment is " + monthlyPayment + ".");

        }
    }


}
