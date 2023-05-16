package programmers.codingBasicTraining;

import java.util.Arrays;

public class PROB109 {

    public static void main(String[] args) {
        int start = 10;
        int end = 3;

        System.out.println(Arrays.toString(solution(start, end)));
    }

    public static int[] solution (int start, int end) {
        int[] numbers = new int[start - end + 1];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = start;
            start --;
        }

        return numbers;
    }
}
