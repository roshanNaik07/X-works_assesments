package com.xworkz.internal;

public class PowerBank {
    private String brand;
    private int Capacity;
    private int price;

    public PowerBank(String brand,int Capacity,int price){
        this.brand=brand;
        this.Capacity=Capacity;
        this.price=price;
    }

    @Override
    public String toString(){
        return "Brand : "+brand+" Capacity : "+Capacity+" price : "+price;
    }

    @Override
    public int hashCode() {
        return 180;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof PowerBank){
                PowerBank powerBank = this;
                PowerBank powerBank1 =(PowerBank) obj;
                if (powerBank.brand.equals(powerBank1.brand) && powerBank.Capacity==powerBank1.Capacity && powerBank.price==powerBank1.price){
                    return true;
                }
            }
        }
        return false;
    }
}
