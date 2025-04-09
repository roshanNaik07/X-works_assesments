package com.xworkz.AfterYugadi.Internal;

public class SunDirect extends Remote{

    public SunDirect(){
        System.out.println("No arg const of SunDirect");
    }

    @Override
    public void color(){
        System.out.println("Running color in SunDirect");
    }

    @Override
    public void addBattery(){
        System.out.println("Running addBatery in SunDirect");
    }

    @Override
    public void onTv(){
        System.out.println("Running onTv in SunDirect");
    }

    @Override
    public void offTv(){
        System.out.println("Running OffTv in SunDirect");
    }

    @Override
    public void breakRemote(){
        System.out.println("Running breakRemote in SunDirect");
    }

    public void price(){
        System.out.println("Running price in SunDirect");
    }
}
