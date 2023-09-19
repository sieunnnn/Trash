package programmers.codingBasicTraining;

public class PROB52 {

    public static void main(String[] args) {
        String my_string = "programmers";
        String alp = "p";

        System.out.println(solution(my_string, alp));
    }

    public static String solution (String my_string, String alp) {
        StringBuilder sb = new StringBuilder();
        char[] charArr = my_string.toCharArray();

        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == alp.charAt(0)) {
                sb.append(String.valueOf(charArr[i]).toUpperCase());
            } else {
                sb.append(charArr[i]);
            }
        }

        return sb.toString();
    }
}
