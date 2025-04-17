package com.xworkz.Rules;

public interface StudentRules {

    void rules();

    void students();

    void teachers();

    default void attendance() {
        System.out.println("Attendance is mandatory for all classes.");
    }
}
