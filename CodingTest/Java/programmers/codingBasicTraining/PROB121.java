package programmers.codingBasicTraining;

import java.util.*;

public class PROB121 {

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5};
        int[] query = {4, 2, 2};

        System.out.println(Arrays.toString(solution(arr, query)));
    }

    public static int[] solution (int[] arr, int[] query) {
        for(int i = 0; i < query.length; i++){

            if(i % 2 == 0){
                arr = Arrays.copyOfRange(arr, 0, query[i]+1);
            }
            else{
                arr = Arrays.copyOfRange(arr, query[i], arr.length);
            }
        }
        return arr;
    }
}
