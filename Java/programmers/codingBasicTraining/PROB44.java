package programmers.codingBasicTraining;

public class PROB44 {

    public static void main(String[] args) {

        String myString = "abcdevwxyz";

        System.out.println(solution(myString));
    }

    public static String solution (String myString) {
        char[] charArr = myString.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] < 'l') {
                sb.append('l');
                continue;
            }
            sb.append(charArr[i]);
        }

        return sb.toString();
    }
}
