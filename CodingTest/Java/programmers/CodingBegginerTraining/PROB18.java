package programmers.CodingBegginerTraining;

import java.util.*;

public class PROB18 {

    public static void main(String[] args) {
        String letter = ".... . .-.. .-.. ---";

        System.out.println(solution(letter));
    }

    public static String solution (String letter) {
        // 모스 배열
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.",
                "--.", "....", "..", ".---", "-.-", ".-..",
                "--", "-.", "---", ".--.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-",
                "-.--", "--.."};

        List<String> morseList = new ArrayList<>(Arrays.asList(morse));

        // 알파벳 배열
        String[] alphabet = new String[26];
        char character = 'a';

        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = String.valueOf(character++);
        }

        // letter 배열
        String[] strArr = letter.split(" ");
        StringBuilder sb = new StringBuilder();
        int idx;

        for (int i = 0; i < strArr.length; i++) {
            idx = morseList.indexOf(strArr[i]);
            sb.append(alphabet[idx]);
        }

        return sb.toString();
    }
}
