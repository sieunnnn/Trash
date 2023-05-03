package programmers.codingBasicTraining;

import java.util.Arrays;

public class PROB50 {

    public static void main(String[] args) {
        String my_string = "programmers";

        System.out.println(Arrays.toString(solution(my_string)));
    }

    public static String[] solution (String my_string) {
        String[] answer = my_string.split(" ");

        return answer;
    }
}
