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
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Bike){
                Bike bike = this;
                Bike bike1 =(Bike) obj;
                if (bike.company.equals(bike1.company)){
                    return true;
                }
            }
        }
        return false;
    }
}
