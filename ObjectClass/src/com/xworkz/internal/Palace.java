package com.xworkz.internal;

public class Palace {
    private String name;
    private String location;
    private int entryFee;
    public Palace(String name,String location,int entryFee){
        this.name=name;
        this.location=location;
        this.entryFee=entryFee;
    }

    @Override
    public String toString() {
        return "name : "+name+" location : "+location+" entryFee : "+entryFee;
    }

    @Override
    public int hashCode() {
        return 174;
    }
}
