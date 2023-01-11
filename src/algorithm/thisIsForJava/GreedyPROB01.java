package src.algorithm.thisIsForJava;

import java.util.Arrays;
import java.util.Scanner;

public class GreedyPROB01 {
    /*
    다양한 수로 이루어진 배열이 있을 때 주어진 수들을 M 번 더하여 가장 큰 수를 만든다.
    단, 배열의 특정한 인덱스에 해당하는 수가 연속해서 K 번을 초과하여 더해질 수 없다.
    서로 다른 인덱스에 해당하는 수가 같은 경우에도 서로 다른 것으로 간주한다.
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N, M, K 를 공백으로 구분하여 입력받기
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        // N 개의 수를 공백을 기준으로 구분하여 입력받기
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // 입력 받은 수를 정렬하기
        Arrays.sort(arr);
        int max = arr[N -1];
        int secondMax = arr[N - 2];

        // 가장 큰 수가 더해지는 횟수
        int count = (M / (K + 1)) * K + (M % (K + 1));

        // 결과
        int result = 0;
        result += count * max; // 가장 큰 수 더하기
        result += (M - count) * secondMax; // 두번째로 큰 수 더하기

        System.out.println(result);

    }

}
