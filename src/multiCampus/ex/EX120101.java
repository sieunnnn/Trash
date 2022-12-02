package multiCampus.ex;

import java.util.Arrays;

public class EX120101 {
    public static void main(String[] args) {
        /*
        <배열>
            같은 타입의 데이터들을 하나의 묶음으로 다루는 자료구조
            배열에 저장된 각 데이터들은 해당 데이터에 접근할 수 있는 index 번호를 부여 받는다.
            배열은 참조자료형으로 JVM heap 영역에 저장된다.
            참조형 변수(reference)를 통해 heap 영역의 배열에 접근할 수 있다.
            index를 통해 배열안의 데이터에 접근할 수 있다.

         */

        /*
        <배열 생성해보기>
            String 타입의 데이터를 5개 보관할 수 있는 배열 생성
         */

        String[] arr = new String[5];
        arr[0] = "치킨";
        arr[1] = "피자";
        arr[2] = "감자튀김";
        arr[3] = "콜라";
        arr[4] = "스무디";

        System.out.println(arr); // 배열의 고유한 정보를 출력해준다.
        System.out.println(arr[3]);

        /*
         <배열의 선언과 동시에 초기화>
            크기가 5인 int[] 을 선언하고 각 인덱스에 5,4,3,2,1 값을 초기화
         */
        int[] iarr = new int[] {5,4,3,2,1};

        // iarr.length : 배열의 크기
        for (int i = 0; i < iarr.length; i++) {
            System.out.println(iarr[i]);
        }

        // 배열 리터럴 초기화
        int[] iarr2 = {1,2,3,4,5};

        for(int i = 0; i < iarr2.length; i++) {
            System.out.println(iarr2[i]);
        }

        // 예제

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int num4 = 40;
        int num5 = 50;

        int sum = 0;
        int sumArr = 0;

        sum += num1;
        sum += num2;
        sum += num3;
        sum += num4;
        sum += num5;

        int[] iarr3 = {10,20,30,40,50};
        for(int i = 0; i < iarr3.length; i++ ) {
            sumArr += iarr3[i];
        }
        System.out.println(sum);
        System.out.println(sumArr);

        // 예제2

        /*
        <얕은복사>
            주소를 복사하기 때문에 두개가 둘다 변경된다.
            pdf 그림 확인하기
         */
        String[] foodArr = {"치킨","피자","감자튀김","순대","떡볶이"};
        String[] copyArr = foodArr;

        copyArr[2] = "장어덮밥";

        System.out.println("foodArr의 주소 : " + System.identityHashCode(foodArr));
        System.out.println(Arrays.toString(copyArr));

        System.out.println("copyArr의 주소 : " + System.identityHashCode(copyArr));
        System.out.println(Arrays.toString(copyArr));


       // <깊은 복사>

        String[] foodArr2 = {"치킨","피자","감자튀김","순대","떡볶이"};
        String[] copyArr2 = new String[foodArr2.length];

        for(int i = 0; i < copyArr2.length; i++) {
            copyArr2[i] = foodArr2[i];

        }
        System.out.println("copyArr2 : " + Arrays.toString(copyArr2));
        copyArr2[2] = "보쌈";

        System.out.println("foodArr2의 주소 : " + System.identityHashCode(foodArr2));
        System.out.println("foodArr2 : " + Arrays.toString(foodArr2));

        System.out.println("copyArr2의 주소 : " + System.identityHashCode(copyArr2));
        System.out.println("copyArr2 : " + Arrays.toString(copyArr2));
    }
}
