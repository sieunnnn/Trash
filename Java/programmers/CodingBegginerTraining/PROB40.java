package programmers.CodingBegginerTraining;

public class PROB40 {

    public static void main(String[] args) {
        int chicken = 1081;

        System.out.println(solution(chicken));
    }

    public static int solution(int chicken) {
        int serviceChicken = 0;

        while (chicken >= 10) {
            int quotientChicken = chicken / 10;
            int remainChicken = chicken % 10;

            chicken = quotientChicken + remainChicken;

            serviceChicken += quotientChicken;
        }

        return serviceChicken;
    }
}
