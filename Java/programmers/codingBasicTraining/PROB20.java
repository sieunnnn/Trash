package programmers.codingBasicTraining;

public class PROB20 {

    public static void main(String[] args) {

        int[] num_list= {3, 4, 5, 2, 1};

        System.out.println(Solution(num_list));
    }

    public static int Solution(int[] num_list) {

        String oddNum = "";
        String evenNum = "";

        for (int i = 0; i < num_list.length; i++) {

            if(num_list[i] % 2 == 0) {
                evenNum += String.valueOf(num_list[i]);
            } else {
                oddNum += String.valueOf(num_list[i]);
            }
        }

        return Integer.parseInt(oddNum) + Integer.parseInt(evenNum);
    }
}
