package programmers.코딩기초트레이닝;

public class PROB30 {

    public static void main(String[] args) {
        int a = -4;
        int b = 7;
        boolean flag = true;

        System.out.println(solution(a, b, flag));
    }

    public static int solution (int a, int b, boolean flag) {
        if (flag == true) {
            return a + b;

        } else {
            return a - b;

        }
    }
}
