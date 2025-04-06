package com.xworkz.AfterYugadi.Internal;

public class MilkyBar extends Chocolate{

    public MilkyBar(){
        System.out.println("Running no arg cont of MilkyBar");
    }

    @Override
    public void makeChocolate(){
        System.out.println("Running makeChocolate in MilkyBar");
    }
    @Override
    public void melt(){
        System.out.println("Running melt in MilkyBar");
    }
    @Override
    public void buyChocolate(){
        System.out.println("Running buyChocolate in MilkyBar");
    }
    @Override
    public void eatChocolate(){
        System.out.println("Running eatChocolate in MilkyBar");
    }
    @Override
    public void wrapChocolate(){
        System.out.println("Running wrapChocolate in MilkyBar");
    }
}
