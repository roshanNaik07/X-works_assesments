package com.xworkz.AfterYugadi.Internal;

public class DairyMilk extends Chocolate{

    public DairyMilk(){
        System.out.println("Running no arg cont of DairyMilk");
    }
    @Override
    public void makeChocolate(){
        System.out.println("Running makeChocolate in DairyMilk");
    }
    @Override
    public void melt(){
        System.out.println("Running melt in DairyMilk");
    }
    @Override
    public void buyChocolate(){
        System.out.println("Running buyChocolate in DairyMilk");
    }
    @Override
    public void eatChocolate(){
        System.out.println("Running eatChocolate in DairyMilk");
    }
    @Override
    public void wrapChocolate(){
        System.out.println("Running wrapChocolate in DairyMilk");
    }
}
