package com.xworkz.internal;

public class Powder {
    private String brand;
    private String type;
    private int price;
    public Powder(String brand, String type, int price){
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
        return 179;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Powder){
                Powder powder = this;
                Powder powder1 =(Powder) obj;
                if (powder.brand.equals(powder1.brand) && powder.type.equals(powder1.type)){
                    return true;
                }
            }
        }
        return false;
    }
}
