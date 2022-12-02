package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PROB10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] alphabet = new int[26];

        for (int i=0; i<26; i++) {
            alphabet[i] = -1;
        }

        String S = br.readLine();

        for (int i=0; i<S.length(); i++) {
            int index = S.charAt(i)-'a';

            if(alphabet[index] == -1) {
                alphabet[index] = i;
            }
        }

        for (int i=0; i<26; i++) {
            System.out.print(alphabet[i] + " ");
        }
    }
}
