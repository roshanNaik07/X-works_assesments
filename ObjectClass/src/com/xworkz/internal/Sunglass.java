package com.xworkz.internal;

public class Sunglass {
    private String company;
    private String type;
    private int price;
    public Sunglass(String company, String type, int price){
        this.company=company;
        this.type=type;
        this.price=price;
    }

    @Override
    public String toString() {
        return "company : "+company+" type : "+type+" price : "+price;
    }

    @Override
    public int hashCode() {
        return 198;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Sunglass) {
                Sunglass sunglass = this;
                Sunglass sunglass1 =(Sunglass) obj;
                if (sunglass.company.equals(sunglass1.company) && sunglass.type.equals(sunglass1.type) && sunglass.price==sunglass1.price){
                    return true;
                }
            }
        }
        return false;
    }
}
