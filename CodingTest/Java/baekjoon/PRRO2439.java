package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PRRO2439 {
    // 첫째 줄에는 별 1 개, 둘째 줄에는 별 2 개, N 번째 줄에는 별 N 개를 찍는 문제. 하지만 오른쪽을 기준으로 정렬한 별을 출력하세요.
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());


        for (int i = 1; i < N + 1; i++) {
            // n - i 개의 공백 출력
            for (int j = i; j < N; j++) {
                sb.append(" ");

            }

            // i 개의 공백 출력
            for (int k = 0; k < i; k++) {
                sb.append("*");

            }

            sb.append("\n");

        }

        System.out.println(sb);

    }
}
