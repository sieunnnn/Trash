package programmers.codingBasicTraining;

public class PROB70 {

    public static void main(String[] args) {
        String my_string = "ihrhbakrfpndopljhygc";
        int m = 4;
        int c = 2;

        System.out.println(solution(my_string, m, c));
    }

    public static String solution (String my_string, int m, int c) {
        StringBuilder sb = new StringBuilder();
        int index = c -1;

        while (true) {
            sb.append(my_string.charAt(index));

            index += m;

            if (index >= my_string.length()) {
                break;
            }
        }

        return sb.toString();
    }
}
