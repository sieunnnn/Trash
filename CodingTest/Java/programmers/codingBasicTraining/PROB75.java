package programmers.codingBasicTraining;

import java.util.Arrays;

public class PROB75 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 100, 99, 98};
        int k = 3;

        System.out.println(Arrays.toString(solution(arr, k)));
    }

    public static int[] solution (int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (k % 2 != 0) {
                arr[i] *= k;

            } else {
                arr[i] += k;
            }
        }

        return arr;
    }
}
