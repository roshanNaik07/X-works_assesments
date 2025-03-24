package com.xworkz.Monight;


import com.xworkz.MondayMood.PG;

public class PgStudent {

    void paidRent(PG pg){
        if (pg!=null){
            System.out.println("Rent Paid to :"+pg.Name);
            pg.pgDetails(pg);
        }
        else System.out.println("pg pointing to null");

    }
}
