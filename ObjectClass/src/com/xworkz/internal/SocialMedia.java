package com.xworkz.internal;

public class SocialMedia {
    private String appName;
    private String size;
    private int price;
    public SocialMedia(String appName, String size, int price){
        this.appName=appName;
        this.size=size;
        this.price=price;
    }

    @Override
    public String toString() {
        return "appName : "+appName+" size : "+size+" price : "+price;
    }

    @Override
    public int hashCode() {
        return 192;
    }
}
