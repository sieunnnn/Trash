package programmers.codingBasicTraining;

import java.util.*;

public class PROB99 {

    public static void main(String[] args) {
        int[] arr = {5, 1, 4};

        System.out.println(Arrays.toString(solution(arr)));
    }

    public static int[] solution(int[] arr) {

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                numbers.add(arr[i]);
            }
        }

        return numbers.stream().mapToInt(i -> i).toArray();
    }
}
