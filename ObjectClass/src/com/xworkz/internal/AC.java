package com.xworkz.internal;

public class AC {
    private String brand;
    private int rating;
    private int price;
    public AC(String brand,int rating,int price){
        this.brand=brand;
        this.rating=rating;
        this.price=price;
    }

    @Override
    public String toString() {
        return "brand : "+brand+" rating : "+rating+" price : "+price;
    }

    @Override
    public int hashCode() {
        return 137;
    }
}
