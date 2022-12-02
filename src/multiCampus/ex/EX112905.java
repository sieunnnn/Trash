package multiCampus.ex;

public class EX112905 {
    public static void main(String[] args) {
        // 문자열 결합
        String name = "김시은";
        String job = "학생";

        String res = "이름은 " + name + " 입니다. 직업은 " + job + " 입니다.";
        System.out.println(res);

        // 문자열과 숫자값을 결합할 때 : + 의 피연산자 중 하나라도 문자열이면 문자열 결합이 수행된다.
        System.out.println(10 + "호 기차");
        System.out.println(10 + 25 + "호 기차");

        System.out.println("이번 기차는 " + 10 + 25 + "호 입니다.");
        System.out.println("이번 기차는 " + (10 + 25) + "호 입니다."); // 산술 먼저 수행

    }
}
