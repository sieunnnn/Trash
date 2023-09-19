package programmers.codingBasicTraining;

public class PROB27 {

    public static void main(String[] args) {
        String ineq = "<";
        String eq = "=";

        int n = 20;
        int m = 50;

        System.out.println(solution(ineq, eq, n, m));
    }

    public static int solution (String ineq, String eq, int n, int m) {

        boolean result = false;

        if (ineq.equals("<") && eq.equals("=")) {
            result = n <= m;
        } else if (ineq.equals("<") && eq.equals("!")) {
            result = n < m;
        } else if (ineq.equals(">") && eq.equals("=")) {
            result = n >= m;
        } else if (ineq.equals(">") && eq.equals("!")) {
            result = n > m;
        }

        if (result == true) {
            return 1;
        } else {
            return 0;
        }
    }
}
