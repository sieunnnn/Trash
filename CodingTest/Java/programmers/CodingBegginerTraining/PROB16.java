package programmers.CodingBegginerTraining;

import java.util.Arrays;

public class PROB16 {
    public String solution(String my_string) {
        char[] chars = my_string.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] = Character.toLowerCase(chars[i]);
            }
        }

        Arrays.sort(chars);

        return new String(chars);
    }
}
