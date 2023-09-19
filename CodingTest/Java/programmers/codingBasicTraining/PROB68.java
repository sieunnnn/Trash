package programmers.codingBasicTraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PROB68 {

    public static void main(String[] args) {
        String myString = "dxffxeeexaaaa";

        System.out.println(Arrays.toString(solution(myString)));
    }

    public static String[] solution (String myString) {
        String[] strArr = myString.split("x");

        // 빈 문자열 걸러내기
        List<String> arrayList = new ArrayList<>();

        for (int i = 0; i < strArr.length; i++) {
            if (!strArr[i].equals("")) {
                arrayList.add(strArr[i]);
            }
        }

        String[] answer = arrayList.toArray(new String[arrayList.size()]);

        Arrays.sort(answer);

        return answer;
    }
}
