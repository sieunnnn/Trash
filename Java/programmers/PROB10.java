package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PROB10 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String my_string = br.readLine();
        String overwrite_string = br.readLine();
        int s = my_string.length() - overwrite_string.length() - 1;

        System.out.println(solution(my_string,overwrite_string,s));
    }

    private static String solution(String my_string, String overwrite_string, int s) {

        String left = my_string.substring(0, s);
        String right = my_string.substring(s+overwrite_string.length());

        String answer = left + overwrite_string + right;

        return answer;
    }
}
