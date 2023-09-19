package programmers.codingBasicTraining;

import java.util.ArrayList;
import java.util.List;

public class PROB59 {
    public static void main(String[] args) {
        String my_string = "banana";
        String is_prefix = "nan";

        System.out.println(solution(my_string, is_prefix));
    }

    public static int solution (String my_string, String is_prefix) {
        // 접두사 만들기
        List<String> arrayList = new ArrayList<>();

        for (int i = 0; i < my_string.length(); i++) {
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j <= i; j++) {
                sb.append(my_string.charAt(j));
            }

            arrayList.add(sb.toString());
        }

        if (arrayList.contains(is_prefix)) {
            return 1;
        } else {
            return 0;
        }
    }
}