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
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Spec){
                Spec spec = this;
                Spec spec1 =(Spec) obj;
                if (spec.company.equals(spec1.company) && spec.color.equals(spec1.color) && spec.price==spec1.price){
                    return true;
                }
            }
        }
        return false;
    }
}
