package src.inflearn.recursion;

public class Code09 {
    // 문자열의 길이 계산
    public static int length(String str) {
        if (str.equals(""))
            return 0;

        else
            return 1 + length(str.substring(1));

    }

    public static void main(String[] args) {
        System.out.println(length("sieun"));

    }

}
