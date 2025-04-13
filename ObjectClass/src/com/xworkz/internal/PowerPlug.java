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

    @Override
    public int hashCode() {
        return 181;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof PowerPlug){
                PowerPlug powerPlug = this;
                PowerPlug powerPlug1 =(PowerPlug) obj;
                if (powerPlug.type.equals(powerPlug1.type) && powerPlug.voltage==powerPlug1.voltage && powerPlug.price==powerPlug1.price){
                    return true;
                }
            }
        }
        return false;
    }
}
