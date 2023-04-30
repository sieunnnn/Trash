package programmers.codingBasicTraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PROB15 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        System.out.println(solution(number, n, m));
    }

    public static int solution (int number, int n, int m) {

        int answer = (number % n == 0 && number % m == 0) ? 1 : 0;

        return answer;
    }
}
