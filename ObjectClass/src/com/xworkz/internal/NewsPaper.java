package com.xworkz.internal;

public class NewsPaper {
    private String name;
    private String location;
    private int price;
    public NewsPaper(String name, String location, int price){
        this.name=name;
        this.location=location;
        this.price=price;
    }

    @Override
    public String toString() {
        return "name : "+name+" location : "+location+" price : "+price;
    }

    @Override
    public int hashCode() {
        return 172;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof NewsPaper){
                NewsPaper newsPaper = this;
                NewsPaper newsPaper1 =(NewsPaper) obj;
                if (newsPaper.name.equals(newsPaper1.name) && newsPaper.location.equals(newsPaper1.location)){
                    return true;
                }
            }
        }
        return false;
    }
}
