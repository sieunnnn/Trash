package programmers.codingBasicTraining;

import java.util.*;
public class PROB116 {

    public static void main(String[] args) {
        String my_string = "Programmers";

        System.out.println(Arrays.toString(solution(my_string)));
    }

    public static int[] solution (String my_string) {

        // 알파벳 배열 만들기
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 52; i ++) {
            if (i < 26) {
                sb.append((char)('A' + i));

            } else {
                sb.append((char)('a' + (i-26)));
            }
        }

        // 결과 배열
        int[] numbers = new int[52];

        for (int i = 0; i < my_string.length(); i++) {
            numbers[sb.indexOf(String.valueOf(my_string.charAt(i)))]++;
        }

        return numbers;
    }
}
