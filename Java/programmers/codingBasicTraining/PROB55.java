package programmers.codingBasicTraining;

public class PROB55 {
    public static void main(String[] args) {
        String myString = "ABBAA";
        String pat = "AABB";

        System.out.println(solution(myString, pat));
    }

    public static int solution (String myString, String pat) {
        StringBuilder sb = new StringBuilder();
        char[] charArr = myString.toCharArray();

        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == 'A') {
                sb.append("B");

            } else if (charArr[i] == 'B') {
                sb.append("A");
            }
        }

        int answer = sb.toString().contains(pat) ? 1 : 0;

        return answer;
    }
}
