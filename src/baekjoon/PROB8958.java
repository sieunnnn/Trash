package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PROB8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());


        for(int i=0; i<N; i++) {
            int count = 0;
            int sum =0;

            String str = br.readLine();

            for (int j=0; j<str.length(); j++) {
                char c = str.charAt(j);

                if (c == 'O') {
                    count++;

                } else {
                    count = 0;
                }
                sum += count;

            }

            System.out.println(sum);
        }
    }
}
