package com.xworkz.mobileshop.dto;

public class MobileDTO {

    private String brand;
    private int price;
    private String availability;

    public MobileDTO() {
    }

    public MobileDTO(String brand, int price, String availability) {
        this.brand = brand;
        this.price = price;
        this.availability = availability;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public String getAvailability() {
        return availability;
    }

    @Override
    public String toString() {
        return "MobileDTO{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", availability='" + availability + '\'' +
                '}';
    }
}
