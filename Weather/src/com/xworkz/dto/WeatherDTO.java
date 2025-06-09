package com.xworkz.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class WeatherDTO implements Serializable {

    private String location;
    private String captured;
    private int temperature;
    private LocalDate recorded;

    public WeatherDTO() {

    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCaptured() {
        return captured;
    }

    public void setCaptured(String captured) {
        this.captured = captured;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public LocalDate getRecorded() {
        return recorded;
    }

    public void setRecorded(LocalDate recorded) {
        if (recorded != null) {
            this.recorded = recorded;
        }else
            throw new IllegalArgumentException("Recorded date cannot be null");
    }
}
