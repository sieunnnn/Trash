package programmers.codingBasicTraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PROB04 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        char[] chs = br.readLine().toCharArray();

        for (int i = 0; i < chs.length; i++) {
            sb.append(convert(chs[i]));
        }

        System.out.println(sb);
    }

    public static boolean isLower(Character chr) {
        return chr >= 'a' && chr <= 'z';
    }

    public static Character convert (Character chr) {
        return isLower(chr)
                ? Character.toUpperCase(chr) // 대문자로
                : Character.toLowerCase(chr); // 소문자로
    }

}