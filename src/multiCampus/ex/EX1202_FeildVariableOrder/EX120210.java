package multiCampus.ex.EX1202_FeildVariableOrder;

public class EX120210 {
    /*
    <필드 변수의 초기화 순서>
        1. 인스턴스 변수
            jvm 의 기본 값 (변수 pdf 에 있다. / 지역변수는 해당 안된다.) -> 필드변수에 직접 대입한 값 -> 초기화 블록 -> 생성자
        2. 클래스 변수
            jvm 의 기본 값 -> 필드변수에 직접 대입한 값 -> static 초기화 블록
     */

    private String name = "김시은";
    private static int classCode = 777;

    /*
    <초기화 블록>
        클래스가 인스턴스화 되는 순간에 한번만 호출되어, 인스턴스 변수의 값을 초기화 하는 용도.
        생성자보다 먼저 호출 된다.
     */
    {
        System.out.println("필드변수에 직접 대입한 값 : " + name);
        name = "KSE";
        System.out.println("초기화블록이 호출된 이후의 값 : " + name);
    }

    /*
    <static 초기화 블록>
        클래스 로더가 클래스를 메모리에 올리는 시점 -> 클래스가 최초로 사용되는 시점에 동작
     */
    static {
        System.out.println("스테틱 변수에 직접 대입한 값: ");
        classCode = 999;
        System.out.println();

    }
    public EX120210() {
        name = "KSE";
        System.out.println("생성자 호출 이후 값 : " + name);
    }

}
