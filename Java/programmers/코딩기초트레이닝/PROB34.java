package programmers.코딩기초트레이닝;

public class PROB34 {

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "aabcc";

        System.out.println(solution(str1, str2));
    }

    public static int solution (String str1, String str2) {
        if (str2.contains(str1)) {
            return 1;
        } else {
            return 0;
        }
    }
}
