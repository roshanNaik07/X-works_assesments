package com.xworkz.AfterYugadi.Internal;

public class Gold extends Metal{

    public Gold(){
        System.out.println("Running no arg const of Gold");
    }

    @Override
    public void color(){
        System.out.println("Running color in Gold");
    }

    @Override
    public void buy(){
        System.out.println("Running buy in Gold");
    }

    @Override
    public void sell(){
        System.out.println("Running sell in Gold");
    }

    @Override
    public void giveShape(){
        System.out.println("Running giveShape in Gold");
    }

    @Override
    public void price(){
        System.out.println("Running price in Gold");
    }

    public void bill(){
        System.out.println("Running bill in Gold");
    }
}
