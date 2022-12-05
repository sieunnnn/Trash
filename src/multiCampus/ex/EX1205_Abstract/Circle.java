package multiCampus.ex.EX1205_Abstract;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /*
    Override: 부모 클래스로부터 상속받은 메서드를 재정의 > Figure 에서 return 0.0 대신에 아래 블록이 실행된다.
    @Override: Override annotation
        * annotation: 클래스가 컴파일 되기전에 수행되어야 하는 기능을 정의한다.
        * @Override: 해당 메서드가 부모 클래스로부터 상속받은 메서드를 알맞게 Override 하였는지 알 수 있다.
     */

    @Override
    public double calArea() {
        return Math.PI * radius * radius;
    }

    public String getName() {
        return "동그라미";
    }
}
