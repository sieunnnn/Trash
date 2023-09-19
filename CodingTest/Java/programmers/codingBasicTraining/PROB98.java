package programmers.codingBasicTraining;

public class PROB98 {

    public static void main(String[] args) {
        int[] num_list = {12, 4, 15, 46, 38, -2, 15};

        System.out.println(solution(num_list));
    }

    public static int solution (int[] num_list) {

        int result = -1;

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) {
                result = i;
                break;
            }
        }

        return result;
    }
}
