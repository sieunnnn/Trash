package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(str.nextToken());
        int B = Integer.parseInt(str.nextToken());
        int C = Integer.parseInt(str.nextToken());
        int money = A==B && B==C
                ? 10000 + A*1000
                : A==B || A==C
                    ? 1000 + A*100
                    : B == C
                        ? 1000 + B*100
                        : Math.max(A,Math.max(B,C))*100;

        System.out.println(money);
    }
}
