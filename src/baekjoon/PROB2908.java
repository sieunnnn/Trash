package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int A1 = ((A%10)*100) + ((A%100)-(A%10)) + (A/100);
        int B1 = ((B%10)*100) + ((B%100)-(B%10)) + (B/100);

        int max = Math.max(A1, B1);

        System.out.println(max);
    }
}
