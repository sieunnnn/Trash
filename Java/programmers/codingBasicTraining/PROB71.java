package programmers.codingBasicTraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PROB71 {

    public static void main(String[] args) {
        String[] intSrts = {"0123456789","9876543210","9999999999999"};
        int k = 50000;
        int s = 5;
        int l = 5;

        System.out.println(Arrays.toString(solution(intSrts, k, s, l)));
    }

    public static int[] solution(String[] intStrs, int k, int s, int l) {
        // k 보다 큰 정수를 담을 배열
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < intStrs.length; i++) {
            int number = Integer.parseInt(intStrs[i].substring(s, s + l));
            System.out.println(intStrs[i].substring(s, s + l));

            if (number > k) {
                numbers.add(number);
            }
        }

        return numbers.stream().mapToInt(i -> i).toArray();
    }
}
