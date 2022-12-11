package multiCampus.controll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class If {
    public static void main(String[] args) throws IOException {
        /*
        <제어문>
        1. 코드의 흐름을 제어하는 문법
        2. 조건문, 반복문
        3. 단독 if문
            if(조건문){실행코드}
            (1) 조건식이 참이면 실행코드를 수행
            (2) 조건식이 거짓이면 실행코드를 무시
         */

        // 사용자가 입력한 숫자가 1보다 크거나 같으면 양수입니다를 출력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("숫자를 하나 입력하세요.");
        int input = Integer.parseInt(br.readLine());

        if(input >= 1) {
            System.out.println("양수 입니다.");
        }

    }
}
