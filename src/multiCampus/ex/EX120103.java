package multiCampus.ex;

import java.util.Arrays;

public class EX120103 {
    public static void main(String[] args) {

        // 아래 배열의 0번 인덱스와 1번 인덱스의 자리를 바꿔주세요.

        int[] iArr = {1,3,5,7,9};
        int[] temp = new int[iArr.length];

        for(int i = 0; i < temp.length; i++) {
            temp[i] = iArr[i];
        }

        temp[0] = iArr[1];
        temp[1] = iArr[0];

        System.out.println("변경 전 : " + Arrays.toString(iArr));
        System.out.println("변경 후 : " + Arrays.toString(temp));


        /*
        iArr2에 담겨있는 값들을 오름차순으로 정렬해주세요.
        오름차수는 작은 수가 앞에, 큰 수가 뒤에 오도록 정렬
         */

        int[] iArr2 = {1,20,4,2,7,9};

        sort(iArr2);

        System.out.println(Arrays.toString(iArr2));

        /*
        iArr2에 담겨있는 값들을 내림차순으로 정렬해주세요.
        오름차수는 작은 수가 앞에, 큰 수가 뒤에 오도록 정렬
         */

        int[] iArr3 = {1,20,4,2,7,9};

        for(int i = 0; i<iArr3.length; i++) {
            for(int j = 0; j<iArr3.length-1-i; j++) {
                if(iArr3[j] < iArr3[j+1]) {
                    int tmp2 = iArr3[j];
                    iArr3[j] = iArr3[j+1];
                    iArr3[j+1] = tmp2;
                }
            }
        }
        System.out.println(Arrays.toString(iArr3));



        //배열 크기변경 * 메소드 따로 빼서 변환해야해
        int[] iArr4 = {1, 20, 4, 2, 7, 9};
        int[] bigArr = add(iArr4);

        System.out.println(Arrays.toString(bigArr));


        /*
        기능: 매개변수로 넘어온 두 int 배열을 하나의 배열로 합쳐주는 매서드
        매서드이름 : merge
        메서드를 작성하고 테스트까지 완료해주세요.

        ex)
            int[] data = {1,2,3,4,5}
            int[] data2 = {6,7,8,9,0}
            merge(data,data2) -> [1,2,3,4,5,6,7,8,9,0]
         */

        int[] data = {1,2,3,4,5};
        int[] data2 = {6,7,8,9,0};


        System.out.println(Arrays.toString(merge(data,data2)));

    }

    public static void sort(int[] iArr2) {
        for(int i = 0; i< iArr2.length; i++) {
            for(int j = 0; j< iArr2.length-1-i; j++) {
                if(iArr2[j] > iArr2[j+1]) {
                    int tmp = iArr2[j];
                    iArr2[j] = iArr2[j+1];
                    iArr2[j+1] = tmp;
                }
            }

        }
    }

    public static int[] add(int[] iArr4) {
        int[] bigArr = new int[iArr4.length+1];

        for (int i = 0; i < iArr4.length; i++) {
            bigArr[i] = iArr4[i];
        }
        bigArr[bigArr.length-1] = 10000;
        return bigArr;
    }

    public static int[] merge(int[] data, int[] data2) {

        int[] bigArr = new int[data.length + data2.length];

        for (int i = 0; i < data.length; i++) {
            bigArr[i] = data[i];
        }
        for (int i = 0; i < data2.length; i++) {
            bigArr[i + data.length] = data2[i];
        }

        return bigArr;
    }
}
