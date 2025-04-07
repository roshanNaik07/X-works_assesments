package com.xworkz.AfterYugadi.Internal;

public class LapCharger extends Charger{

    public LapCharger(){
        System.out.println("Runner no arg const of LapCharger");
    }

    @Override
    public void plugIn(){
        System.out.println("Running plugIn in LapCharger");
    }

    @Override
    public void remove(){
        System.out.println("Running remove in LapCharger");
    }

    @Override
    public void color(){
        System.out.println("Running color in LapCharger");
    }

    @Override
    public void price(){
        System.out.println("Running price in LapCharger");
    }

    @Override
    public void capacity(){
        System.out.println("Running capacity in LapCharger");
    }

    public void length(){
        System.out.println("Running length in LapCharger");
    }
}
