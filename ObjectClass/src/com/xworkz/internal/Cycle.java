package com.xworkz.internal;

public class Cycle {
    private String company;
    private String model;
    private int price;
    public Cycle(String company, String model, int price){
        this.company=company;
        this.model=model;
        this.price=price;
    }

    @Override
    public String toString() {
        return "company : "+company+" model : "+model+" price : "+price;
    }

    @Override
    public int hashCode() {
        return 148;
    }
}
