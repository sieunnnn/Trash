package programmers.codingBasicTraining;

public class PROB67 {

    public static void main(String[] args) {
        String my_string = "Progra21Sremm3";
        int s = 6;
        int e = 12;

        System.out.println(solution(my_string, s, e));
    }

    public static String solution (String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder();

        if (s > 0) {
            sb.append(my_string.substring(0, s));
        }
        // s 가 0 인 경우, 2 등분 그 외에는 3 등분
        String toReverse = my_string.substring(s, e + 1);

        for (int i = toReverse.length() - 1; i >= 0; i--) {
            sb.append(toReverse.charAt(i));
        }

        sb.append(my_string.substring(e + 1));
        return sb.toString();
    }
}
