package programmers.codingBasicTraining;

public class PROB47 {

    public static void main(String[] args) {
        String myString = "aBcDeFg";

        System.out.println(solution(myString));
    }

    public static String solution (String myString) {
        StringBuilder sb = new StringBuilder();
        char[] charArray = myString.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            sb.append(String.valueOf(charArray[i]).toUpperCase());
        }

        return sb.toString();
    }
}
