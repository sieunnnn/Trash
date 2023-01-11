package src.algorithm.thisIsForJava;

import java.util.Scanner;

public class GreedyPROB02 {
    /*
    숫자 카드 게임은 여러 개의 숫자 카드 중에서 가장 높은 숫자가 쓰인 카드 한 장을 뽑는 게임
    먼저 뽑고자 하는 카드가 포함되어 있는 행을 선택한다.
    선택된 행에 포함된 카드들 중 가장 숫자가 낮은 카드를 뽑아야 한다.
    따라서 처음에 카드를 골라 낼 행을 선택할 때, 이후에 해당 행에서 가장 숫자가 낮은
    카드를 뽑을 것을 고려하여 최종적으로 가장 높은 숫자의 카드를 뽑을 수 있도록 전략을 세워야 한다.
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N 과 M 을 공백으로 구분하여 입력 받기
        int N = sc.nextInt();
        int M = sc.nextInt();

        int result = 0;

        // 한 줄 씩 입력 받아 확인하기
        for (int i = 0; i < N; i++) {
            int min = 10001;

            for (int j = 0; j < 1; j++) {
                int number = sc.nextInt();
                // 입력받은 수를 바로 최솟값과 비교하면서 각 행에서 제일 작은 수 찾기
                min = Math.min(min, number);
            }

            // 가장 작은 수들 중에서 가장 큰 수 찾기
            result = Math.max(result, min);
        }

        System.out.println(result);
    }

}
