package src.algorithm.thisIsForJava;

public class GreedyExample {
    // 손님에게 거슬러 줘야 할 돈이 1260 원 일 때 거슬러 줘야 할 동전의 최소 개수를 구하여라.

    public static void main(String[] args) {
        // 거슬러 줘야 할 금액
        int n = 1260;

        // 거슬러 줘야 할 동전의 개수
        int count = 0;

        // 동전의 종류
        int[] coinType = {500, 100, 50, 10};

        for (int i = 0; i < n; i++){
            count += n / coinType[i];
            n %= coinType[i];
        }

        System.out.println(count);
    }

}
