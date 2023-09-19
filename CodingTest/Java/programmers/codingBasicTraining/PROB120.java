package programmers.codingBasicTraining;

import java.util.*;

public class PROB120 {

    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,1,1};

        System.out.println(Arrays.toString(solution(arr)));
    }

    public static int[] solution (int[] arr) {
        List<Integer> stk = new ArrayList<>();
        int i = 0;

        while(i < arr.length) {

            if (stk.isEmpty()) {
                stk.add(arr[i]);
                i++;

                System.out.println(i + Arrays.toString(stk.toArray()));

            } else if (stk.get(stk.size() - 1) == arr[i]){
                stk.remove(stk.get(stk.size() - 1));
                i++;

                System.out.println(i + Arrays.toString(stk.toArray()));

            } else if (stk.get(stk.size() - 1) != arr[i]) {
                stk.add(arr[i]);
                i++;

                System.out.println(i + Arrays.toString(stk.toArray()));

            }
        }

        if (stk.isEmpty()) {
            return new int[]{-1};

        } else {
            return stk.stream().mapToInt(v -> v).toArray();
        }
    }
}
