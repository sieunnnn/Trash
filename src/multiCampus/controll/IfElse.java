package multiCampus.controll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfElse {
    public static void main(String[] args) throws IOException {
        /*
        양자택일 조건문 표현식
        if(조건식){실행코드}else{실행코드}
        */

        //사용자로부터 이름을 입력받아 만약 이름이 본인의 이름이면 [안녕하세요]를 출력하고, 아니면 [당신 누구야]를 출력한다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("이름을 입력하세요.");
        String name = br.readLine();

        if(name.equals("김시은")) {
            System.out.println("안녕하세요.");
        } else {
            System.out.println("당신 누구야?");
        }

    }

}
