package multiCampus.ex.EX1202_Encapsulation.after;

public class Computer extends Product{

    /*
    자바에서 상속은 단일 상속만 가능하다.
    클래스의 부모클래스는 하나만 존재한다.
     */

    protected String cpu;
    protected int ram;

    public Computer() {
        super();
    }

    public Computer(String brand, String pName, int price, String cpu, int ram) {
        super(brand, pName, price);
        this.cpu = cpu;
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }


}
