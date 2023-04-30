package programmers.codingBasicTraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Math.round;

public class PROB23 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        System.out.println(solution(a, b, c));
    }

    public static int solution(int a, int  b, int c) {

        int answer = 0;

        // 세 수가 같은 경우
        if (a == b && b == c) {
            answer = (int) round((a + b + c) * (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)) * (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3)));

        } else if (a != b  && b != c && a != c) {
            answer = a + b + c;

        } else {
            answer = (int) round((a + b + c) * (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)));
        }

        return answer;
    }
}
