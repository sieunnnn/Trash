package multiCampus.ex.EX1207_Interface;

public class TV extends Product {
    private int inch;

    public TV() {

    }

    public TV(String brand, String pName, int price, int inch) {
        super(brand, pName, price);
        this.inch = inch;
    }

    public int getInch() {
        return inch;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }

    public String toString() {
        return "Tv [brand=" + brand + ", pName=" + pName + ", price=" + price + ", inch=" + inch + "]";
    }

}
