package com.xworkz.internal;

public class AC {
    private String brand;
    private int rating;
    private int price;
    public AC(String brand,int rating,int price){
        this.brand=brand;
        this.rating=rating;
        this.price=price;
    }

    @Override
    public String toString() {
        return "brand : "+brand+" rating : "+rating+" price : "+price;
    }

    @Override
    public int hashCode() {
        return 137;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof AC){
                AC ac = this;
                AC ac1 =(AC) obj;
                if (ac.brand.equals(ac1.brand) && ac.rating==ac1.rating && ac.price==ac1.price){
                    return true;
                }
            }
        }
        return false;
    }
}
