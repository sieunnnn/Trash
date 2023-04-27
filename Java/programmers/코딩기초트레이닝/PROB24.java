package programmers.코딩기초트레이닝;

public class PROB24 {

    public static void main(String[] args) {
        int a = 3;
        int d = 4;

        boolean[] included = {true, false, false, true, true};

        System.out.println(solution(a, d, included));

    }

    public static int solution (int a, int d, boolean[] included) {

        int answer = 0;

        for (int i = 0; i < included.length; i++) {

            if (included[i] == true) {
                answer += a + (i * d);
            }
        }

        return answer;
    }
}
