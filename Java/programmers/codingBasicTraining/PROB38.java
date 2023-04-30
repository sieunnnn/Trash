package programmers.codingBasicTraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PROB38 {

    public static void main(String[] args) {
        int n = 10;

        System.out.println(Arrays.toString(solution(n)));
    }

    public static int[] solution (int n) {
        /* 동적 리스트 선언 */
        List<Integer> list = new ArrayList<>();
        list.add(n);

        while (n != 1) {
            n = n % 2 == 0  ? n/2  : 3 * n + 1;
            list.add(n);
        }

        int[] ret = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            ret[i] = list.get(i);
        }

        return ret;

        /*        return list.stream().mapToInt(i -> i).toArray();*/
    }
}
