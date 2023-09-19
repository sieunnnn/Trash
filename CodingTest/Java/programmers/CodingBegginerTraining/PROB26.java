package programmers.CodingBegginerTraining;

public class PROB26 {

    public static void main(String[] args) {
        String bin1 = "10";
        String bin2 = "11";

        System.out.println(solution(bin1, bin2));
    }

    public static String solution(String bin1, String bin2) {
        int binary1 = Integer.parseInt(bin1, 2);
        int binary2 = Integer.parseInt(bin2, 2);

        return Integer.toBinaryString(binary1 + binary2);
    }
}
