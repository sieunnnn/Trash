package src.inflearn.recursion;

public class Code11 {
    // 문자열을 뒤집어 프린트
    public static void printCharsReverse(String str) {
        if (str.length() == 0)
            return;

        else {
            printCharsReverse(str.substring(1));
            System.out.print(str.charAt(0));
        }
    }

    public static void main(String[] args) {
        printCharsReverse("sieun");

    }

}
