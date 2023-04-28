package programmers.코딩기초트레이닝;

public class PROB32 {

    public static void main(String[] args) {
        int[] num_list = {15, 98, 23, 2, 15};
        int n = 20;

        System.out.println(solution(num_list, n));
    }

    public static int solution (int[] num_list, int n) {
        int answer = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] == n) {
                answer = 1;
            }
        }

        return answer;
    }
}
