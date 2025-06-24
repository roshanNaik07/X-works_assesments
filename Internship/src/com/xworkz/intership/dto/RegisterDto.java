package com.xworkz.intership.dto;

import java.io.Serializable;

public class RegisterDto implements Serializable {

    private String name;
    private String course;
    private int fees;
    private String mode;
    private int pk;

    public RegisterDto() {
        System.out.println("Running no argument constructor of RegisterDTO");
    }


    public RegisterDto(String name, String course, int fees, String mode) {
        this.name = name;
        this.course = course;
        this.fees = fees;
        this.mode = mode;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public int getFees() {
        return fees;
    }

    public String getMode() {
        return mode;
    }

    public int getPk() {
        return pk;
    }

    public void setPk(int pk) {
        this.pk = pk;
    }

    @Override
    public String toString() {
        return "RegisterDto{" +
                "name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", fees=" + fees +
                ", mode='" + mode + '\'' +
                '}';
    }

}
