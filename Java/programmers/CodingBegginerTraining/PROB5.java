package programmers.CodingBegginerTraining;

public class PROB5 {

    public static void main(String[] args) {
        String cipher = "dfjardstddetckdaccccdegk";
        int code = 4;

        System.out.println(solution(cipher, code));
    }

    public static String solution(String cipher, int code) {
        StringBuilder sb = new StringBuilder();
        char[] chars = cipher.toCharArray();
        int idx = code -1;

        while (chars.length > idx ) {
            sb.append(chars[idx]);
            idx += code;
        }

        return sb.toString();
    }
}
