package programmers.codingBasicTraining;

import java.util.Arrays;

public class PROB83 {

    public static void main(String[] args) {
        int[] num_list = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};

        System.out.println(Arrays.toString(solution(num_list)));
    }

    public static int[] solution (int[] num_list) {
        // 새로운 배열 생성
        int[] answer = new int[num_list.length - 5];

        Arrays.sort(num_list);

        for (int i = 0; i < answer.length; i++) {
            answer[i] = num_list[i + 5];
        }

        return answer;
    }
}
