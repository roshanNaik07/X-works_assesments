package com.xworkz.internal;

public class Spec {
    private String company;
    private String color;
    private int price;
    public Spec(String company, String color, int price){
        this.company=company;
        this.color=color;
        this.price=price;
    }

    @Override
    public String toString() {
        return "company : "+company+" color : "+color+" price : "+price;
    }

    @Override
    public int hashCode() {
        return 195;
    }
}
