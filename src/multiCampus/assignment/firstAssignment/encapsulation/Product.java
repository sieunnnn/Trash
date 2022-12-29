package src.multiCampus.assignment.firstAssignment.encapsulation;

import java.util.Objects;

public class Product {
    private String brand;
    private String productUID;
    private String color;
    private int price;

    public Product(String brand, String productUID, String color, int price) {
        this.brand = brand;
        this.productUID = productUID;
        this.color = color;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProductUID() {
        return productUID;
    }

    public void setProductUID(String productUID) {
        this.productUID = productUID;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "brand='" + brand + '\'' +
                ", productUID='" + productUID + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price && Objects.equals(productUID, product.productUID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productUID, price);
    }
}
