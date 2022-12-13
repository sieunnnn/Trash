package multiCampus.objectOrientation.modifier.정적변수;

public class 정적변수test {
    public static void main(String[] args) {

        // static
        System.out.println(정적변수.staticVal);

        // heap 영역에 인스턴스 변수 공간을 확보하고 초기화
        정적변수 nonStatic = new 정적변수();
        정적변수 ns2 = new 정적변수(); // heap 영역에 올라간다.

        // heap 영역에 올라간 객체주소를 저장하고 있는 레퍼런스를 통해 인스턴스 변수 호출
        System.out.println(nonStatic.nonStatic);
        System.out.println(ns2.nonStatic);

        nonStatic.nonStatic = "not static";
        // 두개는 서로 다른 개체이다.
        System.out.println(nonStatic.nonStatic);
        System.out.println(ns2.nonStatic);


        System.out.println(nonStatic.staticVal);
        nonStatic.staticVal = "yes static";

        System.out.println(ns2.staticVal);

        정적변수.testStatic();
        nonStatic.testMethod();

    }
}
