package com.xworkz.internal;

public class Electrolite {
    private String brand;
    private String type;
    private int price;
    public Electrolite(String brand, String type, int price){
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
        return 151;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Electrolite){
                Electrolite electrolite = this;
                Electrolite electrolite1 =(Electrolite) obj;
                if (electrolite.brand.equals(electrolite1.brand) && electrolite.type.equals(electrolite1.type)){
                    return true;
                }
            }
        }
        return false;
    }
}
