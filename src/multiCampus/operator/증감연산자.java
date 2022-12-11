package multiCampus.operator;

public class 증감연산자 {
    public static void main(String[] args) {
        /*
        <증감연산자>
        ++, -- 값을 1 증감 시킨다.
            1. 전위 연산자 (++변수): 연산 전에 증감처리
            2. 후위 연산자 (변수++): 연산 후에 증감처리
         */
        int first = 10;
        System.out.println(++first); //11
        System.out.println(first++); //11
        System.out.println(first--); //12
        System.out.println(first); //11

    }
}