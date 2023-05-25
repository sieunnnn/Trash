package programmers.CodingBegginerTraining;

public class PROB7 {

    public static void main(String[] args) {
        String my_string = "cccCCC";

        System.out.println(solution(my_string));
    }

    public static String solution (String my_string) {
        StringBuilder sb = new StringBuilder();
        char[] chars= my_string.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                sb.append(String.valueOf(chars[i]).toUpperCase());

            } else if (chars[i] >= 'A' && chars[i] <= 'Z') {
                sb.append(String.valueOf(chars[i]).toLowerCase());
            }
        }

        return sb.toString();
    }
}
