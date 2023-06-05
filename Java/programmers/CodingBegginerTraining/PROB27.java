package programmers.CodingBegginerTraining;

import java.util.Arrays;

public class PROB27 {

    public static void main(String[] args) {
        String s = "1 2 Z 3";

        System.out.println(solution(s));
    }

    public static int solution(String s) {
        String[] str = s.split(" ");
        int answer = 0;

        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("Z")) {
                answer -= Integer.parseInt(str[i - 1]);
                continue;
            }

            answer += Integer.parseInt(str[i]);
        }

        return answer;
    }
}
