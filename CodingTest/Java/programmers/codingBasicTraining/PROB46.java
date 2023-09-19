package programmers.codingBasicTraining;

public class PROB46 {

    public static void main(String[] args) {
        String myString = "aBcDeFg";

        System.out.println(solution(myString));
    }

    public static String solution (String myString) {
        StringBuilder sb = new StringBuilder();
        char[] charArray = myString.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            sb.append(String.valueOf(charArray[i]).toLowerCase());
        }

        return sb.toString();
    }
}
