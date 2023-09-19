package programmers.codingBasicTraining;

import java.util.*;

public class PROB100 {

    public static void main(String[] args) {
        int n = 10;
        int k = 3;

        System.out.println(Arrays.toString(solution(n, k)));
    }

    public static int[] solution (int n, int k) {

        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i < n + 1; i++) {

            if (i % k == 0) {
                numbers.add(i);
            }
        }

        return numbers.stream().mapToInt(i -> i).toArray();
    }
}
