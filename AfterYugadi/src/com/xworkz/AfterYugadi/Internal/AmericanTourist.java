package com.xworkz.AfterYugadi.Internal;

public class AmericanTourist extends Bag{

    public AmericanTourist(){
        System.out.println("Running no arg cont AmericanTourist");
    }

    @Override
    public void manufacture(){
        System.out.println("Running manufacture in AmericanTourist");
    }

    @Override
    public void openBag(){
        System.out.println("Running openBag in AmericanTourist");
    }

    @Override
    public void closebag(){
        System.out.println("Running closeBag in AmericanTourist");
    }

    @Override
    public void buybag(){
        System.out.println("Running buyBag in AmericanTourist");
    }

    @Override
    public void sellBag(){
        System.out.println("Running sellBag in AmericanTourist");
    }
}
