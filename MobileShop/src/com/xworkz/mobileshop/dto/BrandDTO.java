package com.xworkz.mobileshop.dto;

public class BrandDTO {

    private String brandName;
    private String location;
    private int noOfEmployees;

    public BrandDTO(String brandName, String location, int noOfEmployees) {
        this.brandName = brandName;
        this.location = location;
        this.noOfEmployees = noOfEmployees;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getLocation() {
        return location;
    }

    public int getNoOfEmployees() {
        return noOfEmployees;
    }

    @Override
    public String toString() {
        return "BrandDTO{" +
                "brandName='" + brandName + '\'' +
                ", location='" + location + '\'' +
                ", noOfEmployees=" + noOfEmployees +
                '}';
    }
}
