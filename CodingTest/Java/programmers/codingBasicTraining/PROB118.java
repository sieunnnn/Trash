package programmers.codingBasicTraining;

import java.util.*;

public class PROB118 {

     public static void main(String[] args) {
         String[] str_list = {"u", "u", "l", "r"};

         System.out.println(Arrays.toString(solution(str_list)));
     }

     public static String[] solution (String[] str_list) {

         String[] temp = new String[str_list.length];
         int idx = 0;

         for (int i = 0; i < str_list.length; i++) {
             if (str_list[i].equals("l")) {
                 for (int j = 0; j < i; j++) {
                     temp[idx++] = str_list[j];
                 }

                 break;

             } else if (str_list[i].equals("r")) {
                 for (int j = i +1; j < str_list.length; j++) {
                     temp[idx++] = str_list[j];
                 }

                 break;
             }
         }

         String[] answer = new String[idx];

         for (int i = 0; i < answer.length; i++) {
             answer[i] = temp[i];
         }

         return answer;
     }
}
