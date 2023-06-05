package programmers.CodingBegginerTraining;

import java.util.*;

public class PROB28 {

    public int[] solution (int n) {
        List<Integer> numbers = new ArrayList<>();
        int i = 2;

        while( n >= i) {
            if (n % i == 0) {
                n /= i;

                if (!numbers.contains(i)) {
                    numbers.add(i);
                }

            } else {
                i++;
            }
        }

        return numbers.stream().mapToInt(v -> v).toArray();
    }
}
