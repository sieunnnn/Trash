package programmers.CodingBegginerTraining;

public class PROB37 {

    public static void main(String[] args) {
        int[][] dots = {{1, 1},{2, 1},{2, 2},{1, 2}};

        System.out.println(solution(dots));
    }

    public static int solution(int[][] dots) {
        int width = 0;
        int height = 0;

        for (int i = 1; i < dots.length; i++) {
            if (dots[0][0] != dots[i][0]) {
                width = Math.abs(dots[i][0] - dots[0][0]);

            } else {
                height = Math.abs(dots[i][1] - dots[0][1]);
            }
        }

        return width * height;
    }
}
