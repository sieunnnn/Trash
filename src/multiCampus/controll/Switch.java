package multiCampus.controll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Switch {
    public static void main(String[] args) throws IOException {
        /*
        <switch-case 문>
        1. [표현식]
            switch(조건 값) {
                case 값A : 실행문; break;
                case 값B : 실행문; break;
                default : 실행문;
            }
        2. default : 변수의 값이 case 에 없을 때 수행할 코드이다.
        3. 정수형, 문자, 문자열, Enum 만 가능하다.

        <fall-Through 문>

         */

        switchCase1();
        switchCase2();

    }

    private static void switchCase2() throws IOException {
        /*
        사용자에게 입력,수정,조회,삭제,종료 메뉴를 보여주는 메뉴창을 출력하고
        사용자가 선택한 번호에 따라 알맞은 안내문구를 출력하시오

        출력예시
        1. 입력
        2. 수정
        3. 조회
        4. 삭제
        7. 종료
        메뉴 번호 입력 : 1
        입력메뉴가 선택되었습니다.
        */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("1. 입력");
        System.out.println("2. 수정");
        System.out.println("3. 조회");
        System.out.println("4. 삭제");
        System.out.println("7. 종료");
        System.out.print("메뉴 번호 입력: ");

        int input = Integer.parseInt(br.readLine());
        switch(input) {
            case 1:
                System.out.println("입력 선택하였습니다.");
                break;
            case 2:
                System.out.println("수정 선택하였습니다.");
                break;
            case 3:
                System.out.println("조회 선택하였습니다.");
                break;
            case 4:
                System.out.println("삭제 선택하였습니다.");
                break;
            case 7:
                System.out.println("종료 선택하였습니다.");
                break;

            default:
                System.out.println("올바른 번호를 선택하시지");
                break;
        }
    }

    private static void switchCase1() throws IOException {
        // 정수 두개와 산술연잔자 1개를 입력 받아 연산자에 해당하는 연산을 수행하고 출력하시오.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("첫번째 값: ");
        int firstNum = Integer.parseInt(br.readLine());

        System.out.print("두번째 값: ");
        int secondNum = Integer.parseInt(br.readLine());

        System.out.print("연산자: ");
        String op = br.readLine();

        int result = 0;

        switch(op) {
            case "+":
                result = firstNum + secondNum;
                break;
            case "-":
                result = firstNum - secondNum;
                break;
            case "*":
                result = firstNum * secondNum;
                break;
            case "/":
                result = firstNum / secondNum;
                break;
            case "%":
                result = firstNum % secondNum;
                break;

            default:
                System.out.println("산술연산자를 넣어주세요.");
                break;
        }

        System.out.println("결과: "+result);
    }

}
