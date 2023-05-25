package programmers.CodingBegginerTraining;

public class PROB3 {

    public static void main(String[] args) {
        int hp = 23;

        System.out.println(solution (hp));
    }

    public static int solution(int hp) {
        // 장군 개미 5, 병정 개미 3, 일개미 1
        int answer = 0;

        while (true) {

            if (hp > 4) {
                answer += hp / 5;
                hp %= 5;

            } else if (hp > 2) {
                answer += hp / 3;
                hp %= 3;

            } else {
                answer += hp;
                break;
            }
        }

        return answer;
    }
}
