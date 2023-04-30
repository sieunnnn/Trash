package programmers.codingBasicTraining;

import java.util.Scanner;

public class PROB19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(Solution(n));

    }

    public static int Solution(int n ) {

        int oddTotal = 0;
        int evenTotal = 0;

        if (n % 2 != 0) {
            for (int i = 1; i <= n; i++) {
                // 홀수
                if (i % 2  != 0) {
                    oddTotal += i;
                }
            }

            return oddTotal;

        } else {
            for(int i = 1; i <= n; i++) {
                // 짝수
                if (i % 2 == 0) {
                    evenTotal += Math.pow(i, 2);
                }
            }

            return evenTotal;
        }
    }
}
