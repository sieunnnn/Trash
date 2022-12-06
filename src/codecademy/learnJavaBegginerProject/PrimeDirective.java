package codecademy.learnJavaBegginerProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.System.out;

public class PrimeDirective {

    /*
        This program find a prime number and shows them with arraylist.

        prime number: integer greater than 1 that is only divisible by 1 and itself
            ex) 2,3,5,7 ...
         */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        out.println("Enter the number you want to know if it is prime number.");
        int input = Integer.parseInt(br.readLine());

        PrimeDirective pd = new PrimeDirective();
        out.println("\nIf number you entered is prime number, \nthis program will print True and vice versa.");
        out.println("\nYour number is: " + pd.isPrime(input));


        System.out.println("\n=============================================");
        System.out.println("\nThis program also give you prime number list.");
        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
        System.out.println("\nThis is a list for prime number discrimination: " + Arrays.toString(numbers));
        System.out.println("\nThis is Prime number arraylist: " + pd.onlyPrimes(numbers));

    }

    public PrimeDirective() {
    }

    public boolean isPrime(int input) {


        if(input == 2) {
            return true;
        } else if (input < 2) {
            return false;
        }

        for (int i = 2; i < input; i++) {
            if(input % i == 0) {
                return false;
            }
        }

        return true;
    }


    public ArrayList<Integer> onlyPrimes(int[] numbers){
        ArrayList<Integer> primes = new ArrayList<>();
        for(int number : numbers) {
            if(isPrime(number)) {
                primes.add(number);
            }
        }

        return primes;
    }
}
