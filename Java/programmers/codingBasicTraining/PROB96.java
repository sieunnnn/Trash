package programmers.codingBasicTraining;

public class PROB96 {

    public static void main(String[] args) {
        int[] numbers = {34, 5, 71, 29, 100, 34};
        int n = 123;

        System.out.println(solution(numbers, n));
    }

    public static int solution (int[] numbers, int n) {

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

            if (sum > n) {
                break;
            }
        }

        return sum;
    }
}
