package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PROB16 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();

        System.out.println(solution(str1, str2));
    }

    public static String solution (String str1, String str2) {

        StringBuilder sb = new StringBuilder();

        String[] str1Arr = str1.split("");
        String[] str2Arr = str2.split("");

        for (int i = 0; i < str1Arr.length; i++) {
            sb.append(str1Arr[i]).append(str2Arr[i]);
        }

        return sb.toString();
    }
}
