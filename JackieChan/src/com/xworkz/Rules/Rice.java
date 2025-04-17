package com.xworkz.Rules;

public class Rice implements Crop {

    @Override
    public void growth() {
        System.out.println("Rice is a staple food in many countries.");
    }

    @Override
    public void yield() {
        System.out.println("Rice has a high yield per acre.");
    }

    @Override
    public void crop() {
        System.out.println("Rice is grown in flooded fields.");
    }

    @Override
    public void season() {
        System.out.println("The season for rice is summer.");
    }
}
