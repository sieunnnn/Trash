package programmers.codingBasicTraining;

public class PROB28 {

    public static void main(String[] args) {
        String code = "";

        System.out.println(solution(code));
    }

    public static String solution (String code) {
        StringBuilder sb = new StringBuilder();

        char[] codeArr = code.toCharArray();

        // 디폴트 값
        int mode = 0;

        for (int i = 0; i < codeArr.length; i++) {
            // 모드 0 일 때
            if (mode == 0) {
                // 값이 1일 때
                if (codeArr[i] == '1') {
                    mode = 1;

                } else {
                    // 값이 1이 아닐 때
                    if (i % 2 == 0) {
                        sb.append(codeArr[i]);
                    }
                }
            } else if (mode == 1) {
                // 값이 1일 때
                if (codeArr[i] == '1') {
                    mode = 0;

                } else {
                    // 값이 1이 아닐 때
                    if (i % 2 != 0) {
                        sb.append(codeArr[i]);
                    }
                }
            }
        }

        if (sb.toString().equals("")) {
            return "EMPTY";

        } else {
            return sb.toString();
        }
    }
}
