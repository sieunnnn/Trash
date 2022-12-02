package multiCampus.prob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB1129 {
    public static void main(String[] args) throws IOException {
        q1();
        q2();
        q3();
        q4();
        q5();

    }

    private static void q5() throws IOException {
    /*
    사용자로부터 정수 하나를 입력받아 정수가 1~9사이의 숫자라면 그 수의 구구단을 출력하시오
    1~9사이의 숫자가 아니라면 "1~9 사이의 숫자를 입력해야합니다"를 출력
    ex)
        정수 : 5
        5*1=10
        5*2=15
        5*3=20
        5*4=25
        5*5=30
        5*6=35
        5*7=40
        5*8=45
        5*9=50
     */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int dan = Integer.parseInt(br.readLine());
        int su = 1;

        if(dan < 1 || dan > 9) {
            System.out.println("1~9사이의 숫자를 입력하세요");
            return;
        }

        while(su < 10) {
            System.out.println(dan + "*" + su++ + "=" +(dan*su));
        }
    }

    private static void q1()throws IOException {

        // 사용자로 부터 사다리꼴의 윗변, 아랫변, 높이를 입력받아 넓이를 구하시오.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int up = Integer.parseInt(st.nextToken());
        int down = Integer.parseInt(st.nextToken());
        var height = Integer.parseInt(st.nextToken());

        int S = (up+down)*height/2;

        System.out.println(S);

    }

    private static void q2() throws IOException{

        /*
         사용자로 부터 아이디와 비밀번호를 입력받아
         사용자가 알맞은 아이디와 비밀번호를 입력하였다면, '로그인 되었습니다'를 출력하고
         아이디와 비밀번호가 맞지 않다면 '누구야 당신?' 을 출력하세요
         아이디 : test / 비밀번호 : java
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ID = br.readLine();
        String PASS = br.readLine();

        if(ID.equals("test") && PASS.equals("java")) {
            System.out.println("로그인 되었습니다.");
        } else {
            System.out.println("누구야 당신?");
        }

    }

    private static void q3() throws IOException{

        //사용자가 입력한 정수가 짝수 인지 판단하고 짝수라면 '짝수 입니다.', 홀수라면 '홀수 입니다.' 를 출력하세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());

        if((input%2) == 0) {
            System.out.println("짝수입니다.");
        } else {
            System.out.println("홀수입니다.");
        }
    }

    private static void q4() throws IOException {

        /*
        1P유저 로부터 가위바위보 중 하나를 입력받으세요
        2P유저 로부터 가위바위보 중 하나를 입력받으세요.
        1P유저 기준에서 승/패/비김 여부를 출력해주세요.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        String p1 = st.nextToken();
        String p2 = st.nextToken();

        if(p1.equals("가위")) {
            String res = p2.equals("가위") ? "비김" : p2.equals("바위") ? "패" : "승";
            System.out.println(res);
        } else if(p1.equals("바위")) {
            String res = p2.equals("바위") ? "비김" : p2.equals("보") ? "패" : "승";
            System.out.println(res);
        } else {
            String res = p2.equals("보") ? "비김" : p2.equals("가위") ? "패" : "승";
            System.out.println(res);
        }

    }

}
