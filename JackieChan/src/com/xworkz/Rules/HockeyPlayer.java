package com.xworkz.Rules;

public class HockeyPlayer implements Hockey {

    @Override
    public void rules() {
        System.out.println("Hockey rules: 1. No high sticks, 2. No body checking, 3. No dangerous play");
    }

    @Override
    public void safety() {
        System.out.println("Hockey safety: 1. Wear a helmet, 2. Use mouthguard, 3. Wear shin guards");
    }

    @Override
    public void equipment() {
        System.out.println("Hockey equipment: 1. Stick, 2. Puck, 3. Skates");
    }

}
