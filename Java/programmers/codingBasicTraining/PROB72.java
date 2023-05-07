package programmers.codingBasicTraining;

public class PROB72 {

    public static void main(String[] args) {
        String myString = "aaaa";
        String pat = "aa";

        System.out.println(solution(myString, pat));
    }

    public static int solution (String myString, String pat) {
        int cnt = 0;

        for (int i = 0; i < myString.length(); i++) {
            if (myString.substring(i).startsWith(pat)) {
                cnt++;
            }
        }

        return cnt;
    }
}
