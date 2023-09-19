package src.inflearn.recursion;

public class Code05 {
    // X 의 n 승 코드
    public static double power(double x, int n) {
        if (n == 0)
            return 1;
        else
            return x*power(x, n-1);

    }

    public static void main(String[] args) {
        System.out.println(power(2, 5));

    }

}
