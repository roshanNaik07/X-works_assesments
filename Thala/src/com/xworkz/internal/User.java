package com.xworkz.internal;

public class User extends Entity {

    @Override
    public void access() {
        System.out.println("Running access in User");
    }

}
