package com.xworkz.internal;

public class OlaCabsImpl implements TaxiService {
    public OlaCabsImpl() {
        System.out.println("Running no-arg const of OlaCabsImpl");
    }

    @Override
    public void bookTaxi() {
        System.out.println("Booking taxi using OlaCabsImpl");
    }
}
