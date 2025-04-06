package com.xworkz.AfterYugadi.Internal;

public class Munch extends Chocolate{

    public Munch(){
        System.out.println("Running no arg cont of Munch");
    }
    @Override
    public void makeChocolate(){
        System.out.println("Running makeChocolate in Munch");
    }
    @Override
    public void melt(){
        System.out.println("Running melt in Munch");
    }
    @Override
    public void buyChocolate(){
        System.out.println("Running buyChocolate in Munch");
    }
    @Override
    public void eatChocolate(){
        System.out.println("Running eatChocolate in Munch");
    }
    @Override
    public void wrapChocolate(){
        System.out.println("Running wrapChocolate in Munch");
    }
}
