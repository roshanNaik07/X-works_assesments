package com.xworkz.AfterYugadi.Internal;

public class La_Pinoz_Pizza extends Pizza{
    public La_Pinoz_Pizza(){

        System.out.println("Running no arg cont of La_Pinoz_Pizza");
    }

    @Override
    public void makePizza(){
        System.out.println("Running makePizza in La_Pinoz_Pizza");
    }

    @Override
    public void orderPizza(){
        System.out.println("Running orderPizza in La_Pinoz_Pizza");
    }

    @Override
    public void deliverPizza(){
        System.out.println("Running deliverPizza in La_Pinoz_Pizza");
    }

    @Override
    public void eatPizza(){
        System.out.println("Running eatPizza in La_Pinoz_Pizza");
    }

    @Override
    public void getOffer(){
        System.out.println("Runnning getOffer in La_Pinoz_Pizza");
    }
}
