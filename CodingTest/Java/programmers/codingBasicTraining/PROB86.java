package programmers.codingBasicTraining;

import java.util.Arrays;

public class PROB86 {

    public static void main(String[] args) {
        int[] num_list = {12, 4, 15, 46, 38, 1, 14};

        System.out.println(Arrays.toString(solution(num_list)));
    }

    public static int[] solution (int[] num_list) {
        Arrays.sort(num_list);

        int[] answer = Arrays.copyOf(num_list, 5);

        return answer;
    }

}
