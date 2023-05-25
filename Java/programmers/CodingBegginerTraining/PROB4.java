package programmers.CodingBegginerTraining;

public class PROB4 {

    public static void main(String[] args) {
        String rsp = "2";

        System.out.println(solution(rsp));
    }

    public static String solution(String rsp) {
        // 가위는 2 바위는 0 보는 5로 표현
        StringBuilder sb = new StringBuilder();
        char[] chars = rsp.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '2') {
                sb.append("0");

            } else if (chars[i] == '0') {
                sb.append("5");

            } else if (chars[i] == '5') {
                sb.append("2");
            }
        }

        return sb.toString();
    }
}
