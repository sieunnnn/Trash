package programmers.codingBasicTraining;

import java.util.*;

public class PROB29 {
    public static void main(String[] args) {
        System.out.println(solution(2, 2, 2, 2));
        System.out.println(solution(4, 1, 4, 4));
        System.out.println(solution(6, 3, 3, 6));
        System.out.println(solution(2, 5, 2, 6));
        System.out.println(solution(6, 4, 2, 5));
    }
    public static int solution (int a, int b, int c, int d) {
        /*
        * 1. 4개 모두 같은 숫자
        * 2. 3개 같은숫자, 1개 다른숫자
        * 3. 두개 같은 숫자
        * 4. 두개 같은숫자, 각각 다른숫지
        * 5. 모드 다른 숫자
        * */

        int ret = 0; // 점수
        Set<Integer> set = new HashSet<>(); // 중복 체크 하는 단위
        int[] board = new int[7]; // 4개의 주사위 숫자 acc

        set.add(a);
        set.add(b);
        set.add(c);
        set.add(d);

        board[a]++;
        board[b]++;
        board[c]++;
        board[d]++;

        if (set.size() == 1) {
            // 모두 같은 숫자
            ret = set.stream().findFirst().get() * 1111;

        } else if (set.size() == 2) {
            /* 같은게 두개가 있다
            * case 1. 2 : 2
            * case 2. 1 : 3
            * case 3. 3 : 1
            * */

            List<Integer> list = new ArrayList<>(set);
            int first = list.get(0);
            int second = list.get(1);
            if (board[first] == 2) {
                // case 1.
                ret = (first + second) * Math.abs(first - second);
            } else if (board[first] == 3) {
                // case 3.
                ret = (first*10 + second) * (first*10 + second);
            } else {
                // case 2.
                ret = (first + second*10) * (first + second*10);
            }
        } else if (set.size() == 3) {
            // 3개가 겹침
            List<Integer> list = new ArrayList<>(set);

            int first = list.get(0);
            int second = list.get(1);
            int third = list.get(2);

            if (board[first] == 1 && board[second] == 1) {
                ret = first * second;
            } else if (board[first] == 1 && board[third] == 1) {
                ret = first * third;
            } else {
                ret = second * third;
            }
        } else {
            ret = Math.min(Math.min(Math.min(a, b), c), d);
        }
        return ret;
    }

}
