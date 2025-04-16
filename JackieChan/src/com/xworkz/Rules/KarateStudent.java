package com.xworkz.Rules;

public class KarateStudent implements Karate{

    @Override
    public void rules() {
        System.out.println("Karate rules");
    }

    @Override
    public void students() {
        System.out.println("Karate students");
    }

    @Override
    public void teachers() {
        System.out.println("Karate teachers");
    }

}
