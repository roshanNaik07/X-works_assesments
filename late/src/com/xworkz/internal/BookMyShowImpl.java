package com.xworkz.internal;

public class BookMyShowImpl implements MovieTicket {
    public BookMyShowImpl() {
        System.out.println("Running no-arg const of BookMyShowImpl");
    }

    @Override
    public void bookTicket() {
        System.out.println("Booking ticket through BookMyShowImpl");
    }
}
