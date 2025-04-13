package com.xworkz.internal;

public class Soap {
    private String brand;
    private String Aroma;
    private int price;
    public Soap(String brand,String Aroma,int price){
        this.brand=brand;
        this.Aroma=Aroma;
        this.price=price;
    }

    @Override
    public String toString() {
        return "brand : "+brand+" Aroma : "+Aroma+" price : "+price;
    }

    @Override
    public int hashCode() {
        return 135;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Soap){
                Soap soap = this;
                Soap soap1 =(Soap) obj;
                if (soap.Aroma.equals(soap1.Aroma)){
                    return true;
                }
            }
        }
        return false;
    }
}
