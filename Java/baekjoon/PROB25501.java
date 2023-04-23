package src.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PROB25501 {
    /*
    정휘는 후배들이 재귀 함수를 잘 다루는 재귀의 귀재인지 알아보기 위해 재귀 함수와 관련된 문제를 출제하기로 했다.
    팰린드롬이란, 앞에서부터 읽었을 때와 뒤에서부터 읽었을 때가 같은 문자열을 말한다.
    팰린드롬의 예시로 AAA, ABBA, ABABA 등이 있고, 팰린드롬이 아닌 문자열의 예시로 ABCA, PALINDROME 등이 있다.
    어떤 문자열이 팰린드롬인지 판별하는 문제는 재귀 함수를 이용해 쉽게 해결할 수 있다.
    아래 코드의 isPalindrome 함수는 주어진 문자열이 팰린드롬이면 1, 팰린드롬이 아니면 0을 반환하는 함수다.

    첫째 줄에 테스트케이스의 개수 T 가 주어진다.
    둘째 줄부터 T 개의 줄에 알파벳 대문자로 구성된 문자열 S 가 주어진다.
    각 테스트케이스마다, isPalindrome 함수의 반환값과 recursion 함수의 호출 횟수를 한 줄에 공백으로 구분하여 출력한다.
     */

    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            count = 0;
            String str = br.readLine();
            System.out.println(isPalindrome(str) + " " + count);

        }

    }

    public static int recursion(String str, int start, int end) {
        // base case
            count++;
        if(end <= start) {
            return 1;
        } else if (str.charAt(start) != str.charAt(end)) {
            return 0;
        } else {
            return recursion(str, (start + 1), (end - 1));
        }

    }

    public static int isPalindrome(String str) {
        // count = 1;
        return recursion(str, 0, str.length()-1);

    }

}
