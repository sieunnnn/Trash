package programmers.codingBasicTraining;

import java.util.*;

public class PROB101 {

    public static void main(String[] args) {
        int[] num_list = {4, 2, 6, 1, 7, 6};
        int n = 2;

        System.out.println(Arrays.toString(solution(num_list, n)));
    }

    public static int[] solution (int[] num_list, int n) {

        List<Integer> numbers = new ArrayList<>();
        int idx = 0;

        while(true) {
            numbers.add(num_list[idx]);

            idx += n;

            if (idx > num_list .length - 1) {
                break;
            }
        }

        return numbers.stream().mapToInt(i -> i).toArray();
    }
}
