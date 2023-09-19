package programmers.codingBasicTraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PROB64 {

    public static void main(String[] args) {
        String[] strArr = {"and","notad","abcd"};

        System.out.println(Arrays.toString(strArr));
    }

    public static String[] solution (String[] strArr) {
        List<String> arrayList = new ArrayList<>();

        for (int i = 0; i < strArr.length; i++) {
            if (!strArr[i].contains("ad")) {
                arrayList.add(strArr[i]);
            }
        }

        return arrayList.toArray(new String[arrayList.size()]);
    }
}
