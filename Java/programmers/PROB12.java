package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PROB12 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        System.out.println(solution(num, n));

    }

    public static int solution(int num, int n) {

        int answer = num % n == 0 ? 1 : 0;

        return answer;
    }
}
