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

    @Override
    public int hashCode() {
        return 175;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Park){
                Park park = this;
                Park park1 =(Park) obj;
                if (park.name.equals(park1.name) && park.location.equals(park1.location)){
                    return true;
                }
            }
        }
        return false;
    }
}
