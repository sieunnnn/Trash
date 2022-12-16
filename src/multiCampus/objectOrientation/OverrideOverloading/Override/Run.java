package src.multiCampus.objectOrientation.OverrideOverloading.Override;

public class Run {

    public static void main(String[] args) {

        // 원과 사각형의 넓이를 구하는 코드를 작성하시되, 다형성을 이용하여 코드를 줄여보세요.

        Figure[] figures = {new Circle(5), new Rectangle(4, 7)};

        // static 과 static 메서드는 상속이 가능한가?
        figures[0].testStaticExtends();
        Circle c = (Circle) figures[0];
        c.testStaticExtends();


        for (Figure figure : figures) {
            /*
            강제형변환
                (1) 선조타입으로 형변환 (UpCasting)
                    1. 자동형변환
                    2. 자식타입에는 자식타입이 상속받은 선조타입에 대한 정보가 있다. 그래서 자동캐스팅 가능
                (2) 선조타입을 후손타입으로 형변환 할때는 (DownCasting)
                    1. 명시적형변환
                    2. 선조타입은 자신을 상속받고 있는 클래스가 무엇인지에 대한 정보가 없다
            */


            //Figure f = new Figure();
            //Circle c2 = (Circle) f[0];

            //가능 1 / 불가능 2
            System.out.println(figure.calArea());

        }

    }

}