package programmers.codingBasicTraining;

public class PROB53 {

    public static void main(String[] args) {
        String my_string = "cvsgiorszzzmrpaqpe";
        int[] index_list = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};

        System.out.println(solution(my_string, index_list));
    }

    public static String solution (String my_string, int[] index_list) {
        StringBuilder sb = new StringBuilder();
        char[] charArr = my_string.toCharArray();

        for (int i = 0; i < index_list.length; i++) {
            sb.append(charArr[index_list[i]]);
        }

        return sb.toString();
    }
}
