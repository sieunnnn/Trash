package programmers.CodingBegginerTraining;

import java.util.*;

public class PROB19 {

    public static void main(String[] args) {
        String before = "olleh";
        String after = "hello";

        System.out.println(solution(before, after));
    }

    public static int solution (String before, String after) {
        String[] beforeArr = before.split("");
        Arrays.sort(beforeArr);

        String[] afterArr = after.split("");
        Arrays.sort(afterArr);

        for (int i = 0; i < beforeArr.length; i++) {
            if (!beforeArr[i].equals(afterArr[i])) {
                return 0;
            }
        }

        return 1;
    }
}
