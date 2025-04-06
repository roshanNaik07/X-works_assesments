package com.xworkz.AfterYugadi.Internal;

public class MojoPizza extends Pizza{

    public MojoPizza(){
        System.out.println("Running no arg cont of MojoPizza");
    }

    @Override
    public void makePizza(){
        System.out.println("Running makePizza in MojoPizza");
    }

    @Override
    public void orderPizza(){
        System.out.println("Running orderPizza in MojoPizza");
    }

    @Override
    public void deliverPizza(){
        System.out.println("Running deliverPizza in MojoPizza");
    }

    @Override
    public void eatPizza(){
        System.out.println("Running eatPizza in MojoPizza");
    }

    @Override
    public void getOffer(){
        System.out.println("Running getOffer in MojoPizza");
    }
}
