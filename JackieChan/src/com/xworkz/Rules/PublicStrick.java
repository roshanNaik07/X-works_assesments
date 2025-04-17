package com.xworkz.Rules;

public class PublicStrick implements Strick {

    @Override
    public void rules() {
        System.out.println("Public strick rules");
    }

    @Override
    public void safety() {
        System.out.println("Public strick safety");
    }

    @Override
    public void strick() {
        System.out.println("Public strick");
    }

    @Override
    public void opposition() {
        System.out.println("Opposition is important for public strick.");
    }

}
