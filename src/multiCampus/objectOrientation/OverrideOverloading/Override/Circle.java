package src.multiCampus.objectOrientation.OverrideOverloading.Override;

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
    @Override : Override 어노테이션
        * annotation : 클래스가 컴파일 되기전에 수행되어야 하는 기능을 정의
        * @Override : 해당 메서드가 부모클래스로 부터 상속받은 메서드를 알맞게 Override 하였는지 검증
    */

    @Override   // 부모 클래스에서는 return 0.0; 이였다.
    public double calArea() {
        return Math.PI * radius * radius;  // Math.PI ~ 로 재정의
    }

    /*
    아래 코드는 Override 가 아니라 Circle 클래스에 testExtends 라는 메서드를 새롭게 정의한 것이다.
    @Override 을 지정하면 에러가 발생한다.
    */

    //@Override
    private void testExtends() {
        System.out.println("private 메서드는 상속이 안됩니다.");
    }

    //static 메서드도 상속이 안된다. @Override 을 지정하면 에러가 발생한다.

    //@Override
    public static void testStaticExtends() {
        System.out.println("static 메서드여서 상속 받지 못했습니다.");
    }

    public String testCircle() {
        return "동그라미";
    }

}
