package programmers.codingBasicTraining;

import java.util.*;

public class PROB122 {

    public static void main(String[] args) {
        int n = 3;

        System.out.println(Arrays.deepToString(solution(n)));
    }

    public static int[][] solution (int n) {
        int[][] answer = new int[n][n];

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                if (j == i) {
                    answer[i][j] = 1;

                } else {
                    answer[i][j] = 0;
                }
            }
        }

        return answer;
    }
}
