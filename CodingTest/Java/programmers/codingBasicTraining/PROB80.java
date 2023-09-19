package programmers.codingBasicTraining;

public class PROB80 {

    public static void main(String[] args) {
        double flo = 1.42;

        System.out.println(solution(flo));
    }

    public static int solution (double flo) {
        return (int) Math.abs(flo);
    }
}
