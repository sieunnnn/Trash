package programmers.CodingBegginerTraining;

import java.util.Arrays;

public class PROB20 {

    public static void main(String[] args) {
        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = 2;

        System.out.println(Arrays.deepToString(solution(num_list, n)));
    }

    public static int[][] solution (int[] num_list, int n ) {
        // 새로운 배열
        int[][] numArr = new int[num_list.length / n][n];
        int idx = 0;

        for (int i = 0; i < numArr.length; i++) {
            for (int j = 0; j < n; j ++) {
                numArr[i][j] = num_list[idx++];
            }
        }

        return numArr;
    }
}
