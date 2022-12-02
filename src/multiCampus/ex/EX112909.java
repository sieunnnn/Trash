package multiCampus.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EX112909 {
    public static void main(String[] args) throws IOException {
        /*
        다중조건문 표현식
        if(A조건식) {실행코드
            } else if(B조건식) {
                }
         */

        /*
        사용자로부터 점수를 입력 받아 등급을 출력하세요
        90점 이상이면 A
        80점 이상 90점 미만이면 B
        70점 이상 80점 미만이면 C
        60점 이상 70점 미만이면 D
        60점 미만이면 F

        이때 F가 아닌 경우 점수가 반올림했을 때 올림처리 되는 경우에는 (일의 자리수가 5이상)
        등급 뒤에 +를 붙여주도록 코드를 수정하세요
        95점: A -> A+
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int score = Integer.parseInt(br.readLine());
        String grade = "";

        if(score >= 90 ) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        String plus = "+";

        if(score%10 >= 5) {
            System.out.println(grade + plus);
        }

    }
}
