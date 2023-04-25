package programmers.코딩기초트레이닝;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PROB17 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        System.out.println(solution(a, b));
    }

    public static int solution(int a, int b) {

        int aAndB = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int c = 2 * a * b;

        if (aAndB > c || aAndB == c) {
            return aAndB;

        } else {
            return c;

        }
    }
}
