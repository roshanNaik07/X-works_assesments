package com.xworkz.Jail;

public class Jail {

    private String name;
    private String location;
    private String jailerName;
    private int totalCell;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getLocation(){
        return location;
    }

    public void setLocation(String location){
        this.location=location;
    }

    public String getJailerName(){
        return jailerName;
    }

    public void setJailerName(String jailerName){
        this.jailerName=jailerName;
    }

    public int getTotalCell(){
        return totalCell;
    }

    public void setTotalCell(int totalCell){
        this.totalCell=totalCell;
    }
}
