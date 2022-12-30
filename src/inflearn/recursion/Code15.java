package src.inflearn.recursion;

public class Code15 {
    // Binary search
    public static int binarySearch(String[] items, String target, int begin, int end) {
        // 탐색 성공
        if (begin <= end) {
            int middle = (begin + end) / 2;
            int compResult = target.compareTo(items[middle]);

                if (compResult == 0)
                    return middle;

                // 왼쪽 부분 탐색
                else if (compResult < 0)
                    return binarySearch(items, target, begin, middle - 1);

                // 오른쪽 부분 탐색
                else if (compResult > 0)
                    return binarySearch(items, target, middle + 1, end);

        }

        // 탐색 실패
        return -1;

    }

    public static void main(String[] args) {
        String season[] = {"spring", "summer", "fall", "winter"};

        System.out.println(binarySearch(season, "summer", 0, 3));

    }

}
