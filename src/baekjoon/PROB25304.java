package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        int cost;

        for(int i=1; i<=N; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine(), " ");

            int a = Integer.parseInt(str.nextToken());
            int b = Integer.parseInt(str.nextToken());

            cost = a*b;
            sum += cost;
        }

        if(sum == X) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
