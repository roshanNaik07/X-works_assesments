package com.xworkz.external;

import com.xworkz.internal.EducationPortal;

public class Student {
    EducationPortal educationPortal;

    public Student(EducationPortal educationPortal) {
        this.educationPortal = educationPortal;
        System.out.println("Running EducationPortal param const in Student");
    }

    public void learn() {
        System.out.println("Running learn in Student");
        this.educationPortal.studyOnline();
    }
}
