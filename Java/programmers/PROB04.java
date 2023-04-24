package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PROB04 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            if (Integer.valueOf(str.charAt(i)) < 91 && Integer.valueOf(str.charAt(i)) > 64) {
                String upperToLower = String.valueOf(str.charAt(i)).toLowerCase();
                sb.append(upperToLower);

            } else if (Integer.valueOf(str.charAt(i)) < 123 && Integer.valueOf(str.charAt(i)) > 96) {
                String lowerToUpper = String.valueOf(str.charAt(i)).toUpperCase();
                sb.append(lowerToUpper);
            }
        }

        System.out.println(sb);
    }
}
