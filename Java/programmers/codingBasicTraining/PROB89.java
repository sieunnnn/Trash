package programmers.codingBasicTraining;

import java.util.Arrays;

public class PROB89 {

    public static void main(String[] args) {
        String[] strArr = {"a","bc","d","efg","hi"};

        System.out.println(solution(strArr));
    }

    public static int solution (String[] strArr) {

        int[] length = new int[31];

        for (int i = 0; i < strArr.length; i++) {
            length[strArr[i].length()] ++;
        }

        Arrays.sort(length);

        return length[length.length - 1];
    }
}
