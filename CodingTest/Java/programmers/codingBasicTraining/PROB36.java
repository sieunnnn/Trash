package programmers.codingBasicTraining;

public class PROB36 {

    public static void main(String[] args) {
        String[] order = {"cafelatte", "americanoice", "hotcafelatte", "anything"};

        System.out.println(solution(order));
    }

    public static int solution (String[] order) {
        int sum = 0;

        for (int i = 0; i < order.length; i++) {
            if (order[i].contains("americano")) {
                sum += 4500;

            } else if (order[i].contains("latte")) {
                sum += 5000;

            } else if (order[i].equals("anything")) {
                sum += 4500;
            }
        }

        return sum;
    }
}
