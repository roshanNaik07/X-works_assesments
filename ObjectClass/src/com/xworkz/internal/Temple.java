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

    @Override
    public int hashCode() {
        return 204;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Temple){
                Temple temple = this;
                Temple temple1 =(Temple) obj;
                if (temple.name.equals(temple1.name) && temple.location.equals(temple1.location)){
                    return true;
                }
            }
        }
        return false;
    }
}
