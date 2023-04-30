package programmers.codingBasicTraining;

import java.util.Arrays;

public class PROB39 {

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 1}, {0, 3, 2}, {0, 3, 3}};

        System.out.println(Arrays.toString(solution(arr, queries)));
    }

    public static int[] solution (int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            // s, e, k 결정
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];

            // arr 연산
            for (int j = s; j <= e; j++) {
                if (j % k == 0) {
                    arr[j] ++;
                }
            }
        }

        return arr;
    }
}
