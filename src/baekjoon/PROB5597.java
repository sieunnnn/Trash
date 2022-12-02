package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PROB5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] student = new int[31];
        int n;

        for (int i=1; i<29; i++) {
            n = Integer.parseInt(br.readLine());
            student[n] = 1;

        }
        for (int i=1; i<31; i++) {
            if (student[i] == 0) {
                System.out.println(i);
            }
        }
    }
}
