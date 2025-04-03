package com.xworkz.Monight;

import com.xworkz.MondayMood.ArtWork;
import com.xworkz.MondayMood.MayuraFrights;
import com.xworkz.MondayMood.PG;
import com.xworkz.MondayMood.Resort;

public class MonightRunner {
    public static void main(String[] args) {

        ArtWork artWork=new ArtWork();
        ArtClient artClient = new ArtClient();
        artClient.clientOrder(artWork);

        System.out.println("-----------------------------------------\n-----------------------------------");

        PG pg = new PG();
        PgStudent pgStudent = new PgStudent();
        pgStudent.paidRent(pg);

        System.out.println("-----------------------------------------\n-----------------------------------");

        MayuraFrights mayuraFrights =new MayuraFrights();
        MayuraClient mayuraClient=new MayuraClient();
        mayuraClient.getClientDetails(mayuraFrights);

        System.out.println("-----------------------------------------\n-----------------------------------");

        Resort resort = new Resort();
        ResortCustomer resortCustomer = new ResortCustomer();
        resortCustomer.getCustomerDetails(resort);
    }
}
