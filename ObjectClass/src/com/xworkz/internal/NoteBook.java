package com.xworkz.internal;

public class NoteBook {
    private String brand;
    private int noOfPages;
    private int price;
    public NoteBook(String brand,int noOfPages,int price){
        this.brand=brand;
        this.noOfPages=noOfPages;
        this.price=price;
    }

    @Override
    public String toString() {
        return "brand : "+brand+"noOfPages : "+noOfPages+" price : "+price;
    }
}
