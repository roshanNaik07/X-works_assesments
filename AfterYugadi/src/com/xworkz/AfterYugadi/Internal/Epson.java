package com.xworkz.AfterYugadi.Internal;

public class Epson extends Projector{

    public Epson(){
        System.out.println("Running no arg const of Epson");
    }

    @Override
    public void buy(){
        System.out.println("Running buy in Epson");
    }

    @Override
    public void On(){
        System.out.println("Running On in Epson");
    }

    @Override
    public void Off(){
        System.out.println("Running Off in Epson");
    }

    @Override
    public void size(){
        System.out.println("Running size in Epson");
    }
    @Override
    public void price(){
        System.out.println("Running price in Epson");
    }
}
