package programmers.codingBasicTraining;

import java.util.Arrays;

public class PROB114 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 100, 99, 98};

        System.out.println(solution(arr));
    }

    public static int solution(int[] arr) {

        int cnt = 0;
        int[] prev;

        while (true) {

            prev = arr.clone();

            for(int i = 0; i < arr.length; i++) {
                if (arr[i] > 49 && arr[i] % 2 == 0) {
                    arr[i] /= 2;

                } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                    arr[i] = arr[i] * 2 + 1;
                }

            }

            cnt ++;

            if (Arrays.equals(arr, prev)) {
                System.out.println(cnt);
                break;
            }
        }

        return cnt -1;
    }

}
