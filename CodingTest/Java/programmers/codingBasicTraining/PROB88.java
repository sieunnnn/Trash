package programmers.codingBasicTraining;

public class PROB88 {

    public static void main(String[] args) {

        int[] arr1 = {49, 13};
        int[] arr2 = {70, 11, 2};

        System.out.println(solution(arr1, arr2));
    }

    public static int solution (int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            if (arr1.length > arr2.length) return 1;
            else return -1;

        } else {
            int sumArr1 = sum(arr1);
            int sumArr2 = sum(arr2);

            if (sumArr1 > sumArr2)  return 1;
            else if (sumArr1 == sumArr2) return 0;
            else return -1;

        }
    }

    public static int sum (int[] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }
}
