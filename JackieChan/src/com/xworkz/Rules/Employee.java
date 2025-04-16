package com.xworkz.Rules;

public class Employee implements Office {

    @Override
    public void work() {
        System.out.println("Working in the office");
    }

    @Override
    public void clean() {
        System.out.println("Keep the office clean");
    }

}
