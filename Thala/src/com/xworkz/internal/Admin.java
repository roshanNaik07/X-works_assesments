package com.xworkz.internal;

public class Admin extends User {

    @Override
    public void access() {
        System.out.println("Running access in Admin");
    }

}