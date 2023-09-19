package programmers.codingBasicTraining;

import java.util.ArrayList;
import java.util.List;

public class PROB57 {
    public static void main(String[] args) {
        String my_string = "banana";
        String is_suffix = "nan";

        System.out.println(solution(my_string, is_suffix));
    }

    public static int solution (String my_string, String is_suffix) {
        // 접미사 만들기
        List<String> arrayList = new ArrayList<>();

        for (int i = 0; i < my_string.length(); i++) {
            StringBuilder sb = new StringBuilder();

            for (int j = i; j < my_string.length(); j++) {
                sb.append(my_string.charAt(j));
            }

            arrayList.add(sb.toString());
        }

        if (arrayList.contains(is_suffix)) {
            return 1;
        } else {
            return 0;
        }
    }
}
