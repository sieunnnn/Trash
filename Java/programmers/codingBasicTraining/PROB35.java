package programmers.codingBasicTraining;

import java.util.Arrays;

public class PROB35 {

    public static void main(String[] args) {
        /*
        * [293, 1000, 395, 678, 94]	[94, 777, 104, 1000, 1, 12]	[293, 395, 678]
            [110, 66, 439, 785, 1]	[377, 823, 119, 43]	[110, 66, 439, 785, 1]
        *
        * */
        System.out.println(
                Arrays.toString(
                        solution(new int[] {293, 1000, 395, 678, 94},
                                new int[] {94, 777, 104, 1000, 1, 12})
                )
        );
        System.out.println(
                Arrays.toString(
                        solution(new int[] {110, 66, 439, 785, 1},
                                new int[] {377, 823, 119, 43})
                )
        );

    }
    public static int[] solution(int[] arr, int[] delete_list) {

        int[] deleted = new int[1001];

        for (int i = 0; i < delete_list.length; i++) {
            deleted[delete_list[i]] = 1;
        }

        int idx = 0;
        int[] ret = new int[101];

        for (int i = 0; i < arr.length; i++) {
            if (deleted[arr[i]] != 1) {
                ret[idx++] = arr[i];
            }
        }

        return Arrays.copyOf(ret, idx);
    }
}
