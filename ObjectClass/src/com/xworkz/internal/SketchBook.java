package com.xworkz.internal;

public class SketchBook {
    private String brand;
    private int pages;
    private int price;

    public SketchBook(String brand, int pages, int price) {
        this.brand = brand;
        this.pages = pages;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Pages: " + pages + ", Price: " + price;
    }

}
