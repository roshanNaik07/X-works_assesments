package com.xworkz.internal;

public class Bakery {
    private String name;
    private String location;
    private int startTime;
    public Bakery(String name,String location,int startTime){
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
        return 140;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Bakery){
                Bakery bakery = this;
                Bakery bakery1 =(Bakery) obj;
                if (bakery.name.equals(bakery1.name) && bakery.location.equals(bakery1.location)){
                    return true;
                }
            }
        }
        return false;
    }
}
