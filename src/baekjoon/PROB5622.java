package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PROB5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();

        int arr[] = new int[26];

        arr[0] = arr[1] = arr[2] = 3;
        arr[3] = arr[4] = arr[5] = 4;
        arr[6] = arr[7] = arr[8] = 5;
        arr[9] = arr[10] = arr[11] = 6;
        arr[12] = arr[13] = arr[14] = 7;
        arr[15] = arr[16] = arr[17] = arr[18] = 8;
        arr[19] = arr[20] = arr[21] = 9;
        arr[22] = arr[23] = arr[24] = arr[25] = 10;

        int sum = 0;

        for (int i=0; i<number.length(); i++) {
            char c = number.charAt(i);
            sum += arr[(int)c - 'A'];
        }

        System.out.println(sum);

    }
}
