package programmers.CodingBegginerTraining;

import java.util.*;

import static java.lang.Math.abs;

public class PROB44 {

    public static void main(String[] args) {
        int[] numlist = {10000,20,36,47,40,6,10,7000};
        int n = 30;

        System.out.println(Arrays.toString(solution(numlist, n)));
    }

    public static int[] solution (int[] numlist, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numlist.length; i++) {
            map.put(numlist[i], abs(numlist[i] - n));
        }

        System.out.println(map);

        return new int[]{1};
    }
}
