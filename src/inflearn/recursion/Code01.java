package src.inflearn.recursion;

public class Code01 {
    public static void main(String[] args) {
        func();
    }

    public static void func() {
        System.out.println("Hello...");
        func();
    }

    // 결과를 보면 무한루프에 빠짐을 알 수 있다.
}
