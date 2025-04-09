package com.xworkz.AfterYugadi.Internal;

public class PizzaHut extends Pizza{

    public PizzaHut(){
        System.out.println("Running no arg cont of PizzaHut");
    }

    @Override
    public void makePizza(){
        System.out.println("Running makePizza in PizzaHut");
    }

    @Override
    public void orderPizza(){
        System.out.println("Running orderPizza in PizzaHut");
    }

    @Override
    public void deliverPizza(){
        System.out.println("Running deliverPizza in PizzaHut");
    }

    @Override
    public void eatPizza(){
        System.out.println("Running eatPizza in PizzaHut");
    }

    @Override
    public void getOffer(){
        System.out.println("Runnning getOffer in PizzaHut");
    }
}
