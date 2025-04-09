package com.xworkz.internal;

public class Sunglass {
    private String company;
    private String type;
    private int price;
    public Sunglass(String company, String type, int price){
        this.company=company;
        this.type=type;
        this.price=price;
    }

    @Override
    public String toString() {
        return "company : "+company+" type : "+type+" price : "+price;
    }
}
