package programmers.codingBasicTraining;

import java.util.*;

public class PROB74 {

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3};

        System.out.println(Arrays.toString(solution(arr)));
    }

    public static int[] solution (int[] arr) {
        // 새로운 배열
        List<Integer> stk = new ArrayList<>();

        int i = 0;

        if (i < arr.length) {
            stk.add(arr[0]);

            while( i <= arr.length -1) {
                if (arr[i] > stk.get(stk.size() - 1)) {
                    stk.add(arr[i]);
                    i ++;

                } else {
                    stk.remove(stk.size() -1);
                }
            }
        }

        return stk.stream().mapToInt(v -> v).toArray();
    }
}
