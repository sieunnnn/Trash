package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class PROB4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int C = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i=0; i<C; i++) {

            st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int arr[] = new int[N];

            double sum = 0;

            for(int j=0; j<N; j++) {
                int score = Integer.parseInt(st.nextToken());
                arr[j] = score;
                sum += arr[j];
            }

            double mean = sum / N;
            double count = 0;

            for(int j=0; j<N; j++) {
                if (mean < arr[j]) {
                    count++;
                }
            }

            System.out.printf("%.3f%%\n", (count/N)*100);
        }
    }
}
