package programmers.codingBasicTraining;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PROB40 {

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[][] queries = {{0, 3}, {1, 2}, {1, 4}};

        System.out.println(Arrays.toString(solution(arr, queries)));
    }

    public static int[] solution (int[] arr, int[][] queries) {
        int temp = 0;

        for (int i = 0; i < queries.length; i++) {
            int a = queries[i][0];
            int b = queries[i][1];

            // arr 연산
            temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }

        return arr;
    }
}
