package src.algorithm.thisIsForJava;

import java.util.Scanner;

public class GreedyPROB03 {
    /*
    어떠한 수 N 이 1 이 될 때까지 다음의 두 과정 중 하나를 반복적으로 선택하여 수행한다.
        1. N 에서 1 을 뺀다
        2. N 을 K 로 나눈다. (N 이 K 로 나누어 떨어질 때만 선택 가능)
    1 이 될 때 까지의 최소 수행 횟수를 구하시오.
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N= Integer.parseInt(sc.next());
        int K= Integer.parseInt(sc.next());

        int count = 0;

        // N 이 K 이상 이라면 K 로 계속 나누기
        while (true) {
            //  N 이 K 로 나누어 떨어지는 수가 될 때 까지 첫번 째 과정을 몇번 하는가
            int number = (N / K) * K;
            count += (N - number);
            N = number;

            if (N < K) {
                break;
            }

            N /= K;
            count += 1;
        }

        count += (N -1);
        System.out.println(count);

    }

}
