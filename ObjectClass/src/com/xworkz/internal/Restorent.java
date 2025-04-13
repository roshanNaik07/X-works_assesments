package com.xworkz.internal;

public class Restorent {
    private String name;
    private String location;
    private int startTime;
    public Restorent(String name,String location,int startTime){
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
        return 184;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Restorent){
                Restorent restorent = this;
                Restorent restorent1 =(Restorent) obj;
                if (restorent.name.equals(restorent1.name) && restorent.location.equals(restorent1.location)){
                    return true;
                }
            }
        }
        return false;
    }
}
