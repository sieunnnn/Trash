package programmers.CodingBegginerTraining;

public class PROB2 {

    public static void main(String[] args) {
        String my_string = "aAb1B2cC34oOp";

        System.out.println(solution(my_string));
    }

    public static int solution(String my_string) {
        String numbers = my_string.replaceAll("[^0-9]", "");
        int answer = 0;

        for (int i = 0; i < numbers.length(); i++) {
            answer += Integer.parseInt(String.valueOf(numbers.charAt(i)));
        }

        return answer;
    }
}
