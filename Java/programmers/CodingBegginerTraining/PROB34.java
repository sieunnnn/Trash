package programmers.CodingBegginerTraining;

public class PROB34 {

    public static void main(String[] args) {
        int[] sides = {1, 2};

        System.out.println(solution(sides));
    }

    public static int solution(int[] sides) {
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);
        int answer = 0;

        // 가장 긴변이 max 인 경우
        for (int i = max; i < max + min; i++) {
            answer ++;
        }

        // 나머지 한 변이 가장 긴 경우
        for (int i = max - min + 1; i < max; i++) {
            answer ++;
        }

        return answer;
    }
}
