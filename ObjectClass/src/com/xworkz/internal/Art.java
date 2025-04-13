package com.xworkz.internal;

public class Art {
    private String Name;
    private String Artist;
    private int price;
    public Art(String Name, String Artist, int price){
        this.Name=Name;
        this.Artist=Artist;
        this.price=price;
    }

    @Override
    public String toString() {
        return "Name : "+Name+" Artist : "+Artist+" price : "+price;
    }

    @Override
    public int hashCode() {
        return 138;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof Art){
                Art art = this;
                Art art1 =(Art) obj;
                if (art.Name.equals(art1.Name) && art.Artist.equals(art1.Artist)){
                    return true;
                }
            }
        }
        return false;
    }
}
