package programmers.codingBasicTraining;

import java.util.Arrays;

public class PROB103 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 100, 99, 98};

        System.out.println(Arrays.toString(solution(arr)));
    }

    public static int[] solution (int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 49 && arr[i] % 2 == 0) {
                arr[i] /= 2;

            } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                arr[i] *= 2;
            }
        }

        return arr;
    }
}
