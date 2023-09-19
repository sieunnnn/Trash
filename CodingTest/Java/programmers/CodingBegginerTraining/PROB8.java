package programmers.CodingBegginerTraining;

public class PROB8 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, -3, 4, -5};

        System.out.println(solution(numbers));
    }

    public static int solution(int[] numbers) {
        int temp = 0;

        for (int i = 0; i < numbers.length; i ++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }

            }
        }

        int multiplyPositiveNum = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        int multiplyNegativeNum = numbers[0] * numbers[1];

        return Math.max(multiplyPositiveNum, multiplyNegativeNum);
    }
}
