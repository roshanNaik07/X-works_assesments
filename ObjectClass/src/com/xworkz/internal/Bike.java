package com.xworkz.internal;

public class Bike {
    private String company;
    private int cc;
    private int price;
    public Bike(String company,int cc,int price){
        this.company=company;
        this.cc=cc;
        this.price=price;
    }

    @Override
    public String toString() {
        return "company : "+company+" cc : "+cc+" price : "+price;
    }

    @Override
    public int hashCode() {
        return 123;
    }
}
