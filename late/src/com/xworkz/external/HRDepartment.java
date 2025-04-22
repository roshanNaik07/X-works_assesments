package com.xworkz.external;

import com.xworkz.internal.RecruitmentAgency;

public class HRDepartment {
    RecruitmentAgency agency;

    public HRDepartment(RecruitmentAgency agency) {
        this.agency = agency;
        System.out.println("HRDepartment constructor with RecruitmentAgency");
    }

    public void recruit() {
        if (agency != null) {
            System.out.println("Recruitment in progress...");
            agency.hireCandidate();
        }
    }
}
