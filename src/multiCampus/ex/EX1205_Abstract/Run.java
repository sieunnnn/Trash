package multiCampus.ex.EX1205_Abstract;

public class Run {
    public static void main(String[] args) {

        // 추상 클래스는 인스턴스화 할 수 없다.
        Figure[] figures = {new Circle(5), new Rectangle(4, 7)};
        for (Figure figure : figures) {
            System.out.println(figure.calArea());

        }
    }
}
