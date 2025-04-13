package com.xworkz.internal;

public class Wifi {
    private String brand;
    private String Range;
    private int price;
    public Wifi(String brand, String Range, int price){
        this.brand=brand;
        this.Range=Range;
        this.price=price;
    }

    @Override
    public String toString() {
        return "brand : "+brand+" Range : "+Range+" price : "+price;
    }

    @Override
    public int hashCode() {
        return 211;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Wifi){
                Wifi wifi = this;
                Wifi wifi1 =(Wifi) obj;
                if (wifi.brand.equals(wifi1.brand) && wifi.Range.equals(wifi1.Range)){
                    return true;
                }
            }
        }
        return false;
    }
}
