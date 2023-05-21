package programmers.codingBasicTraining;

public class PROB113 {

    public static void main(String[] args) {
        String my_string = "apporoograpemmemprs";
        int[] indices = {1, 16, 6, 15, 0, 10, 11, 3};

        System.out.println(solution(my_string, indices));
    }

    public static String solution (String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder();

        char[] chars = my_string.toCharArray();

        for (int i = 0; i < indices.length; i++) {
            chars[indices[i]] = ' ';
        }

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ' ') {
                sb.append(chars[i]);
            }
        }

        return sb.toString();
    }
}
