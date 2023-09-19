package src.inflearn.recursion;

public class Code07 {
    // Euclid Method (1)
    public static int gcd(int m, int n) {
        if (m < n) {
            int tmp = m; m = n; n = tmp;     // swap m and n
        }
        if (m % n == 0)
            return n;
        else
            return gcd(n, m%n);

    }

    public static void main(String[] args) {
        System.out.println(gcd(15,40));

    }

}
