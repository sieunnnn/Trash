package programmers.codingBasicTraining;

public class PROB102 {

    public static void main(String[] args) {
        int[] num_list = {-1, 2, 5, 6, 3};

        System.out.println(solution(num_list));
    }

    public static int solution (int[] num_list){

        int sumA = 0;
        int sumB = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0) {
                sumA += num_list[i];

            } else {
                sumB += num_list[i];
            }
        }

        int answer = sumA > sumB ? sumA : sumB;

        return answer;
    }
}
