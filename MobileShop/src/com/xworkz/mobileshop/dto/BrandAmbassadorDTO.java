package com.xworkz.mobileshop.dto;

public class BrandAmbassadorDTO {

    private String Brand;
    private String AmbassadorName;
    private int amountPaid;

    public BrandAmbassadorDTO(String brand, String ambassadorName, int amountPaid) {
        Brand = brand;
        AmbassadorName = ambassadorName;
        this.amountPaid = amountPaid;
    }

    public String getBrand() {
        return Brand;
    }

    public String getAmbassadorName() {
        return AmbassadorName;
    }

    public int getAmountPaid() {
        return amountPaid;
    }

    @Override
    public String toString() {
        return "BrandAmbassadorDTO{" +
                "Brand='" + Brand + '\'' +
                ", AmbassadorName='" + AmbassadorName + '\'' +
                ", amountPaid=" + amountPaid +
                '}';
    }
}
