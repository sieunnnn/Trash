package multiCampus.ex.EX1205_Override_Overloading.A_override;

public class Run {
    public static void main(String[] args) {

        // 반지름이 5인 원의 넓이를 구하시오
        Circle circle = new Circle(5);

        // 너비가 4, 높이가 7인 사각형의 넓이를 구하시오
        Rectangle rect = new Rectangle(4,7);

        Figure[] figures = {new Circle(5), new Rectangle(4,7)};

        for (Figure figure : figures) {

            /*
            강제형변환
                선조타입으로 형변환 할 때는 UpCasting : 자동캐스팅
                    자식타입에는 자식타입이 상속받은 선조타입에 대한 정보가 있다. 그래서 자동캐스팅 가능ㅎ나다.
                선조타입을 후손타입으로 형변환 할때는 DownCasting : 명시적형변환
                    선조타입은 자신을 상속받고 있는 클래스가 무엇인지에 대한 정보가 없다.
             */
            System.out.println(figure.calArea());
        }

        /*
        위의 코드와 같다.
        for (int i=0; i < figures.length; i++) {
            System.out.println(figures[i].calArea());
        }
         */


    }
}
