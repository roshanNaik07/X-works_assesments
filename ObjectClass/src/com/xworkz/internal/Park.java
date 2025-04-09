package com.xworkz.internal;

public class Park {
    private String name;
    private String location;
    private int startTime;
    public Park(String name,String location,int startTime){
        this.name=name;
        this.location=location;
        this.startTime=startTime;
    }

    @Override
    public String toString() {
        return "name : "+name+" location : "+location+" startTime : "+startTime;
    }
}
