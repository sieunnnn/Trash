package programmers.CodingBegginerTraining;

import java.util.*;

public class PROB10 {

    public static void main(String[] args) {
        String my_string = "hi2392";

        System.out.println(Arrays.toString(solution(my_string)));
    }

    public static int[] solution(String my_string) {
        String numbers = my_string.replaceAll("[^0-9]", "");
        int[] answer = new int[numbers.length()];

        for (int i = 0; i < numbers.length(); i++) {
            answer[i] = Integer.parseInt(String.valueOf(numbers.charAt(i)));
        }

        int temp;

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer.length; j++) {
                if (answer[i] < answer[j]) {
                    temp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = temp;
                }
            }
        }

        return answer;
    }
}
