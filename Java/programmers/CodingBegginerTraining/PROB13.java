package programmers.CodingBegginerTraining;


public class PROB13 {

    public String solution(int age) {
        char[] chars = new char[10];
        char alphabet = 'a';

        for (int i = 0; i < chars.length; i++) {
            chars[i] = alphabet++;
        }


        StringBuilder sb = new StringBuilder();

        String ageToString = String.valueOf(age);


        for (int i = 0; i < ageToString.length(); i++) {
            int idx = Integer.parseInt(String.valueOf(ageToString.charAt(i)));

            sb.append(chars[idx]);
        }

        return sb.toString();
    }
}
