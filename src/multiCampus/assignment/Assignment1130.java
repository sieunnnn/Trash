package multiCampus.assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assignment1130 {
    public static void main(String[] args) throws IOException {

        q1();
        q2();
        dia();
        q3();
        q4();
        q5();
        q6();

    }

    private static void q6() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int victory = 0;
        int lose = 0;
        int same = 0;

        while(true) {
            System.out.print("나: ");
            String p1 = br.readLine();

            System.out.print("너: ");
            String p2 = br.readLine();

            if(p1.equals(p2)) {
                same ++;
            } else if(p1.equals("가위")) {
                if(p2.equals("바위")) {
                    lose ++;
                } else {
                    victory++;
                }
            } else if(p1.equals("바위")) {
                if(p2.equals("가위")) {
                    lose ++;
                } else {
                    victory ++;
                }
            } else {
                if(p2.equals("주먹")) {
                    lose ++;
                } else {
                    victory ++;
                }
            }

            if(victory == 2) {
                break;
            }
        }

        System.out.println(victory + "승 " + same + "무 " + lose + "패 하셨습니다.");

    }

    private static void q5() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*
        사용자로부터 숫자와 방향(+,-)를 입력받아 사용자가 입력한 방향에 따라 삼각형 밑변의 위치를 다르게 출력하시오.
        출력예시)
            숫자: 4
            방향(+ 또는 -): -
            ****
            ***
            **
            *
         */

        System.out.print("숫자: ");
        int cnt = Integer.parseInt(br.readLine());

        System.out.print("방향(+ 또는 -) : ");
        String dir = br.readLine();

        if(dir.equals("+")) {
            for(int i=1; i<=cnt; i++) {
                for(int j=1; j<=i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else if(dir.equals("-")) {
            for(int i=cnt; i>0; i--) {
                for(int j=i; j>0; j--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {
            System.out.println("다시 입력해주세요.");
        }
    }

    private static void q4() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /*
         사용자로부터 다운로드 받을 프로그램 갯수를 입력받아
         다운로드 진행창을 출력하시오

         사용자로부터 다운로드 받을 프로그램의 개수 입력받는다.
         [출력양식]
         n번째 프로그램 다운로드 받습니다.
         0% 진행중...
         20% 진행중...
         40% 진행중...
         60% 진행중...
         80% 진행중...
         100% 진행중...
         n번째 프로그램 다운로드 완료되었습니다.
         -------------------------------
         모든 프로그램 다운로드 완료
        */

        int input = Integer.parseInt(br.readLine());

        for(int i=1; i<=input; i++) {
            System.out.println(i+"번째 프로그램 다운로드 받습니다.");
            for(int j=0; j<6; j++) {
                System.out.println((j*20)+"% 진행중...");
            }
            System.out.println(i+"번째 프로그램 다운로드 완료되었습니다.");
            System.out.println("------------------------------------");
        }
        System.out.println("모든 프로그램 다운로드 완료");
    }

    private static void q3() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /*
        사용자로부터 정수를 하나 입력받아 정수만큼의 높이를 가지는 직각삼각형을  * 을 사용해 그리세요
        이 때 빗변은 해당 행의값을 출력합니다.
        출력예시)
            숫자 : 5
             1
             *2
             **3
             ***4
             ****5
        */

        System.out.print("숫자: ");
        int input = Integer.parseInt(br.readLine());

        for(int i = 0; i<input; i++) {
            for (int j = 0; j<=i; j++) {
                if(j==i) {
                    System.out.print(i+1);
                } else {
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }

    private static void dia() throws IOException {
    /*
    사용자로부터 숫자를 입력받아서 한 변을 구성하는 별의 개수가 사용자가 입력한 값이 되도록 하는 다이아몬드를 그리시오
    숫자 : 5
          *
         ***
        *****
       *******
      *********
       *******
        *****
         ***
          *
     */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());

        // 상단
        for(int i=0; i<input; i++) {
            for(int j=1; j<input-i; j++) {
                System.out.print(" ");
            }
            for(int j=0; j<(i*2)+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 하단
        for(int i=input-1; i>0; i--) {
            for(int j=input-i; j>0; j--) {
                System.out.print(" ");
            }
            for(int j=(i*2)-1; j>0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    private static void q2() throws IOException {

        /*
        사용자로부터 정수를 하나 입력받아 사각형을 별로 그리는 데, 대각선에는 숫자를 출력하시오.
        숫자는 1~ 사용자가 입력한 숫자까지

        출력예시)
        숫자: 4
        1***
        *2**
        **3*
        ***4

        */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("숫자를 입력하세요");
        int input = Integer.parseInt(br.readLine());

        for(int i = 1; i <= input; i++) {
            for(int k = 1; k <= input; k++) {
                if(i == k) {
                    System.out.print(i);
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();

        }
    }

    private static void q1() throws IOException {

        /*
        사용자로부터 줄 수와 칸수를 입력받아서 사각형을 별로 그리는 이중반복문 작성하시오

        출력예시
        줄 수 : 3
        칸 수 : 4
        ****
        ****
        ****
        */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("줄 수를 입력하세요.");
        int row = Integer.parseInt(br.readLine());

        System.out.println("칸 수를 입력하세요.");
        int column = Integer.parseInt(br.readLine());

        for(int i = 0; i < row; i++) {
            for(int k = 0; k <column; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
