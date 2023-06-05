package programmers.CodingBegginerTraining;

public class PROB33 {
    public static void main(String[] args) {
        int balls = 3;
        int share = 2;

        System.out.println(solution(balls, share));
    }

    public static int solution(int balls, int share) {
        return combination(balls, share);
    }

    public static int combination(int n, int r) {
        if( n == r || r == 0) {
            return 1;

        } else {

            return combination(n - 1, r - 1) + combination(n -1, r);
        }
    }
}
