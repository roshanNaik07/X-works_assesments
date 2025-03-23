package com.xworkz.cricket;

public class CricketRunner {
    public static void main(String[] args) {

       Ticket ticket = new Ticket();
       Cricket cricket = new Cricket(ticket);

       cricket.watch();
       cricket.profit();

    }
}
