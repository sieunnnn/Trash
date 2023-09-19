package programmers.codingBasicTraining;

public class PROB61 {

    public static void main(String[] args) {
        String binomial = "43 + 12";

        System.out.println(solution(binomial));
    }

    public static int solution (String binomial) {
        String[] equation = binomial.split(" ");

        int a = Integer.parseInt(equation[0]);
        int b = Integer.parseInt(equation[2]);

        if (equation[1].equals("+")) {
            return a + b;

        } else if (equation[1].equals("-")) {
            return a - b;

        } else {
            return a * b;
        }
    }
}
