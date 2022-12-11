package multiCampus.operator;

public class 복합연산자 {
    public static void main(String[] args) {
        // 대입연산자와 다른 연산자를 함께 사용하면 복합대입 연산자
        int num = 12;

        num = num + 12;
        System.out.println(num);

        num += 12;
        System.out.println(num);

        num -= 12;
        System.out.println(num);

        num *= 12;
        System.out.println(num);

        num /= 12;
        System.out.println(num);

        num %= 11;
        System.out.println(num);

        /*
        대입연산자만을 활용해 a와 b의 값을 바꿔주세요
        a = "2번"; 같은 literal 직접 대입은 안됩니다.
         */

        String a = "1번";
        String b = "2번";
        String temp = "3번";

        temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);

    }
}
