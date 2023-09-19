package programmers.codingBasicTraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PROB41 {

    public static void main(String[] args) {
        int l = 5;
        int r = 555;

        System.out.println(Arrays.toString(solution(l, r)));
    }

    public static int[] solution(int l, int r) {
        List<Integer> arrList = new ArrayList<>();

        for (int i = l; i <= r; i ++) {
            String str = String.valueOf(i);

            int idx = 0;

            while (idx < str.length()) {
                if (str.charAt(idx) != '5' && str.charAt(idx) != '0') {
                    break;

                } else {
                    if (idx == str.length() -1) {
                        arrList.add(Integer.parseInt(str));
                        break;
                    }
                }

                idx++;
            }

        }

        if (arrList.isEmpty()) {
            int[] answer = {-1};
            return answer;

        } else {
            return arrList.stream().mapToInt(i -> i).toArray();
        }
    }
}
