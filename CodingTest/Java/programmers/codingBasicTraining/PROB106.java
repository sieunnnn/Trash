package programmers.codingBasicTraining;

import java.util.*;

public class PROB106 {

    public static void main(String[] args) {
        String[] todo_list= {"problemsolving", "practiceguitar", "swim", "studygraph"};
        Boolean[] finished = {true, false, true, false};

        System.out.println(Arrays.toString(solution(todo_list, finished)));
    }

    public static String[] solution (String[] todo_list, Boolean[] finished) {

        // false 의 개수 찾기
        int falseCnt = 0;

        for (int i = 0; i < finished.length; i++) {
            if (!finished[i]) {
                falseCnt++;
            }
        }

        // answer 리스트 만들기
        String[] answer = new String[falseCnt];
        int idx = 0;

        for (int i = 0; i < finished.length; i++) {
            if (!finished[i]) {
                answer[idx] = todo_list[i];
                idx++;
            }
        }

        return answer;
    }
}
