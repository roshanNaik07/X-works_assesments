package com.xworkz.AfterYugadi.Internal;

public class Dominos extends Pizza{

    public Dominos(){
        System.out.println("Running no arg cont of Dominos");
    }
    @Override
    public void makePizza(){
        System.out.println("Running makePizza in Dominos");
    }

    @Override
    public void orderPizza(){
        System.out.println("Running orderPizza in Dominos");
    }

    @Override
    public void deliverPizza(){
        System.out.println("Running deliverPizza in Dominos");
    }

    @Override
    public void eatPizza(){
        System.out.println("Running eatPizza in Dominos");
    }

    @Override
    public void getOffer(){
        System.out.println("Runnning getOffer in Dominos");
    }
}
