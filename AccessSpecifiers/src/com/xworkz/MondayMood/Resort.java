package com.xworkz.MondayMood;

public class Resort {

    public String name = "River side Resort";
    int rentPerday = 3000;
    private String location = "Sakleshpur";

    public void resortMaintanance(){
        System.out.println("Running resortMaintanance");
    }

    void allowBooking(){
        System.out.println("Running allowBooking");
    }

    private void bookResort(Resort resort){
        if(resort!=null){
            System.out.println("Running bookResort ");
            System.out.println("Resort location is : "+resort.location);
        }
        else System.out.println("resort is pointing to null");
    }

    public void display(Resort resort){
        if (resort!=null){
            resort.bookResort(resort);
        }
    }
}
