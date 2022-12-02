package multiCampus.ex.EX1202_AccessModifier;

public class EX120202 {


    /*
    <제한자>
    1. 접근제한자: public, protected, private, default ...
        변수나 메서드에 접근할 수 있는 범위를 제한하는 제한자
         * public: 다른 패키지 내의 클래스에서도 호출할 수 있다.
         * default: 같은 패키지 내의 클래스에서만 호출할 수 있다. 생략하면 접근제한자가 default 이다.
         * protected: 같은 패키지 내의
         * private: 같은 클래스 안에서만 호출 가능하다.
    2. 그 외 제한자: static, final, abstract, void, synchronized ... (선언부에 쓰는 자바의 예악어들)

    */

    public static void publicMethod() {
        System.out.println("접근제한자가 public");
    }

    static void defaultMethod() {
        System.out.println("접근제한자가 default");
    }

    protected static void protectedMethod() {
        System.out.println("접근제한자가 protected");
    }

    private static void privateMethod() {
        System.out.println("접근제한자가 private");
    }

}
