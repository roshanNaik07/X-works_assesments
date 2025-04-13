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

    @Override
    public int hashCode() {
        return 120;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof NoteBook){
                NoteBook noteBook = this;
                NoteBook noteBook1 =(NoteBook) obj;
                if (noteBook.brand.equals(noteBook1.brand)){
                    return true;
                }
            }
        }
        return false;
    }
}
