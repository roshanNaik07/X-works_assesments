package com.xworkz.classParameter;

public class Shop {

    public void ads(Display display){
        System.out.println("Running ads in Shop");
        if(display != null){
            display.run();
        }
        else
            System.out.println("display is pointing to null");
    }

}
