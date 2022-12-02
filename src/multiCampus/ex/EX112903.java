package multiCampus.ex;

public class EX112903 {
    public static void main(String[] args) {
        /*
        <논리 연산자>
        1. and: &&, 두 항이 모두 true 일 때 true, '~면서', '그리고'
        2. or: ||, 두 항 중 한 항이 true 이면 true, '~거나'. '또는'
         */

        System.out.println( 2 >= 2 || 2 > 3); // true || false == true
        System.out.println( 2 > 1 || 3 > 2); // true || true == true
        System.out.println( 3 < 2 || 2 > 3); // false || false == false
        System.out.println( 2 < 2 || 2 < 3); // false || true == true

        System.out.println( 2 >= 2 && 2 > 3); // true && false == false
        System.out.println( 2 > 1 && 3 > 2); // true && true == true
        System.out.println( 3 < 2 && 2 > 3); // false && false == false
        System.out.println( 2 < 2 && 2 < 3); // false && true == false

        // 퀴즈
        boolean a = true;
        boolean b = false;
        boolean c = false;
        boolean d = false;

        // 아래 논리연산의 출력값을 예상해보세요
        System.out.print(a || b && c || d); // 나의 답: true
        System.out.print((a || b) && c || d); // ()을 사용해 우선순위 변경

        /*
        <왼쪽부터 연산 수행시>
            true || false == true
            true && false == false
            false || false == false

        <우선순위 연산 수행시>
            false && false == false
            true || false == true
            true || false == true

         ** and 가 or 보다 우선순위 더 높다!
         */

    }
}
