package programmers.CodingBegginerTraining;

import java.util.*;

public class PROB11 {

    public int[] solution(int n, int[] numlist) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                numbers.add(numlist[i]);
            }
        }

        return numbers.stream().mapToInt(i -> i).toArray();
    }
}
