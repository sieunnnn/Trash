package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PROB1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arr[] = new int[26];

        String word = br.readLine();
        word = word.toUpperCase();

        for (int i=0; i<word.length(); i++) {
            int index = word.charAt(i) - 'A' ;
            arr[index]++;
        }

        int max = 0;
        char answer = '?';

        for (int i=0; i<arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                answer = (char)(i + 'A');

            } else if (max == arr[i]) {
                answer = '?';
            }
        }

        System.out.println(answer);
    }
}
