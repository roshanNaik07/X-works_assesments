package com.xworkz.general.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class DeathDTO implements Serializable {

   String name;
   String cause;
    LocalDate date;
    String time;
    int age;
    String certifiedBy;
    String hospitalName;
    String mannerOfDeath;
    String gender;
    String marks;

    public DeathDTO(String name,String cause, LocalDate date, String time, int age,String certifiedBy,String hospitalName,String mannerOfDeath,String gender,String marks) {
        this.name = name;
        this.cause=cause;
        this.time = time;
        this.date = date;
        this.age = age;
        this.certifiedBy = certifiedBy;
        this.hospitalName = hospitalName;
        this.mannerOfDeath=mannerOfDeath;
        this.gender=gender;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public String getCause() {
        return cause;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public int getAge() {
        return age;
    }

    public String getCertifiedBy() {
        return certifiedBy;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public String getMannerOfDeath() {
        return mannerOfDeath;
    }

    public String getGender() {
        return gender;
    }

    public String getMarks() {
        return marks;
    }

}
