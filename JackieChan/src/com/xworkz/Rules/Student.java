package com.xworkz.Rules;

public class Student implements ClassRoom {

    @Override
    public void teach() {
        System.out.println("Teaching the student");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the classroom");
    }

}
