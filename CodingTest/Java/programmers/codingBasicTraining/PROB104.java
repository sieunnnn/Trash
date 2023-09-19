package programmers.codingBasicTraining;

import java.util.*;

public class PROB104 {

    public static void main(String[] args) {
        int[] num_list = {2, 1, 6};
        int n = 1;

        System.out.println(Arrays.toString(solution(num_list, n)));
    }

    public static int[] solution (int[] num_list, int n ) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = n; i < num_list.length; i++) {
            numbers.add(num_list[i]);
        }

        for (int i = 0; i < n; i++) {
            numbers.add(num_list[i]);
        }

        return numbers.stream().mapToInt(i -> i).toArray();
    }
}
