package programmers.codingBasicTraining;

public class PROB33 {

    public static void main(String[] args) {
        String my_string = "banana";
        String target = "anana";

        System.out.println(solution(my_string, target));
    }

    public static int solution (String my_string, String target) {
        if (my_string.contains(target)) {
            return 1;
        } else {
            return 0;
        }
    }
}
