package programmers.CodingBegginerTraining;

import java.util.*;

public class PROB31 {

    public static void main(String[] args) {
        String my_str = "abcdef123";
        int n = 3;

        System.out.println(Arrays.toString(solution(my_str, n)));
    }

    public static String[] solution (String my_str, int n) {
        int startIdx = 0;
        int lastIdx = n;
        int length;

        if (my_str.length() % n == 0) {
            length = my_str.length() / n;

        } else {
            length = my_str.length() / n + 1;
        }

        String[] answer = new String[length];

        for (int i = 0; i < length - 1; i++) {
            answer[i] = my_str.substring(startIdx, lastIdx);
            startIdx += n;
            lastIdx += n;
        }

        answer[answer.length - 1] = my_str.substring(startIdx);

        return answer;
    }
}
