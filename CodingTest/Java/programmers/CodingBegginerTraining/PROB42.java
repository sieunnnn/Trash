package programmers.CodingBegginerTraining;

public class PROB42 {
    public static void main(String[] args) {
        int a = 7;
        int b = 17;

        System.out.println(solution(a, b));
    }

    public static int solution (int a, int b) {
        // 기약분수
        b /= gcd(a, b);

        // 유한소수, 무한소수 판단
        while (b > 1) {
            if (b % 2 == 0) {
                b /= 2;

            } else if (b % 5 == 0) {
                b /= 5;

            } else {
                return 2;
            }
        }

        return 1;
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;

        } else {
            return gcd(b, a % b);
        }
    }
}
