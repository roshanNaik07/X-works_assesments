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
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Cycle){
                Cycle cycle = this;
                Cycle cycle1 =(Cycle) obj;
                if (cycle.company.equals(cycle1.company) && cycle.model.equals(cycle1.model) && cycle.price==cycle1.price){
                    return true;
                }
            }
        }
        return false;
    }
}
