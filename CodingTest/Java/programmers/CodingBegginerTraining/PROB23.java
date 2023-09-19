package programmers.CodingBegginerTraining;

import java.util.*;

public class PROB23 {

    public static void main(String[] args) {
        int[] emergency = {3, 76, 24};

        System.out.println(Arrays.toString(solution(emergency)));
    }

    public static int[] solution(int[] emergency) {
        // 응급도가 높은 순서대로
        List<Integer> emergencyList = new ArrayList<>();

        for (int i = 0; i < emergency.length; i++) {
            emergencyList.add(emergency[i]);
        }

        // 역순
        Collections.sort(emergencyList);
        Collections.reverse(emergencyList);

        int[] answer = new int[emergency.length];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = emergencyList.indexOf(emergency[i]) + 1;
        }

        return answer;
    }
}
