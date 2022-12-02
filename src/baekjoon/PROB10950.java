package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB10950 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine()," ");

            int a = Integer.parseInt(str.nextToken());
            int b = Integer.parseInt(str.nextToken());

            System.out.println(a+b);
        }
    }
}
