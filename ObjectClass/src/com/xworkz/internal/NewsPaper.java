package com.xworkz.internal;

public class NewsPaper {
    private String name;
    private String location;
    private int price;
    public NewsPaper(String name, String location, int price){
        this.name=name;
        this.location=location;
        this.price=price;
    }

    @Override
    public String toString() {
        return "name : "+name+" location : "+location+" price : "+price;
    }

    @Override
    public int hashCode() {
        return 172;
    }
}
