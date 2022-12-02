package multiCampus.ex;

public class EX112901 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==========================");
        System.out.printf("%30s : 5000원", "김밥");
        System.out.println();
        System.out.printf("%-30s : 10000원", "돈까스");
        System.out.println();
        System.out.printf("%s : 5000원", "김치찌개");
        System.out.println();

        /*
        escape 문자: 특수한 역할을 하는 문자. \와 함께 사용한다.
            줄바꿈: \n, \r\n
         */
        System.out.println("나는 \n밥을 \n먹었다.");

        // Tab
        System.out.println("나는 \t자바가 쉬워요");
        System.out.println("나아는 \t자바가 쉬워요");
        System.out.println("나아아는 \t자바가 쉬워요");

        // 16진수, 8진수
        System.out.println("16진수 100: " + 0x100);
        System.out.println("16진수 100: " + 0100);

        /*
        " 을 문자로 사용: \"
        ' 을 문자로 사용: \'
        \ 을 문자로 사용: \\
         */
        System.out.println("\"");
        System.out.println("'");
        System.out.println("\\");

    }
}
