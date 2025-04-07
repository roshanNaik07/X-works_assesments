package com.xworkz.AfterYugadi.Internal;

public class EarRing extends Accessories{

    public EarRing(){
        System.out.println("Running no arg const of EarRing");
    }

    @Override
    public void wear(){
        System.out.println("Running wear in EarRing");
    }

    @Override
    public void prepare(){
        System.out.println("Running prepare in EarRing");
    }

    @Override
    public void buy(){
        System.out.println("Running buy in EarRing");
    }

    @Override
    public void sell(){
        System.out.println("Running sell in EarRing");
    }

    @Override
    public void color(){
        System.out.println("Running color in EarRing");
    }

    public void material(){
        System.out.println("Running material in EarRing");
    }
}
