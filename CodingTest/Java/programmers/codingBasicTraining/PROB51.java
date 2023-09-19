package programmers.codingBasicTraining;

public class PROB51 {

    public static void main(String[] args) {
        String my_string = "jerry";

        System.out.println(solution(my_string));
    }

    public static String solution (String rny_string) {
        StringBuilder sb = new StringBuilder();
        char[] charArr = rny_string.toCharArray();

        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == 'm') {
                sb.append('r').append('n');
            } else {
                sb.append(charArr[i]);
            }
        }

        return sb.toString();
    }
}
