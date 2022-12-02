package multiCampus.ex.EX1202_Encapsulation.coffee;

public class Coffee_encapsulation {

    /*
    <캡슐화>
        클래스 내부의 필드변수에 클래스 외부에서 직접적으로 접근하는 것을 막는 것
        직접 접근을 막는 대신 getter/setter를 사용해 필드변수에 대한 접근권한을 관리한다.

        * 만약 캡슐화가 없다면?
            외부에서 값을 넣었을 때 방어할 방법이 있을까?
            setter 메서드를 사용하면, 값에 대한 검증이 가능하다.
     */
    private String name;
    private int Price;
    private int cost;
    private int stock;
    private int safetyStock;
    private int salesCnt;


    // 매개변수가 하나도 없는 기본 생성자는, 명시적으로 작성하지 않을 경우 컴퓨터가 자동으로 생성을 해준다.
    public Coffee_encapsulation() {

    }

    public Coffee_encapsulation(String name, int Price, int cost, int stock, int safetyStock, int salesCnt) {
        // heap 영역에 생성된 인스턴스의 메모리 주소를 저장하고 있는 참조형 변수
        this.name = name;
        this.Price  = Price;
        this.cost = cost;
        this.stock = stock;
        this.safetyStock = safetyStock;
        this.salesCnt = salesCnt;

    }

    /*
    <getter>
        get + 필드변수명 예) getName()
        필드변수의 값을 읽을 때 사용한다.
        getter 만 만들면? : 읽기만 가능

    <Setter>
        set + 필드변수명 예) setName(String name)
        필드변수의 값을 넣거나 수정할 때 사용한다.
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
