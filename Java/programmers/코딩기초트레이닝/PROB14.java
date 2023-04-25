package programmers.코딩기초트레이닝;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PROB14 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        System.out.println(solution(a, b));
    }

    public static int solution(int a, int b) {

        String aToStr = String.valueOf(a);
        String bToStr = String.valueOf(b);

        int aAndB = Integer.parseInt(aToStr + bToStr);
        int bAndA = Integer.parseInt(bToStr + aToStr);

        if (aAndB > bAndA || aAndB == bAndA) {
            return aAndB;

        } else {
            return bAndA;
        }
    }
}
