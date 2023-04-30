package programmers.codingBasicTraining;

import java.io.IOException;



public class PROB18 {

    public static void main(String[] args) throws IOException {

        int[] num_list = {3, 4, 5, 2, 1};

        System.out.println(Solution(num_list));
    }

    public static int Solution(int[] num_list) {

        int addTotal = 0;
        int multiflyTotal = 1;

        for (int i = 0; i < num_list.length; i++) {
            addTotal += num_list[i];
            multiflyTotal *= num_list[i];
        }

        if (Math.pow(addTotal, 2) > multiflyTotal) {
            return 1;

        } else {
            return 0;
        }
    }
}
