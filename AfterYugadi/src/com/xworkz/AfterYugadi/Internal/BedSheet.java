package com.xworkz.AfterYugadi.Internal;

public class BedSheet extends Cloth{

    public BedSheet(){
        System.out.println("Running no arg const of BedSheet");
    }

    @Override
    public void buy(){
        System.out.println("Running buy in BedSheet");
    }
    @Override
    public void fold(){
        System.out.println("Running fold in BedSheet");
    }
    @Override
    public void color(){
        System.out.println("Running color in BedSheet");
    }
    @Override
    public void size(){
        System.out.println("Running size in BedSheet");
    }
    @Override
    public void price(){
        System.out.println("Running price in BedSheet");
    }

    public void design(){
        System.out.println("Running design in BedSheet");
    }
}
