package com.xworkz.internal;

public class PowerPlug {
    private String type;
    private int voltage;
    private int price;

    public PowerPlug(String type, int voltage, int price) {
        this.type = type;
        this.voltage = voltage;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Type: " + type + ", Voltage: " + voltage + "V, Price: " + price;
    }
}
