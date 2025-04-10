package com.xworkz.internal;

public class DeliveryApp {
    private String appName;
    private int deliverTime;
    private int deliveryCharge;
    public DeliveryApp(String appName,int deliverTime,int deliveryCharge){
        this.appName=appName;
        this.deliverTime=deliverTime;
        this.deliveryCharge=deliveryCharge;
    }

    @Override
    public String toString() {
        return "appName : "+appName+" deliverTime : "+deliverTime+" deliveryCharge : "+deliveryCharge;
    }

    @Override
    public int hashCode() {
        return 131;
    }
}
