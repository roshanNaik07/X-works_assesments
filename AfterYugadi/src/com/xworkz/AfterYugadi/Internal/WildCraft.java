package com.xworkz.AfterYugadi.Internal;

public class WildCraft extends Bag {

    public WildCraft(){
        System.out.println("Running no arg cont of WildCraft");
    }

    @Override
    public void manufacture(){
        System.out.println("Running manufacture in WildCraft");
    }

    @Override
    public void openBag(){
        System.out.println("Running openBag in WildCraft");
    }

    @Override
    public void closebag(){
        System.out.println("Running closeBag in WildCraft");
    }

    @Override
    public void buybag(){
        System.out.println("Running buyBag in WildCraft");
    }

    @Override
    public void sellBag(){
        System.out.println("Running sellBag in WildCraft");
    }
}
