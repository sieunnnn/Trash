package multiCampus.ex;

import java.util.Arrays;

public class EX120102 {
    public static void main(String[] args) {

        /*
        <2차원 배열>
            2차원 배열은 1차원 배열을 여러개 보관하는 배열이다.
         */

        /*
         <2차원 배열의 초기화>
            크기가 4인 int[]을 3개 가지는 배열
         */

        int[][] dArr = new int[3][4];

        dArr[0][0] = 1;
        dArr[0][1] = 2;
        dArr[0][2] = 3;
        dArr[0][3] = 4;

        System.out.println(dArr);
        System.out.println(dArr[0]);
        System.out.println(dArr[0][0]);
        System.out.println(dArr[1][1]);

        /*
        <가변배열>
            주소배열의 크기는 지정해야 하지만, 값을 저장할 배열의 크기는 지정하지 않고 2차원 배열을 초기화
         */
        int[][] dArr2 = new int[2][];

        dArr2[0] = new int[3];
        dArr2[1] = new int[2];

        // 1~5 사이의 값을 dArr2에 넣어주세요.
        int val = 1;

        for(int i=0; i < dArr2.length; i++) { // dArr2.length = 2
            int[] temp = dArr2[i];
            for(int j=0; j < temp.length; j++) {
                temp[j] = val++;
            }
        }

        // 출력
        for(int i=0; i < dArr2.length; i++) {
            System.out.println(Arrays.toString(dArr2[i]));
        }




    }
}
