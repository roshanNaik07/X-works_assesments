package com.xworkz.park.List;

import java.util.Objects;

public class ParkDTO {

    private String name;
    private String place;
    private int entryFee;

    public ParkDTO(String name, String place, int entryFee) {
        this.name = name;
        this.place = place;
        this.entryFee = entryFee;
    }

    public String getName() {
        return name;
    }

    public String getPlace() {
        return place;
    }

    public int getEntryFee() {
        return entryFee;
    }

    @Override
    public String toString() {
        return "ParkDTO{" +
                "name='" + name + '\'' +
                ", place='" + place + '\'' +
                ", entryFee=" + entryFee +
                '}';
    }
}
