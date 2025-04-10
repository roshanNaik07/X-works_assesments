package com.xworkz.internal;

public class Hotel {
    private String name;
    private String location;
    private int startTime;
    public Hotel(String name,String location,int startTime){
        this.name=name;
        this.location=location;
        this.startTime=startTime;
    }

    @Override
    public String toString() {
        return "name : "+name+" location : "+location+" startTime : "+startTime;
    }

    @Override
    public int hashCode() {
        return 159;
    }
}
