package com.xworkz.internal;

public class Fan {
    private String brand;
    private String color;
    private int price;
    public Fan(String brand,String color,int price){
        this.brand=brand;
        this.color=color;
        this.price=price;
    }

    @Override
    public String toString() {
        return "brand : "+brand+" color : "+color+" price : "+price;
    }

    @Override
    public int hashCode() {
        return 121;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Fan){
                Fan fan = this;
                Fan fan1 =(Fan) obj;
                if (fan.brand.equals(fan1.brand)){
                    return true;
                }
            }
        }
        return false;
    }
}
