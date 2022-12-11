package multiCampus.controll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Branching {
    public static void main(String[] args) throws IOException {
        /*
        break: 반복문에서 즉시 탈출
        continue: 실행코드 안에서 continue를 만날 경우 즉시 반복문의 조건식으로 이동한다.
         */

        branching1();
        branching2();

    }

    private static void branching2() {
        //1에서 10까지 정수들의 합계를 반복을 사용해서 구하시오. 단 4의 배수는 제외하고 합산하시오.
        int sum = 0;

        for(int i = 1; i < 11; i++) {
            if(i % 4 == 0) {
                continue;
            }
            sum += i;
        }

        System.out.println(sum);
    }

    private static void branching1() throws IOException {
    /*
    사용자로부터 문자열을 입력받아 출력하는 반복문을 작성하라.
    사용자로부터 end 라는 문자열을 입력받을 경우 반복문은 멈춘다.
     */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            System.out.println("메세지를 입력하세요.");
            String str = br.readLine();

            if(str.equals("end")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
