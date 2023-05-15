package programmers.codingBasicTraining;

public class PROB108 {

    public static void main(String[] args) {
        String[] str_list = {"abc", "bbc", "cbc"};
        String ex = "c";

        System.out.println(solution(str_list, ex));
    }

    public static String solution (String[] str_list, String ex) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str_list.length; i++) {
            if (!str_list[i].contains(ex)) {
                sb.append(str_list[i]);
            }
        }

        return sb.toString();
    }
}
