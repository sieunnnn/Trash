package programmers.codingBasicTraining;

import java.util.*;

public class PROB105 {

    public static void main(String[] args) {
        String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};

        System.out.println(Arrays.toString(solution(names)));
    }

    public static String[] solution (String[] names) {

        int length;

        if (names.length % 5 == 0) {
            length = names.length / 5;

        } else {
            length = names.length / 5 + 1;
        }

        String[] answer = new String[length];
        int idx = 0;

        for (int i = 0; i < answer.length; i++) {
            answer[i] = names[idx];
            idx += 5;
        }

        return answer;
    }
}
