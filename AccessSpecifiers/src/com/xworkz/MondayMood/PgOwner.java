package com.xworkz.MondayMood;

public class PgOwner {

    void ownerAction(PG pg){
        if(pg!=null){
            System.out.println("Name of the Pg is :"+pg.Name);
            System.out.println("PG rent is :"+pg.rent);
            pg.paintRoom();
            pg.receiveRent();
            pg.pgDetails(pg);
        }
        else System.out.println("pgOwner is pointing null");
    }

}
