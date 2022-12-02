package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PROB1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int a = N;
        int count = 0;

        do {
            N = (((N%10)*10) + (((N/10)+(N%10))%10));
            count ++;
        } while(a !=N);

        System.out.println(count);
    }
}
