package com.xworkz.Rules;

public interface OrderFood {

    void order();

    void delivery();

    void payment();

    default void type(){
        System.out.println("Type of food");
    }
}
