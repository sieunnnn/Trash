package src.inflearn.recursion;

public class Code08 {
    // Euclid Method (2) - 더 단순한 버전
    public static int gcd(int p, int q) {
        if (q == 0)
            return p;
        else
            return gcd(q, p%q);

    }

    public static void main(String[] args) {
        System.out.println(gcd(8,20));

    }

}
