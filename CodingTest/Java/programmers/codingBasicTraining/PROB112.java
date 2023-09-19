package programmers.codingBasicTraining;

import java.util.*;

public class PROB112 {

    public static void main(String[] args) {
        int arr[] = {2, 2, 1, 1, 1};
        boolean[] flag = {true, false, false, false, false};

        System.out.println(Arrays.toString(solution(arr, flag)));
    }

    public static int[] solution (int[] arr, boolean[] flag) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < flag.length; i++) {
            if (flag[i] == true) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    numbers.add(arr[i]);
                }

            } else {
                for (int j = 0; j < arr[i]; j++) {
                    if (numbers.isEmpty()) {
                        break;
                    } else {
                        numbers.remove(numbers.get(numbers.size() -1));
                    }
                }
            }
        }

        return numbers.stream().mapToInt(i -> i).toArray();
    }
}
