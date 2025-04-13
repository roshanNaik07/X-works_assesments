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

    @Override
    public int hashCode() {
        return 158;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Hospital){
                Hospital hospital = this;
                Hospital hospital1 =(Hospital) obj;
                if (hospital.name.equals(hospital1.name) && hospital.location.equals(hospital1.location)){
                    return true;
                }
            }
        }
        return false;
    }
}
