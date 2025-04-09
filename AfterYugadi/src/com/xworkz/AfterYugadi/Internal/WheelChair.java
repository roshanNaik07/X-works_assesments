package com.xworkz.AfterYugadi.Internal;

public class WheelChair extends Chair{

    public WheelChair(){
        System.out.println("Running no arg const of WheelChair");
    }
    @Override
    public void manufacture(){
        System.out.println("Running manufacture in WheelChair");
    }
    @Override
    public void color(){
        System.out.println("Running color in WheelChair");
    }

    @Override
    public void price(){
        System.out.println("Running price in WheelChair");
    }

    @Override
    public void buyChair(){
        System.out.println("Running buyChair in WheelChair");
    }

    @Override
    public void breakChair(){
        System.out.println("Running breakChair in WheelChair");
    }

    public void move(){
        System.out.println("running move in WheelChair");
    }
}
