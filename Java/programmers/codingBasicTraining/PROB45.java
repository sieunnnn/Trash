package programmers.codingBasicTraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PROB45 {

    public static void main(String[] args) {
        String[] picture = {".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."};
        int k = 2;

        System.out.println(Arrays.toString(solution(picture, k)));
    }

    public static String[] solution(String[] picture, int k) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < picture.length; i++) {
            char[] charArr = picture[i].toCharArray();

            for (int j = 0; j < charArr.length; j++) {
                // k 배
                for (int s = 0; s < k; s++) {
                    sb.append(charArr[j]);
                }
            }

            sb.append("\n");
        }

        String[] strArr = sb.toString().split("\n");
        List<String> answer = new ArrayList<>();

        for (int i = 0; i < strArr.length; i++) {
            // k배
            for (int j = 0; j < k; j++) {
                answer.add(strArr[i]);
            }
        }

        return answer.toArray(new String[answer.size()]);
    }
}

