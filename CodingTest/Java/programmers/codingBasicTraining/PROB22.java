package programmers.codingBasicTraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PROB22 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String control = br.readLine();

        System.out.println(Solution(n, control));

    }

    public static int Solution (int n, String control) {

        char[] controlArray = control.toCharArray();

        for (int i = 0; i < controlArray.length; i++) {

            if (controlArray[i] == 'w') {
                n += 1;
            } else if (controlArray[i] == 's') {
                n -= 1;
            } else if (controlArray[i] == 'd') {
                n += 10;
            } else if (controlArray[i] == 'a') {
                n -= 10;
            }

        }

        return n;
    }
}
