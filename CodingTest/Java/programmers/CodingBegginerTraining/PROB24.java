package programmers.CodingBegginerTraining;

public class PROB24 {
    class Solution {
        public int solution(String my_string) {
            my_string = my_string.replaceAll("[^0-9]", " ");

            String[] numbers = my_string.split(" ");
            int answer = 0;

            for (int i = 0; i < numbers.length; i++) {
                if (!numbers[i].isEmpty()) {
                    answer += Integer.parseInt(numbers[i]);
                }
            }

            return answer;
        }
    }
}
