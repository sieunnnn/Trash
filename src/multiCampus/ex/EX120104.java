package multiCampus.ex;

import java.util.Arrays;

public class EX120104 {
    public static void main(String[] args) {
        /*
        크기가 10인 int[]을 선언하고 1~100 사이의 임의의 정수를 발생시켜, 배열 공간에 기록하시오
        기록된 10개의 값 중 가장 큰 값과 가장 작은 값을 알아내어
        [출력양식] min : 1, max : 100 과 같은 형식으로 출력하시오.
        hint : Math 클래스의 random 메서드를 활용하면 임의의 정수를 발생시킬 수 있다.
         */

        int[] randomArr = new int[10];


        for(int i = 0; i < randomArr.length; i++) {
            int random = (int) (Math.random() * 100) + 1;
            randomArr[i] = random;
        }

        EX120103.sort(randomArr);

        System.out.println("min : " + randomArr[0] + " / max : " + randomArr[randomArr.length-1]);
        System.out.println(Arrays.toString(randomArr));


        /*
        크기가 10인 int[]를 3개 생성하세요.
        각 int[]을 1~95 사이의 임의의 수로 초기화 하세요.
        3개 int[]에 들어있는 숫자들 중에서 7,8,9번째로 작은 수를 구하세요
        ex) [1,2,3,3] [4,5,5,6] [6,6,8,9]
        [출력양식]   7번째 : 5
                   8번째 : 6
                   9번째 : 6
         */

        int[] iArr5 = new int[10];
        int[] iArr6 = new int[10];
        int[] iArr7 = new int[10];

        for (int i = 0; i < iArr7.length; i++) {
            iArr5[i] = (int)(Math.random()*95)+1;
            iArr6[i] = (int)(Math.random()*95)+1;
            iArr7[i] = (int)(Math.random()*95)+1;
        }

        int[] res = EX120103.merge(iArr5, iArr6);
        res = EX120103.merge(res,iArr7);
        EX120103.sort(res);

        System.out.println(Arrays.toString(res));
        System.out.println("7번째 : " + res[7]);
        System.out.println("8번째 : " + res[8]);
        System.out.println("9번째 : " + res[9]);

    }
}
