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

    @Override
    public int hashCode() {
        return 190;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof SketchBook){
                SketchBook sketchBook = this;
                SketchBook sketchBook1 =(SketchBook) obj;
                if (sketchBook.brand.equals(sketchBook1.brand) && sketchBook.pages==sketchBook1.pages && sketchBook.price==sketchBook1.price){
                    return true;
                }
            }
        }
        return false;
    }
}
