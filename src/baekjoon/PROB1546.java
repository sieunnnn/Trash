package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int score[] = new int[N];
        double max = score[0];
        double sum = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i=0; i<N; i++) {
            score[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, score[i]);
            sum += score[i];
        }
        sum /= max;
        sum *= 100.0;
        sum /= N;

        System.out.println(sum);
    }
}
