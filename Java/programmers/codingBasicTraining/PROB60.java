package programmers.codingBasicTraining;

public class PROB60 {

    public static void main(String[] args) {

        String myString = "AbCdEfG";
        String pat = "aBc";

        System.out.println(solution(myString, pat));
    }

    public static int solution (String myString, String pat) {
        // 대문자 기준으로
        String upperCaseMyString = myString.toUpperCase();
        String upperCasePat = pat.toUpperCase();

        if (upperCaseMyString.contains(upperCasePat) &&
                upperCaseMyString.length() >= upperCasePat.length()) {
            return 1;

        } else {
            return 0;
        }
    }
}
