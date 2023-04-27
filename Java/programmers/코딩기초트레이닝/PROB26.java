package programmers.코딩기초트레이닝;

public class PROB26 {

    public static void main(String[] args) {
        int[] numLog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};

        System.out.println(solution(numLog));
    }

    public static String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < numLog.length; i++) {
            if (numLog[i] - numLog[i - 1] == 1) {
                sb.append("w");

            } else if (numLog[i] - numLog[i - 1] == -1) {
                sb.append("s");

            } else if (numLog[i] - numLog[i - 1] == 10) {
                sb.append("d");

            } else if (numLog[i] - numLog[i - 1] == -10) {
                sb.append("a");
            }
        }

        return sb.toString();
    }
}
