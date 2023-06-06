package programmers.CodingBegginerTraining;

import java.util.Arrays;

public class PROB36 {
    public static void main(String[] args) {
        String[] keyinput = {"left", "right", "up", "right", "right"};
        int[] board = {11, 11};

        System.out.println(Arrays.toString(solution(keyinput, board)));
    }

    public static int[] solution(String[] keyinput, int[] board) {
        int[] current = {0, 0};
        int maxWidth = (board[0] - 1) / 2;
        int minWidth = maxWidth * -1;

        int maxHeight = (board[1] -1) / 2;
        int minHeight = maxHeight * -1;

        for (int i = 0; i < keyinput.length; i++) {
            if (keyinput[i].equals("left") && current[0] != minWidth) {
                current[0] -= 1;

            } else if (keyinput[i].equals("right") && current[0] != maxWidth) {
                current[0] += 1;

            } else if (keyinput[i].equals("up") && current[1] != maxHeight) {
                current[1] += 1;

            } else if (keyinput[i].equals("down") && current[1] != minHeight) {
                current[1] -= 1;

            }
        }

        return current;
    }
}
