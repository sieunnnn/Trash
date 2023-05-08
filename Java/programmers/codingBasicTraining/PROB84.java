package programmers.codingBasicTraining;

public class PROB84 {

    public static void main(String[] args) {
        String num_str = "123456789";

        System.out.println(solution(num_str));
    }

    public static int solution (String num_str) {
        int answer = 0;

        for (int i = 0; i < num_str.length(); i++) {
            answer += Integer.parseInt(String.valueOf(num_str.charAt(i)));
        }

        return answer;
    }
}
