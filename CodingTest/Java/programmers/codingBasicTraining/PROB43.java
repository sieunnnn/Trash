package programmers.codingBasicTraining;

public class PROB43 {

    public static void main(String[] args) {
        int[] date1 = {2021, 12 , 28};
        int[] date2 = {2021, 12, 29};

        System.out.println(solution(date1, date2));
    }

    public static int solution(int[] date1, int[] date2) {
        // 연도 비교
        if (date1[0] < date2[0]) {
            return 1;

        } else if (date1[0] == date2[0]) {
            // 월 비교
            if (date1[1] < date2[1]) {
                return 1;

            } else if (date1[1] == date2[1]) {
                // 일 비교
                if (date1[2] < date2[2]) {
                    return 1;
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }
}
