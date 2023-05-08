package programmers.codingBasicTraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PROB73 {

    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 2}, {0, 3, 2}, {0, 2, 2}};

        System.out.println(Arrays.toString(solution(arr, queries)));
    }

    public static int[] solution (int[] arr, int[][] queries) {
        // 정답 배열 생성
        List<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < queries.length; i++) {
            List<Integer> numbers = new ArrayList<>();

            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (arr[j] > queries[i][2]) {
                    numbers.add(arr[j]);
                }
            }

            if (numbers.size() == 0) {
                arrayList.add(-1);
            } else {
                arrayList.add(Collections.min(numbers));

            }
        }
        return arrayList.stream().mapToInt(i -> i).toArray();

    }
}
