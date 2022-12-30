package src.inflearn.recursion;

public class Code03 {
    public static void main(String[] args) {
        int result = func(4);
        System.out.print(result);
    }

    public static int func(int n) {

        if (n == 0) {
            return 0;
        } else {
            return n + func(n-1);
        }

    }

    // 1 에서 n 까지의 합을 구한다.
}
