package multiCampus.ex;

import java.util.Arrays;

public class EX120201 {
    public static void main(String[] args) {

        /*
        원하는 인덱스의 데이터를 삭제하는 메서드
        첫번째 매개변수: 배열
        두번째 매개변수: 인덱스
        메서드명 : remove
            예) int[] data = {1,2,3,4,5};
            remove(data,2) -> [1,2,4,5]
         */

        int[] data = {1, 2, 3, 4, 5};

        data = remove(data, 2);

        System.out.println(Arrays.toString(data));



        /*
        원하는 인덱스 구간의 데이터를 잘라내는 메서드
        인덱스 구간: 시작 인덱스 ~ 끝 인덱스의 앞 인덱스까지의 데이터
        첫번째 매개변수: 배열
        두번째 매개변수: 시작 인덱스
        세번재 매개변수: 끝 인덱스
        메서드 명: SubArr
        예) int[] data = {1,2,3,4,5}
            subArr(data,0,2); -> [1,2]
         */


        int[] data2 = {1,2,3,4,5};

        data2 = subArr(data2,0,2);
        System.out.println(Arrays.toString(data2));

    }

    public static int[] remove(int[] arr,int idx) {
        int[] temp = new int[arr.length-1];

        int tidx = 0;

        for(int i=0; i<arr.length; i++) {
            if(i == idx) continue;
            temp[tidx] = arr[i];
            tidx++;
        }

        return temp;
    }

    public static int[] subArr(int[] arr, int start, int end) {
        int[] temp = new int[end-start];

        for(int i=0; i<temp.length; i++) {
            temp[i] = arr[start+i];
        }

        return temp;
    }
}
