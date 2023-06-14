package programmers.CodingBegginerTraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PROB41 {

    public static void main(String[] args) {
        int[][] score = {{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}};

        System.out.println(Arrays.toString(solution(score)));
    }

    public static int[] solution(int[][] score) {
        List<Integer> scoreList = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            scoreList.add(score[i][0] + score[i][1]);
        }

        scoreList.sort(Comparator.reverseOrder());

        int[] rank = new int[scoreList.size()];
        for (int i = 0; i < scoreList.size(); i++) {
            rank[i] = scoreList.indexOf(score[i][0] + score[i][1]) + 1;
        }

        return rank;
    }
}
