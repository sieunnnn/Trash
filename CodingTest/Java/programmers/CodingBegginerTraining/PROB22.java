package programmers.CodingBegginerTraining;

public class PROB22 {

    public static void main(String[] args) {
        int i = 1;
        int j = 13;
        int k = 1;

        System.out.println(solution(i, j, k));
    }

    public static int solution (int i , int j, int k) {
        int answer = 0;
        String number;

        for (int idx = i; idx <= j; idx++) {
            number = String.valueOf(idx);

            for (int s = 0; s < number.length(); s++) {
                if (String.valueOf(number.charAt(s)).equals(String.valueOf(k))) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
