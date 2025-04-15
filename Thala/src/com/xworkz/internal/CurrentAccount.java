package com.xworkz.internal;

public class CurrentAccount extends Account {
    @Override
    public void open() {
        System.out.println("Running open in CurrentAccount");
    }
}