package com.xworkz.AfterYugadi.Internal;

public class SkyBags extends Bag{

    public SkyBags(){
        System.out.println("Running no arg cont of SkyBags");
    }
    @Override
    public void manufacture(){
        System.out.println("Running manufacture in SkyBags");
    }

    @Override
    public void openBag(){
        System.out.println("Running openBag in SkyBags");
    }

    @Override
    public void closebag(){
        System.out.println("Running closeBag in SkyBags");
    }

    @Override
    public void buybag(){
        System.out.println("Running buyBag in SkyBags");
    }

    @Override
    public void sellBag(){
        System.out.println("Running sellBag in SkyBags");
    }
}
