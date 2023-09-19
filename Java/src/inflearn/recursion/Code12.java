package src.inflearn.recursion;

public class Code12 {
    // 2 진수로 변환하여 출력
    public static void printInBinary(int n) {
        if (n < 2)
            System.out.print(n);

        else {
            printInBinary(n/2);
            System.out.print(n%2);
        }
    }

    public static void main(String[] args) {
        printInBinary(5);

    }

}
