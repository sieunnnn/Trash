package programmers.CodingBegginerTraining;

public class PROB29 {

    public static void main(String[] args) {
        int[] array = {7, 77, 17};

        System.out.println(solution(array));
    }

    public static int solution (int[] array) {
        int cnt = 0;

        for (int i = 0; i < array.length; i++) {
            String[] numbers = String.valueOf(array[i]).split("");

            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j].equals("7")) {
                    cnt ++;
                }
            }
        }

        return cnt;
    }
}
