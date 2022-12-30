package src.inflearn.recursion;

public class Code14 {
    // 최대값 찾기 1
    static int findMax1(int[] data, int begin, int end) {
        // data 개수가 하나일 때를 base case 로 가진다.
        if (begin == end)
            return data[begin];

        else
            return Math.max(data[begin], findMax1(data, begin+1, end));
    }

    // 최대값 찾기 2
    static int findMax2(int[] data, int begin, int end) {
        if (begin == end)
            return data[begin];

        else {
            int middle = (begin + end) / 2;
            int max1 = findMax2(data, begin, middle);
            int max2 = findMax2(data, middle + 1, end);

            return Math.max(max1, max2);
        }
    }

    public static void main(String[] args) {
        int data[] = {1, 3, 4, 5, 7, 2, 9, 22, 36, 27, 85};

        System.out.println(findMax1(data, 5, 10));
        System.out.println(findMax2(data, 5, 10));
    }
}
