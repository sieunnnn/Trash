package programmers.코딩기초트레이닝;

public class PROB31 {

    public static void main(String[] args) {
        int a = 3;
        int b = 5;

        System.out.println(solution(a, b));
    }

    public static int solution (int a, int b) {
        if (a % 2 != 0 && b % 2 != 0) {
            return (int) Math.pow(a, 2) + (int) Math.pow(b, 2);

        } else if (a % 2 != 0 || b % 2 != 0) {
            return 2 * (a + b);

        } else {
            return Math.abs(a - b);
        }
    }
}
