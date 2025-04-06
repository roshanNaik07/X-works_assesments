package com.xworkz.AfterYugadi.Internal;

public class Diwali extends Festival{

    public Diwali(){
        System.out.println("Running no arg cont of Diwali");
    }

    @Override
    public void celebrate(){
        System.out.println("Running celebrate in Diwali");
    }

    @Override
    public void holiday(){
        System.out.println("Running holiday in Diwali");
    }

    @Override
    public void eatSweets(){
        System.out.println("Running eatSweet in Diwali");
    }

    @Override
    public void decoration(){
        System.out.println("Running decoration in Diwali");
    }

    @Override
    public void ritual(){
        System.out.println("Running ritual in Diwali");
    }
}
