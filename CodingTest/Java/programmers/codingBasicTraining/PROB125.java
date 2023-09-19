package programmers.codingBasicTraining;

import java.util.*;

public class PROB125 {

    public static void main(String[] args) {
        int[][] arr = {{572, 22, 37}, {287, 726, 384}, {85, 137, 292}, {487, 13, 876}};

        System.out.println(Arrays.deepToString(solution(arr)));
    }

    public static int[][] solution (int[][] arr) {
        int column = arr[0].length;
        int row = arr.length;
        int[][] matrix;

        if (column > row) {
            matrix = new int[column][column];

        } else {
            matrix = new int[row][row];
        }

        for (int i = 0; i < matrix.length; i++) {
            Arrays.fill(matrix[i], 0);
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j< arr[i].length; j++) {
                matrix[i][j] = arr[i][j];
            }
        }

        return matrix;
    }
}
