package com.xworkz.AfterYugadi.Internal;

public class Pop extends Singer{

    public Pop(){
        System.out.println("Running no arg const of Pop..");
    }

    @Override
    public void sings(){
        System.out.println("Running sings in Pop");
    }

    @Override
    public void learn(){
        System.out.println("Running learn in Pop");
    }

    @Override
    public void concert(){
        System.out.println("Running concert in Pop");
    }

    @Override
    public void getPaid(){
        System.out.println("Running getPaid in Pop");
    }

    @Override
    public void perform(){
        System.out.println("Running perform in Pop");
    }

    public void culture(){
        System.out.println("Running culture in Pop");
    }
}
