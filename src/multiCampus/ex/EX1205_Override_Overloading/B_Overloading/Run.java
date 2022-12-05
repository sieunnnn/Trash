package multiCampus.ex.EX1205_Override_Overloading.B_Overloading;

public class Run {
    public static void main(String[] args) {

        // 반지름이 5인 원의 넓이를 구하시오
        Circle circle = new Circle();
        circle.setRadius(5);

        System.out.println(circle.getRadius());

        double area = AreaCalculator.calArea(circle);
        System.out.println(area);

        // 너비가 4, 높이가 7인 사각형의 넓이를 구하시오
        Rectangle rect = new Rectangle();

        rect.setHeight(7);
        rect.setWidth(4);

        double rectArea = AreaCalculator.calArea(rect);
        System.out.println(rectArea);


    }
}
