package programmers.CodingBegginerTraining;

public class PROB15 {

    public static void main(String[] args) {
        int num = 29183;
        int k = 1;

        System.out.println(solution(num, k));
    }

    public static int solution(int num, int k) {
        char[] numbers = String.valueOf(num).toCharArray();

        for (int i = 0; i < numbers.length; i++) {
            if (Integer.parseInt(String.valueOf(numbers[i])) == k) {
                return i + 1;
            }
        }

        return - 1;
    }
}
