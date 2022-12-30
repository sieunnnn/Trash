package src.inflearn.recursion;

public class Code13 {
    // 순차탐색 1
    static int search1(int[] data, int begin, int end, int target) {
        if (begin > end)
            return -1;

        else if (target == data[begin])
            return begin;

        else
            return search1 (data, begin + 1, end, target);
    }

    // 순차탐색 2
    static int search2(int[] data, int begin, int end, int target) {
        if (begin > end)
            return -1;

        else if (target == data[end])
            return end;

        else
            return search2 (data, begin, end-1, target);
    }

    // 순차탐색 3
    static int search3(int[] data, int begin, int end, int target) {
        if (begin > end)
            return -1;

        else {
            int middle = (begin + end) / 2;

            if (data[middle] == target)
                return middle;

            int index = search3 (data, begin, middle-1, target);

            if (index != -1)
                return index;

            else
                return search3 (data, middle + 1, end, target);
        }
    }

    public static void main(String[] args) {
        int data[] = {1, 3, 4, 5, 7, 2, 9, 22, 36, 27, 85};

        System.out.println(search1(data, 4, 8, 9));
        System.out.println(search2(data, 4, 8, 9));
        System.out.println(search3(data, 4, 8, 9));
    }
}
