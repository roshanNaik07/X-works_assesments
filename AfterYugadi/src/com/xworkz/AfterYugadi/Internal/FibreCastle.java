package com.xworkz.AfterYugadi.Internal;

public class FibreCastle extends ColorPencil{

    public FibreCastle(){
        System.out.println("Running no arg const of FibreCastle");
    }

    @Override
    public void buy(){
        System.out.println("Running  buy in FibreCastle");
    }

    @Override
    public void write(){
        System.out.println("Running  write in FibreCastle");
    }

    @Override
    public void color(){
        System.out.println("Running  color in FibreCastle");
    }

    @Override
    public void use(){
        System.out.println("Running  use in FibreCastle");
    }

    @Override
    public void price(){
        System.out.println("Running  price in FibreCastle");
    }

    public void manufacture(){
        System.out.println("Running manufacture in FibreCastle");
    }
}
