package multiCampus.ex.EX1202_Encapsulation_poly;

public class SmartPhone extends Computer {

    private String mobileAgency;

    public SmartPhone() {

    }

    public SmartPhone(String brand, String pName, int price, String cpu, int ram, String mobileAgency) {
        super(brand, pName, price, cpu, ram);
        this.mobileAgency = mobileAgency;
    }

    public String getMobileAgency() {
        return mobileAgency;
    }

    public void setMobileAgency(String mobileAgency) {
        this.mobileAgency = mobileAgency;
    }

    public String toString() {
        return "SmartPhone [brand=" + brand + ", pName=" + pName + ", price=" + price + ", cpu=" + cpu + ", ram=" + ram
                + ", mobileAgency=" + mobileAgency + "]";
    }


}
