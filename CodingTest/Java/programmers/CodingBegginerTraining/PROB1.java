package programmers.CodingBegginerTraining;

import java.util.*;

public class PROB1 {

    public static void main(String[] args) {
        int n = 15;

        System.out.println(Arrays.toString(solution(n)));
    }

    public static int[] solution(int n) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                numbers.add(i);
            }
        }

        return numbers.stream().mapToInt(i -> i).toArray();
    }
}
