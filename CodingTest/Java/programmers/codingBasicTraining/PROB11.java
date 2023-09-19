package programmers.codingBasicTraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PROB11 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String my_string = br.readLine();
        int k = Integer.parseInt(br.readLine());

        System.out.println(solution(my_string, k));
    }

    public static String solution(String my_string, int k) {

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i <k; i ++) {
            sb.append(my_string);
        }

        return sb.toString();
    }
}
