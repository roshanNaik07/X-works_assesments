package com.xworkz.general.dto;

import java.io.Serializable;

public class JobDTO implements Serializable {

    private String name;
    private String email;
    private String skill;
    private String education ;
    private String salary;
    private int experience;

    public JobDTO() {
    }

    public JobDTO(String name, String email, String skill, String education, String salary, int experience) {
        this.name = name;
        this.email = email;
        this.skill = skill;
        this.education = education;
        this.salary = salary;
        this.experience = experience;
    }
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getSkill() {
        return skill;
    }

    public String getEducation() {
        return education;
    }

    public String getSalary() {
        return salary;
    }

    public int getExperience() {
        return experience;
    }
}
