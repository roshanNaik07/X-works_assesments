package com.xworkz.MondayMood;

public class PG {

    public String Name= "Sai PG";
    int rent=6000;
    private String location="Attiguppe";

    public void paintRoom(){
        System.out.println("Running paintRoom in PG");
    }

    void receiveRent(){
        System.out.println("Running receiveRent in PG");
    }

    private void giveRent(PG pg){
        if (pg!=null){
            System.out.println("Running giveRent");
            System.out.println("PG location :"+pg.location);
        }
        else System.out.println("pg is pointing");
    }

    public  void pgDetails(PG pg){
        if (pg!=null){
            pg.giveRent(pg);
        }
        else System.out.println("pg is pointing to null");
    }

}
