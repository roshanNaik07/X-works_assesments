package com.xworkz.internal;

public class Watch {
    private String brand;
    private String type;
    private int price;
    public Watch(String brand,String type,int price){
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
        return 130;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Watch){
                Watch watch = this;
                Watch watch1 =(Watch) obj;
                if (watch.brand.equals(watch1.brand)){
                    return true;
                }
            }
        }
        return false;
    }
}
