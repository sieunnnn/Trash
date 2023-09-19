package programmers.codingBasicTraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PROB13 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] arr = br.readLine().split("");

        System.out.println(Arrays.toString(arr));

        System.out.println(solution(arr));
    }

    public static String solution (String[] arr) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }

        return sb.toString();
    }
}
