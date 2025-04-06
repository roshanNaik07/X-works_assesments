package com.xworkz.AfterYugadi.Internal;

public class Alpenliebe extends Chocolate{

    public Alpenliebe(){
        System.out.println("Running no arg cont of Alpenliebe");
    }

    @Override
    public void makeChocolate(){
        System.out.println("Running makeChocolate in Alpenliebe");
    }
    @Override
    public void melt(){
        System.out.println("Running melt in Alpenliebe");
    }
    @Override
    public void buyChocolate(){
        System.out.println("Running buyChocolate in Alpenliebe");
    }
    @Override
    public void eatChocolate(){
        System.out.println("Running eatChocolate in Alpenliebe");
    }
    @Override
    public void wrapChocolate(){
        System.out.println("Running wrapChocolate in Alpenliebe");
    }
}
