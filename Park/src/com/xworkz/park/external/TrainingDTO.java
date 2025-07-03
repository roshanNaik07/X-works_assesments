package com.xworkz.park.external;

public class TrainingDTO {

    private String name;
    private String location;
    private String founder;
    private int noOfBranches;
    private String branchLocation;
    private int fees;
    private String course;
    private int duration;
    private boolean placementPreparation ;
    private int totalStudents;

    public TrainingDTO(String name, String location, String founder, int noOfBranches, String branchLocation, int fees, String course, int duration, boolean placementPreparation, int totalStudents) {
        this.name = name;
        this.location = location;
        this.founder = founder;
        this.noOfBranches = noOfBranches;
        this.branchLocation = branchLocation;
        this.fees = fees;
        this.course = course;
        this.duration = duration;
        this.placementPreparation = placementPreparation;
        this.totalStudents = totalStudents;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getFounder() {
        return founder;
    }

    public int getNoOfBranches() {
        return noOfBranches;
    }

    public String getBranchLocation() {
        return branchLocation;
    }

    public int getFees() {
        return fees;
    }

    public String getCourse() {
        return course;
    }

    public int getDuration() {
        return duration;
    }

    public boolean isPlacementPreparation() {
        return placementPreparation;
    }

    public int getTotalStudents() {
        return totalStudents;
    }

    @Override
    public String toString() {
        return "TrainingDTO{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", founder='" + founder + '\'' +
                ", noOfBranches=" + noOfBranches +
                ", branchLocation='" + branchLocation + '\'' +
                ", fees=" + fees +
                ", course='" + course + '\'' +
                ", duration=" + duration +
                ", placementPreparation=" + placementPreparation +
                ", totalStudents=" + totalStudents +
                '}';
    }
}
