package multiCampus.controll;

public class DoWhile {
    public static void main(String[] args) {
        int i = 1;

        while(i > 1) {
            System.out.println("while 문 입니다.");
        }

        // do-while 문은 while 문의 조건식이 거짓이더라도 한번은 실행이 된다. (지금은 잘 안씀!)
        do {
            System.out.println("do-while 문 입니다.");
        } while(i > 1);
    }
}
