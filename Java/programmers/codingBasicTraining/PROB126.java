package programmers.codingBasicTraining;

import java.util.Arrays;

public class PROB126 {

    public static void main(String[] args) {
        int slice = 7;
        int n = 10;

        if (n % slice == 0) {
            System.out.println(n / slice);
        } else {
            System.out.println(n / slice + 1);
        }
    }
}
