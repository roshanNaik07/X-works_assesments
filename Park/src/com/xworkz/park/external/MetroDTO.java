package com.xworkz.park.external;

public class MetroDTO {

    private String city ;
    private String line ;
    private String source;
    private String destination;
    private int price ;
    private int noOfStations;
    private int employees;
    private int kilometer;
    private int time ;
    private String booking;

    public MetroDTO(String city, String line, String source, String destination, int price, int noOfStations, int employees, int kilometer, int time, String booking) {
        this.city = city;
        this.line = line;
        this.source = source;
        this.destination = destination;
        this.price = price;
        this.noOfStations = noOfStations;
        this.employees = employees;
        this.kilometer = kilometer;
        this.time = time;
        this.booking = booking;
    }

    public String getCity() {
        return city;
    }

    public String getLine() {
        return line;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public int getPrice() {
        return price;
    }

    public int getNoOfStations() {
        return noOfStations;
    }

    public int getEmployees() {
        return employees;
    }

    public int getKilometer() {
        return kilometer;
    }

    public int getTime() {
        return time;
    }

    public String getBooking() {
        return booking;
    }

    @Override
    public String toString() {
        return "MetroDTO{" +
                "city='" + city + '\'' +
                ", line='" + line + '\'' +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", price=" + price +
                ", noOfStations=" + noOfStations +
                ", employees=" + employees +
                ", kilometer=" + kilometer +
                ", time=" + time +
                ", booking='" + booking + '\'' +
                '}';
    }
}
