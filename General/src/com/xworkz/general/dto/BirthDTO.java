package com.xworkz.general.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class BirthDTO implements Serializable {

    private String birthId;
    private String hospitalName;
    private String fatherName;
    private String motherName;
    private LocalDate date;
    private String doctorName;
    private String nurse;
    private String hospitalType;

    public BirthDTO() {
    }

    public BirthDTO(String birthId, String hospitalName, String fatherName, String motherName, LocalDate date, String doctorName, String nurse, String hospitalType) {
        this.birthId = birthId;
        this.hospitalName = hospitalName;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.date = date;
        this.doctorName = doctorName;
        this.nurse = nurse;
        this.hospitalType = hospitalType;
    }

    // Getters and Setters
    public String getBirthId() {
        return birthId;
    }

    public void setBirthId(String birthId) {
        this.birthId = birthId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate
                                date) {
        this.date = date;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getNurse() {
        return nurse;
    }

    public void setNurse(String nurse) {
        this.nurse = nurse;
    }

    public String getHospitalType() {
        return hospitalType;
    }

    public void setHospitalType(String hospitalType) {
        this.hospitalType = hospitalType;
    }
}
