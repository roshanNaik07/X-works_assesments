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
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof SocialMedia){
                SocialMedia socialMedia = this;
                SocialMedia socialMedia1 =(SocialMedia) obj;
                if (socialMedia.appName.equals(socialMedia1.appName) && socialMedia.size.equals(socialMedia1.size)){
                    return true;
                }
            }
        }
        return false;
    }
}
