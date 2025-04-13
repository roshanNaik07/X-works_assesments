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
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof DeliveryApp){
                DeliveryApp deliveryApp = this;
                DeliveryApp deliveryApp1 =(DeliveryApp) obj;
                if (deliveryApp.appName.equals(deliveryApp1.appName)){
                    return true;
                }
            }
        }
        return false;
    }
}
