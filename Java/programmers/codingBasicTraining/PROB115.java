package programmers.codingBasicTraining;

import java.util.*;

public class PROB115 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 4, 5, 2, 9};

        System.out.println(Arrays.toString(solution(arr)));
    }

    public static int[] solution (int[] arr) {
        int[] answer = new int[0];
        
        List<Integer> numbers = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            numbers.add(arr[i]);
        }
        
        int startIdx = numbers.indexOf(2);
        int lastIdx = numbers.lastIndexOf(2);

        if (!numbers.contains(2)) {
            answer = new int[]{-1};

        } else if (startIdx == lastIdx) {
            answer = new int[]{2};

        } else if (startIdx < lastIdx) {
            answer = numbers.subList(startIdx, lastIdx + 1).stream().mapToInt(i -> i).toArray();
        }
        
        return answer;
    }
}
