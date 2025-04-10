package com.xworkz.internal;

public class Art {
    private String Name;
    private String Artist;
    private int price;
    public Art(String Name, String Artist, int price){
        this.Name=Name;
        this.Artist=Artist;
        this.price=price;
    }

    @Override
    public String toString() {
        return "Name : "+Name+" Artist : "+Artist+" price : "+price;
    }

    @Override
    public int hashCode() {
        return 138;
    }
}
