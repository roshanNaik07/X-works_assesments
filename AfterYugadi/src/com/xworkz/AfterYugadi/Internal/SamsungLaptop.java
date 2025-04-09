package com.xworkz.AfterYugadi.Internal;

public class SamsungLaptop extends Laptop{

    public SamsungLaptop(){
        System.out.println("Running no arg cont SamsungLaptop");
    }

    @Override
    public void manufacture(){
        System.out.println("Running manufacture in SamsungLaptop");
    }

    @Override
    public void buyLaptop(){
        System.out.println("Running buyLaptop in SamsungLaptop");
    }

    @Override
    public void sellLaptop(){
        System.out.println("Running sellLaptop in SamsungLaptop");
    }

    @Override
    public void onLaptop(){
        System.out.println("Running onLaptop in SamsungLaptop");
    }

    @Override
    public void shutDown(){
        System.out.println("Running shutDown in SamsungLaptop");
    }
}
