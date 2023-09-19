package programmers.CodingBegginerTraining;

public class PROB6 {

    public static void main(String[] args) {
        int n = 7;
        int t = 15;

        System.out.println(solution (n, t));
    }

    public static int solution (int n, int t) {
        for (int i = 0; i < t; i++) {
            n += n;
        }

        return n;
    }
}
