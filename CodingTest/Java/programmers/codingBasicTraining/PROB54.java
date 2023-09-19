package programmers.codingBasicTraining;

import java.util.Arrays;

public class PROB54 {

    public static void main(String[] args) {
        String[] strArr = {"AAA","BBB","CCC","DDD"};

        System.out.println(Arrays.toString(solution(strArr)));
    }

    public static String[] solution (String[] strArr) {

        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < strArr[i].length(); j++) {
                if (i % 2 == 0) {
                    strArr[i] = strArr[i].toLowerCase();
                } else {
                    strArr[i] = strArr[i].toUpperCase();
                }
            }
        }

        return strArr;
    }
}
