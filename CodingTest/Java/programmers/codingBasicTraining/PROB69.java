package programmers.codingBasicTraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PROB69 {

    public static void main(String[] args) {
        String myString = "oxooxoxxox";
        System.out.println(Arrays.toString(solution(myString)));
    }

    public static int[] solution (String myString) {
        String[] strArr = myString.split("x");

        List<Integer> integerArr = new ArrayList<>();

        for (int i = 0; i < strArr.length; i++) {
            integerArr.add(strArr[i].length());
        }

        if (myString.charAt(myString.length()-1) == 'x') {
            integerArr.add(0);
        }

        int[] answer = integerArr.stream().mapToInt(i -> i).toArray();

        return answer;
    }
}
