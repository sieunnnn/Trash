package programmers.CodingBegginerTraining;

public class PROB30 {

    public static void main(String[] args) {
        String numbers = "onetwothreefourfivesixseveneightnine";

        System.out.println(solution(numbers));
    }

    public static long solution(String numbers) {
        String[] str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < str.length; i++) {
            numbers = numbers.replaceAll(str[i], String.valueOf(i));
        }

        return Long.parseLong(numbers);
    }
}
