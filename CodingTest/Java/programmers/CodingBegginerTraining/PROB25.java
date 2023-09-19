package programmers.CodingBegginerTraining;

import java.util.*;
import java.util.stream.Collectors;

public class PROB25 {

    public static void main(String[] args) {
        String s = "abcabcadc";

        System.out.println(solution(s));
    }

    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] str = s.split("");
        int cnt = 0;

        Arrays.sort(str);

        for (int i = 0; i < str.length; i++) {
            cnt = 0;

            for (int j = 0; j < str.length; j++) {
                if (str[i].equals(str[j])) {
                    cnt++;
                }
            }

            if (cnt == 1) {
                sb.append(str[i]);
            }
        }

        return sb.toString();
    }
}
