package programmers.codingBasicTraining;

public class PROB65 {

    public static void main(String[] args) {
        String number = "78720646226947352489";

        System.out.println(solution(number));
    }

    public static int solution (String number){
        int sum = 0;

        for (int i = 0; i < number.length(); i++) {
            sum += Integer.parseInt(String.valueOf(number.charAt(i)));
        }

        return sum % 9;
    }
}
