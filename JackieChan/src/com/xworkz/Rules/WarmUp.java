package com.xworkz.Rules;

public class WarmUp implements Exercise{

    @Override
    public void warmUp() {
        System.out.println("warmUp is important");
    }

    @Override
    public void cardio() {
        System.out.println("cardio is important");
    }

    @Override
    public void strengthTraining() {
        System.out.println("strengthTraining is important");
    }

}
