package multiCampus.operator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 삼항연산자 {
    public static void main (String[] args) throws IOException {
        /*
        <조건식>
        1. 연산 결과가 논리값으로 나오는 식
        2. 삼항연산자: 조건식 ? 참일때 값(식): 거짓일 때 값(식):
         */

        int x = 3;
        int y = 3;

        int res = x > y ? x + y : x - y;
        System.out.println(res);



        q1();
        /*
        사용자로부터 하나의 문자를 입력받아 입력받은 문자가 'y' 또는 'Y' 라면 'y 를 입력하셨습니다.'
        입력받은 문자가 'y' 또는 'Y' 가 아니라면 '잘못 입력하셨습니다.' 를 출력하는 코드를 작성하시오.
          */


        q2();
        //사용자가 입력한 숫자가 0보다 크면 '양수'를 0보다 작으면 '음수'를 0이라면 0을 출력 하시오.

    }

    private static void q2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());

        String res = number > 0 ? "양수" : number < 0 ? "음수" : "0";
        System.out.println(res);
    }

    private static void q1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("y 또는 Y를 입력하세요 : ");

        String st = br.readLine();
        String res = st.equals("y") || st.equals("Y") ? "y를 입력하셨습니다." : "잘못 입력하셨습니다.";

        System.out.println(res);
    }

}
