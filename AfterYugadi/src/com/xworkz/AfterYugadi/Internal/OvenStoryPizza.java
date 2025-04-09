package com.xworkz.AfterYugadi.Internal;

public class OvenStoryPizza extends Pizza{

    public OvenStoryPizza(){
        System.out.println("Running no arg cont of OvenStoryPizza");
    }

    @Override
    public void makePizza(){
        System.out.println("Running makePizza in OvenStoryPizza");
    }

    @Override
    public void orderPizza(){
        System.out.println("Running orderPizza in OvenStoryPizza");
    }

    @Override
    public void deliverPizza(){
        System.out.println("Running deliverPizza in OvenStoryPizza");
    }

    @Override
    public void eatPizza(){
        System.out.println("Running eatPizza in OvenStoryPizza");
    }

    @Override
    public void getOffer(){
        System.out.println("Running getOffer in OvenStoryPizza");
    }
}
