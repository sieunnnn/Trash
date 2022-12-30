package src.multiCampus.assignment.firstAssignment.encapsulation;

public class Run {

    public static void main(String[] args) {
        Product 다이슨 = new Product("다이슨", "V10", "빨간색", 960000);
        Product Dyson = new Product("Dyson", "V10", "RED", 960000);

        System.out.println(다이슨.equals(Dyson));

    }
}
