package programmers.codingBasicTraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PROB62 {

    public static void main(String[] args) {

        String my_string = " i    love  you";
        System.out.println(Arrays.toString(solution(my_string)));
    }

    public static String[] solution (String my_string) {
        String[] strArr = my_string.split(" ");
        List<String> arrayList = new ArrayList<>();

        for (int i = 0; i < strArr.length; i++) {
            if (!strArr[i].equals("")) {
                arrayList.add(strArr[i]);
            }
        }

        return arrayList.toArray(new String[arrayList.size()]);
    }
}
