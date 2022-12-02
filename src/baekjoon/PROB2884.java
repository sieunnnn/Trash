package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(str.nextToken());
        int m = Integer.parseInt(str.nextToken());

        if (m < 45) {
            m = 60 + (m - 45);
            h = h - 1;

            if (h < 0) {
                h = 23;
            }
            System.out.println(h + " " + m);

        } else {
            System.out.println(h + " " + (m - 45));
        }

    }
}
