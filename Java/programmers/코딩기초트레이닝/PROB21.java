package programmers.코딩기초트레이닝;

import java.util.Arrays;

public class PROB21 {

    public static void main(String[] args) {
        int[] num_list = {2, 1, 6};

        System.out.println(Arrays.toString(Solution(num_list)));
    }

    public static int[] Solution(int[] num_list) {
        int endNum = num_list[num_list.length - 1];
        int leftEndNum = num_list[num_list.length - 2];

        int[] answer = new int[num_list.length + 1];

        for (int i = 0; i < num_list.length; i++) {

            answer[i] = num_list[i];

        }

        if (endNum > leftEndNum) {
            answer[answer.length - 1] = endNum - leftEndNum;
        } else {
            answer[answer.length - 1] = endNum * 2;
        }

        return answer;
    }
}
