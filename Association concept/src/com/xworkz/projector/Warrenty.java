package com.xworkz.projector;

public class Warrenty {

    private String startDate;
    private String endDate;

    Warrenty(String startDate,String endDate){
        this.startDate=startDate;
        this.endDate=endDate;
    }

    void warrentyDetails(){
        System.out.println("---------------------------------------");
        System.out.println("The warrenty start year "+startDate);
        System.out.println("The warrenty end year "+endDate);
    }
}
