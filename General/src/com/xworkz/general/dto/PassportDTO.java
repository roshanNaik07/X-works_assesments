package com.xworkz.general.dto;

import java.io.Serializable;

public class PassportDTO implements Serializable {

    private String applicantName;
    private long adar;
    private String address;
    private long panNo;
    private String country;
    private String state;
    private String city;
    private String passportType;
    private long refNum;

    public PassportDTO() {
    }

    public PassportDTO(String applicantName, long adar, String address, long panNo, String country, String state, String city, String passportType, long refNum) {
        this.applicantName = applicantName;
        this.adar = adar;
        this.address = address;
        this.panNo = panNo;
        this.country = country;
        this.state = state;
        this.city = city;
        this.passportType = passportType;
        this.refNum = refNum;
    }

    // Getters and Setters
    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public long getAdar() {
        return adar;
    }

    public void setAdar(long adar) {
        this.adar = adar;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPanNo() {
        return panNo;
    }

    public void setPanNo(long panNo) {
        this.panNo = panNo;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPassportType() {
        return passportType;
    }

    public void setPassportType(String passportType) {
        this.passportType = passportType;
    }

    public long getRefNum() {
        return refNum;
    }

    public void setRefNum(long refNum) {
        this.refNum = refNum;
    }
}
