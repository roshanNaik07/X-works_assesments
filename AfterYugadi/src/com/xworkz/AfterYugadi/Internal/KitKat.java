package com.xworkz.AfterYugadi.Internal;

public class KitKat extends Chocolate{

    public KitKat(){
        System.out.println("Running no arg cont of KitKat");
    }

    @Override
    public void makeChocolate(){
        System.out.println("Running makeChocolate in KitKat");
    }
    @Override
    public void melt(){
        System.out.println("Running melt in KitKat");
    }
    @Override
    public void buyChocolate(){
        System.out.println("Running buyChocolate in KitKat");
    }
    @Override
    public void eatChocolate(){
        System.out.println("Running eatChocolate in KitKat");
    }
    @Override
    public void wrapChocolate(){
        System.out.println("Running wrapChocolate in KitKat");
    }
}
