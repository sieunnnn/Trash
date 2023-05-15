package programmers.codingBasicTraining;

public class PROB94 {

    public static void main(String[] args) {
        int[] num_list = {3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1};

        System.out.println(solution(num_list));
    }

    public static int solution(int[] num_list) {

        int sum = 0;
        int multiply = 1;

        for(int i = 0; i < num_list.length; i++) {
            if (num_list.length > 10) {
                sum += num_list[i];

            } else {
                multiply *= num_list[i];
            }
        }

        if (num_list.length > 10) return sum;
        else return multiply;
    }
}
