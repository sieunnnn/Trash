package programmers.codingBasicTraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PROB58 {

    public static void main(String[] args) {
        String myStr = "baconlettucetomato";

        System.out.println(Arrays.toString(solution(myStr)));
    }

    public static String[] solution (String myStr) {
        // 구분자 여러개는 파이프라인 사용
        String[] strArr = myStr.split("a|b|c");

        // 아무것도 없는 원소는 제외해야함
        List<String> arrayList = new ArrayList<>();

        for (int i = 0; i < strArr.length; i++) {
            if (!strArr[i].equals("")) {
                arrayList.add(strArr[i]);
            }
        }

        if (arrayList.size() == 0) {
            String[] emptyArr = {"EMPTY"};
            return emptyArr;
        } else {
            return arrayList.toArray(new String[0]);
        }
    }
}
