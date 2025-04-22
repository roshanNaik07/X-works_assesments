package com.xworkz.internal;

public class Hospital {

    Dentist dentist;

    public Hospital(Dentist dentist) {
        this.dentist = dentist;
        System.out.println("Running no arg const of Hospital");
    }
    public void treat() {
        if (this.dentist != null) {
            System.out.println("Running treat in Hospital");
            this.dentist.checkTeeth();
        } else {
            System.err.println("Dentist is null");
        }
    }
}
