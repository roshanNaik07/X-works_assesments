package com.xworkz.internal;

public class Temple {
    private String name;
    private String location;
    private int managementCount;
    public Temple(String name,String location,int managementCount){
        this.name=name;
        this.location=location;
        this.managementCount=managementCount;
    }

    @Override
    public String toString() {
        return "name : "+name+" location : "+location+" managementCount : "+managementCount;
    }
}
