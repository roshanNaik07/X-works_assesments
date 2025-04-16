package com.xworkz.Rules;

public class Jumper implements BunjiJumping{
    @Override
    public void rules() {
        System.out.println("Jumper rules");
    }

    @Override
    public void safety() {
        System.out.println("Jumper safety");
    }

    @Override
    public void bunjiJumping() {
        System.out.println("Jumper bunjiJumping");
    }

}
