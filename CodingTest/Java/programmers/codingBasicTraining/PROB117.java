package programmers.codingBasicTraining;

import java.util.*;

public class PROB117 {

    public static void main(String[] args) {
        int n = 4;
        int[] slicer = {1, 5, 2};
        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(Arrays.toString(solution(n, slicer, num_list)));
    }

    public static int[] solution (int n, int[] slicer, int[] num_list) {

        List<Integer> numbers = new ArrayList<>();

        if (n == 1) {
            for (int i = 0; i <= slicer[1]; i++) {
                numbers.add(num_list[i]);
            }

        } else if (n == 2) {
            for (int i = slicer[0]; i < num_list.length; i++) {
                numbers.add(num_list[i]);
            }

        } else if (n == 3) {
            for (int i = slicer[0]; i <= slicer[1]; i++) {
                numbers.add(num_list[i]);
            }

        } else if (n == 4) {
            for (int i = slicer[0]; i <= slicer[1]; i += slicer[2]) {
                numbers.add(num_list[i]);
            }
        }

        return numbers.stream().mapToInt(i ->i).toArray();
    }
}
