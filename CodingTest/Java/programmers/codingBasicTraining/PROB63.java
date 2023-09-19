package programmers.codingBasicTraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PROB63 {
    public static void main(String[] args) {
        String my_string = "banana";

        System.out.println(Arrays.toString(solution(my_string)));
    }

    public static String[] solution (String my_string) {
        // 접미사 만들기
        List<String> arrayList = new ArrayList<>();

        for (int i = 0; i < my_string.length(); i++) {
            StringBuilder sb = new StringBuilder();

            for (int j = i; j < my_string.length(); j++) {
                sb.append(my_string.charAt(j));
            }

            arrayList.add(sb.toString());
        }

        Collections.sort(arrayList);

        return arrayList.toArray(new String[arrayList.size()]);
    }
}
