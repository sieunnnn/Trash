package programmers.codingBasicTraining;

public class PROB25 {

    public static void main(String[] args) {
        boolean x1 = false;
        boolean x2 = true;
        boolean x3 = true;
        boolean x4 = true;

        System.out.println(solution(x1, x2, x3, x4));
    }

    public static boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        return up(down(x1, x2),down(x3, x4));
    }

    // 위쪽 향하는 문자 연산
    public static boolean up(boolean x1, boolean x2) {
        if (x1 == true && x2 == true) {
            return true;
        } else {
            return false;
        }
    }

    // 아래쪽 향하는 문자 연산
    public static boolean down(boolean x3, boolean x4) {
        if (x3 == false && x4 == false) {
            return false;
        } else {
            return true;
        }
    }
}
