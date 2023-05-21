package programmers.codingBasicTraining;

import java.util.*;

public class PROB119 {

    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 1, 1};
        int k = 4;

        System.out.println(Arrays.toString(solution(arr, k)));
    }

    public static int[] solution(int[] arr, int k) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            numbers.add(arr[i]);
        }

        int[] uniqueNumbers = numbers.stream().mapToInt(i -> i).distinct().toArray();

        int[] answer = new int[k];

        for (int i = 0; i < answer.length; i++) {
            if (i < uniqueNumbers.length) {
                answer[i] = uniqueNumbers [i];

            } else {
                answer[i] = -1;
            }

        }

        return answer;
    }
}
