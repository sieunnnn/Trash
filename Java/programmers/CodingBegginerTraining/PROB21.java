package programmers.CodingBegginerTraining;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.lang.Math.abs;

public class PROB21 {

    public static void main(String[] args) {
        int[] array = {3, 10, 28};
        int n = 20;

        System.out.println(solution(array, n));
    }

    public static int solution(int[] array, int n) {
        // 절댓값 저장 배열
        List<Integer> abs = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            abs.add(abs(array[i] - n));
        }

        // 최솟값 찾기
        int min = Collections.min(abs);
        int firstIdx = abs.indexOf(min);
        int lastIdx = abs.lastIndexOf(min);

        if (firstIdx == lastIdx) {
            return array[firstIdx];

        } else {
            return Math.min(array[firstIdx], array[lastIdx]);
        }
    }
}
