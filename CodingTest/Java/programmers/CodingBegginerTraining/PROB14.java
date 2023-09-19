package programmers.CodingBegginerTraining;

public class PROB14 {

    public int solution(int order) {
        String intToStr = String.valueOf(order);
        int answer = 0;

        for (int i = 0; i < intToStr.length(); i++){
            if (intToStr.charAt(i) == '3' || intToStr.charAt(i) == '6' || intToStr.charAt(i) == '9') {
                answer++;
            }
        }

        return answer;
    }
}
