package src.multiCampus.abstract_;

public class Circle extends Figure {

    private double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /*
    Override : 부모클래스로부터 상속받은 메서드를 재정의
    @Override
        (1) Override 어노테이션
        (2) annotation : 클래스가 컴파일 되기전에 수행되어야 하는 기능을 정의
        (2) @Override : 해당 메서드가 부모클래스로 부터 상속받은 메서드를 알맞게 Override 하였는지 검증
    */

    @Override
    public double calArea() {
        return Math.PI * radius * radius;
    }

    public String getName() {
        return "동그라미";
    }

    public String testCircle() {
        return "동그라미";
    }

}

