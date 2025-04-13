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
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Hotel){
                Hotel hotel = this;
                Hotel hotel1 =(Hotel) obj;
                if (hotel.name.equals(hotel1.name) && hotel.location.equals(hotel1.location)){
                    return true;
                }
            }
        }
        return false;
    }
}
