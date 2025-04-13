package com.xworkz.internal;

public class WashingMachine {
    private String company;
    private String type;
    private int price;
    public WashingMachine(String company,String type,int price){
        this.company=company;
        this.type=type;
        this.price=price;
    }

    @Override
    public String toString() {
        return "company : "+company+" type : "+type+" price : "+price;
    }

    @Override
    public int hashCode() {
        return 124;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            System.out.println("obj is not null");
            if (obj instanceof WashingMachine){
                WashingMachine washingMachine = this;
                WashingMachine washingMachine1 =(WashingMachine) obj;
                if (washingMachine.type.equals(washingMachine1.type)){
                    return true;
                }
            }
        }
        return false;
    }
}
