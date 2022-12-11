package multiCampus.controll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class While {
    public static void main(String[] args) throws IOException {
        /*
        [표현식] while(조건식) {실행코드}
            조건식이 참이면 실행코드를 반복
            조건식이 거짓이면 반복을 종료
         */

        // 무한반복문
        /*
        while(true) {
            System.out.println("멈추지 않아! 중요한건 꺾이지 않는 마음!");
        }
        */

        while1();
        while2();

    }

    private static void while2() throws IOException {
        /*
        사용자로부터 비밀번호를 입력받아서 비밀번호가 일치하면 "로그인 되었습니다."를 출력하고 반복문을 종료
        비밀번호가 일치하지 않으면 "비밀번호가 틀렸습니다"를 출력하고 다시 비밀번호를 입력받을 수 있도록 한다.
        비밀번호를 5회 틀리게 되면 "비밀번호를 5회 잘못 입력하여 프로그램을 종료합니다." 라고 출력하고 반복문을 종료한다.
            * 비밀번호 :  123abc
        */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int i = 0;

        while(i < 5) {
            System.out.println("비밀번호를 입력하세요.");
            String password = br.readLine();
            i++;

            if(password.equals("123abc")) {
                System.out.println("로그인 되었습니다.");
                break;
            } else {
                System.out.println("비밀번호가 틀렸습니다.");
            }

            if(i == 5) {
                System.out.println("비밀번호를 5회 잘못 입력하여 프로그램을 종료합니다.");
                break;
            }
        }
    }

    private static void while1() {
        // 다섯번만 반복하는 While문
        int i=0;

        while(i < 5) {
            System.out.println("멈추지 않아! 중요한건 꺾이지 않는 마음!");
            i++;
        }
    }
}
