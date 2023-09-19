package programmers.codingBasicTraining;

public class PROB48 {

    public static void main(String[] args) {
        String my_string = "ProgrammerS123";
        int n = 11;

        System.out.println(solution(my_string, n));
    }

    public static String solution (String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        char[] charArr = my_string.toCharArray();

        for (int i = 0; i < n; i++) {
            sb.append(charArr[i]);
        }

        return sb.toString();
    }
}
