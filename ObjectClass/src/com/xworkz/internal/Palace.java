package com.xworkz.internal;

public class Palace {
    private String name;
    private String location;
    private int entryFee;
    public Palace(String name,String location,int entryFee){
        this.name=name;
        this.location=location;
        this.entryFee=entryFee;
    }

    @Override
    public String toString() {
        return "name : "+name+" location : "+location+" entryFee : "+entryFee;
    }

    @Override
    public int hashCode() {
        return 174;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Palace){
                Palace palace = this;
                Palace palace1 =(Palace) obj;
                if (palace.name.equals(palace1.name) && palace.location.equals(palace1.location)){
                    return true;
                }
            }
        }
        return false;
    }
}
