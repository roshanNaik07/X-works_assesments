package com.xworkz.Rules;

public class CollegeStudent implements StudentRules {

    @Override
    public void rules() {
        System.out.println("College students should follow the rules and regulations of the college.");
    }

    @Override
    public void students() {
        System.out.println("College students should maintain discipline and respect each other.");
    }

    @Override
    public void teachers() {
        System.out.println("College students should respect their teachers and follow their instructions.");
    }

    @Override
    public void attendance() {
        System.out.println("Attendance is mandatory for all classes.");
    }
}
