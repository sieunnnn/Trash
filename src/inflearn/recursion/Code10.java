package src.inflearn.recursion;

public class Code10 {
    // 문자열의 프린트
    public static void printChars(String str) {
        if (str.length() == 0)
            return;

        else {
            System.out.print(str.charAt(0));
            printChars(str.substring(1));
        }
    }

    public static void main(String[] args) {
        printChars("sieun");

    }

}
