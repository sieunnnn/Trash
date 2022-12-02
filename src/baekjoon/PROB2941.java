package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PROB2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String alphabet[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        String st = br.readLine();

        for(int i=0; i< alphabet.length; i++) {
            if (st.contains(alphabet[i]))
                st = st.replace(alphabet[i], "#");

        }
        System.out.println(st.length());
    }
}
