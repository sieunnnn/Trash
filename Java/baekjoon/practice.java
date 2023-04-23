package baekjoon;

import java.io.*;
import java.util.*;

public class practice {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String str;
        int sum = 0;

        for (int i = 0; i < N; i++) {

            str = br.readLine();

            char[] arr = str.toCharArray();

//            System.out.println(Arrays.toString(arr));

            for (int j = 0; j < arr.length; j++) {
                sum += arr[j];
            }
        }

        System.out.println((char) sum);
    }
}
