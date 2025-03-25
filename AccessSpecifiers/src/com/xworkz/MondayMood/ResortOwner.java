package com.xworkz.MondayMood;

public class ResortOwner {

    void getdetails(Resort resort) {
        if (resort != null) {
            System.out.println("Resort name is :" + resort.name);
            System.out.println("Rent per day : " + resort.rentPerday);
            resort.resortMaintanance();
            resort.allowBooking();
            resort.display(resort);
        } else System.out.println("resort is pointing to null");
    }
}
