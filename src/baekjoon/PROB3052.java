package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PROB3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] A = new int[10];
        int count = 0;

        for(int i=0; i<10; i++) {
            A[i] = Integer.parseInt(br.readLine()) % 42;
        }

        boolean bl;

        for(int i=0; i<10; i++) {
            bl = true;
            for(int j=i+1; j<10; j++) {
                if (A[i] == A[j]) {
                    bl = false;
                    break;
                }
            }
            if (bl) {
                count++;
            }
        }
        System.out.println(count);
    }
}
