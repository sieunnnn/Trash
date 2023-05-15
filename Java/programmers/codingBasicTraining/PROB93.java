package programmers.codingBasicTraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PROB93 {

    public static void main(String[] args) {
        int[] num_list = {2, 1, 6};
        int n = 3;

        System.out.println(Arrays.toString(solution(num_list, n)));
    }

    public static int[] solution (int[] num_list, int n) {

        List<Integer> numbers = new ArrayList<>()
                ;
        for (int i = n - 1; i < num_list.length; i++) {
            numbers.add(num_list[i]);
        }

        return numbers.stream().mapToInt(i -> i).toArray();
    }
}
