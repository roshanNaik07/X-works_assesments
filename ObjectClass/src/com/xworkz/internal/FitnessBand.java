package com.xworkz.internal;

public class FitnessBand {
    private String brand;
    private String type;
    private int price;
    public FitnessBand(String brand, String type, int price){
        this.brand=brand;
        this.type=type;
        this.price=price;
    }

    @Override
    public String toString() {
        return "brand : "+brand+" type : "+type+" price : "+price;
    }

    @Override
    public int hashCode() {
        return 154;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof FitnessBand){
                FitnessBand fitnessBand = this;
                FitnessBand fitnessBand1 =(FitnessBand) obj;
                if (fitnessBand.brand.equals(fitnessBand1.brand) && fitnessBand.type.equals(fitnessBand1.type)){
                    return true;
                }
            }
        }
        return false;
    }
}
