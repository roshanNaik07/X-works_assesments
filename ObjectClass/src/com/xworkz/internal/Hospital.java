package com.xworkz.internal;

public class Hospital {
    private String name;
    private String location;
    private int startTime;
    public Hospital(String name,String location,int startTime){
        this.name=name;
        this.location=location;
        this.startTime=startTime;
    }

    @Override
    public String toString() {
        return "name : "+name+" location : "+location+" startTime : "+startTime;
    }
}
