package programmers.codingBasicTraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PROB42 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[][] intervals = {{1, 3}, {0, 4}};

        System.out.println(Arrays.toString(solution(arr, intervals)));
    }

    public static int[] solution (int[] arr, int[][] intervals) {
        List<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];

            for (int j = start; j <= end; j++) {
                arrayList.add(arr[j]);
            }
        }

        return arrayList.stream().mapToInt(i -> i).toArray();
    }
}
