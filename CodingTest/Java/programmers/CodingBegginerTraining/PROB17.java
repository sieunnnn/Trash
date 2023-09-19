package programmers.CodingBegginerTraining;

public class PROB17 {
    public static void main(String[] args) {
        int n = 10;

        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int count = 0;
        int number = 0;

        for (int i = 4; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ( i % j == 0) {
                    number++;
                }
            }

            if (number > 2) {
                count++;
                number =0;
            }
        }

        return count;
    }
}
