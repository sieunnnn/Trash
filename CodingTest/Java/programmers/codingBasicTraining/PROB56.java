package programmers.codingBasicTraining;

public class PROB56 {

    public static void main(String[] args) {
        String myString = "abstract algebra";

        System.out.println(solution(myString));
    }

    public static String solution (String myString) {
        StringBuilder sb = new StringBuilder();
        char[] charArr = myString.toCharArray();

        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == 'a') {
                sb.append('A');
            } else if ('A' < charArr[i] && charArr[i] <= 'Z') {
                sb.append(String.valueOf(charArr[i]).toLowerCase());
            } else {
                sb.append(charArr[i]);
            }
        }

        return sb.toString();
    }
}
